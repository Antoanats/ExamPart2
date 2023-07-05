import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.Browser;


public class BaseTest {

    @BeforeClass
    public void setUp() {
        Browser.setUp();
    }

    @AfterClass
    public void tearDown() {
       Browser.tearDown();
    }
}
