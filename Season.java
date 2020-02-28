import java.util.Scanner;

class Season {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease type the month:");
        String month = scanner.nextLine().toLowerCase();

        if ((month.equals("january")) || month.equals("february") || month.equals("december")) {
            System.out.println("Season is Winter");
        }
        else if ((month.equals("march")) || month.equals("april") || month.equals("may")) {
            System.out.println("Season is Spring");
        }
        else if ((month.equals("june")) || month.equals("jule") || month.equals("august")) {
            System.out.println("Season is Summer");
        }
        else if ((month.equals("september")) || month.equals("october") || month.equals("november")) {
            System.out.println("Season is Autumn");
        }

    }
}