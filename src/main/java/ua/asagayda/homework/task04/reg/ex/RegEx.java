package ua.asagayda.homework.task04.reg.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static void main(String[] args) {

// Любое количество букв, а потом две цифры
        String text1 = "aaa12";
        String pattern1 = ("^([A-Za-zА-Яа-я]*)([\\d]{2}$)");
        System.out.println(Pattern.matches(pattern1, text1));

// Две цифры а потом любое количество букв
        String text2 = "12abc";
        String pattern2 = ("^(\\d){2}([A-Za-zА-Яа-я])*$");
        System.out.println(Pattern.matches(pattern2, text2));

// 2-4 цифры, а потом 2-4 буквы.
        String text3 = "1234abcd";
        String pattern3 = ("^(\\d){2,4}([A-Za-zА-Яа-я]){2,4}$");
        System.out.println(Pattern.matches(pattern3, text3));

// 2-4 буквы, а потом 2-4 цифры.
        String text4 = "abcd1234";
        String pattern4 = ("^([A-Za-zА-Яа-я]){2,4}(\\d){2,4}$");
        System.out.println(Pattern.matches(pattern4, text4));

// Пользователь вводит имя и фамилию. Буквы могут быть в разных регистрах.
// Проверить, чтобы первые буквы были в верхнем регистре, а остальные буквы - в нижнем.
        String text5 = "Александр Sagaida";
        String pattern5 = ("^([A-ZА-Я])([a-zа-я]+)\\s([A-ZА-Я])([a-zа-я])+$");
        System.out.println(Pattern.matches(pattern5, text5));

// В строке содержутся слова и числа. Необходмо выделить числа и посчитать их сумму.
        String text6 = "1word2word30";
        String pattern6 = "\\d+";
        Pattern pattern = Pattern.compile(pattern6);
        Matcher matcher = pattern.matcher(text6);
        int sum = 0;

        while (matcher.find()) {
            /*System.out.println(matcher.group());*/
            int i = Integer.parseInt(matcher.group());
            sum=sum+i;
        }
        System.out.println("sum = " + sum);

//  Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
//  (ххх) должен быть таким: (095), (097), (073), (067), (099), (063).
//  Проверить, чтобы 7 - ый номер был в формате "(ххх)ххх-хх-хх".
//  Если пользователь вводит номер начинающийся на(095) или (099) ххх-хх-хх, выводить в
//  консоль "Пользователь имеет МТС номер",
//  на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
//  на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер".
        String text71 = "(093)402-66-48";
        String text72 = "(095)402-66-48";
        String text73 = "(097)402-66-48";
        String text74 = "(073)402-66-48";
        String text75 = "(067)402-66-48";
        String text76 = "(099)402-66-48";
        String text77 = "(063)402-66-48";

        System.out.println("=====================================pattern7");
        String pattern7 = ("^(\\()(093)" +
                "(\\))(\\d){3}(-)(\\d){2}(-)(\\d){2}");
        System.out.println(Pattern.matches(pattern7, text71));
        System.out.println(Pattern.matches(pattern7, text72));
        System.out.println(Pattern.matches(pattern7, text73));
        System.out.println(Pattern.matches(pattern7, text74));
        System.out.println(Pattern.matches(pattern7, text75));
        System.out.println(Pattern.matches(pattern7, text76));
        System.out.println(Pattern.matches(pattern7, text77));
        System.out.println("=====================================Life MTS KievStar");
        String Life1 = ("^(\\()(093|073|063){3}(\\))");

        String Life = ("^(\\()(093||073||063){3}(\\))" +
                "(\\d){3}(-)(\\d){2}(-){1}(\\d){2}");
        String MTS = ("^(\\()((095)||(099)){3}(\\))" +
                "(\\d){3}(-)(\\d){2}(-){1}(\\d){2}");
        String KievStar = ("^(\\(){1}((097)||(067)){3}(\\))" +
                "(\\d){3}(-)(\\d){2}(-)(\\d){2}");

        System.out.println(Pattern.matches(Life, text71));
        System.out.println(Pattern.matches(MTS, text72));
        System.out.println(Pattern.matches(KievStar, text73));
        System.out.println(Pattern.matches(Life, text74));
        System.out.println(Pattern.matches(KievStar, text75));
        System.out.println(Pattern.matches(MTS, text76));
        System.out.println(Pattern.matches(Life, text77));
        System.out.println("===================================== list");

        List<String> list = new ArrayList<>();
        list.add(text71);
        list.add(text72);
        list.add(text73);
        list.add(text74);
        list.add(text75);
        list.add(text76);
        list.add(text77);


        Pattern patternLife = Pattern.compile(Life1);
        Pattern patternMTS = Pattern.compile(MTS);
        Pattern patternKievStar = Pattern.compile(KievStar);

        for (String s:list) {
            if(Pattern.matches(Life, s)){
                System.out.println("Пользователь имеет Лайф номер    : " + s);
            }
            else if (Pattern.matches(MTS, s)){
                System.out.println("Пользователь имеет МТС номер     : " + s);
            }
            else if (Pattern.matches(KievStar, s)){
                System.out.println("Пользователь имеет KievStar номер: " + s);
            }
            else {
                System.out.println("Совпадение не найдено :(");
            }
        }
    }
}
