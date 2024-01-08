// Concrete class representing a Saving Account for MoneyMoney Bank

package org.tnsif.BankMM;
public class MMSavingAcc extends SavingAcc {
    private static final float MINBAL = 1000.0f;

    public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
        super(accNo, accNm, accBal, isSalaried);
    }

    @Override
    public void withdraw(float amount) {
        if (getAccBal() - amount >= MINBAL) {
            setAccBal(getAccBal() - amount);
            System.out.println("Withdrawal successful");
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public String toString() {
        return "Account No: " + getAccNo() + ", Name: " + getAccNm() + ", Balance: " + getAccBal();
    }
}
