package base;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import static com.codeborne.selenide.Selenide.*;

public class BaseTest {
    protected static final PageManager page = new PageManager();

    @BeforeClass
    public static void setUp() {
        Configuration.startMaximized = true;
        clearBrowserCookies();
      //  page.init();

    }

    @AfterClass
    static void tearDown() {
        System.out.println("Конец теста");
    }
}
