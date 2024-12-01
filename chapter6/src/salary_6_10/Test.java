package salary_6_10;

public class Test {
    public static void main(String[] args) {
        // 创建四个对象
        SalariedEmployee salariedEmployee = new SalariedEmployee("张三", 5, 5000);
        HourlyEmployee hourlyEmployee = new HourlyEmployee("李四", 3, 20, 200);
        SalesEmployee salesEmployee = new SalesEmployee("王五", 7, 10000, 0.05);
        BasePlusSalesEmployee basePlusSalesEmployee = new BasePlusSalesEmployee("赵六", 10, 15000, 0.04, 2000);
        // 计算某个月的工资
        int month = 5; // 假设是5月
        System.out.println("张三的工资: " + salariedEmployee.getSalary(month));
        System.out.println("李四的工资: " + hourlyEmployee.getSalary(month));
        System.out.println("王五的工资: " + salesEmployee.getSalary(month));
        System.out.println("赵六的工资: " + basePlusSalesEmployee.getSalary(month));
    }
}
