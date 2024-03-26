/*2.2. Реализовать поиск слов и определённого текста в книге "Война и мир" (Война и мир.txt)
 при помощи обычного поиска по строке и при помощи регулярных выражений.
Реализацию поиска сделать при помощи классов и интерфейсов.
Вывести информацию как часто встречаются строки "война", "и" (как союз), "мир".
Дать возможность через аргументы программы выбрать какое слово будем искать в тексте.
* [Вв](?i)(\\W{3})а
* */

package ex_2.ex_2_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProgramSearch {
    public static void main(String[] args) throws IOException {
        String path;
        path = Files.readString(Paths.get("WarEndWorld.txt"));
        String text = path;
        SearchText searchSimple = new SearchSimple(text);
        SearchRegEx regexSearch = new SearchRegEx(text);

//        String wordStr = args[0];
        String wordStr = "Война";
        int simpleCount = searchSimple.wordSearch(wordStr);
        int regexCount = regexSearch.wordSearch(wordStr);

        System.out.println("Результаты поиска для слова '" + wordStr + "':");
        System.out.println("Простой поиск: " + simpleCount + " вхождений");
        System.out.println("Поиск с использованием регулярных выражений: " + regexCount + " вхождений");
    }
}
