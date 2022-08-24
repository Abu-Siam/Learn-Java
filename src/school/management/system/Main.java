package school.management.system;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){
        Student s1 = new Student(1,"siam");
        Student s2 = new Student(2,"aiam");
        Student s3 = new Student(3,"biam");
        Student s4 = new Student(4,"viam");
//        Student s2 = new Student(1,"siam");
//        System.out.println(s1.equals(s2));
        ArrayList<Student> studentList = new ArrayList<>();
        Collections.addAll(studentList,s1,s2,s3,s4);
        HashMap<Integer,String> studentMap = new HashMap<>();
        for(Student student : studentList){
         studentMap.put(student.getId(),student.getName());
        }
        System.out.println(studentMap.get(1));

        String[] courses =  new String[]{"asd","dfg","ddd"};
        Teacher t1 = new Teacher(1,"semon",courses,10000);
        courses =  new String[]{"phys","bio","mech"};
        Teacher t2 = new Teacher(2,"demon",courses,20000);
        courses =  new String[]{"dota","cs","apex"};
        Teacher t3 = new Teacher(3,"cemon",courses,30000);
        ArrayList<Teacher> teacherList = new ArrayList<>();
        Collections.addAll(teacherList,t1,t2,t3);
        System.out.println(teacherList.stream().map(a -> a.getSalary()).reduce(0,(x,y)->x+y));
        System.out.println(teacherList.stream()
                .filter(s->s.getName().startsWith("se"))
                .collect(Collectors.toMap(Teacher::getId,Teacher::getName)));
    }
}
