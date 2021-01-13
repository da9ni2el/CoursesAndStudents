package practice.CourseAndStudents;

public class Main {
    public static void main(String[] args) {
        Course c1 = new Course("History", 3);
        Course c2 = new Course("Math", 2);
        Course c3 = new Course("Logic" , 4);

        System.out.println(c1);

        Student s1 = new Student("Danielle", c1);
        s1.addCourse(c2);
        s1.addCourse(c3);

        Student s2 = new Student("Gal" , c2);
        Student s3 = new Student("Lioz" , c3);




    }
}
