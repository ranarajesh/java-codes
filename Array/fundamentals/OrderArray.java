package Array.fundamentals;

// highArray.java
// Demonstrates array class with high-level interface
public class OrderArray {
    private long[] arr;
    private int arrElems;
    public OrderArray(int max){
        arr = new long[max];
        arrElems = 0;
    }

    public void display(){
        System.out.println("Printing Elements of Order Array:");
        for (int i=0; i<arrElems; i++){
            System.out.println(arr[i] + " ");
        }
    }
    public int size(){
        return arrElems;
    }
    public void insert(long value){
        // find the index where to add the element in order
        int j;
        for (j =0; j<arrElems; j++){
            if(arr[j] > value){
                break;
            }
        }
        for(int i = arrElems; i>j; i--){
            arr[i] = arr[i-1];
        }
        arr[j] = value;
        arrElems++;
    }
    public int find(long valueSearch){
        int lowerBound =0;
        int upperBound = arrElems -1;
        int currIn;
        while (true){
            currIn = (lowerBound + upperBound)/2;
            if(arr[currIn] == valueSearch){
                return currIn;
            }
            else if(lowerBound > upperBound) {
                return arrElems;
            }else{
                if(arr[currIn] < valueSearch){
                    lowerBound = currIn + 1; // in upper half
                }else {
                    upperBound = currIn -1;// in lower half
                }
            }
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
