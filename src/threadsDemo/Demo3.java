/*
 *  Thread synchronization
 */
package threadsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Demo3 {
    private static int count = 0;
    
    public static synchronized void  incrementCount(){
        count++;
    }
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    incrementCount();
                        
                }
            }            
        });
        
        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    incrementCount();
                        
                }
            }
            
        });
        
        t1.start();
        t2.start();
        
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Demo3.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Count: " + count);
    }
}
