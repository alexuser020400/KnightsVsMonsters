4th Individual Assignment - Java
Description

A simple Java game featuring Knights, Monsters, and a Player, with both console and graphical interface (GUI) modes.

The development process started with building the core logic (classes, battle mechanics, healing system), and then a minimal Swing-based GUI was added for visualization and interaction.

The guidance I received was primarily related to debugging and best practices for using Swing, while the overall design and implementation were based on the assignment instructions and my own understanding.

How to Run

Open the project and run the Main class.

In the Terminal, you will first be asked to:

Enter the width and height of the game map.

Enter the number of entities (Knights, Monsters, etc.) you want to spawn, with limits based on the map size.

After this setup:

The GUI window will open automatically.

(Optional) To run the game only in the terminal, uncomment the relevant lines in Main.

Controls
Key	Action
W / A / S / D	Move the Player
P	Pause game & display team statistics
Q	Quit the game
Features

Turn-based battles between entities.

Healing system for injured fighters.

Automatic removal of dead entities from the map.

Victory condition detection when one team wins.

Color-coded map rendering in the GUI.

Terminal-only mode supported for a text-based experience.

Code Structure

The code is organized into the following main classes:

Entity – Base class for all objects on the map.

Fighter – Extends Entity, adds health and combat behavior.

Player – Controlled by the user.

Knight – AI-controlled fighter, part of the Knight team.

Monster – AI-controlled fighter, part of the Monster team.

Uses ArrayLists for flexible addition and removal of entities.

Notes

The focus was on making the code modular and extensible, despite time constraints.

The game fully implements all assignment requirements:

Battles, healing, team statistics, entity removal, and team victory conditions.








