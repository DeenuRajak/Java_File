package Static;

public class Static1 {
    static int age = 18;

    static {
        age = 18;
        System.out.println("Static block first :");
        System.out.println(age);
    }

    static void disp() {
        System.out.println("Static dip method main ke bad execute hoga!! jab hum call karenge !!");
    }

    public static void main(String[] args) {
        System.out.println("Second preference goes to main method");

        disp();
    }
}
