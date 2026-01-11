package designPatterns.creational.singleton;

public class Driver {
    public static void main(String[] args) {
        JudgeAnalyticsEager judgeAnalyticsEager = JudgeAnalyticsEager.getInstance();
        System.out.println(judgeAnalyticsEager);

        JudgeAnalyticsEager judgeAnalyticsEager1 = JudgeAnalyticsEager.getInstance();
        System.out.println(judgeAnalyticsEager1);
    }
}
