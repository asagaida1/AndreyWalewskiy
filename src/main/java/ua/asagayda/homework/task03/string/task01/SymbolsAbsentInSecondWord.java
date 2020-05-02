package ua.asagayda.homework.task03.string.task01;

/*

   Declare two local variables myStr1 and myStr2 of String type and assign a value “Cartoon” for first string and ”Tomcat”
   for second.
   Write code to display all of the letters, which are present in the first word, but absent in the second.

 */
public class SymbolsAbsentInSecondWord {
   private String firstWord;
   private String secondWord;


    public SymbolsAbsentInSecondWord(String firstWord, String secondWord) {
        this.firstWord = firstWord;
        this.secondWord = secondWord;
    }

    String showSymbols() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < firstWord.length(); i++) {
            if (secondWord.indexOf(firstWord.charAt(i)) < 0) {
                sb.append(firstWord.charAt(i));
            }
        }
        return sb.toString();
    }
}
