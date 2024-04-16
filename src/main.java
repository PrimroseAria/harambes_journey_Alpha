

import java.util.Scanner;

public class main {
    Scanner scanner = new Scanner(System.in);


    public static void printMap(String jungle[][]) {
        System.out.print("\nKaart van het oerwoud: ");
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 3; l++) {
                if (l == 0) {
                    System.out.print("\n");
                    System.out.print(jungle[k][l] + " ");
                } else {
                    System.out.print(jungle[k][l] + " ");
                }
            }
        }
    }
    public static void menu() {
        System.out.println("\n1. Klim uit de boom en loop naar het oosten.");
        System.out.println("2. Klim uit de boom en loop naar het westen.");
        System.out.println("3. Blijf in de boom, grijp een liaan en slinger naar het noorden.");
        System.out.println("4. Blijf in de boom, grijp een liaan en slinger naar het zuiden.");
    }

    public static void oost(String jungle[][], int yCordi, int xCordi){
        jungle[yCordi][xCordi] = "O";
        xCordi++;
        jungle[yCordi][xCordi] = "X";
        printMap(jungle);
    }
    public static void west(String jungle[][], int yCordi, int xCordi){
        jungle[yCordi][xCordi] = "O";
        xCordi--;
        jungle[yCordi][xCordi] = "X";
        printMap(jungle);
    }
    public static void noord(String jungle[][], int yCordi, int xCordi){
        jungle[yCordi][xCordi] = "O";
        yCordi--;
        jungle[yCordi][xCordi] = "X";
        printMap(jungle);
    }
    public static void zuid(String jungle[][], int yCordi, int xCordi){
        jungle[yCordi][xCordi] = "O";
        yCordi++;
        jungle[yCordi][xCordi] = "X";
        printMap(jungle);
    }

    public static void tempelNorth(){
        System.out.println("\nJe hebt de tempel gevonden!");
        System.out.println("Je staat voor een grote deur met een gigantishe banaan gegraveerd in de deur");
        System.out.println("De banaan begint te bewegen, en vraagt aan jou");

        Scanner scanner = new Scanner(System.in);
        int answer = 9;

        while(answer != 163){
            System.out.println("\"Wat is het wachtwoord?\"");
            answer = scanner.nextInt();
            if(answer == 163){
                System.out.println("Je antwoord is goed! Treed binnen!");
                break;

            } else {
                System.out.println("Het antwoord is fout! \nProbeer het opnieuw!");
            }

        }
    }

