import java.io.*;

public class mainClass {
    public static void main(String[] args) throws Exception{
        Vehicle car = new Motorbike("audi", 10);
        //VehiclePrint.printAllModelWithPrice(car);
        OutputStream o = new FileOutputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\test.bin");
        InputStream i = new FileInputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\test.bin");
        VehicleStatic.outputVehicle(car, o);
        VehicleStatic.inputVehicle(i);
    }
}
