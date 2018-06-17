package pl.home.mysteriousumber;

public class WrongNumber {

    public void choosenWrongNo (int guessNo, int secretNo){
        if (guessNo > secretNo){
            System.out.println("Mysterious number is smaller");
            System.out.println("Try again");
        } else if (guessNo < secretNo){
            System.out.println("Mysterious number is bigger");
            System.out.println("Try again");
        }
    }

}
