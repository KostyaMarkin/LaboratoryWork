package lw12;

public class example14_4 {
    public static void main(String[] args) {
        Thread[] threads = new Thread[10];
        for(int i = 0; i < threads.length; i++){
            threads[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getId());

            });
        }
        for(int i = 0; i < threads.length; i++) {
            threads[i].start();
        }
    }
}
