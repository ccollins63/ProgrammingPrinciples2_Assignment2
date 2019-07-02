package bankaccount;

public class SavingsAccount extends BankAccount
{
    private double annualInterestRate;

    public SavingsAccount(String accountId, double annualInterestRate)
    {
        super(accountId);

        this.annualInterestRate = annualInterestRate;
    }

    public SavingsAccount(String accountId, double balance, double annualInterestRate)
    {
        super(accountId, balance);

        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    @Override
    public void month_end_process()
    {
        double balance = getMinBalance();
        double monthlyInterest = (balance * (getAnnualInterestRate() / 12));
        deposit(monthlyInterest);
    }
}
