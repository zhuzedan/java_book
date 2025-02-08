package castle_task_4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Game {
    private Room currentRoom;
    private final Map<String, Handler> handlers = new HashMap<>();

    public Game() {
        createRooms();
        // 初始化命令处理器
        handlers.put("go", new HandlerGo(this));
        handlers.put("bye", new HandlerBye(this));
        handlers.put("help", new HandlerHelp(this));
    }

    void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        } else {
            currentRoom = nextRoom;
            printExit();
        }
    }

    private void createRooms() {
        Room outside, lobby, pub, study, bedroom;
        // 创建房间
        outside = new Room("城堡外");
        lobby = new Room("大堂");
        pub = new Room("小酒吧");
        study = new Room("书房");
        bedroom = new Room("卧室");

        // 设置房间的出口
        outside.setExit("east", lobby);
        outside.setExit("south", study);
        outside.setExit("west", pub);

        lobby.setExit("south", outside);

        pub.setExit("east", outside);

        study.setExit("north", outside);
        study.setExit("east", bedroom);

        bedroom.setExit("west", study);

        // 从城堡门外开始
        currentRoom = outside;
    }

    private void printWelcome() {
        System.out.println();
        System.out.println("欢迎来到城堡！");
        System.out.println("这是一个超级无聊的游戏。");
        System.out.println("如果需要帮助，请输入 'help' 。");
        System.out.println();
        printExit();
    }

    private void printExit() {
        System.out.println("你在" + currentRoom);
        System.out.print("出口有：");
        System.out.println(currentRoom.getExitDesc());
    }

    private void play() {
        Scanner in = new Scanner(System.in);
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            Handler handler = handlers.get(words[0]); // 命令对应的类
            String value = "";
            if (words.length > 1) {
                value = words[1]; // go命令后的方向
            }
            if (handler != null) {
                handler.doCmd(value);  // 分发执行具体命令
                if (handler.isBye()) { // 对bye命令要单独处理，结束程序
                    break;
                }
            } else {
                System.out.println("未知命令，请输入 'help' 查看帮助。");
            }
        }
        System.out.println("***********************************");
        System.out.println("游戏到此结束！");
        System.out.println("欢迎下次光临！");
        System.out.println("谢谢！");
        System.out.println("***********************************");
        in.close();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.printWelcome();
        game.play();
    }
}