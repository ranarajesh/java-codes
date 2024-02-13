package OOPs.Quiz;

public class DisplayOutput {
    public void display() {
        System.out.println("Nothing");
    }
    
    public void display(int x) { 
        System.out.println(x);
    }
   
    public int display(int y){
        System.out.println(y);
    }

    public static void main(String[] args) {

        DisplayOutput out = new DisplayOutput();

        int x = 10;
        int y = 20;

        out.display(x);
        out.display();
        out.display(y);

    }
}
