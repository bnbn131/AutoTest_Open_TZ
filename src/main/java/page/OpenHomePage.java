package page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class OpenHomePage {


    private SelenideElement  USDSale = $x("//tr[@class='main-page-exchange__row main-page-exchange__row--with-border'][1]" +
                                         "/td[@class='main-page-exchange__td'][3]" +
                                         "/div[@class='main-page-exchange__indicator']" +
                                         "/span[@class='main-page-exchange__rate']"); // К сожалению не смог по другому зацепиться за данные значения

    private SelenideElement  USDBuy= $x("//tr[@class='main-page-exchange__row main-page-exchange__row--with-border'][1]" +
                                        "/td[@class='main-page-exchange__td'][2]" +
                                        "/div[@class='main-page-exchange__indicator']" +
                                        "/span[@class='main-page-exchange__rate']");

    private SelenideElement  EURSale= $x("//tr[@class='main-page-exchange__row main-page-exchange__row--with-border'][2]" +
                                        "/td[@class='main-page-exchange__td'][3]" +
                                        "/div[@class='main-page-exchange__indicator']" +
                                        "/span[@class='main-page-exchange__rate']");
    private SelenideElement  EURBuy= $x("//tr[@class='main-page-exchange__row main-page-exchange__row--with-border'][2]" +
                                        "/td[@class='main-page-exchange__td'][2]" +
                                        "/div[@class='main-page-exchange__indicator']" +
                                        "/span[@class='main-page-exchange__rate']");

    public double USDSale(){
        System.out.println(USDSale.getText());
        return  Double.parseDouble(USDSale.getText().replace(",", "."));
    }

    public double USDBuy(){
        System.out.println(USDBuy.getText());
        return  Double.parseDouble(USDBuy.getText().replace(",", "."));
    }

    public double EURSale(){
        System.out.println(EURSale.getText());
        return Double.parseDouble(EURSale.getText().replace(",", "."));
    }

    public double EURBuy(){
        System.out.println(EURBuy.getText());
        return Double.parseDouble(EURBuy.getText().replace(",", "."));
    }



}
