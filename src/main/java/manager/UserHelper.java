package manager;

import models.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserHelper extends HelperBase{

    public UserHelper(WebDriver wd) {
        super(wd);
    }


    public void opegLoginForm() {
        click(By.xpath("//a[text()=' Log in ']"));
    }


    public void fillLoginForm(User user) {
        type(By.id("email"),user.getEmail());
        type(By.id("password"), user.getPassword());
    }

    public void clickLoginButton() {
        click(By.xpath("//button[text()='Y’alla!']"));
    }

    public void successLogin() {
        click(By.xpath("//button[text()='Ok']"));
    }

    public boolean isLogged(){
        isElementPresent(By.xpath("//a[text()=' Logout ']"));
        return true;
    }

    public void logout() {
        click(By.xpath("//a[text()=' Logout ']"));
    }
}
