import java.io.*;

public class mainClass {
    public static void main(String[] args) throws Exception{
        Vehicle car = new Motorbike("audi", 30000);
        //VehiclePrint.printAllModelWithPrice(car);
        OutputStream o = new FileOutputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\test.txt");
        InputStream i = new FileInputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\test.txt");
        VehiclePrint.outputVehicle(car, o);
        VehiclePrint.inputVehicle(i);
        //пагнпгнпгнпгнпгнпгнанана
    }
}
