package com.example.sbnri_assignment;

public class ModelFeed {
    private int id;
    private int likes;
    private int comments;
    private int propic;
    private int postpic;
    private String name;
    private String time;
    private String status;

    public ModelFeed(int id, int likes, int comments, int propic, int postpic, String name, String time, String status) {
        this.id = id;
        this.likes = likes;
        this.comments = comments;
        this.propic = propic;
        this.postpic = postpic;
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public int getLikes() {
        return likes;
    }

    public int getComments() {
        return comments;
    }

    public int getPropic() {
        return propic;
    }

    public int getPostpic() {
        return postpic;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getStatus() {
        return status;
    }
}
