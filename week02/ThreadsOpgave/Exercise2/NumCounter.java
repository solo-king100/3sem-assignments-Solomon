
    public class NumCounter {
        private int count = 0;

        // Method to increment the count, synchronized to ensure thread safety
        public synchronized void increment() {
            count++;
        }

        // Method to retrieve the current count value

        //Tilføjet bare nøgleordet synchronised
        public synchronized int getCount() {
            return count;
        }
    }

