package Merosxorlik;

public class Xirurg extends Doctor {

    private String operationType = "Kesuvchi ";
    public Xirurg(String name, String lastname, int age, String operationType) {
        super(name, lastname, age,operationType );
    }

    public void malumot()
    {
        System.out.println( "Shifokor ismi "+ getName() + " "+getLastname());
        System.out.println("Shifokor yoshi " + getAge());
        System.out.println("Kasbit yo'nalishi ----" + operationType);
    }
}
