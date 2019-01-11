[![Build Status](https://travis-ci.com/StratfordHS-CS2/lab-16-tictactoe-checker-username.svg)](https://travis-ci.com/StratfordHS-CS2/lab-16-tictactoe-checker-username)

# Lab 16 - Tic Tac Toe Checker

## Lab Goal
You will load a completed tic-tac-toe game from a string into a 2d array of chars. You will be determining if there is a winner in the completed game.

## Instructions
* Complete the method `fillGame`. The method receives a completed game as a String and needs to fill the `game` array appropriately.
* Complete the method `printGame`. This method should print the completed game. See the sample output below.
* Complete the method `getWinner`. This method should return a string saying who the winner is and in which direction. See teh sample output below.
* You do not need to edit the `main` method.
* Complete all javadoc comment with the proper tags.

## Sample Output
```
X X X
O O X
X O O
X wins horizontally!

O X O
O X O
X O X
cat's game - no winner!

O X O
X X O
X O O
O wins vertically!

O X X
O X O
X O O
X wins diagonally!

X O X
O O O
X X O
O wins horizontally!
```

## Notes
* The Checkstyle config url is http://www.daveavis.com/cs/checkstyle_SHS.xml
* Make sure you modify the link at the top of your **Readme.md** to reflect your username if you want the badge at the top to represent the status of your code.

## Grading
* 20 - Correctly identifies a horizontal winner.
* 20 - Correctly identifies a vertical winner.
* 20 - Correctly identifies a diagonal winner.
* 20 - Correctly identifies a game with no winner.
* 10 - Correctly prints the game.
* 10 - style

Note that these are potential maximums; the computer can only check so much.  If your code passes Checkstyle, but I see non-descriptive variable names, then your style grade will go down.  If your code passes all tests, but I see code that was copied off of the internet or from another student your grade will go *way* down.
