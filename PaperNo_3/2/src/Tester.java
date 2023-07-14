import java.util.Scanner;

public class Tester {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maker: ");
        String maker = sc.nextLine();

        System.out.print("Enter price: ");
        int price = sc.nextInt();

        System.out.print("Enter type: ");
        int type = sc.nextInt();

        SpecCar speccar = new SpecCar(maker, price, type);

        System.out.println("1. Test toString()\n2. Test setData()\n3. Test getValue()");
        System.out.print("Enter TC (1, 2, 3): ");
        int option = sc.nextInt();

        switch (option) {
            case 1:
                System.out.println(speccar.toString().substring(0, (maker + ", " + String.valueOf(price)).length()));
                System.out.println(speccar.toString());
                break;

            case 2:
                speccar.setData();
                System.out.println(speccar.toString().substring(0, ("XZ" + maker + ", " + String.valueOf(price)).length()));
                break;

            case 3:
                System.out.print(speccar.getValue());
                break;

            default:
                System.out.println("Invalid option");
        }

        sc.close();
    }
}
