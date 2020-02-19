package epam.HT4.HomeTask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class ConstructionCost {
	public void menu() {
		int choice;
		double area;
		Scanner scanner = new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.println("\n1. Standard Material(1200 psf).");
		output.println("2. Above Standard Material(1500 psf).");
		output.println("3. High Standard Material(1800 psf).");
		output.println("4. High Standard Material and fully Automated Home(2500 psf).");
		output.print("Select an option : ");
		choice = scanner.nextInt();
		switch(choice) {
		case 1 : output.print("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 output.println("Total cost required = " + (1200 * area) +" INR");
				 break;
		case 2 : output.print("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 output.println("Total cost required = " + (1500 * area)+" INR");
		 		 break;
		case 3 : output.print("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 output.println("Total cost required = " + (1800 * area) +" INR");
		         break;
		case 4 : output.print("Enter the area in square feets : ");
				 area = scanner.nextDouble();
				 output.println("Total cost required = " + (2500 * area) +" INR");
				 break;
		default: output.println("Enter a valid Choice.");
		}
	}
}
