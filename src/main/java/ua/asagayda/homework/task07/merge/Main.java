package ua.asagayda.homework.task07.merge;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLDataException;

public class Main {
    public static void main(String[] args) {


        System.out.println("Main in Sub88888 branch");

        System.out.println("Main in Sub9999 branch");
    }

    public void printMessage() throws IOException {
        try {
            if (1 == 1) {
                throw new SQLDataException();
            }
            throw new NullPointerException();
        }
        finally {
            throw new IOException();
        }

    }

    public int getNumberOfFiles() throws FileNotFoundException {
        try {
            return 1;
        } catch (IllegalArgumentException | NullPointerException e) {
            throw  e;

        } finally {
            throw new NullPointerException();
        }

    }
}
