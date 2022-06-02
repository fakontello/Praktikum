package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class OrderPage {
    // Имя
    private SelenideElement clientName = $(byXpath("//input[@placeholder='* Имя']"));

    // метод заполнения поля Имя
    public void setClientName(String name) {
        clientName.setValue(name);
    }

    // Фамилия
    private SelenideElement clientSurname = $(byXpath("//input[@placeholder='* Фамилия']"));

    // метод заполнения поля Фамилия
    public void setClientSurname(String surname) {
        clientSurname.setValue(surname);
    }

    // Адрес
    private SelenideElement clientAddress = $(byXpath("//input[@placeholder='* Адрес: куда привезти заказ']"));

    // метод заполнения поля Адрес
    public void setClientAddress(String address) {
        clientAddress.setValue(address);
    }

    // Станция метро (баг: ввести название станции, нажать Enter)
    private SelenideElement metroStation = $(byXpath("//input[@placeholder='* Станция метро']"));

    // геттер станций метро
    public SelenideElement getMetroStation() {
        return metroStation;

    }

    // выбор станций метро
    public void clickMetroStation() {
        metroStation.click();
    }

    // Телефон
    public SelenideElement phoneNumber = $(byXpath
            ("//input[@placeholder='* Телефон: на него позвонит курьер']"));

    // метод заполнения поля Телефон
    public void setPhoneNumber(String phone) {
        phoneNumber.setValue(phone);
    }

    // Кнопка Далее
    private SelenideElement nextButton = $(byText("Далее"));

    // Метод клика по кнопке Далее
    public void clickNextButton() {
        nextButton.click();
    }

    // Кнопка Назад
    private SelenideElement backButton = $(byText("Назад"));

    // Метод клика по кнопке Назад
    public void clickBackButton() {
        backButton.click();
    }

    // Дата доставки
    private SelenideElement deliveryDate = $(byXpath
            ("//input[@placeholder='* Когда привезти самокат']"));

    // Метод клика для выбора даты доставки
    public void clickDeliveryDate() {
        deliveryDate.click();
    }

    // геттер календаря доставки
    public SelenideElement getDeliveryDate() {
        return deliveryDate;
    }

    // Срок аренды
    private SelenideElement rentPeriod = $(byClassName("Dropdown-placeholder"));

    public void clickRentPeriod() {
        rentPeriod.click();
    }

    // Раскрытый список аренды, первый элемент
    private SelenideElement openRentPeriod1 = $$(byClassName("Dropdown-menu")).
            get(0).find(byClassName("Dropdown-option"));

    // геттер раскрытого списка аренды
    public SelenideElement getOpenRentPeriod1() {
        return openRentPeriod1;
    }

    // Раскрытый список аренды, первый элемент
    private SelenideElement openRentPeriod2 = $$(byClassName("Dropdown-menu")).
            get(1).find(byClassName("Dropdown-option"));

    // геттер раскрытого списка аренды
    public SelenideElement getOpenRentPeriod2() {
        return openRentPeriod2;
    }

    // Цвет самоката Черный
    private SelenideElement blackColor = $(byId("black"));

    // Метод клика по кнопке выбора Черного цвета
    public void clickBlackColor() {
        blackColor.click();
    }

    // Цвет самоката Серый
    private SelenideElement greyColor = $(byId("grey"));

    // Метод клика по кнопке выбора Серого цвета
    public void clickGreyColor() {
        greyColor.click();
    }

    // Комментарии для курьера
    private SelenideElement commentsForCourier = $(byXpath
            ("//input[@placeholder='Комментарий для курьера']"));

    // клик по полю с комментами
    public void clickCommentsForCourier() {
        commentsForCourier.click();
    }

    // геттер для комментов курьерам
    public SelenideElement getCommentsForCourier() {
        return commentsForCourier;
    }

    // Кнопка Заказать
    private SelenideElement orderButton = $(byCssSelector
            ("button[class='Button_Button__ra12g Button_Middle__1CSJM']"));

    // Метод клика по кнопке Заказать
    public void clickOrderButton() {
        orderButton.click();
    }

    // Окно подтверждения оформления заказа
    private SelenideElement confirmationWindow = $(byClassName("Order_ModalHeader__3FDaJ"));
    // Окно подтверждения заказа, кнопка Нет
    private SelenideElement noButton = $(byCssSelector
            ("button[class='Button_Button__ra12g Button_Middle__1CSJM Button_Inverted__3IF-i']"));

    // Метод клика по кнопке Нет
    public void clickNoButton() {
        noButton.click();
    }

    // Окно подтверждения заказа, кнопка Да
    private SelenideElement yesButton = $(byCssSelector("button[class='Button_Button__ra12g Button_Middle__1CSJM']"));

    // Метод клика по кнопке Да
    public void clickYesButton() {
        yesButton.click();
    }

    // Окно об успешном оформлении заказа
    private SelenideElement successfulRegistration = $$(byClassName("Order_Modal__YZ-d3")).
            get(0).find(byText("Заказ оформлен"));

    // геттер
    public SelenideElement getSuccessfulRegistration() {
        return successfulRegistration;
    }

    // метод заполнения первой страницы заказа
    public void OrderPageFiller(String name, String surname, String address, String phone) {
        setClientName(name);
        setClientSurname(surname);
        setClientAddress(address);
        setPhoneNumber(phone);
    }

}
