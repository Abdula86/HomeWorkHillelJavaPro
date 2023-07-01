package com.gmail.zavsek_o2;

public interface MyList {
    void addFirst(String value);

    void addLast(String value);

    void add(String value, int index);

    String get(int index);

    void set(String value, int index);

    String delete(int index);

    int size();

    boolean isEmpty();
}


