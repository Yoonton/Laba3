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
        byte[] markByte = (v.getMark() + "!" + v.getSize() + "$\n").getBytes();
        out.write(markByte);
        for(int i = 0; i < v.getSize(); i++){
            byte[] modelByte = ( v.getAllModelNames()[i] + "#" + v.getAllModelPrices()[i] + "*\n").getBytes();
            out.write(modelByte);
        }
    }
    public static void inputVehicle(InputStream in) throws IOException{
        StringBuilder parseString = new StringBuilder();
        int parseStage = 1;
        String mark = "";
        int modelCount = 0;
        String[] modelNames = new String[0];
        double[] modelPrices = new double[0];
        int i = 0;
        Vehicle v;
        while(in.available() > 0){
            int s = in.read();
            switch (parseStage) {
                case 1:
                    if((char)s == '!'){
                        mark = new String(parseString);
                        parseString = new StringBuilder();
                        parseStage = 2;
                    } 
                    else{
                        parseString.append((char)s);
                    }
                    break;

                case 2:
                    if((char)s == '$'){
                        modelCount = Integer.parseInt(parseString.toString());
                        parseString = new StringBuilder();
                        parseStage = 3;
                    }
                    else{
                        parseString.append((char)s);
                    }
                    break;
                
                case 3:
                    modelNames = new String[modelCount];
                    modelPrices = new double[modelCount];
                    parseStage = 4;
                    break;

                case 4:
                    if((char)s == '#'){
                        modelNames[i] = new String(parseString);
                        parseString = new StringBuilder();
                        parseStage = 5;
                    }
                    else{
                        parseString.append((char)s);
                    }
                    break;

                case 5:
                    if((char)s == '*'){
                        modelPrices[i] = Double.parseDouble(parseString.toString());
                        parseString = new StringBuilder();
                        parseStage = 4;
                        i++;
                    }
                    else{
                        parseString.append((char)s);
                    }
                    break;
            }
        }
        System.out.println(mark + " " + Integer.toString(modelCount) + " " + modelNames[1] + " " + modelPrices[1]);
        //v = new Vehicle(mark, modelNames, modelPrices);
        //глпанамгпаемглаглеа
    }
}
