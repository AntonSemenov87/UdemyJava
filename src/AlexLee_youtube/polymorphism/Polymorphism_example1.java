package AlexLee_youtube.polymorphism;

class Bird {
    public void sing(){
        System.out.println("tweet tweet tweet");
    }
}

class Robin extends Bird{
    public void sing(){
        System.out.println("tweetle tweetle");
    }
}

class Pelican extends Bird{
    public void sing(){
        System.out.println("kwah kwah");
    }
}

class Polymorphism_example1 { // many forms
    public static void main(String[] args) {

        Bird b = new Bird();
        b.sing();

        Robin r = new Robin();
        r.sing();

        Pelican p = new Pelican();
        p.sing();


    }
}
