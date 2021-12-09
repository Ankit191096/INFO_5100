package Question1;

import java.util.Comparator;

public class gpaComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        double delta = o2.getGpa() - o1.getGpa();
        if(delta > 0) return 1;
        if(delta < 0) return -1;
        return 0;
    }
}
