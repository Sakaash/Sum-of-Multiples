import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the level completed : ");
    int level = scanner.nextInt();
    System.out.println("Enter the number of base values :");
    int count = scanner.nextInt();
    int[] arr = new int[count];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = scanner.nextInt();
    }
    scanner.close();
    GameLogic game = new GameLogic(level, arr);
    game.printBaseTotal();
 }
}
