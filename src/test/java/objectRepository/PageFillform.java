package objectRepository;

import org.openqa.selenium.By;

public class PageFillform {


    static By textinput = By.xpath("//android.widget.EditText[@content-desc=\"text-input\"]");

    static By txt_inputResult = By.xpath("//android.widget.TextView[@content-desc='input-text-result']");

    static By clickswitch = By.xpath("//android.widget.Switch[@content-desc=\"switch\"]");

    static By dropdown = By.xpath("//android.view.ViewGroup[@content-desc=\"Dropdown\"]/android.view.ViewGroup/android.widget.EditText");
    static By chosedropdown = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.FrameLayout/android.widget.ListView/android.widget.CheckedTextView[2]");
    static By clickbutton = By.xpath("//android.view.ViewGroup[@content-desc=\"button-Active\"]/android.view.ViewGroup/android.widget.TextView");
    static By clickok = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.Button[3]");


    public static By getTextinput() {
        return textinput;
    }


    public static By getTxt_inputResult() {
        return txt_inputResult;
    }

    public static By getClickswitch() {
        return clickswitch;
    }

    public static By getDropdown() {
        return dropdown;
    }

    public static By getChosedropdown() {
        return chosedropdown;
    }

    public static By getClickbutton() {
        return clickbutton;
    }

    public static By getClickok() {
        return clickok;
    }
}
