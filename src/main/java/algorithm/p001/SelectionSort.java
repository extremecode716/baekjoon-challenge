package algorithm.p001;

/**
 * p001 선택 정렬 (Selection Sort)<p>
 * 1 10 5 8 7 6 4 3 2 9 오름차순으로 정렬하는 프로그램을 작성하세요.<p>
 * 가장 작은 것을 선택해서 제일 앞으로 보내기<p>
 * 선택 정렬의 시간 복잡도 10 + 9 + 8 + 7 + 6 + 5 + .. + 1 등차수역 <p>
 * 10 * ( 10 + 1 ) / 2 = 55 의 비교 연산을 해야함
 * N * (N + 1 ) / 2 <- N이 크다고 가정하기 떄문에 더하기나 나누기는 다 무시한다. 따라서 N * N의 수행시간을 가진다고 한다. <p>
 * 선택 정렬의 시간 복잡도는 O(N^2) 입니다. 즉, 비효율적이다.
 */
public class SelectionSort {
    public static void main(String[] args) {
        int i, j, min, index = 0, temp;
        int[] array = new int[]{1, 10, 5, 8, 7, 6, 5, 4, 3, 2, 9};
        for (i = 0; i < 10; ++i) {
            min = Integer.MAX_VALUE;
            // 가장 작은 값의 인덱스를 찾은 후 그 값으로 교체
            for (j = i; j < 10; ++j) {
                if (min > array[j]) {
                    min = array[j];
                    index = j;
                }
            }
            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }
        // 정렬 완료 후 출력
        for (i = 0; i < 10; ++i) {
            System.out.printf("%d ", array[i]);
        }
    }
}
