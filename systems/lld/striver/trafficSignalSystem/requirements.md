# Traffic Management System

## Requirements:
1. The system should control traffic signals at a single intersection (4 traffic lights as a unit).
2. The system should manage automatic cycling through phases (NORTH → EAST → SOUTH → WEST).
3. The system should handle emergency vehicle priority requests by pausing the automatic cycle.
4. During emergency: All signals turn RED, emergency direction gets GREEN, then resume cycle from pause.
5. The system should track vehicle count at each approach.
6. The system should prevent conflicting signals from being active simultaneously.
7. The system should have configurable signal durations (RED, YELLOW, GREEN) for each direction.

## Edge Cases:
1. Emergency vehicle request during signal change
2. Invalid signal state transitions (handled by State Design Pattern)
3. Cycle pause/resume during emergency

## Identify Core Entities
1. Intersection
2. Traffic Lights
3. Cycling
4. Emergency Requests (DTO)
5. Vehicle Count
6. Signal Durations -> Green

## Interaction Flows (APIs)

### Intersection Management Flows
1. Intersection Creation: Create Intersection -> Inititalize 4 traffic lights -> Set default signal timings -> Start automatic cycle
2. Intersection Get Status: Request Status -> Return signal states and info

### Automatic Cycle Management Flows
1. Normal Cycle
2. Cycle Pause/Resume

### Signal Timing Management Flows
1. Timing Configuration
2. Dynamic Timing Adjustment

### Emergency Management Flows
1. Emergency Request
2. Emergency End

### Vehicle Counting Flows
1. Count Update
2. Count Get

### State Transition Flows
1. Valid State Transition
2. Invalid State Transition
3. Emergency State Transition

## Architecture 
We will be using MVC

## Design Class Structures and Relationships

### IntersectionController
1. void createIntersection(int id, String name)
2. Intersection getIntersection(int intersectionId)
3. void startCycle(int intersectionId)
4. void displayStatus(int intersectionId)

### EmergencyController
1. void requestEmergency(int id, Enum direction, int duration)
2. void endEmergency(int intersectionId)

### TrafficController
1. void updateVehicleCount(Enum direction, int count)
2. int getVehicleCount(Enum direction)

### TimingController
1. void setSignalTiming(int intersectionId, Enum direction, int greenDuration)
2. void enableDynamicTiming(int intersectionId, Enum direction, boolean enable)
3. SignalTiming getSignalTiming(int intersectionId, Enum direction)

## Core Use Cases and Methods


## OOP principle and Design Patterns Used
1. Repository Pattern
2. Service Layer pattern
3. State Pattern
4. SRP
5. Open/Closed
6. Encapsulation
7. Dependency Inversions