package com.dmdev.lesson40homework.homework8Task1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class RemoveChatUtil {
    private static final int THOUSAND_USERS = 1000;

    private RemoveChatUtil() {}

    public static List<Chat> removeChats(List<Chat> chats) {
        List<Chat> list = new ArrayList<>();
        Iterator<Chat> iterator = chats.iterator();
        while (iterator.hasNext()) {
            Chat chat = iterator.next();
            if (chat.getUsers() > THOUSAND_USERS) {
                list.add(chat);
            }
        }
        return list;
    }
}
