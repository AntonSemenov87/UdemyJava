package Section6;

public class VipCustomer_main {
    public static void main(String[] args) {
        VipCustomer customer1 = new VipCustomer();
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 25000.00);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 100.00, "tim@gmail.com");
        System.out.println(customer3.getName());
        System.out.println(customer3.getEmailAddress());
    }
}
