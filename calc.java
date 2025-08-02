import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, ans = 0;
        String op;
        System.out.println("ENTER TWO NUMBERS:");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("ENTER THE OPERATOR(/,*,-,+,%,//):");
        op = sc.next();
        switch (op) {
            case "/":
                ans = a / b;
                break;
            case "*":
                ans = a * b;
                break;
            case "-":
                ans = a - b;
                break;
            case "+":
                ans = a + b;
                break;
            case "%":
                ans = a % b;
                break;
            case "//":
                ans = Math.floorDiv(a, b);
                break;
            default:
                System.out.println("INVALID OPERATOR INSERTED...");
                break;
        }
        System.out.println(ans + " IS YOUR ANSWER...");
        sc.close();
    }
}