import java.io.*;

public class VehicleStatic {
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
        DataOutputStream outStream = new DataOutputStream(out);
        byte[] bytes = v.getClass().toString().getBytes();
        outStream.writeInt(bytes.length);
        outStream.write(bytes);
        bytes = v.getMark().getBytes();
        outStream.writeInt(bytes.length);
        outStream.write(bytes);
        outStream.writeInt(v.getSize());
        String[] models = v.getAllModelNames();
        double[] prices = v.getAllModelPrices();
        for(int i = 0; i < v.getSize(); i++){
            bytes = models[i].getBytes();
            outStream.writeInt(bytes.length);
            outStream.write(bytes);
            outStream.writeDouble(prices[i]);
        }
    }
    public static Vehicle inputVehicle(InputStream in) throws IOException{
        Vehicle v = null;
        DataInputStream inStream = new DataInputStream(in);
        byte[] bytes = new byte[inStream.readInt()];
        for(int i = 0; i < bytes.length; i++){
            bytes[i] = inStream.readByte();
        }
        String vehicleClass = new String(bytes);
        bytes = new byte[inStream.readInt()];
        for(int i = 0; i < bytes.length; i++){
            bytes[i] = inStream.readByte();
        }
        String mark = new String(bytes);
        String[] models = new String[inStream.readInt()];
        double[] prices = new double[models.length];
        for(int i = 0; i < models.length;i++){
            bytes = new byte[inStream.readInt()];
            for(int j = 0; j < bytes.length;j++){
                bytes[j] = inStream.readByte();
            }
            models[i] = new String(bytes);
            prices[i] = inStream.readDouble();
        }
        switch (vehicleClass) {
            case "class Motorbike":
                v = new Motorbike(mark, models, prices);
                break;
            case "class Car":
                v = new Car(mark, models, prices);
                break;
        }
        return v;
    }
}
