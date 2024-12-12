interface Resizable {
    void resizeWidth(int width);
    void resizeHeight(int height);
}

class Rectangle implements  Resizable{
    private int width;
    private int height;

    public Rectangle(int width, int height){
        this.width=width;
        this.height=height;
    }
    @Override
    public void resizeWidth(int width){
        this.width=width;
    }
    @Override
    public void resizeHeight(int height){
        this.height=height;
    }
    public void printsize(){
        System.err.println("width:"+width+",Height"+height);
    }

}
public class sample{
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle(100,150);
        rectangle.printsize();
        rectangle.resizeWidth(100);
        rectangle.resizeHeight(150);
        rectangle.printsize();
    }
}