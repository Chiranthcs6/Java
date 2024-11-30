class A{
    int a=10;
}
class B extends A{
    int a=20;
    void display(){
        System.out.println("Parent class variable a:"+super.a);
        System.out.println("Child class variable a:"+a);
    }
    public static void main(String[] args){
        B obj=new B();
        obj.display();
    }
}
    