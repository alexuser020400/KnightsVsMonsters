# Knights vs Monsters

A turn-based Java game featuring Knights, Monsters and a Player, built with object-oriented programming principles.  
The project includes both console gameplay and a Swing-based GUI.

## Overview

Knights vs Monsters is a Java university project focused on applying core OOP concepts such as inheritance, abstraction, encapsulation and polymorphism in a simple game environment.

The game simulates turn-based battles between two teams, with player movement, healing, entity removal and victory condition logic.

## Features

- Turn-based battles between Knights and Monsters
- Player-controlled movement
- Healing system for injured fighters
- Automatic removal of defeated entities
- Victory condition detection
- Console-based gameplay
- Swing-based graphical interface
- Color-coded map rendering

## Technologies

- Java 17+
- Java Swing
- Object-Oriented Programming
- Git / GitHub

## Object-Oriented Design

The project applies OOP concepts through a structured class hierarchy:

- `Entity` — base class for game objects
- `Fighter` — abstract fighter behavior
- `Knight` — knight-specific behavior
- `Monster` — monster-specific behavior
- `Player` — player-controlled entity
- `Map` — game map and entity positioning
- `GameGUI` — Swing-based user interface
- `Main` — application entry point

## How to Run

Clone the repository:

```bash
git clone https://github.com/alexuser020400/KnightsVsMonsters.git
cd KnightsVsMonsters
```

Compile:

```bash
javac src/*.java
```

Run:

```bash
java -cp src Main
```

## Controls

| Key | Action |
|------|--------|
| **W** | Move up |
| **A** | Move left |
| **S** | Move down |
| **D** | Move right |
| **P** | Pause game / View team statistics |
| **Q** | Quit game |

## Project Structure

```text
KnightsVsMonsters/
├── src/
│   ├── Entity.java
│   ├── Fighter.java
│   ├── Knight.java
│   ├── Monster.java
│   ├── Player.java
│   ├── Map.java
│   ├── GameGUI.java
│   └── Main.java
├── README.md
└── LICENSE
```

## What I Learned

- Designing object-oriented class hierarchies
- Applying inheritance, encapsulation and polymorphism
- Managing game state and entity interactions
- Building a simple GUI using Java Swing
- Organizing a Java project using Git and GitHub

## Future Improvements

- Add unit tests
- Improve the graphical interface
- Add difficulty levels
- Add save/load functionality
- Add new character classes

## License

This project is licensed under the MIT License.
