package Array.fundamentals;

public class OrderArrayApp {
    public static  void main(String[] args){
        int maxSize = 100;
        OrderArray arr = new OrderArray(maxSize);
        arr.insert(77);
        arr.insert(99);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);
        arr.display();

        int searchKey = 35;
        if(arr.find(searchKey) != arr.size()){
            System.out.println("Found "+ searchKey);
        }else {
            System.out.println("Can't Find "+ searchKey);
        }

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);
        arr.display();
    }
}
