import java.util.NoSuchElementException;

public class MyThread extends Thread{
    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
            try {
                while (!interrupted()) {
                    Thread.sleep(1000);
                    System.out.printf("Поток - %s\n", Thread.currentThread().getName());
                }
            } catch (InterruptedException e) {
                System.out.printf("Поток %s прерван!\n", Thread.currentThread().getName());
            }finally {
                System.out.printf("%s завершен \n",Thread.currentThread().getName());
            }
        }
    }

