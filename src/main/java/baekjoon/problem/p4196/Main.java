package baekjoon.problem.p4196;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 도미노<p>
 * SCC - 코라사주 알고리즘
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/4196">https://www.acmicpc.net/problem/4196</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    static class Domino {
        private final List<List<Integer>> dominoList;
        private final MyStack<Integer> stack;
        private final boolean[] visit;

        public Domino(List<List<Integer>> dominoList, MyStack<Integer> stack, boolean[] visit) {
            this.dominoList = dominoList;
            this.stack = stack;
            this.visit = visit;
        }

        public void clearVisit() {
            Arrays.fill(visit, false);
        }
    }

    private static void solution() {
        int testCase = Integer.parseInt(Algorithm.readLine());
        for (int t = 1; t <= testCase; ++t) {
            StringTokenizer stringTokenizer = new StringTokenizer(Algorithm.readLine(), " ");
            final int N = Integer.parseInt(stringTokenizer.nextToken());
            final int M = Integer.parseInt(stringTokenizer.nextToken());
            final List<List<Integer>> dominoList = new ArrayList<>();
            for (int i = 0; i <= N; ++i)
                dominoList.add(new ArrayList<>());

            for (int i = 0; i < M; ++i) {
                stringTokenizer = new StringTokenizer(Algorithm.readLine(), " ");
                final int v1 = Integer.parseInt(stringTokenizer.nextToken());
                final int v2 = Integer.parseInt(stringTokenizer.nextToken());
                dominoList.get(v1).add(v2);
            }

            final Domino domino = new Domino(dominoList, new MyStack<>(), new boolean[N + 1]);
            for (int i = 1; i <= N; ++i) {
                if (!domino.visit[i])
                    dfsFirst(domino, i);
            }
            domino.clearVisit();

            int count = 0;
            while (!domino.stack.isEmpty()) {
                final int i = domino.stack.pop();
                if (!domino.visit[i]) {
                    dfsSecond(domino, i);
                    ++count;
                }
            }
            System.out.println(count);
        }
    }

    private static void dfsSecond(final Domino domino, final int item) {
        domino.visit[item] = true;
        for (final int next : domino.dominoList.get(item)) {
            if (!domino.visit[next])
                dfsSecond(domino, next);
        }
    }

    private static void dfsFirst(final Domino domino, final int item) {
        domino.visit[item] = true;
        for (int next : domino.dominoList.get(item)) {
            if (!domino.visit[next])
                dfsFirst(domino, next);
        }
        domino.stack.push(item);
    }

    private static class MyStack<E> {
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