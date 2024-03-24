package Merosxorlik;

public class Doctor {
    private String name;
    private String lastname;
    private int age;
    private String speciality;

    public Doctor(String name, String lastname, int age, String speciality) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.speciality = speciality;
    }

    public String getName()
    {
        return name;
    }

    public  String getLastname()
    {
        return lastname;
    }

    public int getAge()
    {
        return age;
    }

    private void malumot()
    {
        System.out.println( "Shifokor ismi "+ name + " "+ lastname);
        System.out.println("Shifokor yoshi " + age);
        System.out.println("Kasbit yo'nalishi ----" + speciality+"\n");

    }

    public static void main(String[] args) {
        Doctor doctor = new Doctor("Temur","Erkinov",21, "Tish Doktor");
        Lor lor = new Lor("Artur","Erkinov", 24,"");
        Xirurg xirurg = new Xirurg("Dilmurod" ,"Allaberganov",44 ,"");


        doctor.malumot();
        lor.malumot();
        xirurg.malumot();

    }
}
