package page;

import com.codeborne.selenide.ElementsCollection;
import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$$x;

public class SearchPage {
    private ElementsCollection resultLink = $$x("//cite[contains(@class,'iUh30')]");

    public boolean checkLink(String result) {
      return resultLink.findBy(exactText(result)).isDisplayed();
    }

    public void clickLink(String result){
        resultLink.findBy(exactText(result)).click();
    }
}
