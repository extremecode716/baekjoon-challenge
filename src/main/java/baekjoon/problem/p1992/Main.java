package baekjoon.problem.p1992;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 쿼드트리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1992">https://www.acmicpc.net/problem/1992</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static int array2D[][];
    public static StringBuilder stringBuilder;

    private static void solution() {
        final int N = Integer.parseInt(Algorithm.readLine());
        array2D = new int[N][N];
        stringBuilder = new StringBuilder();
        // 초기 셋팅
        for (int y = 0; y < N; ++y) {
            String[] split = Algorithm.readLine().split("");
            for (int x = 0; x < N; ++x) {
                array2D[y][x] = Integer.parseInt(split[x]);
            }
        }
        // 분할정복
        quadTree(0, 0, N);
        System.out.println(stringBuilder.toString());
    }

    public static boolean isCompressible(int row, int col, int size) {
        int value = array2D[row][col];

        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (value != array2D[i][j])
                    return false;
            }
        }
        return true;
    }

    public static void quadTree(int row, int col, int size) {
        if (isCompressible(row, col, size)) {
            stringBuilder.append(array2D[row][col]);
        } else {
            stringBuilder.append("(");
            int newSize = size / 2;
            quadTree(row, col, newSize);
            quadTree(row, col + newSize, newSize);
            quadTree(row + newSize, col, newSize);
            quadTree(row + newSize, col + newSize, newSize);
            stringBuilder.append(")");
        }
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