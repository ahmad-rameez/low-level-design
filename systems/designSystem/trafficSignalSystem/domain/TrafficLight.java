package designSystem.trafficSignalSystem.domain;

import designSystem.trafficSignalSystem.domain.state.RedState;
import designSystem.trafficSignalSystem.domain.state.TrafficLightState;
import designSystem.trafficSignalSystem.exception.InvalidStateTransitionException;

public class TrafficLight {
    private Direction direction;
    private TrafficLightState state;

    public TrafficLight(Direction direction) {
        this.direction = direction;
        this.state = new RedState();
        System.out.println("Traffic Light created");
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public TrafficLightState getState() {
        return state;
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public void turnGreen() {
        state.turnGreen(this);
    }

    public void turnYellow() throws InvalidStateTransitionException {
        state.turnYellow(this);
    }

    public void turnRed() throws InvalidStateTransitionException {
        state.turnRed(this);
    }

    public void turnOff() {
        state.turnOff(this);
    }

    public String getCurrentStateName() {
        return state.getStateName();
    }

    public boolean canTransitionTo(TrafficLightState newState) {
        return state.canTransitionTo(newState);
    }
}
