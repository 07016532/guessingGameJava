package guessing;

/*
 
 Author: Joseph Sweeney
 Version: 1.0
 guessGame class to deal with UI and running of game
 
 */

public class guessGame{

    public void startGame(){
    	
    	//Create three objects using player class
    	Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        //initialise variables to hold each player's guess
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;
        
        //variables to hold each players guess = correct or != correct
        boolean p1correct = false;
        boolean p2correct = false;
        boolean p3correct = false;

        //give random number 
        int targetnumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 1 and 9...");
        
        //variable to say if there is a winner
        boolean win = false;
        
        //starts as false so will run at least once
        while(win == false) {

            System.out.println("The number to guess is " + targetnumber);
            
            //run guess function for each object
            p1.guess();
            p2.guess();
            p3.guess();
            
            //variable = variable from player class, guess function for each object
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);
            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);
            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            if(guessp1 == targetnumber){
                p1correct = true;
            }
            if(guessp2 == targetnumber){
                p2correct = true;
            }
            if(guessp3 == targetnumber){
                p3correct = true;
            }

            if(p1correct || p2correct || p3correct){

                System.out.println("We have a winner!");
                System.out.println("Player one got it right? - "+p1correct);
                System.out.println("Player two got it right? - "+p2correct);
                System.out.println("Player three got it right? - "+p3correct);
                System.out.println("Game over");
                win = true;

            }else{

                System.out.println("No winner, lets try again!");
            }


        }

    }

}