import java.util.Scanner;
public class TaksiMetreTutari {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double km,perKm = 2.2, startPrice = 10, total;
        System.out.print("KM'yi gir: ");
        km = inp.nextDouble();
        total = (km * perKm) + startPrice;
        total = (total < 20) ? 20 : total;
        System.out.print("Taksimetre TL: " + total);

    }
}

