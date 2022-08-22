import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DepartureAndReturnDaysBox extends BasePage{

    By selectDepartureDayLocator=new By.ByCssSelector("span.SingleDatePicker.SingleDatePicker_1");
    By selectReturnDayLocator=By.id("ReturnDate");

    public DepartureAndReturnDaysBox(WebDriver driver) {
        super(driver);
    }

    public void selectDepartureDay(){
        click(selectDepartureDayLocator);




    }
    public void selectReturnDay(){
        click(selectReturnDayLocator);

    }
}
