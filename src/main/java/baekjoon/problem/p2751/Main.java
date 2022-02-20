package baekjoon.problem.p2751;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 수 정렬하기 2
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2751">https://www.acmicpc.net/problem/2751</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        List<String> inputs = Algorithm.readLines(Integer.parseInt(Algorithm.readLine()));

        boolean[] isInputNumbers = new boolean[2000001];

        for (String input : inputs) {
            isInputNumbers[Integer.parseInt(input) + 1000000] = true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < isInputNumbers.length; i++) {
            if (isInputNumbers[i]) {
                stringBuilder.append((i - 1000000)).append("\n");
            }
        }
        System.out.print(stringBuilder);
    }

    private static void solution1() {
        List<String> inputs = Algorithm.readLines(Integer.parseInt(Algorithm.readLine()));

        List<Integer> outputs = inputs.stream().map(Integer::parseInt).collect(Collectors.toList());
        Collections.sort(outputs);
        outputs.stream().forEach(System.out::println);
    }

    private static void solution2() {
        List<String> inputs = Algorithm.readLines(Integer.parseInt(Algorithm.readLine()));

        new TreeSet<>(inputs.stream().map(Integer::parseInt).collect(Collectors.toList())).stream().forEach(System.out::println);
    }

    private static void solution3() {
        List<String> inputs = Algorithm.readLines(Integer.parseInt(Algorithm.readLine()));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (String input : inputs) {
            priorityQueue.add(Integer.parseInt(input));
        }

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
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