abstract class Laptop {

    public abstract void processor();

    public void basicDetails() {
        System.out.println("This is basic detail of a laptop");

    }

    public static void main(String[] args) {
        Laptop lenovo = new lenovo();
        lenovo.basicDetails();
        lenovo.processor();


        Laptop dell = new dell();
        dell.processor();


        Laptop accer = new accer();
        accer.processor();


    }
}

class lenovo extends Laptop{
    @Override
    public void processor() {
        System.out.println("The lenovo laptop which have intel 5th generation ");
    }
}

class dell extends Laptop{
    @Override
    public void processor() {
        System.out.println("The dell laptop which have intel 6th generation");
    }
}

class accer extends Laptop{
    @Override
    public void processor() {
        System.out.println("The accer laptop which have intel 7th generation");
    }
}