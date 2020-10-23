import java.util.Random;

public class SnakeLadder {
    static Random rn=new Random();
    final static int winPoint=100;
    final static int startPosition=0;
    final static int NumberOfPlayer=0;
    final static int noPlay=1;
    final static int ladder=2;
    final static int snake=3;
    static int user1Position=startPosition;
    static int user2Position=startPosition;
    static int numberOfThrownDice=0;
    public static int getUser1Position() {
        return user1Position;
    }

    public static void setUser1Position(int user1Position) {
        SnakeLadder.user1Position = user1Position;
    }

    public static int getUser2Position() {
        return user2Position;
    }

    public static void setUser2Position(int user2Position) {
        SnakeLadder.user2Position = user2Position;
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
    public int player1()
    {
            numberOfThrownDice=numberOfThrownDice+1;
            int numberOnDice=rollDice();
            int option= playerOption();
            if ( getUser1Position() < 1)
            {
                setUser1Position(startPosition);
            }

            if (option == noPlay)
            {
                setUser1Position(getUser1Position());
            }
            else if (option == ladder)
            {
                if (getUser1Position()+rollDice() > 100)
                {
                    setUser1Position(getUser1Position());
                }
                else
                {
                    setUser1Position(getUser1Position()+rollDice());
                }

            }
            else if(option == snake)
            {
                setUser1Position(getUser1Position()-rollDice());
            }
            System.out.println(" Times of Dice Thrown : " + numberOfThrownDice + " Position of Player 1 :" +getUser1Position());
        return user1Position;
    }
    public int player2()
    {
        numberOfThrownDice=numberOfThrownDice+1;
        int numberOnDice=rollDice();
        int option= playerOption();
        if ( getUser2Position() < 1)
        {
            setUser2Position(startPosition);
        }

        if (option == noPlay)
        {
            setUser2Position(getUser2Position());
        }
        else if (option == ladder)
        {
            if (getUser2Position()+rollDice() > 100)
            {
                setUser2Position(getUser2Position());
            }
            else
            {
                setUser2Position(getUser2Position()+rollDice());
            }

        }
        else if(option == snake)
        {
            setUser2Position(getUser2Position()-rollDice());
        }
        System.out.println(" Times of Dice Thrown : " + numberOfThrownDice + " Position of Player 2 :" +getUser2Position());
        return user2Position;
    }


    public static void main(String[] args) {
        SnakeLadder snakeLadder=new SnakeLadder();
        while (true)
        {
            int player1Position=snakeLadder.player1();
            int player2Position=snakeLadder.player2();
            if (player1Position == 100)
            {
                System.out.println("player 1 Won the game ");
                System.out.println("Total number of time thrown dice : " +numberOfThrownDice);
                break;
            }
            else if (player2Position ==100)
            {
                System.out.println("player 2 won the game");
                System.out.println("Total number of time thrown dice : " +numberOfThrownDice);
                break;
            }


        }

    }
}

