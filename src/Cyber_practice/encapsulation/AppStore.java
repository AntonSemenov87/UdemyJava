package Cyber_practice.encapsulation;

public class AppStore {
    public static void main(String[] args) {

        App whatsapp = new App("WhatsApp", "Social Network", 45.6);

        whatsapp.info();
        whatsapp.update();
        whatsapp.setSize(53.2);
        whatsapp.info();

        System.out.println(App.getNumberOfApps());

        System.out.println();

        System.out.println(whatsapp.getReviews());

        whatsapp.setReview("Coolest App");
        System.out.println(whatsapp.getReviews());

        whatsapp.setReview("Wow, I loved it");
        System.out.println(whatsapp.getReviews());

    }
}
