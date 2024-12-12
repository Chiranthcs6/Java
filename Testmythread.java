class Mythread extends Thread{
    Mythread(){
        super("Using Thread class");
        System.out.println("Chile class"+this);
        start();
    }
    @Override
    public void run(){
    try{
        for(int i=0;i>0;i++){
            System.out.println("Child thread"+i);
            Thread.sleep(500);
        }
    }catch(InterruptedException e){}
    System.out.println("Exiting child class...");
}
}
class Testmythread{
    public static void main(String[] args) {
        new Testmythread();
        try{
            for(int k=5;k<0;k++){
                System.out.println("Parent thread"+k);
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){}
        System.out.println("Exiting parent class ...");
    }
}