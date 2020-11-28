package AlexLee_youtube.someYoutubeCourse;

public class SwitchStatements {
    public static void main(String[] args) {

        String role = "Admin";

        switch (role) {

            case "Admin":
                System.out.println("You are an Admin");
                break;

            case "User":
                System.out.println("You are a registered user");
                break;

            default:
                System.out.println("You are a guest");

        }

    }
}
