package hsw.Methoden;

public class eineWunderSchoeneKlasseNamensMaja {

    public static void executeMaja() {
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 10; i++) {
            for (char c : alphabet.toCharArray()) {
                int r = (int) (Math.random() * 256);
                int g = (int) (Math.random() * 256);
                int b = (int) (Math.random() * 256);
                String color = String.format("\u001B[38;2;%d;%d;%dm", r, g, b);
                System.out.print(color + c + " ");
            }
            System.out.print("\u001B[0m");
            System.out.println();

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

}
