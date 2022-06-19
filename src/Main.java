public class Main {
    public static void main(String[] args) {
        // data type,variable name, = , assgin
     /* int studentAge = 15;
        double studentGPA = 3.45;
        char studentFirstInitial = 'K';
        char studentLastInitial = 'H';
        boolean hasPerfectAttendance = true;*/
        /* System.out.println(studentAge);
       System.out.println(studentGPA);
       System.out.println(studentLastInitial);*
       System.out.println(hasPerfectAttendance);*/
        double studentGPA = 3.45;
        //string is array of char
        String studentFirstName = "Ishan";
        String studentLastName = "Madhawa";
        //acessing string array index
        char studentFirstInitial = studentFirstName.charAt(0);


        System.out.println("Student Full Name:-"+studentFirstName+" "+studentLastName+"has a GPA of "+studentGPA);
        System.out.println("Student First Initial:-"+studentFirstInitial);
        System.out.println("Student Last Initial:-"+studentLastName.charAt(0));
    }
}
