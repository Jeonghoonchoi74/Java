import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {


    public static String solution(String myString) {
        String answer;
        answer = myString.toLowerCase();
        return answer;
    }

    public static void main(String[] args) {

        String myString;
        Scanner sc = new Scanner(System.in);
        myString = sc.nextLine();
        String answer = solution(myString);
        System.out.println(answer);
    }
}