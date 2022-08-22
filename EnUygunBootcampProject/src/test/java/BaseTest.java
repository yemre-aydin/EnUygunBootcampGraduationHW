import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestMethodOrder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)//static den kurtarma
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)//junit de testleri sırasıyla koşması için
public class BaseTest {

    WebDriver driver;

    @BeforeAll
    public void setUp(){

        WebDriverManager.chromedriver().setup();//chromedriver başlatma
        driver=new ChromeDriver();
        driver.get("https://www.enuygun.com/ucak-bileti/");
        driver.manage().window().maximize();
    }

    /*
    @AfterAll
    public void tearDown(){
        driver.quit();
    }*/
}
