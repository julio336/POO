package Java;
class Main  {
    public static void main(String[] args) {
        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.printDataCar();

        Car car2 = new Car("ADA123", new Account("Andrea Herrera", "AND456"));
        car2.printDataCar();

        Driver driver1 = new Driver("Julii", "AD123", "foo@bar.com", "12345");
        driver1.printDatadriver();

        UberX uberX = new UberX("KAS123", new Account("Juan Perez", "Dasd123"), "AUDI", "A3");
        uberX.setPassenger(4);
        uberX.printDataCar();

        UberVan uberVan = new UberVan("FHG123", new Account("Andres", "asdsd"));
        uberVan.setPassenger(5);
        uberVan.printDataCar();

    }
}