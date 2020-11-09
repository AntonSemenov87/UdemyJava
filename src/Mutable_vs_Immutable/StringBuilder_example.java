package Mutable_vs_Immutable;

public class StringBuilder_example {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Porsche");

        // methods:
        // concatination --> APPEND
        sb.append(" Macan ");
        System.out.println(sb);
        sb.append(900 + 11);
        System.out.println(sb);

        // deleteCharAt() --> deletes character based on index provided
        sb.deleteCharAt(4);
        System.out.println(sb);

        // delete() --> delete chars in the range of indexes
        sb.delete(4, 7);
        System.out.println(sb);

        //insert --> adds given string into StringBuilder Object at given index
        sb.insert(2, "LOL");
        System.out.println(sb);

        // reverse String
        sb.reverse();
        System.out.println(sb);

        String result = sb.toString();
        System.out.println(result);



    }
}
