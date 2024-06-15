package Tests.OnlinerTests;

import Pages.OnlinerPages.MoblieTaskPage;
import Tests.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_FirstApplePhonePriceMoreThan1000 extends BaseTest {
    MoblieTaskPage moblieTaskPage = new MoblieTaskPage(driver);
    String onlinerLink = "https://www.onliner.by/";

    @Test
    public void firstApplePhonePriceMoreThan1000(){
        moblieTaskPage.open(onlinerLink);

        moblieTaskPage.clickSmartphonesCatalog();

        do {
            driver.findElement(By.tagName("body")).sendKeys(Keys.PAGE_DOWN);
        }
        while (!moblieTaskPage.isHonorCheckboxVisible());

        moblieTaskPage.disableHonorCheckbox();
        moblieTaskPage.clickAppleCheckbox();

        Assert.assertTrue(moblieTaskPage.getFirstPrice() > 1000);
    }

    /*
    Задача по Автоматизации тестирования на Java Условие:
    Написать тест, который выполняет следующие действия.
    На сайте "onliner.by" получить стоимость мобильного телефона,
    который находится на первой позиции в списке мобильных телефонов
    марки "Apple" и проверить, что полученная стоимость больше 100 BYN.
    Примечания: Не используйте никаких языков программирования, кроме Java.
    Не используйте поле поиска по сайту. Не передавайте параметры фильтрации напрямую в URL,
    соответственно стартовая страница теста и единственное значение которое может передаваться в URL
    должно быть "onliner.by". Возможно ли ее выполнение на Вашем сайте?
     */
}
