public class MathFunctions {
    static double Pi=3.14159265359;
    static double e=2.71828182846;

    public static double DoiraYuzi(double r)
    {
        return Pi*r*r;
    }


    public static double daraja(double a)
    {
     return Math.pow(e,a)  ;
    }

    public static double UchburchakYuza(double s,double d,double f)
    {
        double p=(s+d+f)/2;
        double y=Math.sqrt(p*(p-s)*(p-d)*(p-f));
        return y;
    }


    public static void main(String[] args) {
        System.out.println("Radiusi 10ga teng bo'lgan doiraning yyuzi "+DoiraYuzi(10));
        System.out.println(" e o'zgaruvchisining 10 darajasi "+ daraja(10));
        System.out.println("Tamonlari 3 4 5 bo'lgan uchburchakning yuzasi " + UchburchakYuza(3,4,5));
    }
}
