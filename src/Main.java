import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Pick a number between 1 and 10");
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        if(inputNum<5){
           System.out.println("Enjoy good luck brings you!");
        }else{
            System.out.println("Your shoe selection will make you very happy today");
        }

    }
}
