package guessing;

public class guessGame{

    public void startGame(){

    	Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1correct = false;
        boolean p2correct = false;
        boolean p3correct = false;

        int targetnumber = (int) (Math.random()*10);
        System.out.println("I'm thinking of a number between 1 and 9...");

        boolean win = false;

        while(win == false) {

            System.out.println("The number to guess is " + targetnumber);

            p1.guess();
            p2.guess();
            p3.guess();

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