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


}