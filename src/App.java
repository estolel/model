
public class App {
    public static void main(String[] args) {
        Model model = new Model();
        Student student = new Student("EL", "ESTOL",
                18, "M", "201610678");
        System.out.println(student.toString() + "\nStudent{");
        System.out.println("\tFirst Name: \t" + student.firstName);
        System.out.println("\tLast Name: \t" + student.lastName);
        System.out.println("\tAge: \t" + student.age);
        System.out.println("\tGender: \t" + student.gender);
        System.out.println("\tID Number: \t" + student.idNumber);
        System.out.println("}");
    }
}
