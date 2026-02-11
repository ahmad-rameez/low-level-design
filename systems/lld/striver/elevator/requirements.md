## Elevator System

### Requirements
1. Building should support multiple floors and multiple elevators.
2. Each floor should have external panel with up/down button.
3. Each elevator should have internal panel with floor selections, open, close.
4. System should dispatch elevators efficiently.
5. The elevator should move based on Dynamic Strategies (FCFS, SCAN) -> Strategy Pattern
6. People can enter/exit only when elevator is stopped with door open -> State Pattern
7. The System should support adding/removing elevators dynamically.
8. Teh system should maintain building constraints (top, botton floor).

### Edge Cases
1. Capacity?
2. How to handle emergency situation?
3. What if multiple elevators are equidistant?
4. Maintenance mode?

### Core Entities
1. Building -> id, name, minFloor, MaxFloor, totalElevators
2. Elevators -> id, buildingId, currentFloor, direction, capacity, isActive, stateHandler
3. ExternalRequest -> id, floorNumber, buildingId, direction, timestamp, status, assignedElevatorId
4. InternalRequest -> id, elevatorId, destinationFloor[], status
5. Direction -> UP, DOWN, IDLE
6. ElevatorState -> MOVING, STOPPED, DOORS_OPEN, DOORS_CLOSED, MAINTENANCE
7. RequestStatus -> PENDING, ASSIGNED, COMPLETED, QUEUED
8. SystemState

### Flows
1. Elevator Operation flow
   2. Create a new elevator in building with capacity
   3. Move Elevator to target floor
   4. Set the elevator to maintenance mode
   5. Admin starts the elevator system
   6. Admin stops the elevator system
7. External Request Flow
   8. UP button requested
   9. DOWN button pressed
10. Internal Request -> Select the destination FLow. 