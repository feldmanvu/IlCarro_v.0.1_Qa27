package manager;

import models.Car;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarHelper extends HelperBase{
    public CarHelper(WebDriver wd) {
        super(wd);
    }

    public void openCarCreationForm() {
        click(By.xpath("//a[text()=' Let the car work ']"));
    }
    public void fillFormCreateCar(Car car){
        type(By.id("make"),car.getMake());
        type(By.id("model"), car.getModel());
        type(By.id("year"), car.getYear());
        type(By.id("engine"), car.getEngine());
        type(By.id("doors"), car.getDoors());
        type(By.id("seats"),car.getSeats());
        type(By.id("class"), car.getCarClass());
        type(By.id("fuelConsumption"), car.getFuelConsumption());
        type(By.id("serialNumber"),car.getCarRegistrationNumber());
        type(By.id("price"),car.getPrice());
        type(By.id("distance"), car.getDistanceIncluded());


    }
}

