# Tic-Tac-Toe Low-Level Design (LLD)

## **Objective**
To design a flexible and scalable Tic-Tac-Toe game using Object-Oriented Design (OOD) principles and design patterns.

---

## **Design Patterns Used**

### **1️⃣ Singleton Pattern** (Game Class)
**Why?**
- Ensures only **one instance** of the game exists.
- Prevents multiple games from interfering with each other.

**Where?**
- `Game.getInstance()` provides a single game instance.

---

### **2️⃣ Strategy Pattern** (Winning Strategy & Parking Strategy)
**Why?**
- Allows **different winning strategies** without changing the core logic.
- Makes it easy to extend with **new strategies** (e.g., custom board sizes).

**Where?**
- `WinningStrategy` interface & `DefaultWinningStrategy` class.

---

### **3️⃣ Enum Pattern** (Piece Enum)
**Why?**
- **Encapsulates** valid player pieces (`X`, `O`).
- Prevents errors from passing invalid characters.

**Where?**
- `Piece` enum (instead of using `char`).

---

### **4️⃣ Factory Pattern** (Optional for Creating Players or Boards)
**Why?**
- Centralizes object creation logic.
- Useful if we want to create **AI vs Human players dynamically**.

**Where?**
- Can be applied to `PlayerFactory` for different player types.

---

## **Key Improvements in the Design**
✅ Used **Enum (`Piece`)** to make piece selection safer.  
✅ Separated **winning strategy** using **Strategy Pattern** for flexibility.  
✅ **Singleton Pattern** ensures only **one game instance** runs.  
✅ **Board class** now tracks the state efficiently.

---

## **Future Enhancements**
🔹 **AI Player** - Implement a bot using **Minimax Algorithm**.  
🔹 **Configurable Board Size** - Make the board dynamic (e.g., 4x4 or 5x5).  
🔹 **Multiplayer Mode** - Enable networked multiplayer games.

---

This design ensures **scalability, flexibility, and maintainability** while keeping the game logic clean and extensible! 🚀