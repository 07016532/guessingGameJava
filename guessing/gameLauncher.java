package guessing;

/*

Author: Joseph Sweeney
Version: 1.0
gameLauncher class simply to launch a new guessGame object
 
*/

public class gameLauncher{

    public static void main(String[] args) {
        guessGame game = new guessGame();
        game.startGame();

    }
}