package ua.asagayda.homework.task03.string.task03;

import java.util.ArrayList;
import java.util.List;

/*
Вывести текст, составленный из последних букв всех слов.
 */
public class LastSymbolInWord {
    private String str;

    public LastSymbolInWord(String str) {
        this.str = str;
    }

    String showLastSymbol(){
        StringBuilder sb = new StringBuilder();
        String [] arr = str.split(" ");
        for (String s: arr) {
            sb.append(s.charAt(s.length()-1));
        }
        return sb.toString();
    }
}
