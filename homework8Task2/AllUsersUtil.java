package com.dmdev.lesson40homework.homework8Task2;

import java.util.ArrayList;
import java.util.List;

public final class AllUsersUtil {
    private static final int EIGHTEEN = 18;

    private AllUsersUtil() {}

    public static List<User> makeGeneralListUsers(List<Chat2> chats) {
        List<User> adultUsers = new ArrayList<>();
        for (Chat2 chat : chats) {
            for (User user : chat.getUsers()) {
                if (user.getAge() > EIGHTEEN) {
                    adultUsers.add(user);
                }
            }
        }
        return adultUsers;
    }
}
