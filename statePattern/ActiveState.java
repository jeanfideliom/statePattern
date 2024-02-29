package statePattern;
public class ActiveState implements AccountState{

    @Override
    public void deposit(Double depositAmount, Account account) {
        account.setBalance(account.getBalance() + depositAmount);
        System.out.println("Successfuly deposited " + depositAmount + "!");
        account.toString();
    }

    @Override
    public void withdraw(Double withdrawAmount, Account account) {
        account.setBalance(account.getBalance() - withdrawAmount);
        System.out.println("Successfuly withdrew " + withdrawAmount + "!");
        account.toString();
    }

    @Override
    public void suspend(Account account) {
        System.out.println("Account is suspended!");
        account.setState(new SuspendState());
    }

    @Override
    public void activate(Account account) {
       System.out.println("The Account is already activated!");
    }

    @Override
    public void close(Account account) {
        System.out.println("Account is closed!");
        account.setState(new ClosedState());
    }
    
}