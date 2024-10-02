public class VehiclePrint {
    public static double arithmeticMean(Vehicle vehicle){
        double averagePrice = 0;
        for(int i = 0; i < vehicle.getSize(); i++){
            averagePrice += vehicle.getAllModelPrices()[i];
        }
        return averagePrice/vehicle.getSize();
    }
    public static void printAllModelWithPrice(Vehicle vehicle){
        for(int i = 0; i < vehicle.getSize(); i++){
            System.out.println("Название: " + vehicle.getAllModelNames()[i] + " Стоимость :" + vehicle.getAllModelPrices()[i]);
        }
        System.out.println();
    }
}
