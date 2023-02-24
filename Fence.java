import java.util.Scanner;

public class Fence {
    public static void main(String[] args) {
        int three_letters = 62;
        int space = 12;
        int phrase = (three_letters * 5) + (space * 3);

        System.out.println("Enter the length of the fence");
        Scanner sc = new Scanner(System.in);
        int fence_length = sc.nextInt();



        if (fence_length >= phrase) {
            System.out.println("The leng of the fence is enough for the phrase");
        } else {
            System.out.println("The leng of the fence is not enough for the phrase");
        }

    }
}
