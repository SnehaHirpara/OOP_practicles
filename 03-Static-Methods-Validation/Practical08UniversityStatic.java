class University {

    static int totalStudents;
    static String universityName;
 
    static {
        universityName = "GTU";
        totalStudents = 0;
        System.out.println("Static block executed.");
    }

    {
        System.out.println("Instance block executed.");
    }

    University() {
        totalStudents++;
        System.out.println("Constructor executed.");
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

public class Practical08UniversityStatic {

    public static void main(String[] args) {

        System.out.println("University Name: " + University.universityName);

        University s1 = new University();
        University s2 = new University();

        System.out.println("Total Students after 2 objects: " 
                            + University.getTotalStudents());

        University s3 = new University();
        University s4 = new University();
        University s5 = new University();

        System.out.println("Total Students after 5 objects: " 
                            + University.getTotalStudents());
    }
}