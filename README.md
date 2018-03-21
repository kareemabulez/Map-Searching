The Charlottetown airport has a growing concern. Namely people are leaving their luggage unattended throughout the airport. On some occasions passengers are forgetting their luggage altogether and boarding their plane. This leaves a number of pieces of luggage in various places throughout the airport.

The airport has purchased a robot that can maneuver through the airport and analyze luggage to ensure it is not dangerous. The airport however did not purchase the software to help the robot navigate throughout the airport.

You job is to write software to help the robot search the entire airport and report back the **number** and **locations** of all dangerous luggage.

You will read in a map representing the airport and then use a DEPTH FIRST SEARCH algorithm to ensure the robot travels to all reachable squares in the map.

A sample map:
```
10 6
WWWWWWWWWW
WEREEWEXEW
WEEEEWEEEW
WEEEEWEEEW
WEEEEEEEEW
WWWWWWWWWW
```

The first two numbers are the columns and rows of the map. Followed by rows x columns characters such that a W indicates a wall (the robot **cannot** travel through walls), an R indicates the current location of the Robot, an X indicates a dangerous package (of course in real life we wouldn't know ahead of time where the X's are) and lastly an E indicates an open space that the robot can travel through. You may assume the robot can move through or occupy any tile that is not a W, i.e., an X doesn't block the robot.

For the above sample map the output might be:
```
Pieces of dangerous luggage found: 1
Locations of dangerous luggage: (1, 7)
```
The locations within the map start at (0,0) in the top left corner and are reported as (row, col). You can assume the map is closed, i.e., W's surround exterior row, col positions in the map.

The robot can move one square at a time in any of 4 directions, N, S, E(ast) or W(est) but not through walls.

A sample map is provided in file map.txt.
