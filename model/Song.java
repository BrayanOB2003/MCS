package model;

public class Song {
    private String title;
    private String artistName;
    private String releaseDate;
    private String duration;
    private String gender;

    public Song(String title, String artistName, String releaseDate, String duration, int gender) {
        this.title = title;
        this.artistName = artistName;
        this.releaseDate = releaseDate;
        this.duration = duration;
        this.gender = String.valueOf(Genders.values()[gender]);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
