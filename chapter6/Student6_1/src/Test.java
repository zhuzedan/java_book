public class Test {
    public static void main(String[] args) {
        Undergraduate stu1 = new Undergraduate();// 创建子类对象
        stu1.no = "2400123";
        stu1.name = "宁小才";
        stu1.setMajor("计算机科学与技术");
        System.out.println(stu1.stuInfo() + "，专业" + stu1.getMajor());
    }
}
