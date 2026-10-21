package hsw;
public class MethodCollector {
    /**
     * Die main-Methode ruft alle statischen
     * Methoden nacheinander auf.
     * @param args
     */
    public static void main(String[] args) {
        int methodCounter = 1;
        System.out.println("Method " + methodCounter
                + ":" );
        aFirstMethod();
        methodCounter++;

        System.out.println("Method " + methodCounter
                + ":" );
        aSecondMethod();
    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created.");
    }

    private static void aSecondMethod() {
        System.out.println("MethodCollector. aSecondMethod: This method has been created.");
    }
}
