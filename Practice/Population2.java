public class Population2{
	public static void main(String[] args){
	
	/* p(t) = p0 * (1 + r)^t where
	p = population, t= no of years, p(t) = population after t years
	p0 = initial population, r = growth rate(%) */
	
		double p0 = 8243000000.0;
		double r = 0.008;
		double r1 = 1 + 0.008;
		
		double p1 = p0 * Math.pow(r1, 1);
		double p2 = p0 * Math.pow(r1, 2);
		double p3 = p0 * Math.pow(r1, 3);
		double p4 = p0 * Math.pow(r1, 4);
		double p5 = p0 * Math.pow(r1, 5);

		System.out.printf("The initial word population is %.0f%n", p0);
		System.out.printf("The World population after one year is %.0f%n", p1);
		System.out.printf("The World population after two year is %.0f%n", p2);
		System.out.printf("The World population after three year is %.0f%n", p3);
		System.out.printf("The World population after four year is %.0f%n", p4);
		System.out.printf("The World population after five year is %.0f%n", p5);




		}
}


	

	 
	
