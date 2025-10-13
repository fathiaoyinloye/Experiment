import java.util.Scanner;

public class AgeTest{

	public static void main(String[] args){

	Scanner scanner = new Scanner(System.in);
	
	System.out.print("Enter your age: ");
	int age = scanner.nextInt();
	
	if(age <= 12){
		System.out.println("I am a child");
	}
	else if(age <= 19){
		System.out.println("I am a teenager");
	}
	else {
		System.out.println("I am an adult");
	}



	}
}