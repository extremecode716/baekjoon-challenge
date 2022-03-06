package baekjoon.problem.p4386;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * 별자리 만들기 <p>
 * 메모리 최적화 이전 풀이<p>
 * 알고리즘 분류: 그래프 이론, 최소 스패닝 트리
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4386">https://www.acmicpc.net/problem/4386</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main1 {
    public static void main(String[] args) {
        Algorithm1.solve(Main1::solution);
    }

    static class Graph {
        private final Graph parentGraph;
        private final int index;
        private final int depth;
        private final double x;
        private final double y;
        private final double distanceFromParent;
        private List<Graph> childGraphs;

        public Graph(final Graph parentGraph, int index, int depth, double x, double y) {
            this.parentGraph = parentGraph;
            if (parentGraph != null) {
                this.parentGraph.addChildGraph(this);
            }
            this.index = index;
            this.depth = depth;
            this.x = x;
            this.y = y;
            this.distanceFromParent = getDistance(parentGraph, this);
            this.childGraphs = new ArrayList<>();
        }

        private static double getDistance(Graph g1, Graph g2) {
            if (g1 == null || g2 == null)
                return 0.0;

            double dX = g1.x - g2.x;
            double dY = g1.y - g2.y;

            return Math.sqrt((dX * dX) + (dY * dY));
        }

        public int getIndex() {
            return index;
        }

        public int getDepth() {
            return depth;
        }

        public double getX() {
            return x;
        }

        public double getY() {
            return y;
        }

        public Graph getParentGraph() {
            return parentGraph;
        }

        public double getDistanceFromParent() {
            return distanceFromParent;
        }

        public List<Graph> getChildGraphs() {
            return childGraphs;
        }

        public void addChildGraph(final Graph childGraphs) {
            this.childGraphs.add(childGraphs);
        }
    }

    private static double minDistance;

    private static void solution() {
        try (final BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            minDistance = Double.MAX_VALUE;
            final int n = Integer.parseInt(Algorithm1.readLine());
            final List<String> inputs = Algorithm1.readLines(n);

            for (int rootIndex = 0; rootIndex < n; ++rootIndex) {
                final StringTokenizer stringTokenizer = new StringTokenizer(inputs.get(rootIndex), " ");
                final double rootX = Double.parseDouble(stringTokenizer.nextToken());
                final double rootY = Double.parseDouble(stringTokenizer.nextToken());
                int depth = 0;
                final Graph rootGraph = new Graph(null, rootIndex, depth, rootX, rootY);
                final Set<Integer> indexesToVisit = new HashSet<>();
                for (int i = 0; i < n; ++i) {
                    indexesToVisit.add(i);
                }
                makeGraphTree(inputs, rootGraph, ++depth, indexesToVisit);
            }

            bw.write(String.format("%.2f", minDistance) + "\n");
            bw.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void makeGraphTree(final List<String> inputs, final Graph _parentGraph, int depth, final Set<Integer> indexesToVisit) {
        final Graph parentGraph = _parentGraph;

        indexesToVisit.remove(parentGraph.getIndex());
        if (indexesToVisit.size() == 0) {
            double sumDistance = parentGraph.distanceFromParent;
            Graph tmpParentGraph = parentGraph.parentGraph;
            while (tmpParentGraph != null) {
                sumDistance += tmpParentGraph.distanceFromParent;
                tmpParentGraph = tmpParentGraph.parentGraph;
            }
            minDistance = Math.min(minDistance, sumDistance);
            return;
        }

        for (Integer index : indexesToVisit) {
            final StringTokenizer stringTokenizer = new StringTokenizer(inputs.get(index), " ");
            final double x = Double.parseDouble(stringTokenizer.nextToken());
            final double y = Double.parseDouble(stringTokenizer.nextToken());
            final Graph childGraph = new Graph(parentGraph, index, depth, x, y);

            int tmpDepth = depth;
            final Set<Integer> copyIndexesToVisit = indexesToVisit.stream().collect(Collectors.toSet());
            makeGraphTree(inputs, childGraph, ++tmpDepth, copyIndexesToVisit);
        }
    }
}

/**
 * Algorithm 클래스는 백준 문제의 Main 클래스로 복사 - 붙여넣기하여 사용합니다.
 *
 * @author extreme code
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
class Algorithm1 {
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