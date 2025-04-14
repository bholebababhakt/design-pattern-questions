# Parking Lot System Design

## Problem Statement
Design an object-oriented Parking Lot system that supports:
- Multiple parking floors
- Different vehicle types (Car, Bike, Truck)
- Automated parking spot assignment
- Payment calculation based on time
- Entry & Exit gates with tickets
- Admin functionality (add/remove floors, spots)
- Support for handicapped spots
- Electric vehicle (EV) charging stations
- Display system (shows available spots per floor)

---

## Class Diagram
```

ParkingLot (Singleton)
│── ParkingFloor
│    ├── List<ParkingSpot>
│    ├── DisplayBoard
│── ParkingSpot (abstract)
│    ├── HandicappedSpot
│    ├── CompactSpot
│    ├── LargeSpot
│── Vehicle (abstract)
│    ├── Car
│    ├── Bike
│    ├── Truck
│── Ticket
│── Payment (Strategy)
│    ├── HourlyRate
│    ├── FlatRate
│── EntranceGate
│── ExitGate
│── DisplayBoard (Observer)
│── ParkingStrategy (Strategy)
│    ├── NearestToEntrance
│    ├── NearestToElevator
│    ├── NearestToExit
```

---

## Design Patterns Used

1. **Singleton Pattern** - Ensures only one instance of `ParkingLot` exists.
2. **Factory Pattern** - Creates `Vehicle` and `ParkingSpot` objects dynamically.
3. **Strategy Pattern** - Implements different pricing strategies (hourly, flat rate).
4. **Observer Pattern** - Notifies the display system when spots are updated.

---
