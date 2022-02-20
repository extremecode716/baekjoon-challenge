package baekjoon.problem.p1260;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * DFS와 BFS
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/1260">https://www.acmicpc.net/problem/1260</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    private static void solution() {
        final String line = Algorithm.readLine();
        final String[] split = line.split("\\s+");

        Graph graph = new Graph(false, Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        int V = Integer.parseInt(split[2]);
        final List<String> inputs = Algorithm.readLines(Integer.parseInt(split[1]));

        for (String input : inputs) {
            String[] splitNE = input.split("\\s+");
            graph.connectVertex(Integer.parseInt(splitNE[0]), Integer.parseInt(splitNE[1]));
        }
        String dfs = dfs(graph, V);
        String bfs = bfs(graph, V);

        System.out.println(dfs);
        System.out.println(bfs);
    }

    private static class Graph {
        private final int graphSize;
        private final boolean isDirectedGraph;
        private final int[][] graph;
        private final int vertexCount, edgesCount;

        public Graph(boolean isDirectedGraph, int vertexCount, int edgesCount) {
            this.graphSize = vertexCount + 1;
            this.isDirectedGraph = isDirectedGraph;
            this.graph = new int[this.graphSize][this.graphSize];
            this.vertexCount = vertexCount;
            this.edgesCount = edgesCount;
        }

        public void connectVertex(int vertex1, int vertex2) {
            graph[vertex1][vertex2] = 1;
            if (isDirectedGraph)
                return;
            graph[vertex2][vertex1] = 1;
        }

    }

    private static String dfs(Graph graph, int startNode) {
        final StringJoiner output = new StringJoiner(" ");
        final boolean[] visited = new boolean[graph.graphSize];

        MyStack<Integer> stack = new MyStack<>();
        stack.push(startNode);
        while (!stack.isEmpty()) {
            int curr = stack.pop();
            if (visited[curr])
                continue;
            output.add(Integer.toString(curr));
            visited[curr] = true;
            for (int next = graph.vertexCount; next >= 1; --next) {
                if (!visited[next] && graph.graph[curr][next] != 0) {
                    stack.push(next);
                }
            }
        }
        return output.toString();
    }

    private static String bfs(Graph graph, int startNode) {
        final StringJoiner output = new StringJoiner(" ");
        final boolean[] visited = new boolean[graph.graphSize];

        Queue<Integer> queue = new LinkedList<>();
        visited[startNode] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            int curr = queue.remove();
            output.add(Integer.toString(curr));
            for (int next = 1; next <= graph.vertexCount; ++next) {
                if (!visited[next] && graph.graph[curr][next] != 0) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
        return output.toString();
    }
}

class MyStack<E> {
    private final LinkedList<E> deque;

    // default LinkedList
    public MyStack() {
        this.deque = new LinkedList<>();
    }

    public E push(E item) {
        this.deque.push(item);
        return item;
    }

    public E pop() {
        return this.deque.pop();
    }

    public E top() {
        return this.deque.peek();
    }

    public int size() {
        return this.deque.size();
    }

    public boolean isEmpty() {
        return this.deque.isEmpty();
    }

    public E getLast() {
        return this.deque.getLast();
    }

    public E removeLast() {
        return this.deque.removeLast();
    }

    public static <T extends Comparable<? super T>> void sort(MyStack<T> myStack) {
        myStack.deque.sort(null);
    }

    public static <T> void sort(MyStack<T> myStack, Comparator<? super T> comparator) {
        myStack.deque.sort(comparator);
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