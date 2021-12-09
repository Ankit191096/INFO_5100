package Question2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Date;
import java.util.Scanner;

public class drivingLicenceApplication {
    public static void main(String[] args) throws ParseException, notEligibleException {
        System.out.println("Please enter a DateOfBirth in format (dd/mm/yyyy)");
        String dateFormat = "dd/mm/yyyy";
        Scanner scanner = new Scanner(System.in);
        Date date = (new SimpleDateFormat(dateFormat).parse(scanner.nextLine()));
        System.out.println(date);


        Instant instant = date.toInstant();
        ZonedDateTime zone = instant.atZone(ZoneId.systemDefault());
        LocalDate givenDate = zone.toLocalDate();


        Period period = Period.between(givenDate, LocalDate.now());
        int age = period.getYears();


        try
        {
            if (age < 16)
                throw new notEligibleException();
        }
        catch (notEligibleException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
