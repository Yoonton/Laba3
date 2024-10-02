import java.io.FileOutputStream;
import java.io.OutputStream;

public class mainClass {
    public static void main(String[] args) throws Exception{
        Vehicle car = new Motorbike("audi", 5);
        VehiclePrint.printAllModelWithPrice(car);
        OutputStream o = new FileOutputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\test.txt");
        VehiclePrint.outputVehicle(car, o);
    }
}
