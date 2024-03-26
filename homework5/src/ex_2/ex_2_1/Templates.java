/*2.1 В строке "Мой номер телефона +375-29-1234567. Мой ник в Телеграм @TheGodFather."
 при помощи регулярных выражений найти номер телефона без кода (1234567),
 и ник в телеграм без значка “@” (TheGodFather)
 /(?<=)(?:\d{7})/g-телефон
*/

package ex_2.ex_2_1;

public class Templates {
    public static void main(String[] args) {
        String string = "Мой номер телефона +375-29- 1234567. Мой ник в Телеграм @TheGodFathe" +
                "Мой номер телефона +375-29-8765963. Мой ник в Телеграм @TheFather" +
                "Мой номер телефона +375-29-5693262. Мой ник в Телеграм @Theathe" +
                "Мой номер телефона +375-29-5043909. Мой ник в Телеграм @GodFather";
        String regExString = "(?<=)(?:\\d{7})|(?<=@)([a-zA-Z]*)";
        Regex regex = new Regex(regExString, string);
        regex.printable();
    }
}
