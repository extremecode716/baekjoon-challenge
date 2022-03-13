package baekjoon.problem.p1316;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 그룹 단어 체커<p>
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1316">https://www.acmicpc.net/problem/1316</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int t = Integer.parseInt(Algorithm.readLine());
        int count = 0;
        for (int i = 0; i < t; ++i) {
            if (isGroupString(Algorithm.readLine())) {
                ++count;
            }
        }

        System.out.println(count);
    }

    private static boolean isGroupString(String str) {
        final boolean[] checkAlphabet = new boolean['z' - 'a' + 1];

        char prevAlphabet = 0;
        for (int i = 0; i < str.length(); ++i) {
            char curAlphabet = str.charAt(i);

            if (prevAlphabet != curAlphabet) {
                if (checkAlphabet[curAlphabet - 'a']) { // 기존에 나온 알파벳이면 그룹이 아니다.
                    return false;
                } else {
                    checkAlphabet[curAlphabet - 'a'] = true;
                    prevAlphabet = curAlphabet;
                }
            }
        }
        return true;
    }
}

/**
 * Algorithm 클래스는 백준 문제의 Main 클래스로 복사 - 붙여넣기하여 사용합니다.
 *
 * @author extreme code
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
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