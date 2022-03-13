package baekjoon.problem.p2150;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Strongly Connected Component<p>
 * SCC
 *
 * @author extreme code
 * @see <a href="https://www.acmicpc.net/problem/2150">https://www.acmicpc.net/problem/2150</a>
 * @see <a href="https://github.com/extremecode716/baekjoon-challenge">https://github.com/extremecode716/baekjoon-challenge</a>
 */
public class Main {
    public static void main(String[] args) {
        Algorithm.solve(Main::solution);
    }

    static class SCC {
        private final List<List<Integer>> connectList;
        private final List<List<Integer>> connectReverseList;
        private final List<List<Integer>> sccList;
        private final MyStack<Integer> stack;
        private final boolean[] visit;

        public SCC(List<List<Integer>> connectList, List<List<Integer>> connectReverseList, List<List<Integer>> sccList, MyStack<Integer> stack, boolean[] visit) {
            this.connectList = connectList;
            this.connectReverseList = connectReverseList;
            this.sccList = sccList;
            this.stack = stack;
            this.visit = visit;
        }

        public void clearVisit() {
            Arrays.fill(visit, false);
        }
    }

    private static void solution() {
        StringTokenizer stringTokenizer = new StringTokenizer(Algorithm.readLine(), " ");
        final int V = Integer.parseInt(stringTokenizer.nextToken());
        final int E = Integer.parseInt(stringTokenizer.nextToken());
        final List<List<Integer>> connectList = new ArrayList<>();
        final List<List<Integer>> connectReverseList = new ArrayList<>();
        final List<List<Integer>> sccList = new ArrayList<>();
        for (int i = 0; i <= E; ++i) {
            connectList.add(new ArrayList<>());
            connectReverseList.add(new ArrayList<>());
            sccList.add((new ArrayList<>()));
        }

        for (int i = 0; i < E; ++i) {
            stringTokenizer = new StringTokenizer(Algorithm.readLine(), " ");
            final int v1 = Integer.parseInt(stringTokenizer.nextToken());
            final int v2 = Integer.parseInt(stringTokenizer.nextToken());
            connectList.get(v1).add(v2);
            connectReverseList.get(v2).add(v1);

        }

        final SCC scc = new SCC(connectList, connectReverseList, sccList, new MyStack<>(), new boolean[V + 1]);
        for (int i = 1; i <= V; ++i) {
            if (!scc.visit[i])
                dfsFirst(scc, i);
        }
        scc.clearVisit();

        int sccCount = 0;
        while (!scc.stack.isEmpty()) {
            final int i = scc.stack.pop();
            if (!scc.visit[i]) {
                dfsSecond(scc, sccCount, i);
                ++sccCount;
            }
        }

        final StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(sccCount).append('\n');
        final Map<Integer, Integer> sccIndexMap = new TreeMap<>();
        for (int i = 0; i < sccCount; ++i) {
            Collections.sort(scc.sccList.get(i));
            sccIndexMap.put(scc.sccList.get(i).get(0), i); // 키는 맨 앞의 값, value 는 인덱스
        }

        sccIndexMap.forEach((key, value) -> {
            for (Integer item : scc.sccList.get(value)) {
                stringBuilder.append(item).append(' ');
            }
            stringBuilder.append(-1).append('\n');
        });

        System.out.print(stringBuilder);
    }

    private static void dfsSecond(final SCC scc, final int sccCount, final int item) {
        scc.visit[item] = true;
        scc.sccList.get(sccCount).add(item);
        for (final int next : scc.connectReverseList.get(item)) {
            if (!scc.visit[next])
                dfsSecond(scc, sccCount, next);
        }
    }

    private static void dfsFirst(final SCC scc, final int item) {
        scc.visit[item] = true;
        for (int next : scc.connectList.get(item)) {
            if (!scc.visit[next])
                dfsFirst(scc, next);
        }
        scc.stack.push(item);
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