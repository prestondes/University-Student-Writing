import java.util.Scanner;
import java.io.*;
public class PersonWithFiles extends Student
{
	public PersonWithFiles()
	{	
		super();  
	}
	public void readInputFile(Scanner read )
	{	
		setStudentFirst (read.nextLine());
		setCredits(read.nextInt());
		setAddress (read.nextLine());
		setPhone (read.nextLine());
		setRateCheck(read.nextLine());
		setFoodCheck(read.nextLine());
		setPickCheck(read.nextLine());
		
	}
public void writeOutputFile( PrintWriter textStream)
	{
		textStream.println("STUDENT DATA");
		textStream.println("\n");
		textStream.println("Name: " + getStudentFirst());
		textStream.println("Credits: " + getCredits());
		textStream.println("Address " + getAddress());
		textStream.println("Phone # " + getPhone());
		textStream.println("Tuition: " + getTuition());
		textStream.println("Late Fee: " + getLateFee());
		textStream.println("Incidental Fee: " + getIncidental());
		textStream.println("Health Care: " + getHealthCare());
		textStream.println("Food Plan: " + getFoodPlan());
		textStream.println("\n");
		}
}
