class MyThread extends Thread{
    MyThread(){
        super("Using Thread class");
        System.out.println("This is child thread:"+this);
        start();
    }
    public void run(){
        try{
            for(int i=100;i>0;i--){
                System.out.println("Child Thread"+i);
                Thread.sleep(500);
            } 
        }catch(InterruptedException e){}
        System.out.println("Exiting Child class");
    }
}
class TestmyThread{
    public static void main(String[] args){
        new MyThread();
        try{
            for(int k=5;k<0;k--){
                System.out.println("Running main thread"+k);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){}
        System.out.println("Exiting main method:");
    }
}
