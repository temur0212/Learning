public class TbUchburchak {
public double a_katet;
public double b_katet;
public double gepotenuza;

    public TbUchburchak(double a_katet, double b_katet, double gepotenuza) {
        this.a_katet = a_katet;
        this.b_katet = b_katet;
        this.gepotenuza = gepotenuza;
    }

    public TbUchburchak() {
    }



    public double peremetiri()
    {
        return  a_katet+b_katet+gepotenuza;
    }
    public double yuzi()
    {
       return a_katet*b_katet/2.0  ;
    }


    public static void main(String[] args) {
        TbUchburchak uchburchak1 = new TbUchburchak(3,4,5);
        System.out.println("To'g'ri burchakli uchburchakning peremetiri " + uchburchak1.peremetiri());
        System.out.println("To'g'ri burchakli uchburchakning yuzi" + uchburchak1.yuzi());
    }
}
