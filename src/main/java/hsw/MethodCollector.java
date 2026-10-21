package hsw;

import static java.lang.Thread.sleep;

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


    }
    private static void aFirstMethod() {
        System.out.println("MethodCollector. aFirstMethod: This method has been created by ");
    }

    private static void sleepMethod() {
        try{
            sleep(10);
        } catch (InterruptedException e) {}
    }
}
