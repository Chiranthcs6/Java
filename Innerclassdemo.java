class Outer{
    String so=("This is outer class");
    void display(){
        System.out.println(so);
    }
    void test(){
        Inner inner= new Inner();
        inner.display();
    }
    class Inner{
        String si=("This is inner class");
        void display(){
            System.out.println(si);
        }
    }
}
class Innerclassdemo {
    public static void main(String args[]){
        Outer outer= new Outer();
        outer.display();
        outer.test();
    }
}