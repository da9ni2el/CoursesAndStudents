package practice.CourseAndStudents;

public class Course { // מחלקה
    private String name; // תכונה
    private int points; // תכונה

    public Course(String n, int p){ // בנאי
        name = n;
        points = p;
    }

    public Course(Course c){  // בנאי העתקה
        name = c.name;
        points = c.points;
    }

    public String toString(){
        return name + ", " + points;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }

    public int getPoints(){
        return points;
    }

    public void setPoints(int p) {
        points = p;
    }
}
