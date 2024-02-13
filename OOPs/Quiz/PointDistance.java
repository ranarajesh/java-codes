package OOPs.Quiz;

public class PointDistance {
    private int x;
    private int y;

    public PointDistance(){
        x  =0; 
        y = 0;
    }

    public PointDistance(int x1, int y1){
        x = x1;
        y = y1;
    }

    public double distance(){
        return Math.sqrt(x*x + y*y);
    }
    public double distance(int x2, int y2){
        return Math.sqrt((x2 -x)*(x2 -x) + (y2 -y)* (y2 -y));
    }

    public static void main(String[] args) {
        PointDistance p1 = new PointDistance();
        System.out.println(p1.distance());
        System.out.println(p1.distance(2, 1));
    }
}
