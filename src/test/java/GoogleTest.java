/**
 * Created by elephant on 28.03.16.
 */

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;


public class GoogleTest {

    @Test
    public void userCanSearchKeywordWithGoogle() {
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $$("#ires .g").shouldHave(CollectionCondition.size(10));
        $("#ires .g").shouldHave(Condition.text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }

    @Test
    public void userCanSearchKeywordWithGoogle2() {
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
    }
}
