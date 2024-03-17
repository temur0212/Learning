public class Car {
    public   String rangi;
    public String modeli;
    public double narxi;
    public String uzatish_qutisi;

    public Car(String rangi, String modeli, double narxi, String uzatish_qutisi) {
        this.rangi = rangi;
        this.modeli = modeli;
        this.narxi = narxi;
        this.uzatish_qutisi = uzatish_qutisi;
    }

    public Car() {
    }

    public void print(String rangi, String modeli, double narxi, String uzatish_qutisi)
    {

        System.out.println("Aftomobilning rangi : "+rangi);
        System.out.println("Aftmobilning modeli : "+ modeli);
        System.out.println("Aftomobilning narxi : "+ narxi);
        System.out.println("Aftomobilning uzatish qutusi : " + uzatish_qutisi);
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.print("Oq","BWD",33.000,"Aftomat");
    }
}
