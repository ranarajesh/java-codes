package Array.fundamentals;

// highArray.java
// Demonstrates array class with high-level interface
public class HighArray {
    private long[] arr;
    private int arrElems;
    public HighArray(int max){
        arr = new long[max];
        arrElems = 0;
    }

    public void display(){
        System.out.println("Printing Elements of Array:");
        for (int i=0; i<arrElems; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public void insert(long value){
        arr[arrElems] = value;
        arrElems++;
    }
    public boolean find(long valueSearch){
        int i;
        for (i = 0; i < arrElems; i++) {
            if(arr[i] == valueSearch){
                break;
            }
        }
        if(i == arrElems){
            return false;
        }else{
            return true;
        }
    }

    public boolean delete(long value){
        int j;
        for (j = 0; j<arrElems; j++){
            if(arr[j] == value)
                break;
        }
        if(j == arrElems){
            return false;
        }else{
            for (int i = j; i < arrElems -1 ; i++) {
                // move higher ones down
                arr[i] = arr[i+1];
            }
            arrElems--;
            return true;
        }
    }
}
