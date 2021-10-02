import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);


        System.out.print("First Number: ");
        int firstNum = in.nextInt();

        System.out.print("First Number: ");
        int secondNum = in.nextInt();

        System.out.print("Which operator (+,-,*,/): ");
        String operator = in.next();

        in.close();

    switch(operator){
        case "+":
            System.out.println(firstNum+secondNum);
            break; 
        case "-":
            System.out.println(firstNum-secondNum);
            break;
        case "*":
            System.out.println(firstNum*secondNum);
            break;
        case "/":
            System.out.println(firstNum/secondNum);
            break;
    default:
    System.out.println("Invalid operator");


       }






    }
}

// Write a program to create a calculator that can Add, Subtract, Multiply, and Divide 2 numbers entered by the user. Also, add an option to exit out from the program.

 

//   OPTIONS

// 1. Add

// 2. Subtract

// 3. Multiply

// 4. Divide

// 5. Exit

 

// 1. Write different methods for each module (add, subtract, multiply, and divide).

// 2. Use switch/case to call the particular method.

// 3. Take input inside the methods to perform the related operation.

// 4. Return the answer and display it inside the main method.

// 5. Display a default message (ex. "Invalid Entry, Try Again") if any number other than 1-5 is entered by the user