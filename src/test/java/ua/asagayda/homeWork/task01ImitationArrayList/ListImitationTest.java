package ua.asagayda.homeWork.task01ImitationArrayList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListImitationTest {
ListImitation listImitation = new ListImitation(3);

    @Test
    void addSymbol() {
        listImitation.addSymbol(1);
       int [] expected = listImitation.getArr();
       int [] actual = {1,0,0};
       assertArrayEquals(expected, actual);
    }


    @Test
    void changeElementByIndex() {
        listImitation.changeElementByIndex(1,1);
        int [] expected = listImitation.getArr();
        int [] actual = {0,1,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void deleteElementByIndex() {
        listImitation.deleteElementByIndex(2);
        int [] expected = listImitation.getArr();
        int [] actual = {0,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addLength() {
        listImitation.addLength(3);
        int [] expected = listImitation.getArr();
        int [] actual = {0,0,0,0,0,0};
        assertArrayEquals(expected, actual);
    }

    @Test
    void decreaseLength() {
        listImitation.decreaseLength(2);
        int [] expected = listImitation.getArr();
        int [] actual = {0,0};
        assertArrayEquals(expected, actual);
    }
    @Test
    void decreaseLengthSholdIllegalArgumentException() {
        Throwable exception = assertThrows(IllegalArgumentException.class, () -> listImitation.decreaseLength(0));
        assertEquals("should be less than the length of the array and greater then zero",
                exception.getMessage());
    }


//    @Test
//    void printList() {
//    }
//
//    @Test
//    void printListRevers() {
//    }
//
    @Test
    void sortListBubble() {
        listImitation.addSymbol(3);
        listImitation.addSymbol(1);
        listImitation.addSymbol(2);
        listImitation.sortListBubble();
        int [] expected = listImitation.getArr();
        int [] actual = {1,2,3};
        assertArrayEquals(expected, actual);
    }

    @Test
    void addArrey() {
        listImitation.addArrey(new int [] {1});
        int [] expected = listImitation.getArr();
        int [] actual = {1,0,0};
        assertArrayEquals(expected, actual);
    }
    @Test
    void addArrey2() {
        listImitation.addArrey(new int [] {1,2,3,4});
        int [] expected = listImitation.getArr();
        int [] actual = {0,0,0,1,2,3,4};

        assertArrayEquals(expected, actual);
    }


    @Test
    void removeDuplicates() {
        listImitation.addSymbol(1);
        listImitation.addSymbol(2);
        listImitation.addSymbol(1);

        listImitation.removeDuplicates();
        int [] expected = listImitation.getArr();
        int [] actual = {1,2};

        assertArrayEquals(expected, actual);
    }

    @Test
    void findIndexFirstElement() {
        listImitation.addSymbol(1);
        listImitation.addSymbol(2);
        listImitation.addSymbol(1);
        listImitation.addSymbol(2);
        listImitation.addSymbol(3);

        int expected = listImitation.findIndexFirstElement(1);
        int actual = 0;

        assertEquals(expected, actual);
    }
    @Test
    void findIndexFirstElement2() {
        listImitation.addSymbol(1);
        listImitation.addSymbol(2);
        listImitation.addSymbol(1);
        listImitation.addSymbol(2);
        listImitation.addSymbol(3);

        int expected = listImitation.findIndexFirstElement(3);
        int actual = 4;

        assertEquals(expected, actual);
    }

//
//    @Test
//    void mixingElement() {
//    }
}