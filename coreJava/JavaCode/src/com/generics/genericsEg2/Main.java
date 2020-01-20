package com.generics.genericsEg2;

public class Main {
    public static void main(String[] args) {
        FootballPlayer joe = new FootballPlayer("Joe");
        BaseBallPlayer pat =  new BaseBallPlayer("Pat");
        SoccerPlayer bech = new SoccerPlayer("bech");


//        Team adeladieCrows = new Team("Adeladie Crows");
//        adeladieCrows.addPlayer(joe);
//        adeladieCrows.addPlayer(pat);
//        adeladieCrows.addPlayer(bech);

        Team<FootballPlayer> adeladieCrows =  new Team<>("Adeladie Crows");

        adeladieCrows.addPlayer(joe);

        Team<BaseBallPlayer> baseBallPlayerTeam = new Team<>("Chicago Cubs");
        baseBallPlayerTeam.addPlayer(pat);

        Team<SoccerPlayer> soccerPlayerTeam = new Team<>("Chile team");
        soccerPlayerTeam.addPlayer(bech);

        Team<FootballPlayer> hawthrone =  new Team<>("Hawthrone");
        Team<FootballPlayer> fremantle=  new Team<>("Fremantle");
        hawthrone.matchResult(fremantle, 1, 1);
        hawthrone.matchResult(adeladieCrows, 2, 1);

        adeladieCrows.matchResult(hawthrone, 3, 8);
        adeladieCrows.matchResult(fremantle, 5, 2);
        System.out.println("Ranking of " + adeladieCrows.getName() + " --> " + adeladieCrows.ranking());
        System.out.println("Ranking of " + hawthrone.getName() + " --> " + hawthrone.ranking());
        System.out.println("Ranking of " + fremantle.getName() + " --> " + fremantle.ranking());

        System.out.println("Players --> " + adeladieCrows.numPlayers());

        System.out.println(adeladieCrows.compareTo(hawthrone));
        System.out.println(hawthrone.compareTo(fremantle));
        System.out.println(fremantle.compareTo(adeladieCrows));
        System.out.println(fremantle.compareTo(hawthrone));


    }
}
