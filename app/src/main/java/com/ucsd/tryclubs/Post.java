package com.ucsd.tryclubs;

public class Post {
    private String eName;
    private String hosts;
    private String location;
    private String date;
    private String time;
    private String description;
    private String profilePictureForPost; //not sure if this has to be a string, will ask later.

    public Post(String eName, String hosts, String location, String date, String time, String description, String profilePictureForPost) {
        this.eName = eName;
        this.hosts = hosts;
        this.location = location;
        this.date = date;
        this.time = time;
        this.description = description;
        this.profilePictureForPost = profilePictureForPost;
    }

    public String geteName() {
        return eName;
    }

    public String getHosts() {
        return hosts;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getProfilePictureForPost() {
        return profilePictureForPost;
    }

}
