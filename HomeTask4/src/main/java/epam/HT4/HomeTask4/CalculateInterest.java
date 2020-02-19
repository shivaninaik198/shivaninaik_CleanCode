package epam.HT4.HomeTask4;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
public class CalculateInterest {
	double amount, time, rate;
	public void read() {
		Scanner sc = new Scanner(System.in);
		PrintStream output = new PrintStream(new FileOutputStream(FileDescriptor.out));
		output.print("Enter the Principal Amount : ");
		amount = sc.nextDouble();
		output.print("Enter the Time Period : ");
		time = sc.nextDouble();
		output.print("Enter the Rate of Interest : ");
		rate = sc.nextDouble();
		double s_interest = calculateSimpleInterest();
		output.println("Simple Interest = "+ s_interest+" INR");
		double c_interest = calculateCompoundInterest();
		output.println("Compound Interest = "+ c_interest+" INR");
	}
	public double calculateSimpleInterest() {
		return (amount * time * rate)/100;
	}
	public double calculateCompoundInterest() {
		return (amount *(Math.pow(1+(rate/100), time) - 1));
	}
}
