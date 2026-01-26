package designSystem.trafficSignalSystem.domain.state;

import designSystem.trafficSignalSystem.domain.TrafficLight;
import designSystem.trafficSignalSystem.exception.InvalidStateTransitionException;

public interface TrafficLightState {
    void turnGreen(TrafficLight trafficLight);
    void turnYellow(TrafficLight trafficLight) throws InvalidStateTransitionException;
    void turnRed(TrafficLight trafficLight) throws InvalidStateTransitionException;
    void turnOff(TrafficLight trafficLight);
    String getStateName();
    boolean canTransitionTo(TrafficLightState newState);
}
