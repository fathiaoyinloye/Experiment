import java.util.Scanner;
	public class PoundstoKilogram{
		public static void main(String[] args){
			//1 pounnds = 0.454kg;

		Scanner scanner = new Scanner(System.in);
		
			System.out.print("Enter a number in pounds: ");
			double pounds = scanner.nextDouble();

			double kilogram = pounds * 0.454;

			System.out.println("Pounds converted to: " +kilogram +"kg");

	}
}