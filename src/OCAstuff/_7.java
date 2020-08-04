package OCAstuff;

public class _7 {
    public static void main(String[] args) {
        int $calories = 434;
        short numPets = 5;
        int numGrains = 5;
        String name = "Scuffy";
        name.length();
        byte x =  5;
        byte y = 4;
        int z = x + y;
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        if ( a.equals("2cfalse")) System.out.println("equals");


       int total = 0;
        StringBuilder letters = new StringBuilder("abcdefg");
        total += letters.substring(1, 2).length();
        total += letters.substring(6, 6).length();
        total += letters.substring(6, 5).length();
        System.out.println(total); // exception StringIndexOutOfBoundsException: start 6, end 5
    }
}
