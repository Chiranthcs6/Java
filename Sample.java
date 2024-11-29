class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        start();
    }
    public void run(){
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
    
}


public class Sample {
    public static void main(String[] args){
        System.out.println("Main thread Started");
        MyThread myThread= new MyThread("Child class");
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        try{
            myThread.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("Main Thread Ended");
    }
    
}
