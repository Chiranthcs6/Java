class A{
    void display(){
        System.out.println("Hello");
    }
}
class B extends A{
    @Override
    void display(){
        super.display();
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
        B obj=new B();
        obj.display();
    }
}