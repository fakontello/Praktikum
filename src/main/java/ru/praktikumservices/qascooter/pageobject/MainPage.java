package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    // кнопка "Заказать" в правом верхнем углу
    private SelenideElement purchaseButton = $(byClassName("Button_Button__ra12g"));

    // метод клика по кнопке "Заказать" в правом верхнем углу
    public void clickPurchaseButton() {

        purchaseButton.click();
    }

    // кнопка "Статус заказа" в правом верхнем углу
    private SelenideElement purchaseStatusButton = $(byClassName("Header_Link__1TAG7"));

    // метод клика по кнопке "Статус заказа" в правом верхнем углу
    public void clickPurchaseStatusButton() {

        purchaseStatusButton.click();
    }

    // нижняя кнопка "Заказать"
    private SelenideElement purchaseDownButton = $$(byClassName("Home_FinishButton__1_cWm")).
            get(0).find(byText("Заказать"));

    // метод клика по нижней кнопке Заказать
    public void clickPurchaseDownButton() {

        purchaseDownButton.click();
    }

    // блок FAQ 1
    private SelenideElement faqBlock1 = $(byId("accordion__heading-0")).scrollTo();

    // клик по блоку FAQ 1
    public void clickFaqBlock1() {
        faqBlock1.click();
    }

    // геттер FAQ 1
    public SelenideElement getFaqBlock1() {
        return faqBlock1;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock1 = $(byId("accordion__panel-0"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock1() {
        return insideFaqBlock1;
    }

    // блок FAQ 2
    private SelenideElement faqBlock2 = $(byId("accordion__heading-1")).scrollTo();

    // клик по блоку FAQ 2
    public void clickFaqBlock2() {
        faqBlock2.click();
    }

    // геттер FAQ 2
    public SelenideElement getFaqBlock2() {
        return faqBlock2;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock2 = $(byId("accordion__panel-1"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock2() {
        return insideFaqBlock2;
    }

    // блок FAQ 3
    private SelenideElement faqBlock3 = $(byId("accordion__heading-2")).scrollTo();

    // клик по блоку FAQ 3
    public void clickFaqBlock3() {
        faqBlock3.click();
    }

    // геттер FAQ 3
    public SelenideElement getFaqBlock3() {
        return faqBlock3;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock3 = $(byId("accordion__panel-2"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock3() {
        return insideFaqBlock3;
    }

    // блок FAQ 4
    private SelenideElement faqBlock4 = $(byId("accordion__heading-3")).scrollTo();

    // клик по блоку FAQ 4
    public void clickFaqBlock4() {
        faqBlock4.click();
    }

    // геттер FAQ 4
    public SelenideElement getFaqBlock4() {
        return faqBlock4;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock4 = $(byId("accordion__panel-3"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock4() {
        return insideFaqBlock4;
    }

    // блок FAQ 5
    private SelenideElement faqBlock5 = $(byId("accordion__heading-4")).scrollTo();

    // клик по блоку FAQ 5
    public void clickFaqBlock5() {
        faqBlock5.click();
    }

    // геттер FAQ 5
    public SelenideElement getFaqBlock5() {
        return faqBlock5;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock5 = $(byId("accordion__panel-4"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock5() {
        return insideFaqBlock5;
    }

    // блок FAQ 6
    private SelenideElement faqBlock6 = $(byId("accordion__heading-5")).scrollTo();

    // клик по блоку FAQ 6
    public void clickFaqBlock6() {
        faqBlock6.click();
    }

    // геттер FAQ 6
    public SelenideElement getFaqBlock6() {
        return faqBlock6;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock6 = $(byId("accordion__panel-5"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock6() {
        return insideFaqBlock6;
    }

    // блок FAQ 7
    private SelenideElement faqBlock7 = $(byId("accordion__heading-6")).scrollTo();

    // клик по блоку FAQ 7
    public void clickFaqBlock7() {
        faqBlock7.click();
    }

    // геттер FAQ 7
    public SelenideElement getFaqBlock7() {
        return faqBlock7;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock7 = $(byId("accordion__panel-6"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock7() {
        return insideFaqBlock7;
    }

    // блок FAQ 8
    private SelenideElement faqBlock8 = $(byId("accordion__heading-7")).scrollTo();

    // клик по блоку FAQ 8
    public void clickFaqBlock8() {
        faqBlock8.click();
    }

    // геттер FAQ 8
    public SelenideElement getFaqBlock8() {
        return faqBlock8;
    }

    // содержимое блока
    private SelenideElement insideFaqBlock8 = $(byId("accordion__panel-7"));

    // геттер содержимого
    public SelenideElement getInsideFaqBlock8() {
        return insideFaqBlock8;
    }

}
