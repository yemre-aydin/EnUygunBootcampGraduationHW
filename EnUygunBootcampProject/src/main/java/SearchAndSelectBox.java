import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchAndSelectBox extends BasePage{


    By searchOriginLocator= By.id("OriginInput");
    By selectOriginLocator=By.id("react-autowhatever-OriginInput-section-0-item-0");
    By searchDestinationLocator=By.id("DestinationInput");
    By selectDestinationLocator=By.id("react-autowhatever-DestinationInput-section-0-item-0");

    public SearchAndSelectBox(WebDriver driver) {
        super(driver);
    }

    public void searchOrigin(String text){
        type(searchOriginLocator,text);
        click(selectOriginLocator);


    }
    public void searchDestination(String text){
        type(searchDestinationLocator,text);
        click(selectDestinationLocator);

    }


}
