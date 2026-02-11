package lld.striver.trafficSignalSystem.domain.state;

import lld.striver.trafficSignalSystem.domain.TrafficLight;
import lld.striver.trafficSignalSystem.exception.InvalidStateTransitionException;

public interface TrafficLightState {
    void turnGreen(TrafficLight trafficLight);
    void turnYellow(TrafficLight trafficLight) throws InvalidStateTransitionException;
    void turnRed(TrafficLight trafficLight) throws InvalidStateTransitionException;
    void turnOff(TrafficLight trafficLight);
    String getStateName();
    boolean canTransitionTo(TrafficLightState newState);
}
