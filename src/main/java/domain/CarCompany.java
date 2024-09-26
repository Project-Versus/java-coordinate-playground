package domain;

public class CarCompany implements Company{
    private Cars cars;

    public CarCompany() {

    }

    @Override
    public void generateReport() {
        this.cars.getCars().forEach(car -> {
            System.out.println(car.getName() + " : " + car.getChargeQuantity()+"리터");
        });
    }

    public void addCars(Cars cars) {
        this.cars = cars;
    }
}
