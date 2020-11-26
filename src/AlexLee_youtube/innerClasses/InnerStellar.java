package AlexLee_youtube.innerClasses;

class Outside {
    int a = 0;

        class Inside{
            int b = 5;
        }
}

public class InnerStellar {
    public static void main(String[] args) {

        Outside o = new Outside();
        Outside.Inside i = o.new Inside();
        System.out.println(o.a);
        System.out.println(i.b);

    }
}
