package pl.home.mysteriousumber;

public class Winner {

    public void youAreWinner(int guessNo, int secretNo){
        if (guessNo == secretNo){
            System.out.println("You are the winner");
            return;
        }
    }

}
