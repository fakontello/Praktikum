package ru.praktikumservices.qascooter.pageobject;

import com.codeborne.selenide.Condition;
import org.junit.Before;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public class FaqTest {
    private MainPage openMainPage;

    @Before
    public void preconditions() {
        openMainPage = open("https://qa-scooter.praktikum-services.ru/", MainPage.class);

    }

    @Test
    public void faqTest1() {

        openMainPage.getFaqBlock1().shouldHave(Condition.exactText("Сколько это стоит? И как оплатить?"));

        openMainPage.clickFaqBlock1();
        openMainPage.getInsideFaqBlock1().shouldHave(Condition.exactText
                ("Сутки — 400 рублей. Оплата курьеру — наличными или картой."));

    }

    @Test
    public void faqTest2() {

        openMainPage.getFaqBlock2().shouldHave(Condition.exactText("Хочу сразу несколько самокатов! Так можно?"));

        openMainPage.clickFaqBlock2();
        openMainPage.getInsideFaqBlock2().shouldHave(Condition.exactText("Пока что у нас так: один заказ — " +
                "один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — " +
                "один за другим."));
    }

    @Test
    public void faqTest3() {

        openMainPage.getFaqBlock3().shouldHave(Condition.exactText("Как рассчитывается время аренды?"));

        openMainPage.clickFaqBlock3();
        openMainPage.getInsideFaqBlock3().shouldHave(Condition.exactText("Допустим, вы оформляете заказ на 8 мая. " +
                "Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы " +
                "оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится " +
                "9 мая в 20:30."));

    }

    @Test
    public void faqTest4() {

        openMainPage.getFaqBlock4().shouldHave(Condition.exactText("Можно ли заказать самокат прямо на сегодня?"));

        openMainPage.clickFaqBlock4();
        openMainPage.getInsideFaqBlock4().shouldHave(Condition.exactText("Только начиная с завтрашнего дня. " +
                "Но скоро станем расторопнее."));

    }

    @Test
    public void faqTest5() {

        openMainPage.getFaqBlock5().shouldHave(Condition.exactText
                ("Можно ли продлить заказ или вернуть самокат раньше?"));

        openMainPage.clickFaqBlock5();
        openMainPage.getInsideFaqBlock5().shouldHave(Condition.exactText("Пока что нет! Но если что-то срочное — " +
                "всегда можно позвонить в поддержку по красивому номеру 1010."));

    }

    @Test
    public void faqTest6() {

        openMainPage.getFaqBlock6().shouldHave(Condition.exactText("Вы привозите зарядку вместе с самокатом?"));

        openMainPage.clickFaqBlock6();
        openMainPage.getInsideFaqBlock6().shouldHave(Condition.exactText("Самокат приезжает к вам с полной " +
                "зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. " +
                "Зарядка не понадобится."));

    }

    @Test
    public void faqTest7() {

        openMainPage.getFaqBlock7().shouldHave(Condition.exactText("Можно ли отменить заказ?"));

        openMainPage.clickFaqBlock7();
        openMainPage.getInsideFaqBlock7().shouldHave(Condition.exactText("Да, пока самокат не привезли. Штрафа не " +
                "будет, объяснительной записки тоже не попросим. Все же свои."));

    }

    @Test
    public void faqTest8() {

        openMainPage.getFaqBlock8().shouldHave(Condition.exactText("Я жизу за МКАДом, привезёте?"));

        openMainPage.clickFaqBlock8();
        openMainPage.getInsideFaqBlock8().shouldHave(Condition.exactText("Да, обязательно. Всем самокатов! И " +
                "Москве, и Московской области."));

    }
}
