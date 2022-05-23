package inheritance_abstraction;

public class CarShop {
    public static void main(String[] args) {
        BMW bmw=new BMW(2019,"X5","Black",10000);
        bmw.start();
        System.out.println("bmw.isLuxury = " + bmw.isLuxury);
        System.out.println("bmw = " + bmw);

        System.out.println("=========================");

        Toyota toyota=new Toyota(2019,"Camry","White",25000);
        toyota.start();
        System.out.println("toyota = " + toyota);
    }
}
