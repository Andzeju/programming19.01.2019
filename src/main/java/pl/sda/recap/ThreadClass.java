package pl.sda.recap;

public class ThreadClass implements Runnable {
    private final String name;
    private final int numberOfRepeats;


    public ThreadClass(String name, int numberOfRepeats) {
        this.name = name;
        this.numberOfRepeats = numberOfRepeats;
    }

    public void run() {
//        int i = 1;
//        while (i <= numberOfRepeats) {
//            System.out.println("Hello from thread named " + this.name + " for " + i + " time");
//            i++;
//        }
        for (int i = 0; i < numberOfRepeats; i++) {
            System.out.println("Hello from thread named " + this.name + " for " + (i + 1) + " time");
        }
    }

}
