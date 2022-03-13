package baekjoon.problem.p4153;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 직각삼각형<p>
 * 피타고라스의 정리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4153">https://www.acmicpc.net/problem/4153</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final String endString = "0 0 0";

        final StringBuilder stringBuilder = new StringBuilder();
        boolean isEnd = false;
        while (!isEnd) {
            final String line = Algorithm.readLine();
            isEnd = line.equals(endString);
            if (isEnd)
                break;
            final StringTokenizer stringTokenizer = new StringTokenizer(line, " ");
            final List<Integer> lengths = new ArrayList<>();
            int max = Integer.MIN_VALUE;
            int maxIndex = 0;
            for (int i = 0; i < 3; ++i) {
                int length = Integer.parseInt(stringTokenizer.nextToken());
                lengths.add(length);
                if (length > max) {
                    max = length;
                    maxIndex = i;
                }
            }

            boolean isRectangle = false;
            int pythagoras = 0;
            for (int i = 0; i < lengths.size(); ++i) {
                if (i == maxIndex) {
                    pythagoras -= lengths.get(i) * lengths.get(i);
                    continue;
                }
                pythagoras += lengths.get(i) * lengths.get(i);
            }
            isRectangle = pythagoras == 0;
            if (isRectangle) {
                stringBuilder.append("right");
            } else {
                stringBuilder.append("wrong");
            }
            stringBuilder.append("\n");
        }
        System.out.print(stringBuilder);
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