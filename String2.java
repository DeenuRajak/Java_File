public class String2 {
    public static void main(String [] args){
        String brand = "Deenu ";
        System.out.println(brand);
        brand.concat("Rajak");
        System.out.println(brand);
        StringBuilder brand1 = new StringBuilder ("Deenu ");
        System.out.println(brand1);
        brand1.append("Rajak");
        System.out.println(brand1);
    }
}
