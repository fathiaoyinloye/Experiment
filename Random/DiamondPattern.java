
public class DiamondPattern{

	public static void main(String[] args){
	
//top part of the pattern

			for(int count = 1; count <= 4; count++){
				//Spaces before the asterisks
				for(int counter = count; counter <= 3; counter++){
					System.out.print(" ");

				}
				//the asterisks
				for(int counter = 1; counter <= 2* count - 1; counter++){
					System.out.print("*");

				}

				System.out.println();
			}


//lower part of the pattern

			for(int count = 3; count >= 1; count--){
				//Spaces before the asterisks
				for(int counter = count; counter <= 3; counter++){
					System.out.print(" ");

				}
				//the asterisks
				for(int counter = 1; counter <= 2 * count - 1; counter++){
					System.out.print("*");

				}

				System.out.println();
			}
					
	}
}