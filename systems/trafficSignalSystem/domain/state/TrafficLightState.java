package trafficSignalSystem.domain.state;

import trafficSignalSystem.domain.TrafficLight;
import trafficSignalSystem.exception.InvalidStateTransitionException;

public interface TrafficLightState {
    void turnGreen(TrafficLight trafficLight);
    void turnYellow(TrafficLight trafficLight) throws InvalidStateTransitionException;
    void turnRed(TrafficLight trafficLight) throws InvalidStateTransitionException;
    void turnOff(TrafficLight trafficLight);
    String getStateName();
    boolean canTransitionTo(TrafficLightState newState);
}
