# ski-jumping-tournament
Simulator for a ski jumping tournament

This is a project that was done through a MOOC course (Object-Oriented programming with Java, part II) by University of Helsinki. 
This specific project was the end project for week 8 ( https://materiaalit.github.io/2013-oo-programming/part2/week-8/ ).

As it is a part of the course, it is validated through TMC which runs the tests online, so my project had to be modified in some parts to accommodate the tests so that I would get points for it.

This is how the project should work:

First, the simulator asks the user for the jumper names. If the user inputs an empty string (i.e. presses enter), we move to the jumping phase. In the jumping phase, the jumpers jump one by one in reverse order according to their points. The jumper with the less points always jumps first, then the ones with more points, till the person with the most points.

The total points of a jumper are calculated by adding up the points from their jumps. Jump points are decided in relation to the jump length (use a random integer between 60-120) and judge decision. Five judges vote for each jump (a vote is a random number between 10-20). The judge decision takes into consideration only three judge votes: the smallest and the greatest votes are not taken into account. For instance, if Mikael jumps 61 meters and the judge votes are 11, 12, 13, 14, and 15, the total points for the jump are 100.

There are as many rounds as the user wants. When the user wants to quit, we print the tournament results. The tournament results include the jumpers, the jumper total points, and the lengths of the jumps. The final results are sorted against the jumper total points, and the jumper who received the most points is the first.
