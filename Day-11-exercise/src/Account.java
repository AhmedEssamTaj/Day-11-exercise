public class Account {
    private String id;
    private String name;
    private int balance=0;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public Account(int balance, String name, String id) {
        this.balance = balance;
        this.name = name;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // this method simulate adding (deposting) money into the bank account
    public int credit(int amount) {

        if (amount > 0) {
            this.balance += amount;
            System.out.println("an amount of "+amount+" SAR has been Added to Account "+this.id);

        }else {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }

        return this.balance;

    }

    // this method simulate buying or withdrawll of money from the bank account
    public int debit(int amount) {

        if (amount > this.balance) {
            throw new IllegalArgumentException("insufficient funds! ");
        }else {
            this.balance -= amount;
            System.out.println("Account "+this.id +" has been credited for an amount of "+amount+" SAR" );
        }
        return this.balance;

    }

    public int transferTo (Account another ,int amount) {

        if (amount > this.balance) {
            throw new IllegalArgumentException("insufficient funds! try Again");
        }else {
            this.balance -= amount;
            System.out.println("An amount of "+amount+" SAR has been transferred to account " + another.getId()+" successfully..");
            another.credit(amount);

        }return this.balance;

    }

    @Override
    public String toString() {
        return "Account " + name + '\'' + ", balance = " + balance;
    }
}
