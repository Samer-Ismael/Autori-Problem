import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        char[] letters = input.toCharArray();
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < letters.length; i++){
            if (Character.isUpperCase(letters[i])){
                answer.append(letters[i]);
            }
        }
        System.out.println(answer);
    }
}