package designPatterns.creational.singleton;

public class JudgeAnalyticsLazyVolatile {
    private static volatile JudgeAnalyticsLazyVolatile judgeAnalyticsLazyVolatile;

    private JudgeAnalyticsLazyVolatile() {
    }

    public static JudgeAnalyticsLazyVolatile getInstance(){
        if(judgeAnalyticsLazyVolatile == null) {
            synchronized (JudgeAnalyticsLazyVolatile.class) {
                judgeAnalyticsLazyVolatile = new JudgeAnalyticsLazyVolatile();
            }
        }
        return judgeAnalyticsLazyVolatile;
    }
}
