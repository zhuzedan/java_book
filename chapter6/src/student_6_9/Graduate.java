package student_6_9;

public class Graduate extends Student{
    public Graduate(String studentId, String name, int[] score) {
        super(studentId, name, score);
    }
    // 重写成绩评级方法
    @Override
    public String evaluate() {
        double averageScore = getAverageScore();
        if (averageScore >= 90) return "优秀";
        else if (averageScore >= 80) return "良好";
        else if (averageScore >= 70) return "一般";
        else if (averageScore >= 60) return "及格";
        else return "不及格";
    }
}
