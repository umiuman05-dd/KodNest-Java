import java.util.Scanner;

class Student {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void displayName() {
        System.out.println("Student Name: " + name);
    }
}

public class Storename {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        Student s1 = new Student();
        s1.setName(name);
        s1.displayName();

        scanner.close();
    }
}