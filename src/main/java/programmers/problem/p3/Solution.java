package programmers.problem.p3;

//<div class="p-3"><h6 class="mb-3 _2c1lVVXCA5xmsDOxsZ0_k9">
//        문제 설명
//</h6> <div class="challenge-markdown"><div class="markdown solarized-dark"><p>정수 n이 주어질때, 1부터 n까지의 정수를 순서대로 담은 배열을 리턴하도록 solution 함수를 작성했습니다. 이때, 코드가 올바르게 동작할 수 있도록 빈칸을 알맞게 채워주세요.</p>
//
//<hr>
//
//<h5>매개변수 설명</h5>
//
//<ul>
//<li>정수 n이 solution 함수의 매개변수로 주어집니다.</li>
//<li>n은 1 이상 100,000이하인 정수입니다.</li>
//</ul>
//
//<hr>
//
//<h5>return 값 설명</h5>
//
//<ul>
//<li>solution 함수는 1부터 n까지의 정수를 순서대로 담은 배열을 리턴합니다.</li>
//</ul>
//
//<hr>
//
//<h5>예시</h5>
//<table class="table">
//<thead><tr>
//<th>arr</th>
//<th>return</th>
//</tr>
//</thead>
//<tbody><tr>
//<td>3</td>
//<td>[1,2,3]</td>
//</tr>
//<tr>
//<td>5</td>
//<td>[1,2,3,4,5]</td>
//</tr>
//</tbody>
//</table></div></div></div>
public class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n];
        for(int i=0; i<n; i++) {
            answer[i] = i + 1;
        }
        return answer;
    }
}
