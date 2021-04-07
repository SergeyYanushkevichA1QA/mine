package by.a1qa.screens;


import aquality.appium.mobile.elements.interfaces.IButton;
import aquality.appium.mobile.elements.interfaces.ILabel;
import aquality.appium.mobile.screens.Screen;
import org.openqa.selenium.By;


public class TicketScreen extends Screen {
    private final String ticketContainer = "//androidx.recyclerview.widget.RecyclerView[@index='0']";

    private final ILabel seatingChartLoc = getElementFactory().getLabel(By.id("com.todaytix.TodayTix:id/static_seating_chart"), "Seating chart");
    private final By TicketPriceLoc = By.xpath(ticketContainer + "//*[contains(@resource-id, 'com.todaytix.TodayTix:id/real_price')]");
    private final ILabel expensiveTicket = getElementFactory().getLabel(By.id("com.todaytix.TodayTix:id/real_price"), "Expensive ticket");
    private final ILabel holdTimerLbl = getElementFactory().getLabel(By.id("com.todaytix.TodayTix:id/hold_timer_static_label"), "Hold timer");
    private final ILabel numberAndPriceLbl = getElementFactory().getLabel(By.id("com.todaytix.TodayTix:id/price_label"), "Nmber and price of ticket");
    private final IButton continueButton = getElementFactory().getButton(By.id("com.todaytix.TodayTix:id/checkout_button"), "Continue butotn");

    public TicketScreen() {
        super(By.id("com.todaytix.TodayTix:id/static_seating_chart"), "Ticket Screen");
    }

    public boolean isOnTicketScreen() {
        return seatingChartLoc.state().waitForDisplayed();
    }

    public void clickMostExpensiveTicket() {
        expensiveTicket.click();
    }

    public String getHoldTimerTxt() {
        return holdTimerLbl.getText();
    }

    public String getPrice() {
        return expensiveTicket.getText();
    }

    public String getNumberAndPrice() {
        return numberAndPriceLbl.getText();
    }

    public void clickContinueBtn(){
        continueButton.click();
    }
}
