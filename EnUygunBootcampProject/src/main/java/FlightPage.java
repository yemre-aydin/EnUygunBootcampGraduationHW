import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlightPage extends BasePage{

    By  cheapFlightButtonLocator=new By.ByCssSelector("span.primary-btn block");
    public FlightPage(WebDriver driver) {
        super(driver);
    }

    public void clickCheapFlight(){
        click(cheapFlightButtonLocator);
    }


}
