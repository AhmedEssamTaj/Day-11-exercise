
/*
Author: Ahmed Essam Taj
Date: 3, November
Day 11 - exercise number-1

 */

public class Main {
    public static void main(String[] args) {

        Account ahmedMainAccount = new Account("123-AhmedMain-567","Ahmed Taj-Main");
        Account ahmedSavingsAccount = new Account("12-AhmedSavings-34","Ahmed Taj-Savings");

        try {

            ahmedMainAccount.setBalance(1500);
            ahmedSavingsAccount.setBalance(500);

            ahmedMainAccount.credit(1000);
            ahmedMainAccount.debit(250);
            ahmedMainAccount.transferTo(ahmedSavingsAccount, 500);


            System.out.println(ahmedMainAccount.toString());
            System.out.println(ahmedSavingsAccount.toString());


        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }






    }
}