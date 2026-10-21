package hsw;

import static hsw.Methoden.eineWunderSchoeneKlasseNamensMaja.executeMaja;

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
        methodCounter++;
        bHallo();
        dHallo();
// hier kann die nächste Methode folgen.
        System.out.println("Method " + methodCounter + ":");
        sleepyMethod();
        executeMaja();
        methodCounter++;
    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created by ");
    }

    private static void sleepyMethod() {
        System.out.println("MethodCollector. Taking a nap...");
    }

    private static void bHallo(){
        System.out.println("Hallo! Jeronimo. ");
    }

    private static void dHallo(){
        System.out.println("Hallo! Danielos. ");
    }
}

