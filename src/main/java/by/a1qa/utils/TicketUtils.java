package by.a1qa.utils;

import aquality.appium.mobile.application.AqualityServices;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TicketUtils {
//Jul 3, 2021 · 2:30 PM · 2 tickets
    private static String regDate = "\\w*\\s\\d*";
    private static String regTime = "(\\d*)?:(\\d*)\\s[A-Z]*";
//Saturday, Jun 26
    public static String getDate(String data) {
        Pattern pattern = Pattern.compile(regDate);
        Matcher matcher = pattern.matcher(data);
        if(matcher.find()) {
            return matcher.group(0).trim();
        } else {
            AqualityServices.getLogger().info("No matches");
            return null;
        }
    }

    public static String getDateForTicket(String data) {
        String date = null;
        date = data.substring(data.indexOf(',') + 1);
        return date.trim();
    }

    public static String getTime(String data) {
        Pattern pattern = Pattern.compile(regTime);
        Matcher matcher = pattern.matcher(data);
        if(matcher.find()) {
            return matcher.group(0).trim();
        } else {
            AqualityServices.getLogger().info("No matches");
            return null;
        }
    }

    public static String getTicketsNumber(String data) {
        String number = null;
        number = data.substring(data.indexOf("M") + 3, data.indexOf("t"));
        return number.trim();
    }

    public static String getPriceFromTicketScreen(String data) {
        String price = null;
        price = data.substring(0, data.indexOf("ea") -1);
        return price;
    }
}
