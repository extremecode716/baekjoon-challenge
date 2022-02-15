package baekjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 알고리즘 풀이 구조 클래스<p>
 * 백준에 제출하기 위해 해당 클래스 Main 클래스로 가져가서 사용합니다.
 *
 * @author extreme code
 */
class Algorithm {
    @FunctionalInterface
    public interface Solution {
        void solve();
    }

    private static BufferedReader buffer;

    public static int getLineCount() {
        buffer = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = 1;
        try {
            lineCount = Integer.parseInt(buffer.readLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lineCount;
    }

    public static List<String> getInputs(final int lineCount) {
        List<String> lines = new ArrayList<>();
        try {
            int count = 0;
            String line;
            while ((line = buffer.readLine()) != null) {
                lines.add(line);
                ++count;
                if (count == lineCount)
                    break;
            }
            buffer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lines;
    }

    public static void solve(Solution solution) {
        solution.solve();
    }
}
