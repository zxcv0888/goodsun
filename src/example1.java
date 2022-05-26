import java.util.*;

public class example1 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mul = (input.nextInt() * input.nextInt() * input.nextInt());
        String str = Integer.toString(mul);

        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if ((str.charAt(j) - '0')== i) {
                    count++;
                }
            }
            System.out.println(count);
        }


    }
}
