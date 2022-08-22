import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage{
    SearchAndSelectBox searchBox;
    DepartureAndReturnDaysBox departureAndReturnDaysBox;

    public HomePage(WebDriver driver) {
        super(driver);
        searchBox=new SearchAndSelectBox(driver);

    }


    public SearchAndSelectBox searchBox() {
        return this.searchBox;
    }
    public DepartureAndReturnDaysBox departureAndReturnDaysBox(){
        return this.departureAndReturnDaysBox;
    }
}
