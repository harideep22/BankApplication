package bank.application;

public class Main {
    public static void main(String[] args) {

        HdfcBank.rateOfInterest=7;
        SBI.rateOfInterest=8;

        HdfcBank account1=new HdfcBank(9000,"123","Sabu");
        HdfcBank account2=new HdfcBank(2000000,"12345","Kuttan");
        SBI account3 =new SBI(30500,"987","Shaji");

        double i1=account1.calculateTotalInterest(4);
        System.out.println("The rate of interest of account1 is "+i1);

        String message1=account2.addMoney(500);
        System.out.println(message1);

        String message2=account3.withdrawMoney(3000,"678");
        System.out.println(message2);
        String message3=account3.withdrawMoney(3000,"987");
        System.out.println(message3);

    }
}