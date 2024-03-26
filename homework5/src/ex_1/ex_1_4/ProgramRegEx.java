/*1.4. Получить из строки "012312" переменную типа Long
 несколькими способами (изучите структуру класса Long)
 */

package ex_1.ex_1_4;

import static java.lang.Long.*;

public class ProgramRegEx {
    public static void main(String[] args) {
        String string = "012312";
        Long longer = new Long(string);
        long longer1 = decode(string);
        long longer2 = parseLong(string);
        System.out.println("Преобразование String в long \n"
                + "При помощи создания класса new Long(устаревший метод) " + "- '" + longer + "'\n"
                + "При помощи decode() " + "- '" +  longer1 + "'\n"
                + "При помощи parseLong() " + "- '" +  longer2 + "'");
    }

}
