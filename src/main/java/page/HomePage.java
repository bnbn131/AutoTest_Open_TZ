package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;


public class HomePage {
    private SelenideElement searchLine = $x("//input[@name='q']");

    public void innerSearchText(String searchText){
        searchLine.val(searchText).pressEnter();
    }
}
