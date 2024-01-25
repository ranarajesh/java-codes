class StaticPolymorphism {

    int add(int num1, int num2) {
        return num1 + num2;
    }

    int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static void main(String args[]) {

        StaticPolymorphism obj = new StaticPolymorphism();
        System.out.println("10 + 20 = " + obj.add(10, 20));
        System.out.println("10 + 20 + 30 = " + obj.add(10, 20, 30));
    }

}