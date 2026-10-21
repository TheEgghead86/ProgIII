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
// hier kann die nächste Methode folgen.
        System.out.println("Method " + methodCounter + ":");
        sleepyMethod();
        methodCounter++;
    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created by ");
    }

    private static void sleepyMethod() {
        System.out.println("MethodCollector. Taking a nap...");

    }
}
