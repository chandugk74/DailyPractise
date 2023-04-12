package singeltonEX;

//https://www.youtube.com/watch?v=6JehKH-zF28&ab_channel=TechStack9
public class EagerInitialization {
    //	create private static variable
    private static EagerInitialization theOnlyInstance = new EagerInitialization();

    //	create private constructor
    private EagerInitialization() {

    }

    //	 return the object of this class
    public static EagerInitialization getInstance() {

		return theOnlyInstance;
    }

}