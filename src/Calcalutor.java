import java.util.Scanner;

public class Calcalutor
{
    public static void main(String[] args) {
         float income;
         float calc;
        Scanner oran=new Scanner (System.in);

        System.out.println("lütfen Para Miktarını giriniz");
        income=oran.nextFloat();
        calc=income*18/100;
        float calcKdv=calc+income;
        float calcKdvsz=calcKdv-income;
        System.out.println("KDV'siz Fiyat= "+ income);
        System.out.println("KDV'li Fiyat= "+ calcKdv);
        System.out.println("KDV TUTARI= "+calcKdvsz);
    }
}