public static void bananaSouth(){
    System.out.println("\nJe ziet een heerlijke banaan en hebt ontzettende honger.");
    System.out.println("Wat doe je?");
    System.out.println("1. Je eet de banaan op... nom, nom, nom... heerlijk...");
    System.out.println("2. Je bedwingt je honger en neemt de banaan mee voor het geval dat je hem nog nodig hebt.");

    Scanner scanner = new Scanner(System.in);

    int answer = 0;

    answer = scanner.nextInt();

    switch (answer) {
        case 1:
            System.out.println("GAME OVER!");
            break;
        case 2:
            System.out.println("Slimme keuze! Wie bewaart heeft wat.");
            System.out.println("eerste plek = 1");
            break;
        default:
            System.out.println("Blijf proberen!");
            break;
    }

    System.out.println("Wat doe je nu?");

}

    public static void statueGoldenBanana() {
        System.out.println("\nJe ziet een standbeeld van de gouden banaan en hoort vanuit de hemel...");
        System.out.println("\"Vind de gouden banaan in de tempel en heb nooit meer honger!\"");
        System.out.println("Je vindt een inscriptie die zegt \" tweede plek = 6 \"");
        System.out.println("Wat doe je?");

    }

    public static void gorillaArt () {

        System.out.println("_\n" +
                           "             ,.-\" \"-.,\n" +
                           "            /   ===   \\\n" +
                           "           /  =======  \\\n" +
                           "        __|  (o)   (0)  |__\n" +
                           "       / _|    .---.    |_ \\\n" +
                           "      | /.----/ O O \\----.\\ |\n" +4

                           "       \\/     |     |     \\/\n" +4

                           "       |                   |\n" +4

                           "       |                   |\n" +4

                           "       |                   |\n" +4

                           "       _\\   -.,_____,.-   /_\n" +4

                           "   ,.-\"  \"-.,_________,.-\"  \"-.,\n" +4

                           "  /          |       |          \\\n" +4

                           " |           l.     .l           |\n" +4

                           " |            |     |            |\n" +4

                           " l.           |     |           .l\n" +4

                           "  |           l.   .l           | \\,\n" +
                           "  l.           |   |           .l   \\,\n" +
                           "   |           |   |           |      \\,\n" +
                           "   l.          |   |          .l        |\n" +
                           "    |          |   |          |         |\n" +
                           "    |          |---|          |         |\n" +
                           "    |          |   |          |         |\n" +
                           "    /\"-.,__,.-\"\\   /\"-.,__,.-\"\\\"-.,_,.-\"\\\n" +
                           "   |            \\ /            |         |\n" +
                           "   |             |             |         |\n" +
                           "    \\__|__|__|__/ \\__|__|__|__/ \\_|__|__/\n" +
                           "\n");
    }


    public static void gorillaEncounter() {
        System.out.println("\nJe komt een andere gorilla tegen.");
        System.out.println("Jij bent zeker op zoek naar de tempel?");
        System.out.println("Ik geef je de juiste richting als je deze vraag goed hebt.");
        System.out.println("Wat is Java?");
        System.out.println("Java is een...");

        Scanner scanner = new Scanner(System.in);

        int answer = 0;

        System.out.println("1. banaan.");
        System.out.println("2. planeet.");
        System.out.println("3. programmeertaal.");
        answer = scanner.nextInt();
        switch (answer) {
            case 1:
                System.out.println("Close but not a banana!");
                break;
            case 2:
                System.out.println("Helaas, dat klopt niet!");
                break;
            case 3:
                System.out.println("Uitstekend!");
                System.out.println("De tempel vind je in het noorden!");
                System.out.println("derde plek = 3");
                break;
            default:
                System.out.println("Blijf proberen!");
                break;
        }


        System.out.println("Waar wil je nu naar toe?");








    }




    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        gorillaArt();
        System.out.println("Welkom in het oerwoud van gorilla Harambe!");
        System.out.println("Harambe zit lekker hoog in zijn boom te luieren.");
        System.out.println("Opeens hoort hij zijn maag rommelen...");
        System.out.println("Tijd om te eten!");
        System.out.println("Wat doe je?");

        String[][] jungle = new String[3][3];
        for (int i = 0; i <= jungle.length - 1; i++) {
            for (int j = 0; j < jungle[jungle.length - 1].length; j++) {
                jungle[i][j] = "O";
            }
        }
        jungle[1][1] = "X";


        printMap(jungle);
        menu();

        int xCordi = 1;
        int yCordi = 1;
        int num = 9;
        while(num != 0){
            if(yCordi == 1 && xCordi == 2) {
                gorillaEncounter();

            } else if(yCordi == 1 && xCordi == 0) {
                statueGoldenBanana();

            } else if(yCordi == 2 && xCordi == 1) {
                bananaSouth();

            } else if(yCordi == 0 && xCordi == 1) {

                tempelNorth();

                num = 0;
                break;
            }

            int choice = newScanner.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("Je gaat naar het Oosten");
                    oost(jungle, yCordi, xCordi);
                    xCordi++;
                    break;
                case 2:
                    System.out.println("Je gaat naar het Westen");
                    west(jungle, yCordi, xCordi);
                    xCordi--;
                    break;
                case 3:
                    System.out.println("Je gaat naar het Noorden");
                    noord(jungle, yCordi, xCordi);
                    yCordi--;
                    break;
                case 4:
                    System.out.println("Je gaat naar het Zuiden");
                    zuid(jungle, yCordi, xCordi);
                    yCordi++;
                    break;

            }

        }
        System.out.println("Congratulations! Je hebt het gedaan! \nThanks for playing!");

    }
}