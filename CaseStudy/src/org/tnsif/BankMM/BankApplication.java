package org.tnsif.BankMM;

public class BankApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // a. Assign instance of MMBankFactory to BankFactory reference.
        BankFactory bankFactory = new MMBankFactory();

        // b. Instantiate MMSavingAcc and refer it through reference SavingAcc.
        SavingAcc savingAcc = bankFactory.getNewSavingAcc(101, "John Doe", 5000.0f, true);

        // c. Instantiate MMCurrentAcc and refer it through reference CurrentAcc.
        CurrentAcc currentAcc = bankFactory.getNewCurrentAcc(102, "Jane Doe", 10000.0f, 5000.0f);

        // d. Invoke withdraw() method.
        System.out.println("----------------------------BANK MANAGEMENT SYSTEM--------------------------------------");
        savingAcc.withdraw(2000.0f);
        currentAcc.withdraw(8000.0f);

        // e. Invoke toString() method.
       
        System.out.println(savingAcc.toString());
        System.out.println(currentAcc.toString());
    }
}


