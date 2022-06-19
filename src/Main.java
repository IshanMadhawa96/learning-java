import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double studentGPA = 3.45;
        String studentFirstName = "Ishan";
        String studentLastName = "Madhawa";
        System.out.println("Student Full Name:-"+studentFirstName+" "+studentLastName+" has a GPA of "+studentGPA);
        System.out.println("What do you want to update it to?");
        Scanner input = new Scanner(System.in);
        studentGPA = input.nextDouble();
        System.out.println("Student Full Name:-"+studentFirstName+" "+studentLastName+" has a GPA of(Updated):-"+studentGPA);

    }
}
