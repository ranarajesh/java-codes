package OOPs.methods;

public class GetterSetter {
    // A method is a group of statements that performs some operations and may or may not return a result.
    // These two types of methods are very popular in OOP. A get method retrieves the value of a particular data field, whereas a set method sets its value.

    private int speed;
    public void setSpeed(int x){
        this.speed = x;
    }
    public int getSpeed(){
        return this.speed;
    }

    public static void main(String[] args) {
        GetterSetter getSet = new GetterSetter();
        System.out.println(getSet.getSpeed());
        getSet.setSpeed(10);
        System.out.println(getSet.getSpeed());
    }
}
