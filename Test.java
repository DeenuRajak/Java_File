class Test {
    int a;
    String name;
    public static void main(String []args){
        Test obj1 = new Test();
        Test obj2 = new Test();

        obj1.name="Deenu";
        obj2.a=10;
        System.out.println(obj1.a);
        System.out.println(obj1.name);

        System.out.println(obj2.a);
        System.out.println(obj2.name);
    }
}
