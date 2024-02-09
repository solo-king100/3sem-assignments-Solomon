import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

//Her har jeg prøvet at lave et program som plusser det første 1000000 heltal.
//Atomic Long er en speciel type variabel i Java der bruges til at holde styr på et tal
// sikkert, når man har mange threads. Det sikrer, at når flere tråde forsøger at ændre
// dens værdi, sker det én ad gangen(Ligesom at bruge synchronized)
public class SumOfNaturalNumbers {

    private static final int Natnum = 1000000;
    private static AtomicLong sum = new AtomicLong(0);

    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        ExecutorService executor = Executors.newFixedThreadPool(cores);

        int chunkSize = Natnum / cores;
        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize + 1;
            final int end = (i == cores - 1) ? Natnum : (i + 1) * chunkSize;
            executor.submit(() -> {
                for (int j = start; j <= end; j++) {
                    sum.addAndGet(j);
                }
            });
        }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Sum of the first " + Natnum + " natural numbers is: " + sum.get());
    }
}
