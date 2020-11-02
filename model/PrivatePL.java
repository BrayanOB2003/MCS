package model;

public class PrivatePL extends PlayList{
    private User userAccess;
    
    public PrivatePL(String name, User userAccess){
        super(name);
        this.userAccess = userAccess;
    }

    public User getUserAccess() {
        return userAccess;
    }

    public void setUserAccess(User userAccess) {
        this.userAccess = userAccess;
    }
}
