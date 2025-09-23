# Knights vs Monsters 

A simple Java game featuring Knights, Monsters, and a Player, with both console and GUI modes.

---

## Features
- Turn-based battles between **Knights** and **Monsters**.
- Healing system for injured fighters.
- Automatic removal of dead entities from the map.
- Victory condition detection when a team wins.
- Color-coded map rendering with a **Swing-based GUI**.
- Console mode for text-based gameplay (optional).

---

## How to Run

### **Compile**
Open a terminal in the root folder of the project and run:

javac src/*.java

Run:
java -cp src Main

🕹️ Controls
Key	Action
W / A / S / D	Move the Player
P	Pause the game & view team statistics
Q	Quit the game

🛠️ Built With
Java 17+
Swing for GUI

📂 Project Structure
css
KnightsVsMonsters/
│
├── src/
│   ├── Entity.java
│   ├── Fighter.java
│   ├── Knight.java
│   ├── Monster.java
│   ├── Player.java
│   ├── Map.java
│   ├── GameGUI.java
│   └── Main.java
│
├── Screenshot 2025-06-05 193624.png
├── README.md
└── LICENSE

📄 License
This project is licensed under the MIT License – see the LICENSE file for details.
