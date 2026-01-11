package designPatterns.creational.singleton;

// Lazy is not thread safe
public class JudgeAnalyticsLazy {
    private static JudgeAnalyticsLazy judgeAnalyticsLazy;

    private JudgeAnalyticsLazy() {
    }

    public static synchronized JudgeAnalyticsLazy getInstance(){
        if(judgeAnalyticsLazy == null) {
            judgeAnalyticsLazy = new JudgeAnalyticsLazy();
        }
        return judgeAnalyticsLazy;
    }
}
