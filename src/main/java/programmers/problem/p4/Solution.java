package programmers.problem.p4;
//<div class="p-3"><h6 class="mb-3 _2c1lVVXCA5xmsDOxsZ0_k9">
//        문제 설명
//</h6> <div class="challenge-markdown"><div class="markdown solarized-dark"><p><code>EMPLOYEES</code> 테이블은 자동차 판매 회사에서 일하고 있는 직원의 정보가 담긴 테이블입니다. <code>EMPLOYEES</code>테이블 구조는 다음과 같으며, <code>ID</code>, <code>NAME</code>, <code>SALARY</code>, <code>BRANCH_ID</code>는 각각 직원의 아이디, 이름, 월급, 근무하는 대리점 아이디를 나타냅니다.</p>
//<table class="table">
//<thead><tr>
//<th>NAME</th>
//<th>TYPE</th>
//<th>NULLABLE</th>
//</tr>
//</thead>
//<tbody><tr>
//<td>ID</td>
//<td>INT</td>
//<td>FALSE</td>
//</tr>
//<tr>
//<td>NAME</td>
//<td>VARCHAR(N)</td>
//<td>FALSE</td>
//</tr>
//<tr>
//<td>SALARY</td>
//<td>NUMERIC(N,M)</td>
//<td>FALSE</td>
//</tr>
//<tr>
//<td>BRANCH_ID</td>
//<td>INT</td>
//<td>FALSE</td>
//</tr>
//</tbody>
//</table>
//<h5>문제</h5>
//
//<p><code>EMPLOYEES</code> 테이블을 이용해 지점 별 총급여액이 얼마인지 조회하는 SQL문을 작성해주세요.<br>
//단, 결과는 지점의 ID순으로 정렬되어야 합니다.</p>
//
//<h5>예시</h5>
//
//<p>예를 들어 <code>EMPLOYEES</code> 테이블이 다음과 같다면</p>
//<table class="table">
//<thead><tr>
//<th>ID</th>
//<th>NAME</th>
//<th>SALARY</th>
//<th>BRANCH_ID</th>
//</tr>
//</thead>
//<tbody><tr>
//<td>4603</td>
//<td>Alayna</td>
//<td>180</td>
//<td>15</td>
//</tr>
//<tr>
//<td>4651</td>
//<td>Juliet</td>
//<td>300</td>
//<td>17</td>
//</tr>
//<tr>
//<td>864</td>
//<td>Holly</td>
//<td>330</td>
//<td>16</td>
//</tr>
//<tr>
//<td>2842</td>
//<td>Kyra</td>
//<td>280</td>
//<td>16</td>
//</tr>
//</tbody>
//</table>
//<p>15번 지점의 총급여액은 180 (Alayna)<br>
//16번 지점의 총급여액은 330 + 280 (Holly, Kyra)<br>
//17번 지점의 총급여액은 300 (Juliet)</p>
//
//<p>이므로, SQL을 실행하면 다음과 같이 출력되어야 합니다.</p>
//<table class="table">
//<thead><tr>
//<th>BRANCH_ID</th>
//<th>TOTAL</th>
//</tr>
//</thead>
//<tbody><tr>
//<td>15</td>
//<td>180</td>
//</tr>
//<tr>
//<td>16</td>
//<td>610</td>
//</tr>
//<tr>
//<td>17</td>
//<td>300</td>
//</tr>
//</tbody>
//</table></div></div></div>
public class Solution {
    String sql = "SELECT BRANCH_ID, SUM(SALARY) FROM EMPLOYEES GROUP BY BRANCH_ID";
}
