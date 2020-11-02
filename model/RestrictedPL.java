package model;

public class RestrictedPL extends PlayList{
    private final static int MAX_USERS_ACCESS = 5;
    private User[] userAccess;
    
    public RestrictedPL(String name){
        super(name);
        userAccess = new User[MAX_USERS_ACCESS];
    }

    public User[] getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(User[] userAccess) {
        this.userAccess = userAccess;
    }
}
