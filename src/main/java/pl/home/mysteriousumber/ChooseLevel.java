package pl.home.mysteriousumber;

import java.util.Scanner;

public class ChooseLevel {

    protected int getLevel(Scanner sc, int level, int no) {
        while ((level != 1) && (level != 2) && (level != 3)){

            System.out.println("Choose the level of difficulty:");
            System.out.println("EASY - push 1");
            System.out.println("MEDIUM - push 2");
            System.out.println("HARD - push 3");
            level = sc.nextInt();

            if (level == 1){
                no = 50;
            }
            if (level == 2){
                no = 75;
            }
            if (level == 3){
                no = 100;
            }
            if ((level != 1) && (level != 2) && (level != 3)){
                System.out.println("Wrong choice");
            }
        }
        return no;
    }

}
