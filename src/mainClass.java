import java.io.*;

public class mainClass {
    public static void main(String[] args) throws Exception{
        Vehicle car = new Motorbike("audi", 10);
        VehicleStatic.printAllModelWithPrice(car);
        //bytestram

        OutputStream o = new FileOutputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\byteStram.bin");
        InputStream i = new FileInputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\byteStram.bin");
        VehicleStatic.outputVehicle(car, o);
        Vehicle newC = VehicleStatic.inputVehicle(i);
        VehicleStatic.printAllModelWithPrice(newC);

        newC = null;
        //char stream

        FileWriter fw = new FileWriter("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\charStream.txt");
        FileReader fr = new FileReader("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\charStream.txt");
        VehicleStatic.writeVehicle(car, fw);

        Vehicle moto = VehicleStatic.readVehicle(new InputStreamReader(System.in));
        VehicleStatic.writeVehicle(moto, new OutputStreamWriter(System.out));
        //VehicleStatic.printAllModelWithPrice(moto);

        //serial
        newC = VehicleStatic.readVehicle(fr);
        VehicleStatic.printAllModelWithPrice(newC);

        ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\Serializable.bin"));
        objOut.writeObject(car);
        ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("C:\\Users\\mak-s\\ИВТ\\OOP\\Laba3\\lib\\Serializable.bin"));
        VehicleStatic.printAllModelWithPrice((Vehicle)objIn.readObject());
        objIn.close();
        objOut.close();
        
    }
}
