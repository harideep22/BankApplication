package bank.application;

import java.util.UUID;

public class HdfcBank implements BankInterface{

        private int balance;
        private String accountNo;  // we are randomly generating account number not
        private String password;
        public String name;
        public static double rateOfInterest=4;

        public HdfcBank(int balance, String password, String name) {
            this.accountNo= UUID.randomUUID().toString();
            this.balance = balance;
            this.password = password;
            this.name = name;
        }

        @Override
        public int checkBalance(String password) {
            if(password==this.password){
                return balance;
            }
            return -1;
        }

        @Override
        public String addMoney(int money) {
            balance=balance+money;
            String message=money+" has been added to bank account "+accountNo;
            return message;
        }

        @Override
        public String withdrawMoney(int drawMoney, String password) {
            if(password==this.password){
                if(balance>drawMoney){
                    balance-=drawMoney;
                    return "Money withdrawn successfully";
                }
                else return "Insufficient balance ";
            }
            return "wrong password";
        }

        @Override
        public String changePassword(String oldPassword, String newPassword) {
            if(this.password.equals(oldPassword)){
                this.password=newPassword;
                return "Password changed Succesfully";
            }
            return "Wrong Password";
        }

        @Override
        public double calculateTotalInterest(int years) {
            double interest=balance*rateOfInterest*years/100;
            return interest;
        }
}

