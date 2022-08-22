import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlightTicketTest extends BaseTest{

    HomePage homePage;
    FlightPage flightPage;
    SearchAndSelectBox searchBox;
    DepartureAndReturnDaysBox departureAndReturnDaysBox;
    WebDriverWait wait;






    @Test
    @Order(1)
    public void searchAndSelectFlight() throws InterruptedException {

        homePage=new HomePage(driver);
        Thread.sleep(5000);
        homePage.searchBox.searchOrigin("istanbul");//"Nereden" Şehri seç
        Thread.sleep(5000);
        homePage.searchBox.searchDestination("Paris");//"Nereye" Şehri seç



    }

    @Test
    @Order(2)
    public void departureAndReturnDaysSelect(){

        homePage.departureAndReturnDaysBox.selectDepartureDay();





    }

    @Test
    @Order(3)
    public void findCheapFlight(){

        flightPage.clickCheapFlight();
    }
    @Test
    @Order(4)
    public void selectConvenientFlight(){

    }
}
