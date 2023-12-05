public class Box {
    double l;
    double h;
    double w;

    Box(){
        this.l = 1.5;
        this.h = 1.5;
        this.w = 1.5;
    }

    Box(double side){
    this.l = side;
    this.w = side;
    this.h = side;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    public  void information(){
        System.out.println("Information");
    }
}
