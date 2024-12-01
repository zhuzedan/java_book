package loan_7_6;

public class Test {
    public static void main(String[] args) {
        // 创建一个普通学生
        Person student = new Student("张三", 1500.0);
        student.printIncomeAndExpense();
        // 创建一个普通老师
        Person teacher = new Teacher("李四", 5000.0);
        teacher.printIncomeAndExpense();
        // 创建一个在职研究生
        Person graduateStudent = new GraduateStudent("王五", 2000.0, 3000.0);
        graduateStudent.printIncomeAndExpense();
    }
}
