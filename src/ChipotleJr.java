/*
CHALLENGE WEEK 2

Write a program that will allow a robot to assemble 10 burritos. Use a random generator for each burrito option and build a
list of 10 burrito customizations:

Rice: white, brown, no rice
Meat: chicken, steak, carnidas, chorizo, sofritas, veggies
Beans: pinto, black, no beans
Salsa: mild, medium, hot, no salsa
Veggies: lettuce, fajita veggies, no veggies

Save the finished burritos and display the contents

psuedocode

-create 5 arrays of food category and store the types of ingredients there
- the overall  loop should run 10 times and display "burrito number: ingridients 1 from each of the 5 arrays;
-utiliits for random and also for arraylist
-randind(random index generator) will generate int to gen index number (rx upto 3 for rice, beans andveggies); (ry upto 4 for salsa); (rz upto 5 for meat)
-ur gonna get the generated randind and store the index numbers in x, y,z consequently;
-ur gonna get the value from array and put it custom

arraylist <array> customized = {custom}
 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ChipotleJr {
    public static void main(String[] args) {
//food categories declared
        String[] rice = {"white rice", "brown rice", "no rice"};
        String[] meat = {"chicken meat", "steak meat", "chorizo", "carnidas", "sofritas", "veggies"};
        String[] beans = {"pinto beans", "black beans", "no beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa"};
        String[] veggies = {"lettuce", "fajita veggies", "no veggies"};


        Random r = new Random();

        for (int i = 0; i < 10; i++) {

            //will generate the index

            int rr = r.nextInt(3), rb = r.nextInt(3), rv = r.nextInt(3);
            int rm = r.nextInt(6);
            int rs = r.nextInt(4);


            int no = i + 1;
            System.out.print(" Burrito " + no + ":  ");

            String custom[] = {rice[rr], meat[rm], beans[rb], salsa[rs], veggies[rv]}; // custom is built

            for (String gen : custom)
               // System.out.print(gen + ",   "); //will display the custom array content
           System.out.print("");

                // 'store' is array where every finished custom made burrito is stored
                ArrayList<String> store = new ArrayList<String>(Arrays.asList(custom));

            //will show Final ArrayList content display using for
            for (String str : store)
                System.out.print(str + ",   ");
                System.out.println();

        }

    }

}
