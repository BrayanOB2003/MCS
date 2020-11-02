package model;

public class MCS {
    private final static int MAX_USERS = 10;
    private final static int MAX_PLAYLIST = 20;
    private final static int MAX_SONGS = 30;
    private User[] users;
    private PlayList[] playLists;    
    private Song[] poolSongs;
    
    public MCS(){
        users = new User[MAX_USERS];
        playLists = new PlayList[MAX_PLAYLIST];
        poolSongs = new Song[MAX_SONGS];
    }
    
    public String addUser(String name, String password, int age){
        User user = new User(name, password, age);
        String userRegister = "";
        for(int i = 0; i < users.length; i++){
            if(users[i] == null){
                users[i] = user;
                userRegister = "\n\nEl usuario se añadio correctamente.";
            } else{            
                userRegister = "\n\nEl limite de usuarios ha sido superado, no se pudo agregar.";
            }
        }
        
        return userRegister;
    }
    
    public String showUsers(){
        String userInfo = "";
        
        for(int i=0; i < users.length; i++){
            if(users[i] != null){
                userInfo =  "*************  User **************\n"; 
                userInfo += "**  UserName: " + users[i].getName() + "\n";
                userInfo += "**  Age: " + users[i].getAge() + "\n";
                userInfo += "**  Category: " + users[i].getCategory() + "\n";
                userInfo += "***********************************\n\n";
            }
        }
        
        return userInfo;
    }
    
    public String addPoolSong(){
    
    }
}
