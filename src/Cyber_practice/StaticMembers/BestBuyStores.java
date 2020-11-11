package Cyber_practice.StaticMembers;

public class BestBuyStores {
    public static void main(String[] args) {

        BestBuy storeOne = new BestBuy();
        storeOne.numOfComputers--;
        BestBuy storeTwo = new BestBuy();

//        System.out.println(storeOne.numOfComputers);
//        storeOne.numOfComputers--;
//        System.out.println(storeTwo.numOfComputers);

        BestBuy.printComputer();


    }
}
