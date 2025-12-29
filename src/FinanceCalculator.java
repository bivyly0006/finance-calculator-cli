
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Double totalIncome = 0.0;
        Double totalExpense = 0.0;
        Double balance ;
        int Choice;

        System.out.println("Welcome!");

        System.out.println("1. Add Income");
        System.out.println("2. Add Expense");
        System.out.println("3. View Balance");
        System.out.println("4. Exit");


        System.out.print("Enter choice: ");
        Choice = scanner.nextInt();

        while(Choice>=1 && Choice<4){

                System.out.print("Enter income amount:'eg 5000.00'  ");
                totalIncome = scanner.nextDouble();



                System.out.print("Enter expense amount:'eg 5000.00'  ");
                totalExpense = scanner.nextDouble();



                balance=totalIncome-totalExpense;
                System.out.println("Balance = "+balance);


        }

    }
}
