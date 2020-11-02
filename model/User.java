package model;

public class User {
    private String name;
    private String password;
    private int age;
    private String category;
    private int sharedSongs;
            
    public User(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
        this.category = userCategoy();
        sharedSongs = 0;    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getSharedSongs() {
        return sharedSongs;
    }

    public void setSharedSongs(int sharedSongs) {
        this.sharedSongs = sharedSongs;
    }

    private String userCategoy(){
        
        String clasification;
        
        if(sharedSongs < 3){
            clasification = String.valueOf(Categories.Newbie);
        } else if(sharedSongs < 10){
            clasification = String.valueOf(Categories.LittleContributor);
        } else if(sharedSongs < 30){
            clasification = String.valueOf(Categories.MildContributor);
        } else{
            clasification = String.valueOf(Categories.StarContributor);
        }
        
        return clasification;
    }
}
