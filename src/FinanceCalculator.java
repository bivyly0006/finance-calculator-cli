
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        Double totalIncome = 0.0;
        Double totalExpense = 0.0;
        int Choice;

        System.out.println("=== Personal Finance Calculator ===");

        while(true) {
            System.out.println("1. Add Income");
            System.out.println("2. Add Expense");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");


            System.out.print("Enter choice: ");
            Choice = scanner.nextInt();

            if (Choice==1){
                System.out.print("Enter income amount: ");
                double income = scanner.nextDouble();
                totalIncome += income;
                System.out.println("Income added successfully!");
            }else if (Choice==2){
                System.out.print("Enter expense amount: ");
                double expense = scanner.nextDouble();
                totalExpense += expense;
                System.out.println("Expense added successfully!");
            }else if(Choice==3){
                double balance = totalIncome - totalExpense;
                System.out.println("\n___ Financial Summary ___");
                System.out.println("Total Income: $"+totalIncome);
                System.out.println("Total Expense: $"+totalExpense);
                System.out.println("Balance: $"+balance);
            }else if(Choice==4){
                System.out.println("Thank you for using Finance Calculator!");
                break;
            }else{
                System.out.println("Invalid choice. Please try again.");
            }

            {
                scanner.close();
            }

        }

    }
}
