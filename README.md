Documentation to keep track of progress...

Version 0.0 - Initial Project Creation...JPanel created.

Version 0.1 - Chess Board Created...Created by creating a for loop that creates the squares with the help of if statements that identify the parity of the coordination using modulo. 

Version 0.2 - Chess Pieces Printed...Images are imported using a helper method that eases the syntax for locating the image file location. Then initial piece positions are initalized in a separate class that has a method that contains 8x8 arrays 
that hold the child classes through runtime dispatch. Then the pieces are drawn with the 2D Array by using a nested for loop that first scans the columns and labels the row value to a static 0. This part then checks whether the index is null or not. If not, then
it draws the piece by identifying it through a nested switch case where it identifies the color initially, then identifies the piece name, then it uses the column value from the for loop iteration and multiplies that by 100 plus the piece width to get the x position.
y position uses the same process but instead all calculations for y pos in the mother loop holds steady at 0, meaning all pieces are drawn at the topmost part of the board. Once its done, it starts the first iteration of the inner loop where it also handles the same
logic but now the r is iterated with it sharing the c value from the mother loop. The process remains the same. Once its done, it stops and loops back to the mother loop where it repeats the process again. 
