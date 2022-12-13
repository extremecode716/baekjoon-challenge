package baekjoon.problem.p2980;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 도로와 신호등
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2980">https://www.acmicpc.net/problem/2980</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        StringTokenizer stringTokenizer = new StringTokenizer(Algorithm.readLine());
        final int N = Integer.parseInt(stringTokenizer.nextToken());  // 신호등의 개수
        final int L = Integer.parseInt(stringTokenizer.nextToken());  // 도로의 길이

        int totalTime = 0;
        int currentPosition = 0;

        for(int i = 0; i < N; ++i) {
            stringTokenizer = new StringTokenizer(Algorithm.readLine());
            final int D = Integer.parseInt(stringTokenizer.nextToken()); // 신호등의 위치
            final int R = Integer.parseInt(stringTokenizer.nextToken()); // 빨간색이 지속되는 시간
            final int G = Integer.parseInt(stringTokenizer.nextToken()); // 초록생이 지속되는 시간
            totalTime += D - currentPosition;
            currentPosition = D;
            final int cycleTime = totalTime % (R + G);
            final boolean isRed = cycleTime < R;
            if(isRed)
                totalTime += R - cycleTime;
        }
        totalTime += L - currentPosition;

        System.out.println(totalTime);
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