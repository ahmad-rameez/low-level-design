## Functional Requirements

### Entry Flow
1. Vehicle arrives at gate
2. Assign slot based on vehicle type
3. Generate ticket
4. Mark slot as occupied
5. Return entry response

### Exit Flow
1. Present ticket
2. Calculate fee using pricing rules (flat vs hourly)
3. Process payment
4. Release slot
5. Return exit response with receipt

### Admin Flow
1. Add/Edit/Delete floors and slots
2. Define/update pricing rules
3. View parking lot status

## Non-Functional Requirements
1. Scalability: Multiple parking lots, thousands of slots
2. Availability: Entry/Exit must work even if payment fails
3. Consistency: Accurate slot status at all times
4. Extensibility: Easy addition of new vehicle types or gateways
5. Security: Role-based access for admin operations
6. Latency: < 500ms for key flows

## Edge Cases to Consider
1. Payment failure at exit
2. Lost ticket
3. System clock mismatch
4. Slot marked occupied wrongly

## Frameworks
1. Functional Requirements
2. Define Core Entities
3. Discuss Interaction Flow, to identify the classes
4. Discuss class structures and Relationship
5. Core Use cases and Methods
6. OOP Principles and Design Patterns
7. Discuss the edge cases
8. Class Diagram and package structures
9. Future Requirements