package Day06;

public class MyImplementation implements Runnable{
    
    @Override
    public void run() {
        RunningThreadCount();
    }

    public void RunningThreadCount () {
        //task for thread
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() +
            "-> " + i);

        }
    }


}
