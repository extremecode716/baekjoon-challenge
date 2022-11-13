package baekjoon.problem.p16943;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 숫자 재배치
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/16943">https://www.acmicpc.net/problem/16943</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

     static class Solve {
        private int answer, b;
        private int[] a;
        private boolean[] visited;
        private String input;
        private int size;

         public Solve(String input) {
             this.input = input;
             String[] splitStr = this.input.split(" ");
             this.size = splitStr[0].length();
             a = new int[input.length()];
             b = Integer.parseInt(splitStr[1]);
             answer = -1;
             visited = new boolean[size];
             for(int i = 0; i < size; ++i) {
                 a[i] = input.charAt(i) - '0';
             }
         }

         public void solve(int number, int count) {
            if(count == size) {
                answer = Math.max(answer, number);
                return;
            }
            for (int i = 0; i < size; ++i) {
                if(visited[i] || (a[i] == 0 && count == 0)) continue;
                int tempNumber = number * 10 + a[i];
                if(tempNumber > b) continue;

                visited[i] = true;
                solve(tempNumber, count + 1);
                visited[i] = false;
            }
         }
     }

    private static void solution() {
        final String input = Algorithm.readLine();
        final Solve solve = new Solve(input);
        solve.solve(0, 0);
        System.out.println(solve.answer);
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