package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;

public class OrderTest {
    private MainPage openMainPage;
    private OrderPage placeOrder;

    @Before
    public void preconditions() {
        openMainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);
        placeOrder = new OrderPage();
    }

    @Test
    public void orderTest1() {

        openMainPage.clickPurchaseButton();

        placeOrder.OrderPageFiller("Евгений", "Симхаев",
                "Москва, ул. Тверская д13", "+79112340296");
        placeOrder.clickMetroStation();
        placeOrder.getMetroStation().setValue("Тверская").sendKeys(Keys.DOWN, Keys.ENTER);

        placeOrder.clickNextButton();

        placeOrder.clickDeliveryDate();
        placeOrder.getDeliveryDate().sendKeys(Keys.RIGHT, Keys.ENTER);

        placeOrder.clickRentPeriod();
        placeOrder.getOpenRentPeriod1();

        placeOrder.clickGreyColor();

        placeOrder.clickCommentsForCourier();
        placeOrder.getCommentsForCourier().setValue("тест комментов");

        placeOrder.clickOrderButton();

        placeOrder.clickYesButton();

        placeOrder.getSuccessfulRegistration().shouldHave(Condition.exactText("Заказ оформлен"));

    }

    @Test
    public void orderTest2() {

        openMainPage.clickPurchaseDownButton();

        placeOrder.OrderPageFiller("Сергей", "Иванов",
                "Москва, ул. Тушинская д23", "+79222367287");
        placeOrder.clickMetroStation();
        placeOrder.getMetroStation().setValue("Тушино").sendKeys(Keys.DOWN, Keys.ENTER);

        placeOrder.clickNextButton();

        placeOrder.clickDeliveryDate();
        placeOrder.getDeliveryDate().sendKeys(Keys.DOWN, Keys.ENTER);

        placeOrder.clickRentPeriod();
        placeOrder.getOpenRentPeriod2();

        placeOrder.clickBlackColor();

        placeOrder.clickCommentsForCourier();
        placeOrder.getCommentsForCourier().setValue("тест комментов номер 2");

        placeOrder.clickOrderButton();

        placeOrder.clickYesButton();

        placeOrder.getSuccessfulRegistration().shouldHave(Condition.exactText("Заказ оформлен"));

    }

}

