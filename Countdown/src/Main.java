// 정수 start_num와 end_num가 주어질 때, start_num에서 end_num까지
// 1씩 감소하는 수들을 차례로 담은 리스트를 return하도록 solution 함수를 완성해주세요.
// 예를 들어, 5, 3이 주어지면 [5, 4, 3]을 리턴합니다.
import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int[] solution(int start, int end_num) {
        //System.out.println(start);
       // System.out.println(end_num);
        int[] answer = new int[start-end_num+1];
        for(int i=0; end_num<=start; start--){
            answer[i] = start;
            i++;
        }
        return answer;
    }

//start 는 end 보다 항상 크다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end_num = sc.nextInt();
        //System.out.println(start);
        //System.out.println(end_num);
        int result[] = new int[start-end_num+1];
        result = solution(start, end_num);
        System.out.println(Arrays.toString(result));
    }
}

