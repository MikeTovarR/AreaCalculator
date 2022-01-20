import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {


        calculateArea(); //star wih this function, it contains all the main code

    }

    public static void calculateArea(){ //with this function, the code avoid crashes, if it crashes, the function just call itself again

        try {

            Menu menu = new Menu();
            Scanner scanner = new Scanner(System.in);
            boolean calculatorOFF = false;
            while(!calculatorOFF){          //the calculator still running until you want to exit

                System.out.println("The measure of the area is: " + menu.mainMenu());
                System.out.println("Calculate another area?\nPRESS ANY KEY TO CONTINUE\nPRESS '1' TO EXIT");
                if(scanner.nextInt() == 1) calculatorOFF = true;            //you can exit pressing '1' when it asks you
            }

        }
        catch(Exception e) {

            System.out.println("\nYou entered an invalid option. Please try again\n\n");
            calculateArea();            //recursive when it crashes
        }

    }
}
