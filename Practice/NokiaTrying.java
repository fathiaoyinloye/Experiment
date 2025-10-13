public class ModifiedNokia{
	public static void main(String... args){

		Scanner scanner = new Scanner(System.in);
		Boolean nextpage = true;

		String menuDisplay = """
		Welcome to your Nokia Phone menu display
		List of Menu functions
		1 -> Phonebook
		2 -> Messages
		3 -> Chat
		4 -> Call Register
		5 -> Tones
		6 -> Settings
		7 -> Call divert
		8 -> Games
		9 -> Calculator
		10 -> Remainders
		11 -> Clock
		12 -> Profiles
		13 -> Sim settings
		0 -> Exit


""";
		//while(nextpage){
		System.out.println(menuDisplay);
		System.out.print("Choose from the above menu: ");
		int menuChoice = scanner.nextInt();
	
		switch(menuChoice){
		case 1 -> {String phonebook = """
			
			Phonebook
			1 -> Search
			2 -> Service Nos.
			3 -> Add name
			4 -> Erase
			5 -> Edit
			6 -> Assign Tone
			7 -> Send b'card
			8 -> Options
			9 -> Speed dials
			10 -> Voice tag
			0 -> to go back to previous menu


		""";
			System.out.println(phonebook);
			
			
			//boolean keepgoing = true;
			System.out.print("Choose from the phonebook dropdown menu: ");
			int phonebookmenu = scanner.nextInt();
			//while (keepgoing){
			switch(phonebookmenu){

			case 1 -> {System.out.print("Search");}
			case 2 -> {System.out.print("Service Nos");}
			case 3 -> {System.out.print("Add name");}
			case 4 -> {System.out.print("Erase");}
			case 5 -> {System.out.print("Edit");}
			case 6 -> {System.out.print("Asign tone");}
			case 7 -> {System.out.print("Send b'card");}
			case 8 -> {String options = """
					   Options
					1 -> Type of View
					2 -> Memory Status

					""";

					System.out.print(options);
					System.out.println("Choose from the options dropdown menu: ");
					int optionsMenu = scanner.nextInt();

					switch(optionsMenu){
					case 1 -> {System.out.print("Type of View");}
					case 2 -> {System.out.print("Memory Status");}
					}

				}
			case 9 -> {System.out.print("Speed dials");}
			case 10 -> {System.out.print("Voice tags");}
			case 0 -> {System.out.print("Go back Previous menu");
				keepgoing = false;}
			}
		}
}
}
