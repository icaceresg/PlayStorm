package Class;


//Singleton pattern
public final class Administrator extends User{
    private static Administrator instance;
    
    
    private Administrator(String name, String password, String email)
    {
        super(name, email, password);
    }
    
    
    //Call this function to create Administrator user
    public static Administrator getInstance(String name, String password, String email)
    {
        if (instance == null)
            instance = new Administrator(name, password, email);
        return instance;
    }
}
