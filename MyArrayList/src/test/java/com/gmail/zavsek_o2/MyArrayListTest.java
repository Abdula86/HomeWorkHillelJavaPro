package test.java.com.gmail.zavsek_o2;

import com.gmail.zavsek_o2.MyArrayList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyArrayListTest {
    private MyArrayList list;

    @BeforeEach
    void setUp() {
        list = new MyArrayList();
    }

    @Test
    void emptyList() {
        Assertions.assertTrue(list.isEmpty());
        Assertions.assertEquals(0, list.size());
        Assertions.assertEquals("", list.toString());
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.get(5));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.set("value", 5));
    }

    @Test
    void nonEmptyList() {
        list.addLast("value");
        Assertions.assertFalse(list.isEmpty());
        Assertions.assertEquals(1, list.size());
    }

    @Test
    void addLast() {
        for (int i = 0; i < 5; i++) {
            list.addLast("element#" + i);
        }
        String[] expected = {"element#0", "element#1", "element#2", "element#3", "element#4"};

        Assertions.assertFalse(list.isEmpty());
        Assertions.assertEquals(5, list.size());
        Assertions.assertEquals("element#0, element#1, element#2, element#3, element#4, ", list.toString());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void addFirst() {
        for (int i = 0; i < 5; i++) {
            list.addFirst("element#" + i);
        }
        String[] expected = {"element#4", "element#3", "element#2", "element#1", "element#0"};

        Assertions.assertFalse(list.isEmpty());
        Assertions.assertEquals(5, list.size());
        Assertions.assertEquals("element#4, element#3, element#2, element#1, element#0, ", list.toString());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void add() {
        for (int i = 0; i < 5; i++) {
            list.addLast("element#" + i);
        }
        String[] expected = {"element#0", "element#1", "element#2", "qwerty", "element#3", "element#4"};

        list.add("qwerty", 3);

        Assertions.assertFalse(list.isEmpty());
        Assertions.assertEquals(6, list.size());
        Assertions.assertEquals("element#0, element#1, element#2, qwerty, element#3, element#4, ", list.toString());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }

    @Test
    void addInvalidIndex() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.add("value", -1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.add("value", 10));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.add("value", 100));
    }

    @Test
    void deleteInvalidIndex() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(-1));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(10));
        Assertions.assertThrows(IllegalArgumentException.class, () -> list.delete(100));
    }

    @Test
    void deleteLastElement() {
        for (int i = 0; i < 16; i++) {
            list.addLast("element#" + i);
        }

        String deletedElement = list.delete(15);

        Assertions.assertEquals("element#15", deletedElement);
        Assertions.assertFalse(list.isEmpty());
        Assertions.assertEquals(15, list.size());
    }

    @Test
    void delete() {
        for (int i = 0; i < 5; i++) {
            list.addLast("element#" + i);
        }
        String[] expected = {"element#0", "element#1", "element#3", "element#4"};

        String deletedElement = list.delete(2);

        Assertions.assertEquals("element#2", deletedElement);
        Assertions.assertFalse(list.isEmpty());
        Assertions.assertEquals(4, list.size());
        for (int i = 0; i < expected.length; i++) {
            Assertions.assertEquals(expected[i], list.get(i));
        }
    }
}
