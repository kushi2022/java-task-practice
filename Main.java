class Grandfather {
    String land = "Land (Grandfather's property)";
    public void showLand(){
        System.out.println("Inherited property: " + land);
    }
}

class Father extends Grandfather {
    String house = "House (Father's property)";

    public void showHouse() {
        System.out.println("Father's own property: " + house);
    }
}

class Son extends Father {
    int bankBalance = 500000;

    public void showBankbalance() {
        System.out.println("Son's bank balance: " + bankBalance);

    }
}


class Grandson extends Son {
    String car = "Car (Grandson's property)";

    public void showCar() {
        System.out.println("Grandson's property: " + car);
    }
}

class Greatgrandson extends Grandson {
    String gold = "Gold (Greatgrandson's property)";

    public void showGold() {
        System.out.println("Greatgrandson's property: " + gold);
    }
}

public class Main{

    public static void main(String[] args) {
        Greatgrandson greatgrandson = new Greatgrandson();
        greatgrandson.showLand();
        greatgrandson.showHouse();
        greatgrandson.showBankbalance();
        greatgrandson.showCar();
        greatgrandson.showGold();

        System.out.println("*Properties list**");
        System.out.println("---> :" + greatgrandson.land);
        System.out.println("---> :" + greatgrandson.house);
        System.out.println("---> :" + greatgrandson.bankBalance);
        System.out.println("---> :" + greatgrandson.car);
        System.out.println("---> :" + greatgrandson.gold);
    }
}