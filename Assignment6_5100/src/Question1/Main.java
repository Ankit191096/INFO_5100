package Question1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(5 ,"Tushar",  2.8, new Date(91,07,29)));
        list.add(new Student(3 ,"Ankit",3.7, new Date(96,05,01)));
        list.add(new Student(2 ,"Anuya",  4.0, new Date(96,03,20)));
        list.add(new Student(1 ,"Priyanka",   4.8, new Date(95,07,19)));
        list.add(new Student(4 ,"Priya",  3.2, new Date(94,02,23)));
        System.out.println("Sort by ascending order of 'name'");
        Collections.sort(list, new NameComparator());
        for(Student s : list)
            System.out.println(s);

        System.out.println("Sort by descending order of 'gpa'");
        Collections.sort(list, new gpaComparator());
        for(Student s : list)
            System.out.println(s);

        System.out.println("Sort by ascending order of 'dateOfBirth'");
        Collections.sort(list, new DateOfBirthComparator());
        for(Student s : list)
            System.out.println(s);
    }
}
