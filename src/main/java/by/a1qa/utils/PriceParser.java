package by.a1qa.utils;

public class PriceParser {

    private static final String sign = "£";
    private static final String symbols = "ea";

    public static double parsePrice(String priceString) {
        String modefied = null;
        modefied = priceString.replaceAll(sign, "");
        double price = Double.parseDouble(modefied);
        return price;
    }

    public static double parseRealPrice(String priceString) {
        String modefied = null;
        modefied = priceString.replaceAll(sign,"");
        modefied = modefied.substring(0, modefied.indexOf(symbols) - 1);
        double price = Double.parseDouble(modefied);
        return price;
    }
}
