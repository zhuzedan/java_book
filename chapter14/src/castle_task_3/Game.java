package castle_task_3;

import java.util.Scanner;

public class Game {
    private Room currentRoom;

    public Game() {
        createRooms();
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

    private void printHelp() {
        System.out.print("迷路了吗？你可以做的命令有：go bye help");
        System.out.println("如：\tgo east");
    }

    private void goRoom(String direction) {
        Room nextRoom = currentRoom.getExit(direction);
        if (nextRoom == null) {
            System.out.println("那里没有门！");
        } else {
            currentRoom = nextRoom;
            printExit();
        }
    }

    private void printExit() {
        System.out.println("你在" + currentRoom);
        System.out.print("出口有：");
        System.out.println(currentRoom.getExitDesc());
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Game game = new Game();
        game.printWelcome();

        label:
        while (true) {
            String line = in.nextLine();
            String[] words = line.split(" ");
            switch (words[0]) {
                case "help":
                    game.printHelp();
                    break;
                case "go":
                    game.goRoom(words[1]);
                    break;
                case "bye":
                    break label;
            }
        }

        System.out.println("感谢您的光临。再见！");
        in.close();
    }
}