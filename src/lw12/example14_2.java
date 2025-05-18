package lw12;

public class example14_2 {
    public static void main(String[] args) throws InterruptedException {
        Thread threaOne = new Thread(() ->{
            for(int i = 0; i < 10; i++){
                System.out.println(i);
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        threaOne.start();
        threaOne.join();
    }
}
