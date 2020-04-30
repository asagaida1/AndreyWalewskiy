package lessons;

import org.hamcrest.core.StringContains;
import ua.asagayda.homework.task02_meet_people.Member;

public class PassParameters {

    public static void passInt(int a) {//copy of b
        a = 15;
    }

    public static void passObject(Member member) {
        member.setAge(60);
    }

    public static void passString(String string) {
        string = "John";
    }

    public static void main(String[] args) {
        int b = 45;

//        new Integer(5)
//        passInt(b);

//        System.out.println(b);

        Member member = new Member(null, "145", 23, "789", 0);

       /* passObject(member);

        System.out.println(member.getAge());*/

       String name = "Hello";

       passString(name);

        System.out.println(name);
    }
}
