package baekjoon.problem.p10815;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 숫자 카드
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/10815">https://www.acmicpc.net/problem/10815</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final List<String> inputs = Algorithm.readLines(4);
        final String[] haveNumberCards = inputs.get(1).split(" ");
        final int M = Integer.parseInt(inputs.get(2));
        final String[] numberCards = inputs.get(3).split(" ");

        final Set<String> haveNumberCardsSet = Set.of(haveNumberCards);
        final StringJoiner stringJoiner = new StringJoiner(" ");
        for (int i = 0; i < M; ++i) {
            if (haveNumberCardsSet.contains(numberCards[i])) {
                stringJoiner.add("1");
            } else {
                stringJoiner.add("0");
            }
        }

        System.out.println(stringJoiner);
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