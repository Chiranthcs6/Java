class shape {
    void draw(float radius){
        System.out.println("Draw the cirlce with radius"+radius);
    }
    void draw(float base, float height){
        System.out.println("Draw the triangle with base"+base+"height"+height);
    }
    void draw(float side,Boolean a){
        System.out.println("Draw the square with sides"+side);
    }
    void erase(float radius){
        System.out.println("Erase the circle with radius"+radius);
    }
    void erase(float base, float height){
        System.out.println("Draw the triangle with base"+base+"Height"+height);
    }
    void erase(float side, Boolean a){
        System.out.println("Draw the square with sides"+side);
    }
}
    class Circle extends shape{
        float radius;
        Circle(float radius){
            this.radius=radius;
        }
        void draw(){
        super.draw(radius);}
        void erase(){
            super.erase(radius);
        }
    }
    class Triangle extends shape{
        float base;
        float height;
        Triangle(float base, float height){
            this.base=base;
            this.height=height;
        }
        void draw(){
            super.draw(base,height);}
        void erase(){
            super.erase(base,height);
        }
    }
    
    class Square extends shape{
        float side;
        Square(float side){
            this.side=side;
        }
        void draw(){
            super.draw(side, true);
        }
        void erase(){
            super.erase(side,true);
        }
    }
    public class test{
        public static void main(String[] args) {
            Circle c1= new Circle(5);
            Triangle t1= new Triangle(6, 7);
            Square s1= new Square(6);
            c1.draw();
            t1.draw();
            s1.draw();

            c1.erase();
            t1.erase();
            s1.erase();
            
        }
    }
