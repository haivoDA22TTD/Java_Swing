import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            System.out.println("Chọn ví dụ cần chạy:");
            System.out.println("1 - MouseListener");
            System.out.println("2 - MouseAdapter");
            System.out.println("3 - MouseMotionListener");
            System.out.println("4 - MouseWheelListener");
            System.out.println("5 - Mouse Position");
            System.out.print("Nhập số (1-5): ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    new MouseListenerExample();
                    break;
                case 2:
                    new MouseAdapterExample();
                    break;
                case 3:
                    new MouseMotionExample();
                    break;
                case 4:
                    new MouseWheelExample();
                    break;
                case 5:
                    new MousePositionExample();
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }
