package Merosxorlik;

public class Lor extends Doctor{
   private String HearingSpecialist = "Lor";

    public Lor(String name, String lastname, int age ,String HearingSpecialist) {
        super(name, lastname, age, HearingSpecialist);

    }


    public void malumot()
    {
        System.out.println( "Shifokor ismi "+ getName() + " "+getLastname());
        System.out.println("Shifokor yoshi " + getAge());
        System.out.println("Kasbit yo'nalishi ----" + HearingSpecialist + "\n");
        System.out.println(" ");
    }




}
