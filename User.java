import java.time.LocalDate;

public class User {
    protected String name;
    protected LocalDate dob;

    User(){
        this.name = null;
        this.dob = LocalDate.now();
    }

    User(String name, int year, int month, int day){
        this.name = name;
        this.dob = LocalDate.of(year, month, day);
    }

    public void displayInfo(){
        System.out.println(name + " was born on " + dob);
    }
}



