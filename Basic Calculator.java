/*       
 * - Assessment : Assignment 01
 * - Student Name   : Dadallage Samarasinghe, Student
 * - Due Date       : 07.02.2021
 * - Description    : A program designed to do speifc math equations.
 * - Professor Name : David Haley, Professor
 */
import java.util.Scanner;
public class Assignment01 {
    public static void main(String[] args) {
    	// Identify the numbers with float variable.
    	float num1,num2,num3,total,average;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Number 1: ");
		num1 = in.nextFloat();
		System.out.print("Enter Number 2: ");
		num2 = in.nextFloat();
		System.out.print("Enter Number 3: ");
		num3 = in.nextFloat();
		//Calculate the sum of three numbers.
		total=num1+num2+num3;	
		//Print the sum of three numbers.
		System.out.println("The sum of three numbers: " +total);
		// Calculate the average of the three numbers.
		average=total/3;
		//Print the average of the three numbers.
		System.out.println("The Average of three numbers: "+average);
		//Print the square root of the sum of the three numbers.
		System.out.println("The Square root of the sum of three numbers: " + Math.sqrt(total));
		//Print the Answer of Raise the Number 1 to the power of the Number 2.
		System.out.println("The Answer of Raise Number 1 to the Power of Number 2: " + Math.pow(num1, num2));
		//Print the Answer of Raise the Number 2 to the power of the Number 3.
		System.out.println("The Answer of Raise Number 2 to the Power of Number 3: " + Math.pow(num2, num3));
		//Print the Answer of Raise the Number 3 to the power of the Number 1.
		System.out.println("The Answer of Raise Number 3 to the Power of Number 1: " + Math.pow(num3, num1));
        // Print my name.
        System.out.print("My name: Dadallage Hiran Uddeepana Samarasinghe");
}
}


