package com.dmdev.lesson40homework.homework8Task1;

import java.util.*;

public class ChatRunner {
    public static void main(String[] args) {
        List<Chat> chats = new ArrayList<>(Arrays.asList(
                new Chat("Юмор", 15890),
                new Chat("Новости", 456),
                new Chat("Звезды района", 11589),
                new Chat("Секреты садовода", 288),
                new Chat("Любители адреналина", 11589),
                new Chat("Сезон меланхолии", 658)
        ));

        List<Chat> result = RemoveChatUtil.removeChats(chats);
        System.out.println(result);

        result.sort(new ChatNameComparator());
        System.out.println(result);

        result.sort(Comparator.comparingInt(Chat::getUsers)
                .reversed()
                .thenComparing(Chat::getName));

        System.out.println(result);
    }
}
