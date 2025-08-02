import java.util.Scanner;
class s1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,r;
        System.out.println("ENTER A NUMBER TO REVERSE IT...");
        i=sc.nextInt();
        while(i>0){
           r=i%10;
           System.out.println(+r);
           i=i/10;
        }
        sc.close();
    }
}