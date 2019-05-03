package unsa.edu.pe.manualdutic.recursos;

public class Video {
    private String video;
    private String title;
    private String description;

    public Video() {
    }

    public Video(String video,String title, String description) {
        this.video = video;
        this.title = title;
        this.description = description;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
