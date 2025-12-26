package trafficSignalSystem.domain;

import trafficSignalSystem.exception.InvalidStateTransitionException;

import java.util.HashMap;
import java.util.Map;

public class Intersection {
    private int id;
    private String name;
    private Map<Direction, TrafficLight> trafficLights;
    private boolean isEmergencyMode;
    private Direction emergencyDirection;
    private boolean isCyclePaused;

    public Intersection(int id, String name) {
        this.id = id;
        this.name = name;
        this.trafficLights = new HashMap<>();
        this.isEmergencyMode = false;
        this.isCyclePaused = false;
        for (Direction direction : Direction.values()) {
            this.trafficLights.put(direction, new TrafficLight(direction));
        }
        System.out.println("Intersection created: " + name + " (ID: " + id + ")");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Direction, TrafficLight> getTrafficLights() {
        return trafficLights;
    }

    public void setTrafficLights(Map<Direction, TrafficLight> trafficLights) {
        this.trafficLights = trafficLights;
    }

    public boolean isEmergencyMode() {
        return isEmergencyMode;
    }

    public void setEmergencyMode(boolean emergencyMode) {
        isEmergencyMode = emergencyMode;
    }

    public Direction getEmergencyDirection() {
        return emergencyDirection;
    }

    public void setEmergencyDirection(Direction emergencyDirection) {
        this.emergencyDirection = emergencyDirection;
    }

    public boolean isCyclePaused() {
        return isCyclePaused;
    }

    public void setCyclePaused(boolean cyclePaused) {
        isCyclePaused = cyclePaused;
    }

    public TrafficLight getTrafficLight(Direction direction) {
        return trafficLights.get(direction);
    }

    public void setAllSignalsToRed() throws InvalidStateTransitionException {
        for (TrafficLight light : trafficLights.values()) {
            String currentState = light.getCurrentStateName();
            if ("GREEN".equals(currentState)) {
                // GREEN → YELLOW → RED (proper sequence)
                light.turnYellow();
                // In a real system, we'd wait for yellow duration, then turn red
                // For simulation, we'll turn red immediately after yellow
                light.turnRed();
            } else if ("YELLOW".equals(currentState)) {
                // YELLOW → RED
                light.turnRed();
            } else if ("RED".equals(currentState)) {
                // Already RED, no change needed
                System.out.println("Traffic light " + light.getDirection() + " is already RED");
            } else {
                // OFF or any other state → RED
                light.turnRed();
            }
        }
        System.out.println("All signals set to RED for intersection " + id);
    }

    public void setSignalToGreen(Direction direction) {
        TrafficLight light = trafficLights.get(direction);
        if (light != null) {
            light.turnGreen();
            System.out.println("Signal " + direction + " set to GREEN for intersection " + id);
        }
    }

    public void setSignalToYellow(Direction direction) throws InvalidStateTransitionException {
        TrafficLight light = trafficLights.get(direction);
        if (light != null) {
            light.turnYellow();
            System.out.println("Signal " + direction + " set to YELLOW for intersection " + id);
        }
    }

    public void setSignalToRed(Direction direction) throws InvalidStateTransitionException {
        TrafficLight light = trafficLights.get(direction);
        if (light != null) {
            light.turnRed();
            System.out.println("Signal " + direction + " set to RED for intersection " + id);
        }
    }

    public void setSignalToOff(Direction direction) {
        TrafficLight light = trafficLights.get(direction);
        if (light != null) {
            light.turnOff();
            System.out.println("Signal " + direction + " set to OFF for intersection " + id);
        }
    }

    /**
     * Emergency method to safely transition a signal to RED following proper state sequence
     */
    public void emergencyTransitionToRed(Direction direction) throws InvalidStateTransitionException {
        TrafficLight light = trafficLights.get(direction);
        if (light != null) {
            String currentState = light.getCurrentStateName();
            if ("GREEN".equals(currentState)) {
                // GREEN → YELLOW → RED (emergency sequence)
                System.out.println("Emergency transition: " + direction + " GREEN → YELLOW → RED");
                light.turnYellow();
                light.turnRed();
            } else if ("YELLOW".equals(currentState)) {
                // YELLOW → RED
                System.out.println("Emergency transition: " + direction + " YELLOW → RED");
                light.turnRed();
            } else if ("RED".equals(currentState)) {
                // Already RED
                System.out.println("Emergency transition: " + direction + " already RED");
            } else {
                // OFF or any other state → RED
                System.out.println("Emergency transition: " + direction + " → RED");
                light.turnRed();
            }
        }
    }
}
