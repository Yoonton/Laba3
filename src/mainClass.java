import java.io.*;

public class mainClass {
    public static void main(String[] args) throws Exception{
        Vehicle car = new Motorbike("audi", 10);
        VehicleStatic.printAllModelWithPrice(car);
        
        OutputStream o = new FileOutputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\byteStram.bin");
        InputStream i = new FileInputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\byteStram.bin");
        VehicleStatic.outputVehicle(car, o);
        Vehicle newC = VehicleStatic.inputVehicle(i);
        VehicleStatic.printAllModelWithPrice(newC);

        newC = null;

        FileWriter fw = new FileWriter("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\charStream.txt");
        FileReader fr = new FileReader("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\charStream.txt");
        VehicleStatic.writeVehicle(car, fw);

        newC = VehicleStatic.readVehicle(fr);
        VehicleStatic.printAllModelWithPrice(newC);
    }
}
