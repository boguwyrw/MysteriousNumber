package pl.home.mysteriousumber;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        ChooseLevel choiceLevel = new ChooseLevel();
        WrongNumber wrongNumber = new WrongNumber();
        Winner win = new Winner();
        Looser loose = new Looser();

        int level = 0;
        int no = 0;
        int guessNo = 0;

        no = choiceLevel.getLevel(sc, level, no);
        int secretNo = rd.nextInt(no) + 1;

        char[] looser = {' ', 'L', 'O', 'O', 'S', 'E', 'R'};

        System.out.println("Guess number between 1 and " + no);

        while (guessNo != secretNo) {

            System.out.println("Give a number:");
            guessNo = sc.nextInt();

            win.youAreWinner(guessNo, secretNo);

            if (loose.youLoose(guessNo, secretNo, looser)) {
                break;
            }
            wrongNumber.choosenWrongNo(guessNo, secretNo);
        }

    }
}
