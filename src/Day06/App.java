package Day06;

import java.util.concurrent.*;
import java.util.*;

public class App {

    public static void main(String[] args) {
        
        // Thread th = new Thread(new Runnable() {
            
        //     public void run () {
        //         //task for thread
        //         for (int i = 0; i < 10; i++) {

        //             System.out.println(Thread.currentThread().getName() +
        //             "-> " + i);

        //         }
        //     }
        // });
        // //to run thread
        // th.start();

        // MyImplementation my1 = new MyImplementation();
        // MyImplementation my2 = new MyImplementation();
        // MyImplementation my3 = new MyImplementation();
        // MyImplementation my4 = new MyImplementation();
        // MyImplementation my5 = new MyImplementation();
        
        // // ExecutorService es = Executors.newSingThreadExecuter();

        // // es.shutdown();
        // // //execute tasks using a single thread

        // //execute the task using fixed thread pool
        // ExecutorService es1 = Executors.newFixedThreadPool(5);
        
        // es1.execute(my1);
        // es1.execute(my2);
        // es1.execute(my3);
        // es1.execute(my4);
        // es1.execute(my5);
        // //to release memory
        // es1.shutdown();

        List<Products> products = new ArrayList<Product>();
            products.add(new Product(1L, "Apple iPad", "Apple tablet", "computer"));
            products.add(new Product(2L, "Apple Macbook Pro", "Apple laptop", "computer"));
        

        
    }
}