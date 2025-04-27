public class Car extends Vehicle {
    public Car(String plate, String brand, String model){
        super(plate, brand, model);
    }
    
    @Override
    public double calculateParkingFee(int hours){
        return hours * 5.0;
    }

    @Override
    public String toString(){
        return "Veículo: Carro - " + super.toString();
    }
}
