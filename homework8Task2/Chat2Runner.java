package com.dmdev.lesson40homework.homework8Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Chat2Runner {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>(Arrays.asList(
                new User(3, "Ivan", 34),
                new User(5, "Ivan", 23)
        ));

        List<User> users2 = new ArrayList<>(Arrays.asList(
                new User(4, "Petr", 41),
                new User(6, "Slava", 14)
        ));

        List<User> users3 = new ArrayList<>(Arrays.asList(
                new User(7, "Roman", 35),
                new User(8, "Igor", 39)
        ));

        List<Chat2> chats = new ArrayList<>();
        chats.add(new Chat2("Юмор", users));
        chats.add(new Chat2("Новости", users2));
        chats.add(new Chat2("Звезды района", users3));

        System.out.println(AllUsersUtil.makeGeneralListUsers(chats));
        System.out.println(AverageAgeUtil.getAverageAge(AllUsersUtil.makeGeneralListUsers(chats)));
    }
}
