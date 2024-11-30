package AchievementRating6_3;

public class Student {
    protected String studentId;
    protected String name;
    protected int[] score;
    public Student(String studentId, String name, int[] score) {
        this.studentId = studentId;
        this.name = name;
        this.score = score;
    }
    // 计算平均分
    public double getAverageScore() {
        int totalScore = 0;
        for (int i = 0; i < this.score.length; i++) {
            totalScore += this.score[i];
        }
        return Math.round((totalScore) / 3.0 * 100) / 100.0;
    }
    // 默认的成绩评级方法
    public String evaluate() {
        double averageScore = getAverageScore();
        if (averageScore >= 80) return "优秀";
        else if (averageScore >= 70) return "良好";
        else if (averageScore >= 60) return "一般";
        else if (averageScore >= 50) return "及格";
        else return "不及格";
    }
    @Override
    public String toString() {
        return "学号: " + studentId + ", 姓名: " + name + ", 平均分: " + getAverageScore() + ", 成绩等级: " + evaluate();
    }
}
