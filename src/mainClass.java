public class mainClass {
    public static void main(String[] args) throws Exception{
        Vehicle car = new Motorbike("audi", 5);
        //Motorbike bike = new Motorbike("krytoi", 3);
      //  try{
            VehiclePrint.printAllModelWithPrice(car);
            car.editModelName("Name: 456467567", "Name: 567567");
            car.setPriceByName("Name: 1", 4.0);
            VehiclePrint.printAllModelWithPrice(car);
            car.deliteModelByName("Name: 1");
            car.modelAdd("asdfas", 385632.0);
            VehiclePrint.printAllModelWithPrice(car);
        /* }
        catch(NoSuchModelNameException ex){
            System.out.println(ex);
        }
        catch(DuplicateModelNameException ex){
            System.out.println(ex);
        }
        catch(ModelPriceOutOfBoundsException ex){
            System.out.println(ex);
        }*/
    }
}
