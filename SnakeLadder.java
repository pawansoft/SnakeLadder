import java.util.Random;

public class SnakeLadder {
    final static int winPoint=100;
    final static int startPosition=0;
    final static int NumberOfPlayer=0;
    public static int rollDice()
    {
        Random rn=new Random();
        int diceValue=rn.nextInt(6)+1;
        return diceValue;
    }
    public static void main(String[] args) {
        System.out.println(rollDice());

    }
}

