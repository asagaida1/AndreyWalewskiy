package ua.asagayda.homeWork.Task01_ImitationArrayList;

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

//    @Test
//    void deleteElementByIndex() {
//    }
//
//    @Test
//    void addLength() {
//    }
//
//    @Test
//    void decreaseLength() {
//    }
//
//    @Test
//    void printList() {
//    }
//
//    @Test
//    void printListRevers() {
//    }
//
//    @Test
//    void sortListBubble() {
//    }
//
//    @Test
//    void addArrey() {
//    }
//
//    @Test
//    void length() {
//    }
//
//    @Test
//    void removeDuplicates() {
//    }
//
//    @Test
//    void findIndexFirstElement() {
//    }
//
//    @Test
//    void findIndexFirstElement2() {
//    }
//
//    @Test
//    void mixingElement() {
//    }
}