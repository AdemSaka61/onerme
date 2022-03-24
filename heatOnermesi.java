import java.util.Scanner;


public class heatOnermesi {
    public static void main(String[] args) {

        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklık Değerini Giriniz :");
        heat = input.nextInt();

        if (heat < 5) {
            System.out.print("Kayak Yapabilirsiniz");

        }
        if (heat >=5 && heat <=15) {
            System.out.println("Sinemaya Gidebilrsiniz.");
        }
        if (heat >= 15 && heat <=25) {
            System.out.println("Pikniğe Gidebilirsiniz.");
        }
        if (heat >= 25){
            System.out.print("Yüzmeye Gidebilirsiniz");
        }


    }
}
