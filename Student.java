package practice.CourseAndStudents;

public class Student {
    private String name; // שם הסטודנט
    private Course[] courses; // מערך הקורסים
    private int numOfCourses; // מספר הקורסים שעשה הסטודנט
    private final int Max_Courses = 30; // מספר קורסים מקסימלי

    public Student(String n, Course c1) { // בנאי
        name = n;
        courses = new Course[Max_Courses]; // יוצר אובייקט מסוג קורס בגודל 30
        numOfCourses = 0;
    }

    public void addCourse(Course c) { // שיטה
        if (numOfCourses < Max_Courses) {
            courses[numOfCourses] = new Course(c); // יצירת אובייקט ונציב במערך
            numOfCourses++;
        }
    }

    public String toString() { // שיטה שמחזירה מחרוזת המורכבת משם הסטודנט ומרשימת הקורסים שעשה
        String res = "Student: " + name + "\n";
        res = res + "Courses: " + "\n";
        for (int i = 0; i < numOfCourses; i++) { // פירוט כל הקורסים שהסטודנט עשה
            res = res + courses[i].toString() + "\n";
        }
        return res;
    }

    public int totalPoints() { // שיטה שמחזירה את כמות הנקודות שצבר הסטודנט
        int total = 0;
        for (int i = 0; i < numOfCourses; i++) {
            total += courses[i].getPoints();
        }
        return total;
    }
// עלי לכתוב את השיטות הבאות:
//    public Course maxPoints() { // שיטה שתחזיר את אובייקט הקורס שנותן את מספר הנקודות המקסימלי
//        int x = totalPoints();
//        Course max = new Course("Max Point : ", x);
//        for (int i = 0; i < numOfCourses; i++) {
//            if (x > courses[i].getPoints()) {
//                return max;
//            }
//        }
//        return max;
//    }


//    public int howManyWithPoints(int p){ // השיטה תקבל פרמטר ותחזיר כמה קורסים במערך נותנים את מספר הנקודות הזה
//       for (int i=0; i<courses ; i++){
//        }
//        return p;
//    }
}

