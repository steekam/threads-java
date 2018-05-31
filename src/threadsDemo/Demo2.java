/*
    Creating a thread without using a whole class
*/
package threadsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getId()+" Value: "+ i);
                }
                
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ex) {
                    Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
                }
            }            
        });
        
        t1.start();
    }
}
