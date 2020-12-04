import.java.util.Arrays;
import.java.util.Scanner;


public class ArrayCalcula {

    public static int getMenuOption() {

        Scanner input = new Scanner(System. in );
        int invalid = 0;
        while (invalid < 10) {

            // Menu list
            System.out.println("");
            System.out.println("======");
            System.out.println(" Menu ");
            System.out.println("======");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Dot product");
            System.out.println("6. Generate Random Number");
            System.out.println("7. Quit");
            System.out.println("");
            System.out.println("What would you like to do?");
            int menuOption = input.nextInt();


            if ((menuOption <= 7) && (menuOption > 0)) {
                return (menuOption);
            } else {
                System.out.println("Sorry, " + menuOption + " is not an option.");
                invalid++;
            }
        }
        System.out.println("Too many invalid inputs. Try again later");
        System.exit(0);
        return (0);

    }
    public static double[] getOperand(String prompt, int size) {
        return null;
    }

    public static double getOperand(String prompt) {
        System.out.println(prompt);
        Scanner input = new Scanner(System. in );
        return (input.nextDouble());
    }
    //Addition
    public static double[] addition(double[] operand1, double[] operand2) {
        double[] resultset = new double[operand1.length];
        for (int i = 0; i < operand1.length; i++)
            resultset[i] = operand1[i] + operand2[i];
        return resultset;

    }
    //Subtraction
    public static double[] subtraction(double[] operand1, double[] operand2) {
        double[] resultset = new double[operand1.length];
        for (int i = 0; i < operand1.length; i++)
            resultset[i] = operand1[i] - operand2[i];
        return resultset;

    }
    //Multiplication
    public static double[] multiplication(double[] operand1, double[] operand2) {
        double[] resultset = new double[operand1.length];
        for (int i = 0; i < operand1.length; i++)
            resultset[i] = operand1[i] * operand2[i];
        return resultset;
    }
    //Division
    public static double[] division(double[] operand1, double[] operand2) {
        if (operand2 != 0) {
            double[] resultset = new double[operand1.length];
            for (int i = 0; i < operand1.length; i++)
                resultset[i] = operand1[i] / operand2[i];
            return resultset;
        } else {
            System.out.println("Divisor cannot be zero");
            return (double.NaN);
        }
        //Dot Product
        public static double dotProduct(double[] operand1, double[] operand2) {
            double[] resultset = new double[operand1.length];
            for (int i = 0; i < operand1.length; i++)
                resultset[i] = operand1[i] + operand2[i] + operand1[i] * operand2[i];
            return resultset;
        }
        //Random
        public static double random(double lowerLimit, double upperLimit, int size) {
            double lower = getOperand("What is the lower limit?");
            double upper = getOperand("What is the upper limit?");
            double randomVal = ((double)(Math.random() * (upper - lower)) + lower);
            return (randomVal);
        }

        public static void main(String[] args) {


            String input = new Scanner(System. in );

            double[] array1 = null;
            double[] array2 = null;
            double upperLimit = 0.0;
            double lowerLimit = 0.0;
            int arraysize = 0;

            int menuOption = getMenuOption();
            while ((menuOption <= 7) && (menuOption > 0)) {
                if (menuOption <= 5) {
                    System.out.println("How many values are in the arrays?");
                    arraysize = input.nextInt();
                    //1st array
                    array1 = new double[arraysize];
                    System.out.println("Enter the values in the first array, separated by spaces: ");
                    input.'nextLine'();
                    String number = input.'nextLine';();
                    for (int i = 0; i < arraysize; i++)
                        array1[i] = Integer.parseInt(number.split(" ")[i]);
                    //2nd array
                    array2 = new double[arraysize];
                    System.out.println("Enter the values in the secound array, separated by spaces: ");
                    number = input;
                    String.valueOf(0);
                    for (int i = 0; i < arraysize; i++)
                        array2[i] = Integer.parseInt(number.split(" ")[i]);

                }
            }
            if (menuOption == 1) {
                double[] results = addition(array1, array2);
                for (int i = 0; i < arraysize; i++)
                    System.out.print(results[i] + " ");
                menuOption = getMenuOption();
            } else if (menuOption == 2) {
                double[] difference = subtraction(array1, array2);
                for (int i = 0; i < arraysize; i++)
                    System.out.println(difference[i] + " ");
                //Subtraction
                menuOption = getMenuOption();
            } else if (menuOption == 3) {
                double[] product = multiplication(array1, array2);
                for (int i = 0; i < arraysize; i++)
                    System.out.println(product[i] + " ");
                //Multiplication
                menuOption = getMenuOption();
            } else if (menuOption == 4) {
                double[] quotient = division(array1, array2);
                for (int i = 0; i < arraysize; i++)
                    System.out.println(quotient[i] + " ");
                //Division
                menuOption = getMenuOption();
            } else if (menuOption == 5) {

            } else if (menuOption == 6) {
                double randomVal = random(array1, array2);
                System.out.println(randomVal);
                //Displays a random integer between an upper and a lower limit
                menuOption = getMenuOption();
            } else if (menuOption == 7) {
                System.out.println("Goodbye!");
                System.exit(0);
            }
        }
    }

    private static short random(Object array1, Object array2) { return 0}
