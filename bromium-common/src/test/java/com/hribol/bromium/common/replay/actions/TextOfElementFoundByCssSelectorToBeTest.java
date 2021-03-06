package com.hribol.bromium.common.replay.actions;

import com.hribol.bromium.core.synchronization.EventSynchronizer;
import com.hribol.bromium.replay.ReplayingState;
import com.hribol.bromium.replay.actions.WebDriverAction;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 * Created by hvrigazov on 21.05.17.
 */
public class TextOfElementFoundByCssSelectorToBeTest {

    String cssSelector = ".test";
    String text = "text";
    String eventName = "eventName";
    Integer timeout = 1;

    WebDriver driver;

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void timesOutIfNoSuitableElements() {
        WebDriverAction webDriverAction = getActionBase("bla");
        thrown.expect(TimeoutException.class);
        webDriverAction.execute(driver, mock(ReplayingState.class), mock(EventSynchronizer.class));
    }

    @Test
    public void doesNotTimeoutIfSuitableElementIsFound() {
        WebDriverAction webDriverAction = getActionBase(text);
        webDriverAction.execute(driver, mock(ReplayingState.class), mock(EventSynchronizer.class));
    }

    private WebDriverAction getActionBase(String textOfElement) {
        WebDriverAction webDriverAction = new TextOfElementFoundByCssSelectorToBe(cssSelector, text, eventName, timeout);

        WebElement webElement = mock(WebElement.class);
        when(webElement.getText()).thenReturn(textOfElement);
        List<WebElement> webElements = new ArrayList<>();
        webElements.add(webElement);
        By by = By.cssSelector(cssSelector);
        driver = mock(WebDriver.class);
        when(driver.findElements(by)).thenReturn(webElements);

        return webDriverAction;
    }
}
