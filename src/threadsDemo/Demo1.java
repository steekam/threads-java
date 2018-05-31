/*
    Creating threads by implementing the Runnable interface
*/
package threadsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

class MYClass implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId()+" Value: "+ i);
            
            try {
            Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
}

public class Demo1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MYClass());
        Thread t2 = new Thread(new MYClass());
        t1.start();
        t2.start();

    }
}
