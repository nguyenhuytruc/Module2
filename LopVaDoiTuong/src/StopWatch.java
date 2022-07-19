public class StopWatch {
    private long startTime = 0;
    private long endTime = 0;
    private boolean running = false;

    public long getStartTime() {
        return startTime = System.currentTimeMillis();
    }

    public long getEndTime() {
        return endTime = System.currentTimeMillis();
    }

    public void start() {
        this.startTime = System.currentTimeMillis();
        this.running = true;
    }

    public void stop() {
        this.endTime = System.currentTimeMillis();
        this.running = true;
    }

    public long getElapsedTime() {
        long elapsed;
        if (running) {
            elapsed = System.currentTimeMillis() - startTime;
        } else {
            elapsed = endTime - startTime;
        }
        return elapsed;
    }

    public static void main(String[] args) {
        long[] myArray = new long[100000];
        for (int i = 0; i < 100000; i++) {
            myArray[i] = (long) (Math.random() * 1000);
        }
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        selectionSort(myArray);
        stopWatch.stop();
        System.out.println("Run time Selection Sort for 100 000 element: " + stopWatch.getElapsedTime() + " milisecond");
    }

    public static void selectionSort(long[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            long min = array[i];
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            array[index] = array[i];
            array[i] = min;
        }
    }
}

