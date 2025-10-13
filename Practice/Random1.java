import java.util.Random;

public class Random1{
	public static void main(String[] args){

		Random random = new Random();
		int number1 = random.nextInt(11, 20);
		int number2 = random.nextInt(1, 11);
		int number3 = random.nextInt(20, 30);


		System.out.println(number1);
		System.out.println(number2);
		System.out.println(number3);

		double number4 = random.nextDouble(11, 20);
		double number5 = random.nextDouble(1, 11);
		double number6 = random.nextDouble(20, 30);


		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);

		boolean head = random.nextBoolean();
		System.out.println(head);

	


	}
}