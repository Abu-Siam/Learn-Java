package School.management.system;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Student{
    /**
     * @param id
     * @param name

     */
    private String[] courses;
    private Integer salary;
    public Teacher(Integer id, String name, String[] courses, Integer salary) {
        super(id, name);
        this.courses =courses;
        this.salary = salary;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
