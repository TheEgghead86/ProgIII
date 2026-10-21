package hsw;

import java.util.Arrays;

public class MethodCollector {
    /**
     * Die main-Methode ruft alle statischen
     * Methoden nacheinander auf.
     * @param args
     */
    public static void main(String[] args) {
        int methodCounter = 1;
// Erste Methode
        System.out.println("Method " + methodCounter
                + ":" );
        aFirstMethod();
        dieseEineMethode();
        methodCounter++;
// hier kann die nächste Methode folgen.
    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created by ");
    }

    private static void dieseEineMethode(){
        String text = "Freitag Online";
        System.out.println("Bitte " + Arrays.hashCode(text.toCharArray()));
    }
}
