package baekjoon.problem.p2755;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 이번학기 평점은 몇점?
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2755">https://www.acmicpc.net/problem/2755</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int subjectCount = Integer.parseInt(Algorithm.readLine());
        final List<String> inputs = Algorithm.readLines(subjectCount);

        int sumCredit = 0;
        double result = 0;
        for (String input : inputs) {
            StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
            stringTokenizer.nextToken();
            final int credit = Integer.parseInt(stringTokenizer.nextToken());
            sumCredit += credit;
            final double score = calScore(stringTokenizer.nextToken());

            result += credit * score;
        }

        final double avg = Math.round(result / sumCredit * 100) / 100.0;
        final DecimalFormat decimalFormat = new DecimalFormat("0.00");
        System.out.println(decimalFormat.format(avg));
    }

    private static double calScore(String grade) {
        switch (grade) {
            case "A+":
                return 4.3;
            case "A0":
                return 4.0;
            case "A-":
                return 3.7;
            case "B+":
                return 3.3;
            case "B0":
                return 3.0;
            case "B-":
                return 2.7;
            case "C+":
                return 2.3;
            case "C0":
                return 2.0;
            case "C-":
                return 1.7;
            case "D+":
                return 1.3;
            case "D0":
                return 1.0;
            case "D-":
                return 0.7;
            case "F":
                return 0.0;
        }
        return 0.0;
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