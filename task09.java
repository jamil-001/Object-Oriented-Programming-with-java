
abstract class Student {
    private String studentName;
    private String studentID;
    private int[] grades;

    public Student(String studentName, String studentID, int[] grades) {
        this.studentName = studentName;
        this.studentID = studentID;
        this.grades = grades;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentID() {
        return studentID;
    }

    public int[] getGrades() {
        return grades;
    }

    public abstract double calculateAverageGrade();
    public abstract void displayStudentInfo();
}

class Undergraduate extends Student {
    public Undergraduate(String studentName, String studentID, int[] grades) {
        super(studentName, studentID, grades);
    }
    public double calculateAverageGrade() {
        int[] grades = getGrades();
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        return grades.length > 0 ? (double) total / grades.length : 0.0;
    }
    public void displayStudentInfo() {
        System.out.println("Undergraduate Student");
        System.out.println("Name: " + getStudentName());
        System.out.println("ID: " + getStudentID());
        System.out.println("Average Grade: " + calculateAverageGrade());
    }
}

class Graduate extends Student {
    public Graduate(String studentName, String studentID, int[] grades) {
        super(studentName, studentID, grades);
    }
    public double calculateAverageGrade() {
        int[] grades = getGrades();
        int total = 0;
        for (int g : grades) {
            total += g;
        }
        double avg = grades.length > 0 ? (double) total / grades.length : 0.0;
        return avg < 90 ? avg * 0.95 : avg;
    }

    @Override
    public void displayStudentInfo() {
        System.out.println("Graduate Student");
        System.out.println("Name: " + getStudentName());
        System.out.println("ID: " + getStudentID());
        System.out.println("Average Grade (adjusted): " + calculateAverageGrade());
    }
}

public class  task09{
    public static void main(String[] args) {
        Student ug = new Undergraduate("Alice Johnson", "UG2023001", new int[]{85, 78, 92, 88});
        Student grad = new Graduate("Bob Smith", "GR2023002", new int[]{90, 87, 84, 89});

        System.out.println("=== Undergraduate Student Info ===");
        ug.displayStudentInfo();

        System.out.println("\n=== Graduate Student Info ===");
        grad.displayStudentInfo();
    }
}
