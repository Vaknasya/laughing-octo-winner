package Elements;

import org.openqa.selenium.By;

public class Label extends BaseElement{

    public Label(By locator, String name) {
        super(locator, name);
    }

    private final Label inputUsernameField =
            new Label(By.cssSelector("#user-name"), "lOGIN FIELD");


}
