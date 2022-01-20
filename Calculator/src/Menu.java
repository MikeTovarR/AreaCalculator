import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Shape shape = new Shape();

    public float mainMenu(){
        int shapeType;
        float area = 0;
        boolean validate = false;  //validate if the program could calculate the area, turns true when it finishes

        while(!validate){   //creates a menu that will restart in case you enter an invalid value

            System.out.println("Select the shape to calculate area:\n1. Square\n2. Rectangle\n3. Triangle\n4. Circle\n" +
                    "5. Pentagon\n6. Semicircle\n7. Pentagram");        //different shapes to choose

            shapeType = scanner.nextInt();

            shape.setShapeType(shapeType);      //here you create the selected shape

            switch(shapeType) {

                case 1:
                    askBase();
                    area = shape.calculate();       //calculate function make the basic operation that is common in all the shapes,
                                                    // a multiplication between the base and the height. in the square case is just base * base
                    validate = true;                //once the area is calculated, exit the menu
                    break;

                case 2:
                    askBase();
                    askHeight();
                    area = shape.calculate();       //rectangle area involves base and height, you need to enter both and the function calculate
                                                    //the multiplication automatically
                    validate = true;
                    break;

                case 3:
                    askBase();
                    askHeight();
                    area = (shape.calculate()/2);    //triangle area, the base * height function, and the result /2
                    validate = true;
                    break;

                case 4:
                    askHeight();
                    area = shape.calculate();       //in the circle case, if you divide it in triangles, the radius is the height
                                                    //area is radius * radius * pi (or height * height * pi)
                    validate = true;
                    break;

                case 5:
                    askBase();
                    askHeight();
                    area = (shape.calculate()*5/2); //for the pentagon, you calculate 5 triangles inside the pentagon shape
                    validate = true;
                    break;

                case 6:
                    askHeight();
                    area = (shape.calculate()/2);   //semicircle is the circle formula, and the result /2
                    validate = true;
                    break;

                case 7:
                    askBase();
                    askHeight();

                    area = (shape.calculate()*5/2);         //here is the area of the pentagon at the center of the pentagram,
                    System.out.println("Enter the measure of the height of the triangles of the Pentagram");
                    shape.setHeight(scanner.nextFloat());
                    area = area+(5*shape.calculate()/2);    //and you add the result of the sum of the areas of the external triangles
                                                            //they may have a different height, but the same base as the pentagon
                    validate = true;
                    break;

                default:
                    System.out.println("\nInvalid option, please try again\n");
                    break;
            }

        }

        return area;        //the function returns the measure of the area

    }

    private void askBase(){

            System.out.println("Enter the measure of the base of the shape");
            shape.setBase(scanner.nextFloat());

    }                                                      //asks and set the measures of the base and height
    private void askHeight(){

        System.out.println("Enter the measure of the height of the shape");
        shape.setHeight(scanner.nextFloat());

    }

}
