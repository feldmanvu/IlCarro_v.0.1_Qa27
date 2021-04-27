import models.Car;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateNewCarTest extends TestBase{
    @BeforeMethod
    public void precondition(){

    }
    @Test
    public void createNewCar(){
        app.car().openCarCreationForm();
        app.car().fillFormCreateCar(new Car().withMake("KIA").
                withModel("RIO").withYear("2016").withEngine("1.6").
                withDoors("5").withSeats("5").withCarClass("C").
                withCarRegistrationNumber("2312300").
                withPrice("23").withDistanceIncluded("150 000"));


    }

    @AfterMethod
    public void postConditions(){

    }
}
