package baekjoon.problem.p7568;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 덩치
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/7568">https://www.acmicpc.net/problem/7568</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final int N = Integer.parseInt(Algorithm.readLine());
        final List<String> inputs = Algorithm.readLines(N);
        final List<BodyInfo> bodyInfos = new ArrayList<>();
        final int[] ranks = new int[N];

        int index = 0;
        for (String input : inputs) {
            StringTokenizer stringTokenizer = new StringTokenizer(input, " ");
            int weight = Integer.parseInt(stringTokenizer.nextToken());
            int height = Integer.parseInt(stringTokenizer.nextToken());
            ranks[index] = 1;
            bodyInfos.add(new BodyInfo(weight, height, index++));
        }

        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (bodyInfos.get(i).getWeight() > bodyInfos.get(j).getWeight() && bodyInfos.get(i).getHeight() > bodyInfos.get(j).getHeight()) {
                    ranks[j]++;
                    bodyInfos.get(j).setRank(ranks[j]);
                }
                else if (bodyInfos.get(i).getWeight() < bodyInfos.get(j).getWeight() && bodyInfos.get(i).getHeight() < bodyInfos.get(j).getHeight()) {
                    ranks[i]++;
                    bodyInfos.get(i).setRank(ranks[i]);
                }
                else
                    continue;
            }
        }

        for (int i = 0; i < ranks.length; ++i) {
            stringBuilder.append(ranks[i]);
            if (i != ranks.length - 1) {
                stringBuilder.append(" ");
            }
        }
        System.out.println(stringBuilder);
    }
}

class BodyInfo {
    private final int weight;
    private final int height;
    private final int index;
    private int rank;

    public BodyInfo(int weight, int height, int index) {
        this.weight = weight;
        this.height = height;
        this.index = index;
        this.rank = 1;
    }

    public int getIndex() {
        return index;
    }

    public int getRank() {
        return rank;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyInfo bodyInfo = (BodyInfo) o;
        return weight == bodyInfo.weight && height == bodyInfo.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight, height);
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