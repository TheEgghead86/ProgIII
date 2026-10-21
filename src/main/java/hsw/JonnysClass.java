package hsw;

public class JonnysClass {

    public void winkendeHand() throws InterruptedException {

        int counter = 10;

        while (counter > 0) {

            // Hand nach links winken

            System.out.println("\033[H\033[2J");

            System.out.flush();

            System.out.println("    O/");

            System.out.println("   /|");

            System.out.println("   / \\");

            System.out.println("  👋");

            Thread.sleep(300);

            // Hand nach rechts winken

            System.out.println("\033[H\033[2J");

            System.out.flush();

            System.out.println("    \\O");

            System.out.println("     |\\");

            System.out.println("    / \\");

            System.out.println("     👋");

            Thread.sleep(300);

            counter--;
        }

    }
}
