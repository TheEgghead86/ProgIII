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
        methodCounter++;
        dHallo();
        methodCounter++;
// hier kann die nächste Methode folgen.
        System.out.println("Method " + methodCounter
                + ":" );
      
        definetlyNotMalware();
        System.out.println("Method " + methodCounter + ":");
        sleepyMethod();
        executeMaja();
        methodCounter++;

        System.out.println("Method " + methodCounter + ": " + anotherMethodMarlon());
        methodCounter++;

        JonnysClass jc = new JonnysClass();
        try {
            jc.winkendeHand();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created by ");
    }

    public static void definetlyNotMalware() {
        System.out.println("Installing Virus");
    }
    private static void aNewMethod() {
        System.out.println("Neue Methode");
    }
    private static void sleepyMethod() {
        System.out.println("MethodCollector. Taking a nap...");
    }

    private static void bHallo(){
        System.out.println("Hallo! Jeronimo. ");
    }

    private static String anotherMethodMarlon() {
        return "MethodCollector.anotherMethodMarlon: Method created by Marlon";
    }

    private static void dHallo(){
        System.out.println("Hallo! Danielos. ");
    }
}

