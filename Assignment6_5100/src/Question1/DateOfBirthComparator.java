package Question1;

import java.util.Comparator;

public class DateOfBirthComparator implements Comparator<Student> {
    @Override
    public int compare(Student p, Student q) {
        if (p.getDateOfBirth().before(q.getDateOfBirth()) ){
            return -1;
        } else if (p.getDateOfBirth().after(q.getDateOfBirth()) ){
            return 1;
        } else {
            return 0;
        }
    }
}
