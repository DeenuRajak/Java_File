import java.util.*;
class Guesser{
    int guesserNum;
    int guessingNumber () {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Guesser!! Kindly guess the number :");
            guesserNum = scan.nextInt();
        }
        return guesserNum;
    }
}
 class Player{
    int guesserNum;
    int guessingNumber(){
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Player!! kindly guess the number :");
            guesserNum =scan.nextInt();
        }
        return guesserNum;
    }
 }

 class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g = new Guesser();
        numFromGuesser = g.guessingNumber();
    }

    void collectNumFromPlayer(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();

        numFromPlayer1=p1.guessingNumber();
        numFromPlayer2=p2.guessingNumber();
        numFromPlayer3=p3.guessingNumber();

    }

    void compare(){
        if(numFromGuesser==numFromPlayer1){
            System.out.println("Player 1 won  the game :");
        }else if(numFromGuesser==numFromPlayer2){
            System.out.println("Player 2 won the game :");
        }else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 won the game :");
        }else{
            System.out.println("No one won the game Please try again!!");
        }
    }
 }

public class GuesserGame {

    public static void main(String [] args){
        System.out.println("Game Started!!!");
        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();
    }    
}
