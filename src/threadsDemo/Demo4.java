/*
 * Dealing with volatile keyword
 */
package threadsDemo;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class Process extends Thread{
    private volatile boolean running = true;

    @Override
    public void run() {
        int i = 0;
        while(running){
            System.out.println(i);            
            i++;
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Process.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void shutdown(){
        running = false;
    }    
    
}

public class Demo4 {
    
    public static void main(String[] args) {
        System.out.println("Press return key to stop counter");
        Process p1 = new Process();
        p1.start();
        
        Scanner input = new Scanner(System.in);
        input.nextLine();
        p1.shutdown();
    }
    
}
