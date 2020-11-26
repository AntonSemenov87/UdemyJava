package AlexLee_youtube.extras;

public class TryCatchNullPointer {
    public static void main(String[] args) {

        try {

            int[] a = {4};
            System.out.println(a[1]);

        } catch (java.lang.NullPointerException e) {
            System.out.println("Your array is null");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Your array is not big enough to find this element");
        } catch (Exception e) {
            System.out.println("Something else went wrong (not null, not out-of-bounds)");
        }
    }
}
