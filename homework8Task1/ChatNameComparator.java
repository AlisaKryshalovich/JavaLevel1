package com.dmdev.lesson40homework.homework8Task1;

import java.util.Comparator;

public class ChatNameComparator implements Comparator<Chat> {

    @Override
    public int compare(Chat o1, Chat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
