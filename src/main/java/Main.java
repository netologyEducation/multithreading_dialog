import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        final ThreadGroup group = new ThreadGroup("group");

        List<MyThread> myThreads = new ArrayList<>();

        for (int i = 0; i< 5; i++){
            myThreads.add(new MyThread(group, "Поток №" + i));
        }

        for (MyThread myThread : myThreads) {
            myThread.start();
        }
        Thread.sleep(3000);
        group.interrupt();
    }
}
