package com.collection.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static ArrayList<Album> albums = new ArrayList<Album>();
    public static void main(String[] args) {
        Album album = new Album("Strombringer", "Purple");

        album.addSong("Strombringer", 3.9);
        album.addSong("Hold on", 4.0);
        album.addSong("Holy man", 4.21);
        album.addSong("You cant do it right", 5.12);
        album.addSong("Soldiers of fortune", 4.11);
        album.addSong("Love don't mean a thing", 3.56);



        album = new Album("For those who about to rock", "AC/DC");
        album.addSong("For those who about to rock", 5.2);
        album.addSong("Evil walks", 4.0);
        album.addSong("COD", 5.12);
        album.addSong("Breaking the rules", 4.11);
        album.addSong("Love has a faith", 3.56);

        albums.add(album);

        LinkedList<Song> songsPlaylist = new LinkedList<Song>();

        albums.get(0).addToPlayList("Yu can do it right", songsPlaylist);
        albums.get(0).addToPlayList("Holy man", songsPlaylist);
        albums.get(0).addToPlayList("Speed king", songsPlaylist);
        albums.get(0).addToPlayList(9, songsPlaylist);
        albums.get(0).addToPlayList(7, songsPlaylist);
        albums.get(0).addToPlayList(4, songsPlaylist);

    }
}
