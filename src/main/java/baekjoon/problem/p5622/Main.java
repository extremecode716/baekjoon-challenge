package baekjoon.problem.p5622;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 다이얼
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/5622">https://www.acmicpc.net/problem/5622</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final String input = Algorithm.readLine();
        final Map<Character, Integer> dialPhoneMap = initDialPhoneMap();

        int time = 0;
        for (int i = 0; i < input.length(); ++i) {
            time += dialPhoneMap.get(input.charAt(i)) + 1;
        }
        System.out.println(time);
    }

    private static Map<Character, Integer> initDialPhoneMap() {
        final Map<Character, Integer> dialPhoneMap = new HashMap<>();
        dialPhoneMap.put('A', 2);
        dialPhoneMap.put('B', 2);
        dialPhoneMap.put('C', 2);

        dialPhoneMap.put('D', 3);
        dialPhoneMap.put('E', 3);
        dialPhoneMap.put('F', 3);

        dialPhoneMap.put('G', 4);
        dialPhoneMap.put('H', 4);
        dialPhoneMap.put('I', 4);

        dialPhoneMap.put('J', 5);
        dialPhoneMap.put('K', 5);
        dialPhoneMap.put('L', 5);

        dialPhoneMap.put('M', 6);
        dialPhoneMap.put('N', 6);
        dialPhoneMap.put('O', 6);

        dialPhoneMap.put('P', 7);
        dialPhoneMap.put('Q', 7);
        dialPhoneMap.put('R', 7);
        dialPhoneMap.put('S', 7);

        dialPhoneMap.put('T', 8);
        dialPhoneMap.put('U', 8);
        dialPhoneMap.put('V', 8);

        dialPhoneMap.put('W', 9);
        dialPhoneMap.put('X', 9);
        dialPhoneMap.put('Y', 9);
        dialPhoneMap.put('Z', 9);

        return dialPhoneMap;
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