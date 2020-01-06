package com.collection.linkedList;

public class Song {
    private String nameOfTheSong;
    private double duration;

    public Song(String nameOfTheSong, double duration) {
        this.nameOfTheSong = nameOfTheSong;
        this.duration = duration;
    }

    public String getNameOfTheSong() {
        return nameOfTheSong;
    }

    @Override
    public String toString() {
        return "Song{" +
                "nameOfTheSong='" + nameOfTheSong + '\'' +
                ", duration=" + duration +
                '}';
    }
}
