package ThreadsOpgave.Exercise1;

import org.w3c.dom.css.Counter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main{
public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(4);

        for (int i = 0; i < 26; i++) {
            final char repeatChar = (char) ('A' + i);
            Runnable printTask = () -> {
                String toPrint = new String(new char[]{repeatChar, repeatChar, repeatChar});
                System.out.println(toPrint);
            };

            // Submit the task for execution
            executor.submit(printTask);
        }


        executor.shutdownNow();


    }
}
