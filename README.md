# MarsRoverProject
## Project Description:
The main aim of the project is to move the rovers around the surface of Mars. The surface of the Mars is represented by Plateau. Rovers navigate the Plateau so they can use their special cameras and robot arms to collect samples back to Planet Earth.

## Inputs to the Program:
1. User should be able to provide the maximum coordinates to fix the max size of the plateau. Plateau can be Square/Rectangular grid for this project. For eg: (x,y) = (5,5). The minimum coordinates of the Plateau are (0,0). It means that the Rover can move around the grid which is formed by minimum and maximum coordinates.
2. User should be able to provide the initial position of the rover where it should start on grid. It is represented in terms of (x,y) coordinates and the letters N, S, E, W to represent North, South, West, East respectively. For eg: "1 2 N"
3. User should be able to provide the instructions to move rover around the Plateau. The instructions are represented by the letters L, R, M where L indicates the rover to spin 90 degrees left without moving from the current position, R indicates the rover to spin 90 degrees right without moving from the current position, M indiacate the rover to move forward by one grid point maintaining the same direction. For Eg: LRMMLMMRM
4. The program should return the final position of the rover after moving around the plateau with the instructions provided.

## Design:
The UML class diagram for this project is inside the UML folder.

The project is divided into three folders. Vehicles, Plateau and VehicleController. Vehicles consist of MarsVehicleImpl class which implements the Marsvehicle interface. It implements all the methods which facilitates movement of Rovers and other vehicles on plateau. MarsVehicle interface has a class called Rover where it implements methods to move rover around the plateau based on user provided inputs such as initial position and instructions.

Plateau is a abstarct class consist of methods which handles the size of the Plateau. SquarePlateau has been considered for this project.

VehicleController consist of RoverMissionControls interface where it can handle the rover functionalities such as spin Left/right or move forward on the grid.

Followed Test Driven Development and covered all the unit tests including the edge cases. Handled exceptions for invalid grid size, Obstacles for rover and one rover colliding the other rover. 

## Instructions to run 
To run this project you need to fork this repository to your git account and clone it to your machine. Once cloned you can run the tests using mvn test.

All the tests should pass and the application shoud run successfully for additional inputs.

## Future Thoughts
Plateau can be of different shapes.

Different types of Vehicle, Rovers and Robots can be placed on the plateau.

User Interface can be implemented in the future.

Vehicle can skip the current instruction when there is obstacle and follow the next instruction given by User.

