import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Device D1 = new Miracast();
        Device D2 = new AirPlay();
        Device D3 = new Miracast();
        Device D4 = new AirPlay();

        SynApp.addDevice(D1);
        SynApp.addDevice(D2);
        SynApp.addDevice(D3);
        SynApp.addDevice(D4);

        for(int i = 0; i < 100; i++){
            System.out.println("Device: ");
            int input = scanner.nextInt();
            SynApp.showDevice(input);
        }
    }
}