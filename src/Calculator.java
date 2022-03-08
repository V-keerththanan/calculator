import java.util.Scanner;

class OwnCalculator{
    double sum(double x,double y) {
        return x+y;
    }
    double sub(double x,double y) {
        return x-y;
    }
    double mul(double x,double y) {
        return x*y;
    }
    double div(double x,double y) {
        return x/y;
    }
}





public class Calculator {
    public static void main(String[] args) {
        int selection;
        double number1, number2, result;
        int checker;
        OwnCalculator casio=new OwnCalculator();

        Scanner in = new Scanner(System.in);
        System.out.println("\n.........................Welcome....................\n");
        System.out.println("What do you Want to do?\n");

        do {

            System.out.println("Press num 1 for Sum\npress num 2 for diff\npress num 3 for multi\npress num 4 for divid\n");
            selection = in.nextInt();


            System.out.println("Enter first number");
            number1 = in.nextDouble();

            System.out.println("Enter second number");
            number2 = in.nextDouble();

            switch(selection) {

                case 1:
                    result = casio.sum(number1, number2);
                    System.out.println(number1 + " + " + number2 + " : " + result);
                    break;


                case 2:
                    result = casio.sub(number1, number2);
                    System.out.println(number1 + " - " + number2 + " : " + result);
                    break;


                case 3:
                    result =  casio.mul(number1, number2);
                    System.out.println(number1 + " * " + number2 + " : " + result);
                    break;


                case 4:
                    result =  casio.div(number1, number2);
                    System.out.println(number1 + " / " + number2 + " : " + result);
                    break;

                default:
                    System.out.println("Invalid Selection");
                    break;
            }
            System.out.println("If you wanto continue , press 1 or exit press 0");

            checker=	in.nextInt();


        }while(checker==1);

        System.out.println("\n.........................Good Bye............");


    }

}
