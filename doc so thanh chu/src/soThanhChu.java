import java.util.Scanner;

public class soThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so");
        short number = sc.nextShort();
        int number1 = number % 10;
        int number2 = (number % 100 - number1)/10;
        int number3 = (number - number%100)/100;
        switch (number3) {
            case 0:
                System.out.print("khong tram ");
                break;
            case 1:
                System.out.print("mot tram ");
                break;
            case 2:
                System.out.print("hai tram ");
                break;
            case 3:
                System.out.print("ba tram  ");
                break;
            case 4:
                System.out.print("bon tram ");
                break;
            case 5:
                System.out.print("nam tram ");
                break;
            case 6:
                System.out.print("sau tram ");
                break;
            case 7:
                System.out.print("bay tram ");
                break;
            case 8:
                System.out.print("tam tram ");
                break;
            case 9:
                System.out.print("chin tram ");
                break;
        }

        switch (number2) {
            case 0:
                System.out.print("le ");
                break;
            case 1:
                System.out.print("muoi ");
                break;
            case 2:
                System.out.print("hai muoi ");
                break;
            case 3:
                System.out.print("ba muoi ");
                break;
            case 4:
                System.out.print("bon muoi ");
                break;
            case 5:
                System.out.print("nam muoi ");
                break;
            case 6:
                System.out.print("sau muoi ");
                break;
            case 7:
                System.out.print("bay muoi ");
                break;
            case 8:
                System.out.print("tam muoi ");
                break;
            case 9:
                System.out.print("chin muoi ");
                break;
        }
        switch (number1) {
            case 0:
                System.out.println("khong");
                break;
            case 1:
                System.out.println("mot");
                break;
            case 2:
                System.out.println("hai");
                break;
            case 3:
                System.out.println("ba");
                break;
            case 4:
                System.out.println("bon");
                break;
            case 5:
                System.out.println("nam");
                break;
            case 6:
                System.out.println("sau");
                break;
            case 7:
                System.out.println("bay");
                break;
            case 8:
                System.out.println("tam");
                break;
            case 9:
                System.out.println("chin");
                break;
        }
    }
}
