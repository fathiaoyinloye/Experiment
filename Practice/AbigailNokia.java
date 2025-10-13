import java.util.Scanner;

public class Nokia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            // Main Menu
            System.out.println("""
                    === Nokia Menu ===
                    1: Phone Book
                    2: Messages
                    3: Chat
                    4: Call Register
                    5: Tones
                    6: Settings
                    7: Call Divert
                    8: Games
                    9: Calculator
                    10: Reminders
                    11: Clock
                    12: Profiles
                    13: SIM Services
                    0: Exit
                    """);

            System.out.print("Select an option: ");
            int mainOption = input.nextInt();

            switch (mainOption) {
                case 1 -> {
                    boolean phoneBookRunning = true;
                    while (phoneBookRunning) {
                        System.out.println("""
                                --- Phone Book ---
                                1: Search
                                2: Service Nos
                                3: Add Name
                                4: Erase
                                5: Edit
                                6: Assign Tone
                                7: Send b'card
                                8: Options
                                   1: Type of View
                                   2: Memory Status
                                9: Speed Dials
                                10: Voice Tags
                                0: Back
                                """);
                        System.out.print("Choose an option: ");
                        int phoneBookOption = input.nextInt();

                        switch (phoneBookOption) {
                            case 1 -> System.out.println("Searching...");
                            case 2 -> System.out.println("Service Nos...");
                            case 3 -> System.out.println("Adding name...");
                            case 4 -> System.out.println("Erasing...");
                            case 5 -> System.out.println("Editing...");
                            case 6 -> System.out.println("Assigning tone...");
                            case 7 -> System.out.println("Sending b'card...");
                            case 8 -> {
                                System.out.println("1: Type of View");
                                System.out.println("2: Memory Status");
                                int subOption = input.nextInt();
                                if (subOption == 1) System.out.println("Type of View...");
                                else if (subOption == 2) System.out.println("Memory Status...");
                                else System.out.println("Invalid Option");
                            }
                            case 9 -> System.out.println("Speed Dials...");
                            case 10 -> System.out.println("Voice Tags...");
                            case 0 -> phoneBookRunning = false;
                            default -> System.out.println("Invalid option");
                        }
                    }
                }
	