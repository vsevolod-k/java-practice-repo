package HW08.task1;

public class User {
    String userName;
    private int age;
    String email;
    private String password;
    boolean isActive;
    double amountSpendMoney;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    public void setAge(int age) {
        if (age >= 25 && age <= 60) {
            this.age = age;
        } else {
            System.out.println("User age cannot be less than 25 and more than 60");
        }
    }

    public void setPassword(String password) {
        if (password.length() >= 8 && password.length() <= 36) {
            this.password = password;
        } else {
            System.out.println("Incorrect password");
        }
    }

    public double makePurchase(double purchasePrice) {
        this.amountSpendMoney += purchasePrice;
        return purchasePrice;
    }

    public double printTotalOfSpentMoney() {
        return this.amountSpendMoney;
    }
}
