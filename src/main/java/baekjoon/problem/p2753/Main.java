package baekjoon.problem.p2753;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * 윤년
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2753">https://www.acmicpc.net/problem/2753</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final String input = Algorithm.readLine();
        final int year = Integer.parseInt(input);

        System.out.println(isLeapYear(year) ? "1" : "0");
    }

    private static boolean isLeapYear(int year) {
        if ((year & 3) != 0) {
            return false;
        }
        return (year % 100 != 0) || (year % 400 == 0);
    }

    private static boolean isLeapYear1(int year) {
        if (year % 400 == 0)
            return true;
        if (year % 100 == 0)
            return false;
        if (year % 4 == 0)
            return true;
        return false;
    }

    private static boolean isLeapYear2(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            return true;
        return false;
    }

    private static boolean isLeapYear4(int year) {
        final GregorianCalendar gcalendar = new GregorianCalendar();
        return gcalendar.isLeapYear(year);
    }
}

/**
 * 백준에 제출하기 위해 문제의 Main 클래스로 복사 이동하여 사용됩니다.
 *
 * @author extreme code
 */
class Algorithm {
    @FunctionalInterface
    public interface Solution {
        void solve();
    }

    private static BufferedReader bufferedReader;

    public static String readLine() {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return line;
    }

    public static List<String> readLines(final int readCount) {
        bufferedReader = bufferedReader == null ? new BufferedReader(new InputStreamReader(System.in)) : bufferedReader;
        List<String> lines = new ArrayList<>();
        try {
            int count = 0;
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
                ++count;
                if (count == readCount)
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void close() {
        if (null == bufferedReader)
            return;
        try {
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            bufferedReader = null;
        }
    }

    public static void solve(Solution solution) {
        solution.solve();
        close();
    }
}