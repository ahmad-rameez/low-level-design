package designPatterns.creational.factory;

import java.util.Objects;

public class LogisticsFactory {
    public static ILogistics getLogistics(String mode) {
        if(Objects.equals(mode, "road")) {
            return new RoadLogistics();
        }
        return new AirLogistics();
    }
}
