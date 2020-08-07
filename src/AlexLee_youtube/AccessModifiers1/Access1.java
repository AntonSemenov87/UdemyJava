package AlexLee_youtube.AccessModifiers1;

public class Access1 {

    // default, public, private, protected
    // default - access within the package
    // public - access everywhere across all packages
    // private - within the class/file
    // protected - access within the package AND if access through subclass when using extends

    protected int hours = 3;
    protected int minutes = 47;

    public int getHours () {
        return hours;
    }

}
