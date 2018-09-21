package guessing;

/*
 
Author: Joseph Sweeney
Version: 1.0
Player class to give each player a random number
 
*/

public class Player{

    int number = 0;

    public void guess(){
        number = (int) (Math.random()*10);
        System.out.println("I'm guessing "+number);
    }

}
