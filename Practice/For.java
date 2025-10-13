import java.util.Scanner;
public class For{
	public static void main(String[] args){
		
		//for(int count =7 ; count <10; count = count + 1){
		//System.out.println(count);

		/* int count = 0;
		while(count <10){
		System.out.println(count);
		count = count + 2;
		}			

		int x = 0;
 		int total = 0;
 		while (x <= 10) {
		x = x +1;
   		total = total + x;

		System.out.println(total);
		}				*/

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your age: ");
		int age = scanner.nextInt();

		/* while(age <0){
		System.out.println("Please enter your age");
		System.out.print("Enter your age: ");
		 age = scanner.nextInt();
		}
		System.out.println("You are" + age + "years old"); */


int total = 0;
for(int count = age; count < age; count--){
total = total + age;
System.out.print(total);
}
	

	}
}