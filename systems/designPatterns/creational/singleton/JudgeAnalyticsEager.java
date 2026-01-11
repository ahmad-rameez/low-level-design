package designPatterns.creational.singleton;

// Thread Safe
public class JudgeAnalyticsEager {

    private static final JudgeAnalyticsEager judgeAnalyticsEager = new JudgeAnalyticsEager();

    // This private constructor Allows not invoking my other service
    private JudgeAnalyticsEager() {
    }

    // public method to get the instance
    public static JudgeAnalyticsEager getInstance(){
        return judgeAnalyticsEager;
    }


}
