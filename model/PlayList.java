package model;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class PlayList {
    private String name;
    private String duration;
    private String genders;
    private ArrayList<Song> songs;
    public PlayList(String name) {
        this.name = name;
        
        duration = durationConvertion();
        songs = new ArrayList<Song>();
        genders = playListGenders();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGenders() {
        return genders;
    }

    public void setGenders(String genders) {
        this.genders = genders;
    }
     
    private String durationConvertion(){
        
        String duration = "";
        int second = 0;
        int min = 0;
        int hours = 0;
        
        for(int i = 0; i < songs.size(); i++){
        
            min  += Integer.parseInt(songs.get(i).getDuration().substring(0, 1));
            second += Integer.parseInt(songs.get(i).getDuration().substring(2,4));
        }
        
        while(second >= 60){
            min++;
            second -= 60;
        }
        
       while(min >= 60){
           hours++;
           min -=60;
       }
        
       duration = String.valueOf(hours) + ":" + String.valueOf(min) + ":" + String.valueOf(second);
       
       return duration;
    }
    
    private String playListGenders(){
        ArrayList<String> allGenders = new ArrayList<String>();
        Iterator<String> all = allGenders.iterator();
        
        String comparation = "";
        String playListGenders = "";
        int cont = 0;
        
        for(int i = 0; i < songs.size(); i++){
            allGenders.add(songs.get(i).getGender());
        }
        
        for(int i = 0; i < allGenders.size(); i++){
            while(all.hasNext()){
                comparation = all.next();
                if(allGenders.get(i).equals(comparation)){
                    cont++;
                    if(cont == 2){
                        all.remove();
                        cont--;
                    }
                }
            }
        }
        
        while(all.hasNext()){
        
            playListGenders += all.next() + ",";
        }
            
        return playListGenders;
    }
    
}
