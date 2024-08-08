import java.util.Arrays;

class Classroom {
    String name;
    String[] students;

    public Classroom(String name, String[] students) {
        this.name = name;
        this.students = students;
    }

    void print() {
        System.out.println("Class name: " + name);
        System.out.println("Students:");
        System.out.println(Arrays.toString(students));
    }
}

public class ClassroomData {
    public static void main(String[] args) {
        String[] students = {"Omkar", "Shahid", "Vinod", "Pranav"};
        Classroom cs = new Classroom("TY CSE AI", students);
        cs.print();
    }
}
