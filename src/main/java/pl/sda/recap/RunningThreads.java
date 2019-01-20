package pl.sda.recap;

public class RunningThreads {
    public static void main(String[] args) {


        ThreadClass thread1 = new ThreadClass("thread1", 10);
        ThreadClass thread2 = new ThreadClass("thread2", 5);

        new Thread(thread2).start();
        new Thread(thread1).start();


    }
}
