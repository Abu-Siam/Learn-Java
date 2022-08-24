package School.management.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class School {
    private ArrayList<Teacher> teacherList;
    private ArrayList<Student> studentList;

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public void setTeacherList(ArrayList<Teacher> teacherList) {
        this.teacherList = teacherList;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof School)) return false;
        School school = (School) o;
        return Objects.equals(teacherList, school.teacherList) && Objects.equals(studentList, school.studentList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teacherList, studentList);
    }

    public School(ArrayList<Teacher> teacherList, ArrayList<Student> studentList) {
        this.teacherList = teacherList;
        this.studentList = studentList;
    }

}
