package com.collection.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs =  new ArrayList<Song>();
    }

    public boolean addSong(String name, double duration){

        if(findSong(name)==null){
            this.songs.add(new Song(name, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String name){
        for(Song checkSong: this.songs){
            if(checkSong.getNameOfTheSong().equals(this.songs)){
                return checkSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, List<Song> playlist){
        int index = trackNumber-1;
        if(index>0 && (index<=this.songs.size())){
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " +  trackNumber);
        return false;
    }

    public  boolean addToPlayList(String title, LinkedList<Song> playlist){
        Song checkSong = findSong(title);
        if(checkSong!=null){
            playlist.add(checkSong);
            return true;
        }
        System.out.println("This song is not in the album -> " +  title);
        return false;
    }

}
