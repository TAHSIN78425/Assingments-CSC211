import java.security.Key;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any string with out Stop to run  ");
        String key = scanner.nextLine();
        int counter=0;

try {
    while(key!="Stop"){

        System.out.println("Enter Team Id No: ");
        int id = scanner.nextInt();
        System.out.println("Enter Number of games they won :");
        int win = scanner.nextInt();
        System.out.println("Enter Number of games the lost :");
        int loss = scanner.nextInt();
        Team team = new Team(id, win, loss);


counter+=1;
        System.out.println("Total no of team is :"+counter);
        System.out.println(" ");
        key = scanner.nextLine();

    }
}catch (Exception exception){



}
        }


        }

