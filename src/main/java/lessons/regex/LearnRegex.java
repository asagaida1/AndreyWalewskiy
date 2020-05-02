package lessons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LearnRegex {
    public static void main(String[] args) {
        /*String text = "Hello";
        String pattern = "H.llo";// .(dot) - any symbol*/

        /*String text = "Hello";
        String pattern = "H[e,w]llo";// [e,w]  or e or w symbols
        */
        /*String text = "Hallo";
        String pattern = "H[a-wA-W]llo";// [a-wA-W]  from a to w symbols and from A to W*/

      /*  String text = "H5llo";
//        String pattern = "H[0-9]llo";// [0-9] any digit
        String pattern = "H\\dllo";// \\d any digit*/

        /*String text = "HEllo";
        String pattern = "H\\Dllo";// \\D any symbol
        */
        /*String text = "H#llo";
        String pattern = "H\\Wllo";// \\W non-word character*/

        /*String text = "Hfllo";
        String pattern = "H[a-z&&[^rt]]llo";// negative*/


//        Quantifiers

        /*String text = "Hllo";
        String pattern = "He*llo";// * - from 0 to infinity*/

//        String text = "Hello";
//        String pattern = "He+llo";// + - from 1 to infinity

//        String text = "Heello";
//        String pattern = "He{3}llo";// {n} - only n times

//        String text = "Heeello";
//        String pattern = "He{1,3}llo";// {n,m} - from n to m times

       /* String text = "Hllo";
        String pattern = "He?llo";// ? - from 0 to 1 times*/

        String text = "HyysunrunTryy";
        String pattern = ".*(sun|run){1,2}.*";// ? - from 0 to 1 times

        System.out.println(Pattern.matches(pattern, text));
    }
}

class UseRegex {
    public static void main(String[] args) {
        String text = "aWsde   BAE";
        String pattern = "([a-zA-Z&&[^b13]]){1,5}\\s{3}([A-Z&&[^AW]]){1,3}";

        System.out.println(Pattern.matches(pattern, text));
    }
}

class UseMatcherClass {
    public static void main(String[] args) {
        String text = "1word2word3";
        String pattern = "word";

        Pattern pattern1 = Pattern.compile(pattern);

        Matcher matcher = pattern1.matcher(text);

        int count = 0;

        while (matcher.find()) {
            System.out.println(matcher.group());
            count++;
        }

        System.out.println(count);

    }
}
