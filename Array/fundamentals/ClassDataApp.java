package Array.fundamentals;

public class ClassDataApp {
    public static  void main(String[] arg){
        int maxSize = 100;
        ClassDataArray arr = new ClassDataArray(maxSize);
        arr.insert("Evans", "Patty", 24);
        arr.insert("Smith", "Lorraine", 37);
        arr.insert("Yee", "Tom", 43);
        arr.insert("Adams", "Henry", 63);
        arr.insert("Hashimoto", "Sato", 21);
        arr.insert("Stimson", "Henry", 29); 
        arr.insert("Velasquez", "Jose", 72); 
        arr.insert("Lamarque", "Henry", 54); 
        arr.insert("Vang", "Minh", 22); 
        arr.insert("Creswell", "Lucinda", 18);
        arr.displayP();

        String searchKey = "Yee";
        Person found = arr.find(searchKey);
        if(found != null){
            System.out.println("Found");
            found.displayPerson();
        }else{
            System.out.println("Can't find "+ searchKey);
        }
        // deleting
        arr.delete("Smith");
        arr.displayP();
        System.out.println("Tested...");

    }

}
