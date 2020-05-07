package ua.asagayda.homework.task04.reg.ex;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumberMain {
    public static void main(String[] args) {
        PhoneNumberRegEx p = new PhoneNumberRegEx();

        String text1 = "(093)402-66-48";
        String text2 = "(095)402-66-48";
        String text3 = "(097)402-66-48";
        String text4 = "(073)402-66-48";
        String text5 = "(067)402-66-48";
        String text6 = "(099)402-66-48";
        String text7 = "(063)402-66-48";
        String text8 = "(044)402-66-48й";

        List<String> list = new ArrayList<>();
        list.add(text1);
        list.add(text2);
        list.add(text3);
        list.add(text4);
        list.add(text5);
        list.add(text6);
        list.add(text7);
        list.add(text8);

        for (String s: list) {
            System.out.print(p.validatePhoneNumber(s));
            System.out.println(p.identifyOperator(p.validatePhoneNumber(s)));
        }


    }

}
