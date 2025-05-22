package HW08.task1;

public class Main {

    public static void main(String[] args) {
        User firstUser = new User("Oleksandr");
        firstUser.setAge(60);
        firstUser.email = "firstUserEmail@gmail.com";
        firstUser.setPassword("test1234");
        firstUser.isActive = true;
        firstUser.makePurchase(100);
        firstUser.makePurchase(500);
        firstUser.makePurchase(700);

        User secondUser = new User("Andrii");
        secondUser.setAge(33);
        secondUser.email = "secondUserEmail@gmail.com";
        secondUser.setPassword("test1234");
        secondUser.isActive = true;
        secondUser.makePurchase(200);
        secondUser.makePurchase(666);
        secondUser.makePurchase(139);

        User thirdUser = new User("Tetiana");
        thirdUser.setAge(25);
        thirdUser.email = "thirdUserEmail@gmail.com";
        thirdUser.setPassword("test1234");
        thirdUser.isActive = true;
        thirdUser.makePurchase(832);
        thirdUser.makePurchase(500);
        thirdUser.makePurchase(1488);

        System.out.println(firstUser.getAge() + " year old " + firstUser.userName
                + " has spent " + firstUser.printTotalOfSpentMoney() + " UAH");
        System.out.println(secondUser.getAge() + " year old " + secondUser.userName
                + " has spent " + secondUser.printTotalOfSpentMoney() + " UAH");
        System.out.println(thirdUser.getAge() + " year old " + thirdUser.userName
                + " has spent " + thirdUser.printTotalOfSpentMoney() + " UAH");
    }
}
