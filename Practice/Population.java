import java.util.Scanner;

public class Population{
	public static void main(String[] args){
	
	Scanner scanner = new Scanner(System.in);
	/* p(t) = p0 * (1 * r)^t where
	p = population, t= no of years, p(t) = population after t years
	p0 = initial population, r = growth rate(%) */

	System.out.print("Enter current population: ");
	double population = scanner.nextDouble();

	System.out.print("Enter No of years: ");
	double years = scanner.nextDouble();

	System.out.print("Enter growth rate in percentage: ");
	double growth = scanner.nextDouble();

	double  pafter = population * Math.pow((1 + growth), years); 
	
	System.out.println("Estimated world population is: " +pafter);

	}
}


	

	 
	
