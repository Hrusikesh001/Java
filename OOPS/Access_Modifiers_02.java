public class Access_Modifiers_02 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "HrusikeshSahu";
        myAcc.setPassword("myPassword123");
    }
}

class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}