package base;

import page.HomePage;
import page.OpenHomePage;
import page.SearchPage;



public class PageManager {

    private HomePage homePage = new HomePage();
    private SearchPage searchPage = new SearchPage();
    private OpenHomePage openHomePage = new OpenHomePage();


    protected void init() {
        homePage = new HomePage();
        searchPage = new SearchPage();
        openHomePage = new OpenHomePage();
    }

    public HomePage homePage() {
        return homePage;
    }

    public SearchPage searchPage(){
        return searchPage;
    }

    public OpenHomePage openHomePage(){
        return openHomePage;
    }

}
