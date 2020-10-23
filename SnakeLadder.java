import java.util.Random;

public class SnakeLadder {
    static Random rn=new Random();
    final static int winPoint=100;
    final static int startPosition=0;
    final static int NumberOfPlayer=0;
    final static int noPlay=1;
    final static int ladder=2;
    final static int snake=3;
    static int userPosition=startPosition;

    public static int getUserPosition() {
        return userPosition;
    }

    public static void setUserPosition(int userPosition) {
        SnakeLadder.userPosition = userPosition;
    }

    public static int rollDice()
    {
        int diceValue=rn.nextInt(6)+1;
        return diceValue;
    }

    public static int playerOption()
    {
        int option=rn.nextInt(3)+1;
        return option;
    }
    public static void main(String[] args) {
        int numberOfThrownDice=0;
        while ( getUserPosition() != winPoint)
        {
            numberOfThrownDice=numberOfThrownDice+1;
            int numberOnDice=rollDice();
            int option= playerOption();
            if ( getUserPosition() < 1)
            {
                setUserPosition(startPosition);
            }

            if (option == noPlay)
            {
                setUserPosition(getUserPosition());
            }
            else if (option == ladder)
            {
                if (getUserPosition()+rollDice() > 100)
                {
                    setUserPosition(getUserPosition());
                }
                else
                {
                    setUserPosition(getUserPosition()+rollDice());
                }

            }
            else if(option == snake)
            {
                setUserPosition(getUserPosition()-rollDice());
            }
            System.out.println(" Times of Dice Thrown : " + numberOfThrownDice + " Position of User :" +getUserPosition());
        }
        System.out.println("Total number of dice thrown by Player to Win :" +numberOfThrownDice);
    }
}

