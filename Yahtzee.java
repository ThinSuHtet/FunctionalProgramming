import java.util.*;
public class Yahtzee{
  public static int rollDice(){
    double randomNum = Math.random() * 6;
    randomNum += 1;
    return (int) randomNum;
  }
  public static int roll2Dice(){
    int dice1 = rollDice();
    int dice2 = rollDice();
    int count = 1;
    while(!(dice1 == dice2)){
      dice1 = rollDice();
      dice2 = rollDice();
      count += 1;

    }
    return count;
  }
  public static int roll3Dice(){
    int dice1 = rollDice();
    int dice2 = rollDice();
    int dice3 = rollDice();
    int count = 1;
    while(!(dice1 == dice2 && dice2 == dice3)){
      dice1 = rollDice();
      dice2 = rollDice();
      dice3 = rollDice();
      count += 1;

    }
    return count;
  }
  public static int rollYahtzee(){
    int dice1 = rollDice();
    int dice2 = rollDice();
    int dice3 = rollDice();
    int dice4 = rollDice();
    int dice5 = rollDice();
    int count = 1;
    while(!(dice1 == dice2 && dice2 == dice3 && dice3 == dice4 && dice4 == dice5)){
      dice1 = rollDice();
      dice2 = rollDice();
      dice3 = rollDice();
      dice4 = rollDice();
      dice5 = rollDice();
      count += 1;

    }
    return count;
  }
  public static void main(String[] args){
    int r2 = roll2Dice();
    System.out.println("Number of count for rolling two dice to get same value: "+ r2);
    int r3 = roll3Dice();
    System.out.println("Number of count for rolling three dice to get same value: "+ r3);
    int play_yahtzee = rollYahtzee();
    System.out.println("Playing Yahtzee: "+play_yahtzee);

    //Two players playing Yahtzee game
    System.out.println("------------Two Players Playing Yahtzee Games------------");
    int player1 = rollYahtzee();
    System.out.println("Player 1 rolling a Yahtzee: "+player1);
    int player2 = rollYahtzee();
    System.out.println("Player 2 rolling a Yahtzee: "+player2);
    if(player1 < player2){
      System.out.println("Winner is Player 1!!");
    }
    else if(player2 < player1){
      System.out.println("Winner is Player 2!!");
    }
    else{
      System.out.println("The game is a draw!!!");
    }
  }
}