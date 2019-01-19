package pl.sda.recap;

public class ThreadClass implements Runnable {
    String name;
    int numberOfRepeats;


    public ThreadClass(String name, int numberOfRepeats) {
        this.name = name;
        this.numberOfRepeats = numberOfRepeats;
    }

    public void run() {
        int i = 1;
        while (i <= numberOfRepeats) {
            System.out.println("Hello from thread named " + this.name + " for " + i + " time");
            i++;
        }
    }

}
