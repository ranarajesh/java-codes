package Array.fundamentals;

public class ClassDataArray {
    private Person[] perArr;
    private int nElems;
    public ClassDataArray(int max){
        perArr = new Person[max];
        nElems = 0;
    }
    public Person find(String searchName){
        int j ;
        for (j =0; j<nElems; j++){
            if(perArr[j].getLastName().equals(searchName)){
                //The key field (the last name) is now a String object, so comparisons require the equals() method 
                //rather than the == operator. The getLast() method of Person obtains the last name of a Person object, and equals() does the comparison:
                break;
            }
        }
        if(j == nElems) return null;
        else{
            return perArr[j];
        }
    }

    public void insert(String last, String first, int age){
        perArr[nElems] = new Person(last, first, age);
        nElems++;
    }

    public boolean delete(String searchName){
        int j;
        for(j =0; j<nElems; j++){
            if(perArr[j].getLastName().equals(searchName)) {
                break;
            }
        }

        if(j == nElems) return false;
        else{
            for(int k =j; k<nElems; k++){
                perArr[k] = perArr[k=1];
            }
            nElems--;
            return true;
        }
    }
    public void displayP(){
        for (int i = 0; i < nElems ; i++) {
            perArr[i].displayPerson();
        }
    }

}
