import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class TTTCheckerTest.
 *
 * @author  Dave Avis
 * @version 1.11.2019
 */
public class TTTCheckerTest
{
    /**
     * Test for a horizontal winner.
     */
    @Test(timeout=2000)
    public void horizontalWinnerTest()
    {
        String[] inputs = { "XXXOOXXOO", "XOXOOOXXO" };
        String[] results = { "X H", "O H" };
        
        TTTChecker game;
        for( int i = 0; i < inputs.length; i++ )
        {
            boolean valid = false;
            game = new TTTChecker();
            
            game.fillGame( inputs[i] );
            
            String[] resultsArr = results[i].split(" ");
            char winner = resultsArr[0].charAt(0);
            char dir = resultsArr[1].charAt(0);
            
            String output = game.getWinner();
            output = output.toUpperCase();
            if( output.indexOf( winner ) >= 0 && output.indexOf( dir ) >= 0 )
            {
                valid = true;
            }
            assertTrue( "Testing for horizontal winner failed (" + inputs[i] + ")", valid );
        }
    }
    
    /**
     * Test for a vertical winner.
     */
    @Test(timeout=2000)
    public void verticalWinnerTest()
    {
        String[] inputs = { "OXOXXOXOO", "0XXX0X00X" };
        String[] results = { "O V", "X V" };
        
        TTTChecker game;
        for( int i = 0; i < inputs.length; i++ )
        {
            boolean valid = false;
            game = new TTTChecker();
            
            game.fillGame( inputs[i] );
            
            String[] resultsArr = results[i].split(" ");
            char winner = resultsArr[0].charAt(0);
            char dir = resultsArr[1].charAt(0);
            
            String output = game.getWinner();
            output = output.toUpperCase();
            if( output.indexOf( winner ) >= 0 && output.indexOf( dir ) >= 0 )
            {
                valid = true;
            }
            assertTrue( "Testing for vertical winner failed (" + inputs[i] + ")", valid );
        }
    }
    
    /**
     * Test for a diagonal winner.
     */
    @Test(timeout=2000)
    public void diagonalWinnerTest()
    {
        String[] inputs = { "OXOXOXOXX", "00XXX0X00" };
        String[] results = { "O D", "X D" };
        
        TTTChecker game;
        for( int i = 0; i < inputs.length; i++ )
        {
            boolean valid = false;
            game = new TTTChecker();
            
            game.fillGame( inputs[i] );
            
            String[] resultsArr = results[i].split(" ");
            char winner = resultsArr[0].charAt(0);
            char dir = resultsArr[1].charAt(0);
            
            String output = game.getWinner();
            output = output.toUpperCase();
            if( output.indexOf( winner ) >= 0 && output.indexOf( dir ) >= 0 )
            {
                valid = true;
            }
            assertTrue( "Testing for diagonal winner failed (" + inputs[i] + ")", valid );
        }
    }
    
    /**
     * Test for a cat's game.  No winner.
     */
    @Test(timeout=2000)
    public void noWinnerTest()
    {
        String[] inputs = { "OXOOXOXOX", "XOXXOXOXO" };
        String[] results = { "C C", "C C" };
        
        TTTChecker game;
        for( int i = 0; i < inputs.length; i++ )
        {
            boolean valid = false;
            game = new TTTChecker();
            
            game.fillGame( inputs[i] );
            
            String[] resultsArr = results[i].split(" ");
            char winner = resultsArr[0].charAt(0);
            char dir = resultsArr[1].charAt(0);
            
            String output = game.getWinner();
            output = output.toUpperCase();
            if( output.indexOf( winner ) >= 0 && output.indexOf( dir ) >= 0 )
            {
                valid = true;
            }
            assertTrue( "Testing for cat's game failed (" + inputs[i] + ")", valid );
        }
    }
    
    /**
     * Test to make sure something resembling the expected output is produced.
     */
    @Test(timeout=2000)
    public void printGameTest()
    {
        String[] inputs = { "OXOOXOXOX", "XOXXOXOXO" };
        
        TTTChecker game;
        for( int i = 0; i < inputs.length; i++ )
        {
            boolean valid = false;
            game = new TTTChecker();
            
            game.fillGame( inputs[i] );
            
            String output = game.printGame();
            output = output.toUpperCase();
            if( output.indexOf( "\n" ) > 0 && output.length() >= 11 )
            {
                valid = true;
            }
            assertTrue( "Testing printGame() failed.", valid );
        }
    }
}