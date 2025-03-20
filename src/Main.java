import Factory.BankFactory;
import Model.Bank;
import Service.BankService;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Primitive type
        long viewCounts = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEnable = false;

        // Reference type
        Date date = new Date();
        String myName = "Braya Cheat.";
        int[][] numbers = {{1, 2, 3}, {3, 4, 5}, {6, 7, 8}};
        String[] books = {"Life of PI", "GOF", "LOTR", "AIBL"};
        // System.out.println(Arrays.deepToString(numbers));
        final float pi = 3.14F;

//        for(String book : books.length - 1){
//            System.out.println(book);
//        }
//
//        for(int row = numbers.length - 1; row >= 0; row--){
//            for(int col = numbers[row].length - 1; col >= 0; col--){
//                System.out.println(numbers[row][col]);
//            }
//        }

        // Arithmetic
        // type casting while calculate
        //double result = (double)10 / (double)3;
        //int x = 1;
        // y will be 1 because it copy x before increment
        //int y = x++;
        // y will be 2 because it increment before copy
        //int y = ++x;

        // Order of operator
        // () -> high prio
        // */ -> mid prio
        // + - -> low priolkjlk
//        double test = 1.1;
//        int[] arr = {9,7,5,11,32,5,6};
        Main main = new Main();
        // Number formmat
//        String res = NumberFormat.getPercentInstance().format(0.1);
//        String res1 = NumberFormat.getCurrencyInstance().format(0.1);

//        Scanner scanner = new Scanner(System.in);
//        int num = 0;
//        System.out.print("Enter num: ");
//        num = scanner.nextInt();
//        System.out.println(main.findFizzBuzz(num));

        Bank bank = BankFactory.createBank(0);
        BankService bankService = new BankService(bank);
        Scanner scan = new Scanner(System.in);
        double amount = 0;
        int op;

        while(true){
            System.out.println("Welcome to kak code.");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("4. Exit");

            System.out.print("Choose an option: ");
            op = scan.nextInt();

            switch (op) {
                case 1:
                    System.out.println("Dak marn hah?" );
                    amount = scan.nextDouble();
                    System.out.println(bankService.deposit(amount));
                    break;
                case 2:
                    System.out.println("Dork marn hah?" );
                    amount = scan.nextDouble();
                    System.out.println(bankService.withdraw(amount));
                    break;
                case 3:
                    System.out.println(bankService.getBalance());
                case 4:
                    break;
            }
            if(op == 4) break;
        }
    }

    public String findFizzBuzz(int num) {
        if(num % 3 == 0 && num % 5 == 0) return "FizzBuzz";
        if(num % 3 == 0) return "Buzz";
        if(num % 5 == 0) return "Fizz";
        return String.valueOf(num);
    }

    public String weatherCheck(int temp) {
        if (temp < 0) return "Cold weather ❄️";
        if (temp > 25) return "Asian weather 🔥 (AC needed)";
        return "Normal weather 🌤️";
    }

    public int findMax(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MAX_VALUE;
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public int findMin(int[] arr) {
        if (arr == null || arr.length == 0) return Integer.MIN_VALUE;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            min = Math.min(min, arr[i]);
        }
        return min;
    }
}