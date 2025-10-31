import java.util.Random;
import java.util.Arrays;
public class GetRandomCharacters{

	public static void main (String... args){
		Random random = new Random();

		String letters = "abcdefghij";
	
		char randomLetter = letters.charAt(random.nextInt(0, letters.length()));



	System.out.print(randomLetter );




//taking all numbers that occurs twice

int[] myArray = {1,2,4,7,4,6,7,2,4,5};
int[] newArray = new int[myArray.length];
 	for(int index = 0; index < myArray.length; index++){
		for(int number = index + 1; number < myArray.length; number++){
			if(myArray[index] == myArray[number]){
				newArray[index] = myArray[index];
				myArray[number] = 0;}

		}


	}


	System.out.print(Arrays.toString(newArray));





	}














}