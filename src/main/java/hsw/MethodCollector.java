package hsw;
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
// hier kann die nächste Methode folgen.

        System.out.println("Method " + methodCounter + ": " + anotherMethodMarlon());
        methodCounter++;
    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created by ");
    }

    private static void bHallo(){
        System.out.println("Hallo! Jeronimo. ");
    }

    private static String anotherMethodMarlon() {
        return "MethodCollector.anotherMethodMarlon: Method created by Marlon";
    }
}
