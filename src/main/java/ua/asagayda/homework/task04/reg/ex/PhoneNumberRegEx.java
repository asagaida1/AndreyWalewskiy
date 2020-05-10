package ua.asagayda.homework.task04.reg.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Пользователь вводит телефон в формате (ххх)ххх-хх-хх.
(ххх) должен быть таким: (095), (097), (073), (067), (099), (063).
Проверить, чтобы 7 - ый номер был в формате "(ххх)ххх-хх-хх".
Если пользователь вводит номер начинающийся на(095) или (099) ххх-хх-хх, выводить в
консоль "Пользователь имеет МТС номер",
на(097) или (067) ххх-хх-хх, выводить в консоль "Пользователь имеет Киевстар номер",
на(073) или (063) ххх-хх-хх, выводить в консоль "Пользователь имеет Лайф номер".
 */
public class PhoneNumberRegEx {

    String validatePhoneNumber(String phoneNumber) {
        if (phoneNumber == null) {
            throw new IllegalArgumentException("incoming Phone number must not be null" +
                    "In ua.asagayda.homework.task04.reg.ex.PhoneNumberRegEx.validatePhoneNumber");
        }

        String patternValidate = ("^(\\()(\\d){3}(\\))(\\d){3}(-)(\\d){2}(-)(\\d){2}$");

        if (Pattern.matches(patternValidate, phoneNumber)) {
            return phoneNumber;
        }
        else{
            throw new IllegalArgumentException("Phone number should be in the format: " +
                    "(ххх)ххх-хх-хх you entered: " +  phoneNumber);
        }
    }

    String identifyOperator(String phoneNumber){
        if (phoneNumber == null) {
            throw new IllegalArgumentException("incoming Phone number must not be null" +
                    "In ua.asagayda.homework.task04.reg.ex.PhoneNumberRegEx.validateOperator");
        }

        String text = phoneNumber;
        StringBuilder sb = new StringBuilder();
        String life = "(093)|(073)|(063)";
        String MTS = "(095)|(099)";
        String Kievstar="(097)|(067)";
        Pattern patternLife = Pattern.compile(life);
        Pattern patternMTS = Pattern.compile(MTS);
        Pattern patternKievStar = Pattern.compile(Kievstar);
        Matcher matcherLife = patternLife.matcher(text);
        Matcher matcherMTS = patternMTS.matcher(text);
        Matcher matcherKievStar = patternKievStar.matcher(text);

        //(\\d){3}

        switch ("095") {
            case "095":
            case "066":
                System.out.println("MTS");
                break;
        }

        if(matcherLife.find()){
            return sb.append("Пользователь имеет Лайф номер, код оператора: ").append(matcherLife.group()).toString();
        }
        else if(matcherMTS.find()){
            return sb.append("Пользователь имеет MTS номер, код оператора: ").append(matcherMTS.group()).toString();
        }
        else if(matcherKievStar.find()){
            return sb.append("Пользователь имеет Kievstar номер, код оператора: ").append(matcherKievStar.group()).toString();
        }
        else {
            return sb.append("Оператор не определенн, номер телефона: ").append(text).toString();
        }
    }
}
