package bankaccount;

import java.util.ArrayList;

public class AccountOwner {

	private String name;
	private String accountOwnerId;
	private String e_mail;
	private ArrayList<BankAccount> accountsOwned;
	
	/**
	 * Initialize the properties of this object to the given parameter values.
	 * If a value is not known, use null.
	 */
	public AccountOwner(String name, String accountOwnerId, String e_mail)
    {
		this.name           = name;
		this.accountOwnerId = accountOwnerId;
		this.e_mail         = e_mail;

		accountsOwned       = new ArrayList<BankAccount>();
	}
	
	public AccountOwner(String accountOwnerId)
    {
		this.accountOwnerId = accountOwnerId;

        accountsOwned       = new ArrayList<BankAccount>();
    }

	public String getName()
    {
		return name;
	}

	public void setName(String name)
    {
		this.name = name;
	}
	
	public String getE_mail()
    {
		return e_mail;
	}

	public void setE_mail(String e_mail)
    {
		this.e_mail = e_mail;
	}

	public String getAccountOwnerIdId()
    {
		return accountOwnerId;
	}

    public ArrayList getAccountsOwned()
    {
        return accountsOwned;
    }

    public double totalBalanceOfAccountsOwned()
    {
        double totalBalance = 0.0;

        for(int i = 0; i < accountsOwned.size(); i++)
        {
            BankAccount accountSelected = accountsOwned.get(i);
            double accountBalance = accountSelected.getBalance();

            totalBalance += accountBalance;
        }

        return totalBalance;
    }

    public boolean ownerOfAllAccountsOwned()
    {
        boolean ownsAllAccounts = false;

        for(int i = 0; i < accountsOwned.size(); i++)
        {
            BankAccount accountSelected = accountsOwned.get(i);
            AccountOwner acctName       = accountSelected.getOwner();
            String acctOwner            = acctName.getName();

            if(acctOwner.equalsIgnoreCase(getName()))
            {
                ownsAllAccounts = true;
            }

            else
            {
                ownsAllAccounts = false;
                break;
            }
        }

        return ownsAllAccounts;
    }
}
