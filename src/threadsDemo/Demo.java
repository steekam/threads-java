
package threadsDemo;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
    This is an example of how you can implement threads by extending the thread class
*/

class MyClass extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getId()+" Value: "+ i);
        }
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
            Logger.getLogger(MyClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}


public class Demo {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.start();
        
        MyClass myClass1 = new MyClass();
        myClass1.start();
        

    }
}
