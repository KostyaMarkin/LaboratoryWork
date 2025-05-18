package lw12;

public class example14_3 {
    private static final Object lock = new Object();

    private static int number = 1;
    public static void main(String[] args) {
        Thread threadChetNumber = new Thread(() -> {
           synchronized (lock){
               while(number < 10){
                   if(number % 2 == 0){
                       System.out.println(Thread.currentThread().getName()
                       + ": " + number);
                       number++;
                   } else {
                       try{
                           lock.wait();
                       } catch (InterruptedException e) {
                           e.printStackTrace();
                       }
                   }
                   lock.notifyAll();
               }
           }
        });
        Thread threadNotChetNumber = new Thread(() -> {
            synchronized (lock){
                while(number < 10){
                    if(number % 2 != 0){
                        System.out.println(Thread.currentThread().getName()
                                + ": " + number);
                        number++;
                    } else {
                        try{
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        threadChetNumber.setName("Поток четных чисел");
        threadNotChetNumber.setName("Поток нечетных чисел");

        threadChetNumber.start();
        threadNotChetNumber.start();
    }
}
