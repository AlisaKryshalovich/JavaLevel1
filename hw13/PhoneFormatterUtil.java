package com.dmdev.hw13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class PhoneFormatterUtil {

    private PhoneFormatterUtil() {
    }

    public static String formatPhoneNumber(String phone) {
        Pattern phonePat = Pattern.compile(
                "^(?:\\+?375)?\\s*\\(?\\s*(\\d{2})\\s*\\)?\\s*(\\d{3})\\s*(\\d{2})\\s*(\\d{2})$");
        String cleanedPhone = phone.replaceAll("[^\\d]", "");
        if (!cleanedPhone.startsWith("375")) {
            cleanedPhone = "375" + cleanedPhone;
        }
        Matcher matcher = phonePat.matcher(cleanedPhone);
        if (matcher.matches()) {
            return String.format("+375 (%s) %s-%s-%s", matcher.group(1), matcher.group(2), matcher.group(3),
                    matcher.group(4));
        }
        return phone;
    }
}
