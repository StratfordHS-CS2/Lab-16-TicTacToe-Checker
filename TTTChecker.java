import java.util.Scanner;
import java.io.File;
import java.io.IOException;

/**
 * Write a description of class TTTChecker here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TTTChecker
{
    // This variable holds the current tic-tac-toe board.
    // This is available to each method without having to pass
    // it to the method.
    public static char[][] game;
    
    /**
     * 
     */
    public static void fillGame( String gameStr )
    {
        // you need to take the game string "XXOOXOOXX" and
        // put it into "game". Fill row 1, then row 2, then row 3.
        
        // you will first need to create a new 3x3 char array to store in game.
    }
    
    /**
     * 
     */
    public static String printGame()
    {
        // return the game board as a printable string
        // make sure to include \n to change rows.
        String output="";
        // your code goes here
        
        return output.trim();
    }
    
    /**
     * 
     */
    public static String getWinner()
    {
        // Test to see if there is a winner.  Return who won and how.
        // Example Ouput:
        // "X wins horizontally!"
        // "O wins vertically!"
        // "X wins diagonally!"
        // "cat's game - no winner"
        String winner = "";
        
        return winner + "\n";
    }
    
    /**
     * You do not need to edit this method.
     * 
     * Reads a list of tic-tac-toe games from a file and runs the 
     * above methods on each game.
     * 
     * @param args not used
     * @throws IOException if the file is not opened properly.
     */
    public static void main( String[] args ) throws IOException
    {
        // Create a new scanner to read from a file in the same folder as this class.
        Scanner file = new Scanner( new File("tictactoe.dat" ) );
        
        // The first line of the file contains the number of games in the file
        int games = file.nextInt();
        file.nextLine();
        
        // Read the file line by line and process each line as a game.
        for( int i = 0; i < games; i++ )
        {
            fillGame( file.nextLine() );
            System.out.println( printGame() );
            System.out.println( getWinner() );
        }
    }
}
