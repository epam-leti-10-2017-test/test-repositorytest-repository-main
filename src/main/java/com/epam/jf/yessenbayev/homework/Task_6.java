package main.java.com.epam.jf.yessenbayev.homework;

import java.util.Arrays;
import java.util.Comparator;

/**
 * На вход программе подается несколько строк (через параметры командной строки args).
 * Требуется упорядочить и вывести строки в порядке возрастания значений их длины.
 * В случае, если длины строк совпадают - упорядочить их в лексикографическом порядке.
 */
public class Task_6 {

    /**
     * @param args анализируемые строки.
     */
    public static void main(String[] args) {
        if (args.length > 0) {
            Arrays.sort(args);
            Arrays.sort(args, Comparator.comparingInt(String::length));
            System.out.println(Arrays.toString(args));
        } else {
            System.out.println("Error");
        }
    }
}
