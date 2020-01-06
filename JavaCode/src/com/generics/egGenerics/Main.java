package com.generics.egGenerics;

public class Main {

    public static void main(String[] args) {

        League<Team<FootballPlayer>> football  = new League<>("AFL");
        Team<FootballPlayer>hawthrone =  new Team<>("Hawthrone");
        Team<FootballPlayer> fremantle=  new Team<>("Fremantle");
        Team<FootballPlayer> melbourne=  new Team<>("Melbourne");
        Team<FootballPlayer> adeladieCrows=  new Team<>("Adeladie Crows");
        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago Cubs");

        football.add(adeladieCrows);
        football.add(melbourne);
        football.add(hawthrone);
        football.add(fremantle);

        hawthrone.matchResult(melbourne, 5, 3);
        hawthrone.matchResult(fremantle, 4, 1);
        hawthrone.matchResult(adeladieCrows, 4, 4);
        fremantle.matchResult(adeladieCrows, 6, 6);
        fremantle.matchResult(melbourne, 0, 2);
        fremantle.matchResult(hawthrone, 3, 2);
        adeladieCrows.matchResult(fremantle, 7, 7);
        melbourne.matchResult(hawthrone, 1, 4);

        football.showLeagueTable();

    }
}
