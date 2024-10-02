import java.io.*;

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
    public static void outputVehicle(Vehicle v, OutputStream out) throws IOException{
        byte[] markByte = ("Название марки: " + v.getMark() + " Количество моделей: " + v.getSize() + "\n").getBytes();
        out.write(markByte);
        for(int i = 0; i < v.getSize(); i++){
            byte[] modelByte = ("Название модели: " + v.getAllModelNames()[i] + " Цена: " + v.getAllModelPrices()[i] + "\n").getBytes();
            out.write(modelByte);
        }
    }
}
