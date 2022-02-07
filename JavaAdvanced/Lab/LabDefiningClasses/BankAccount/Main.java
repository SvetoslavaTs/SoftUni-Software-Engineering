package LabDefiningClasses.BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<Integer, BankAccount> vault = new HashMap<>();

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String output = null;

            switch (tokens[0]) {
                case "Create": {
                    BankAccount bankAccount = new BankAccount();
                    vault.put(bankAccount.getId(), bankAccount);
                    output = "Account ID" + bankAccount.getId() + " created";
                    break;
                }
                case "Deposit": {
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);
                    if (!vault.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        vault.get(id).deposit(amount);
                        output = "Deposited " + amount + " to ID" + id;
                    }
                    break;
                }
                case "SetInterest": {
                    double newInterest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterestRate(newInterest);
                    break;
                }
                case "GetInterest": {
                    int id = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);
                    if (!vault.containsKey(id)) {
                        output = "Account does not exist";
                    } else {
                        double interest = vault.get(id).getInterest(years);
                        output = String.format("%.2f", interest);
                    }
                    break;
                }
            }
            if (!(output == null)) {
                System.out.println(output);
            }
            input = scanner.nextLine();
        }


    }
}