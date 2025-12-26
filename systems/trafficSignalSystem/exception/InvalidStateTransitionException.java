package trafficSignalSystem.exception;

public class InvalidStateTransitionException extends Exception{

    public InvalidStateTransitionException(String from, String to) {
        super("Invalid state transition from " + from + " to " + to);
    }
}
