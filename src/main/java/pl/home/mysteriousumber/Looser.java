package pl.home.mysteriousumber;

public class Looser {

    int countdown = 0;
    public boolean youLoose(int guessNo, int secretNo, char[] looser){

        if (guessNo != secretNo){
            countdown++;
        }

        for (int i = 1; i <= countdown; i++){
            System.out.print(looser[i]);
        }
        System.out.println();

        if (countdown == looser.length-1){
            System.out.println("You are looser");
            System.out.println("Mysterious number is " + secretNo);
            return true;
        }
        return false;
    }

}
