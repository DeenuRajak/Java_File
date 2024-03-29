import java.util.*;


class Guesser{
    int guessNum;
    int guesserNum(){
        System.out.println("Guesser!!!  kindly guess the number :");
        try (Scanner scan = new Scanner(System.in)) {
            guessNum = scan.nextInt();
        }
        return guessNum;
    }
}

class Player{
    int guessNum;
    int guesserNum(){
        System.out.println("Player!!! kindly guess the number :");
        try (Scanner scan = new Scanner (System.in)) {
            guessNum = scan.nextInt();
        }
        return guessNum;
    }
}
class Umpire{

    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;


    void collectNumFromGuesser(){
      Guesser g = new Guesser();
      numFromGuesser = g.guesserNum();
    }

    void collectNumFromPlayer(){
       Player p1= new Player();
       Player p2= new Player();
       Player p3= new Player();

       numFromPlayer1=p1.guesserNum();
       numFromPlayer2= p2.guesserNum();
       numFromPlayer3=p3.guesserNum();

    }
  void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser == numFromPlayer2 &&numFromGuesser  ==numFromPlayer3){
                System.out.println(" Player1 ,Player2 & Player 3 All of these won the Game");
            }else if(numFromGuesser==numFromPlayer2){
            System.out.println("Player1 & Player2 both  won the game ");
        }else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player1 & Player 3 both  won the Game");
        }else{
            System.out.println("Player1 won the Game");
        }
        }
        else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println(" Player2 & Player 3 both won the Game");
            }else {
                System.out.println(" Player3 won the Game");

            }
        }else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3  won the Game");
        }
        else{
            System.out.println("OOPS!!! All of you lose the Game Please try again");
        }
  }
}
public class GuesserGame1 {

    public static void main(String []args){
        System.out.println("Game Started!!!");
         Umpire u = new Umpire();
        
         u.collectNumFromGuesser();
         u.collectNumFromPlayer();
         u.compare();
    
    }
    
}
