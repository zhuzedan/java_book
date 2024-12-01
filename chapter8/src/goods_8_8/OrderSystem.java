package goods_8_8;

import java.util.*;

public class OrderSystem {
    private Map<String, Goods> goods;
    private List<Order> orders;
    private User user;

    private void init() {
        goods = new HashMap<>();
        goods.put("云岭茉莉白", new Goods(1, "云岭茉莉白", 16));
        goods.put("伯牙绝弦", new Goods(2, "伯牙绝弦", 18));
        goods.put("百香三重奏", new Goods(3, "百香三重奏", 15));
        goods.put("白桃乌龙奶盖", new Goods(4, "白桃乌龙奶盖", 17));
        goods.put("芋圆葡萄", new Goods(5, "芋圆葡萄", 8));
        orders = new ArrayList<>();
    }

    private void menu() {
        System.out.println("--------欢迎光临宁宁奶茶店--------");
        System.out.println("1. 查看菜单");
        System.out.println("2. 搜索奶茶");
        System.out.println("3. 点单");
        System.out.println("4. 取餐");
        System.out.println("5. 订单列表");
        System.out.println("6. 退出系统");
    }

    private void showAll() {
        Set<String> goodsSet = goods.keySet();
        Iterator<String> it = goodsSet.iterator();
        while (it.hasNext()) {
            System.out.println(goods.get(it.next()));
        }
    }

    private void searchGoods() {
        System.out.println("请输入你要搜索的奶茶：");
        Scanner in = new Scanner(System.in);
        String goodsString = in.next();
        Goods item = goods.get(goodsString);
        System.out.println(item.toString());
    }

    private void order() {
        System.out.println("请输入你要点单的奶茶：");
        Scanner in = new Scanner(System.in);
        String goodsString = in.next();
        Goods item = goods.get(goodsString);
        int orderId = orders.size() + 1;
        Order order = new Order(orderId, 0, item.getGoodsName(), user.getNick());
        orders.add(order);
        System.out.println("下单成功，你得取餐号为：" + orderId);
    }

    private void pickUp() {
        System.out.println("请输入取餐号：");
        Scanner in = new Scanner(System.in);
        int orderId = in.nextInt();
        Order order = orders.get(orderId - 1);
        if (order == null) {
            System.out.println("订单不存在");
        } else if (order.getStatus() == 1) {
            System.out.println("订单已取走");
        } else {
            System.out.println("取餐成功");
        }
    }

    private void orderList() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

    private void exit() {
        System.out.println("感谢使用，欢迎下次光临");
        System.exit(0);
    }

    public void run() {
        while (user == null) {
            Scanner input = new Scanner(System.in);
            System.out.println("请输入您的账户：");
            String inputAccount = input.next();
            System.out.println("请输入您的密码：");
            String inputPassword = input.next();
            if (inputAccount.equals("user1") &&
                    inputPassword.equals("111111")) {
                System.out.println("登录成功！");
                user = new User(1, "user1");
                break;
            } else {
                System.out.println("账户或密码输入错误，" +
                        "请重新输入！");
            }
        }
        init();
        while (true) {
            menu();
            Scanner in = new Scanner(System.in);
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    showAll(); // 查看菜单
                    break;
                case 2:
                    searchGoods(); // 查找奶茶
                    break;
                case 3:
                    order(); // 点单
                    break;
                case 4:
                    pickUp(); // 取餐
                    break;
                case 5:
                    orderList(); // 订单列表
                    break;
                case 6:
                    exit(); // 退出系统
                    break;
                default:
                    System.out.println("错误的选项，请重新输入!");
                    break;
            }
        }
    }
}
