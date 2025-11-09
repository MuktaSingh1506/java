package assignment4;

class BankAccount {
    private int balance = 1000;

    // synchronized methods to prevent race condition
    synchronized void deposit(int amount) {
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited: " + amount + " | Balance: " + balance);
    }

    synchronized void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(Thread.currentThread().getName() + " withdrew: " + amount + " | Balance: " + balance);
        } else {
            System.out.println(Thread.currentThread().getName() + " - Insufficient funds! Balance: " + balance);
        }
    }
}

class ThreadSync11 extends Thread {
    BankAccount account;
    boolean isDeposit;

    ThreadSync11(BankAccount acc, boolean deposit) {
        this.account = acc;
        this.isDeposit = deposit;
    }

    public void run() {
        if (isDeposit) {
            account.deposit(500);
        } else {
            account.withdraw(700);
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();

        ThreadSync11 t1 = new ThreadSync11(acc, true);  // deposit thread
        ThreadSync11 t2 = new ThreadSync11(acc, false); // withdraw thread

        t1.setName("Depositor");
        t2.setName("Withdrawer");

        t1.start();
        t2.start();
    }
}
