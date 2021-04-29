import models.Car;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewCarTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        if(!app.user().islogged()){
            app.user().login();
            app.user().pause(2000);
        }


    }
    @Test
    public void createNewCar() {

        Car car=new Car().withLocation("Tel-Aviv")
                .withMake("Subaru")
                .withModel("Forester")
                .withYear("2017")
                .withEngine("2000")
                .withFuel(" Petrol ")
                .withGear("AT")
                .withWd(" RWD ")
                .withDoors("5")
                .withSeats("5")
                .withCarClass("Luxury")
                .withFuelConsumption("10")
                .withCarRegNum("8110222")
                .withPrice("350")
                .withDistanceIncluded("500");

        app.car().openCarCreationForm();
        app.user().pause(1000);
        app.car().fillCarForm(car);
        app.car().attachFoto( "C:\\QA27\\IlCarro_v.0.1_Qa27\\Subaru.jpg");
        app.user().pause(2000);
        app.car().saveNewCar();
        Assert.assertTrue((app.car().isCarAdded()));


    }

    @AfterMethod
    public void postConditions(){

    }
}
