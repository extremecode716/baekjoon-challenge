package programmers.problem.p2;

import java.util.Scanner;

//<div class="p-3"><h6 class="mb-3 _2c1lVVXCA5xmsDOxsZ0_k9">
//        문제 설명
//</h6> <div class="challenge-markdown"><div class="markdown solarized-dark"><p>이 문제에는 표준 입력으로 정수 n이 주어집니다.<br>
//별(*) 문자를 이용해 높이가 n인 삼각형을 출력해보세요.</p>
//
//<h5>제한 조건</h5>
//
//<ul>
//<li>n은 100 이하인 자연수입니다.</li>
//</ul>
//
//<h5>예시</h5>
//
//<p>입력</p>
//<div class="highlight"><pre class="codehilite"><code>3
//</code></pre></div>
//<p>출력</p>
//<div class="highlight"><pre class="codehilite"><code>*
//        **
//        ***
//</code></pre></div></div></div></div>
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < a; ++i) {
            for(int j = 0; j < i + 1; ++j) {
                stringBuilder.append('*');
            }
            stringBuilder.append('\n');
        }

        System.out.print(stringBuilder);
    }
}