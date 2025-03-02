package com.dmdev.lesson40homework.homework8Task2;

import java.util.Iterator;
import java.util.List;

public final class AverageAgeUtil {
    private AverageAgeUtil() {}

    public static String getAverageAge(List<User> users) {
        int sum = 0;
        int count = 0;
        for (Iterator<User> iterator = users.iterator();iterator.hasNext();) {
            User next = iterator.next();
            sum += next.getAge();
            count++;
        }
        return "Average age: " + sum / count;
    }
}
