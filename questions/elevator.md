# **Elevator System LLD - Design Patterns and Their Usage**

## **Understanding the Problem Statement**
An elevator system manages multiple elevators in a building. It needs to handle requests from different floors, assign elevators efficiently, and ensure smooth operation. Our **goal** is to create a **scalable, maintainable, and efficient** elevator system using **design patterns**.

---

## **Key Features and Required Design Patterns**
We need to address the following aspects while designing the system:

### **1. Managing Multiple Elevators - Singleton Pattern**
- The **ElevatorSystem** class should be a **single instance** managing multiple elevators.
- **Why?** We need **one global access point** to manage elevators instead of creating multiple instances.

### **2. Handling Requests Efficiently - Command Pattern**
- **Problem:** Floor requests (up/down) and inside elevator requests (floor selection) need a **structured way** to execute.
- **Solution:** Use the **Command Pattern** where:
    - Requests are encapsulated as objects.
    - The system can queue, execute, and even undo them if needed.

### **3. Choosing the Best Elevator - Strategy Pattern**
- **Problem:** Assigning an elevator optimally based on proximity, direction, or load.
- **Solution:** Define multiple **strategies** (e.g., nearest, least busy, intelligent load balancing) and use the **Strategy Pattern** to switch dynamically.

### **4. Elevator State Management - State Pattern**
- **Problem:** Elevators transition between states: **Idle, Moving, Stopped, Maintenance**.
- **Solution:** Implement the **State Pattern** so that each state manages **valid transitions**.

### **5. Observer Pattern for Notifications**
- **Problem:** Multiple floors and passengers need updates when an elevator arrives.
- **Solution:** Use the **Observer Pattern**, where **floors and users subscribe to elevator status updates**.

### **6. Factory Pattern for Creating Different Elevator Types**
- **Problem:** Some buildings have different types of elevators (e.g., passenger, freight, express).
- **Solution:** Use **Factory Pattern** to create different elevator types based on the requirements.

---

## **System Components and Flow**
### **1. Core Classes**
- **ElevatorSystem (Singleton)**
    - Manages all elevators.
    - Assigns requests using a **Strategy**.
- **Elevator (State Pattern)**
    - Each elevator has **states**: **Idle, Moving, Stopped**.
    - Handles request execution.
- **Request (Command Pattern)**
    - Encapsulates **floor request or internal request**.
- **ElevatorSelectionStrategy (Strategy Pattern)**
    - Determines **best elevator** for a request.
- **Floor & Passengers (Observer Pattern)**
    - Listens to elevator updates.

---

This design ensures **scalability, modularity, and maintainability**, making it adaptable for real-world applications.

