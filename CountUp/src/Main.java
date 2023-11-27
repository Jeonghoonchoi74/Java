// 문제: 정수 start_num와 end_num가 주어질 때, start_num부터 end_num까지의 숫자를 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static int[] solution(int start_num, int end_num) {
        int[] answer = new int[end_num - start_num + 1];
        for(int i = 0; start_num<=end_num ;start_num++ ,i++) {
            answer[i] = start_num;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start_num = sc.nextInt();
        int end_num = sc.nextInt();
        int[] answer = solution(start_num, end_num);
        System.out.println(Arrays.toString(answer));
    }
}