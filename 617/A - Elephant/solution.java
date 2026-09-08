import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        
        int steps = (x + 4) / 5; // ceiling division
        
        System.out.println(steps);
    }
}