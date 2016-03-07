package org.guru.datascientist.udemy.microservices;

import org.guru.datascientist.udemy.microservices.lab1.Player;
import org.guru.datascientist.udemy.microservices.lab1.Team;
import org.guru.datascientist.udemy.microservices.lab1.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class Lab1Application {

    @Autowired
    TeamRepository teamRepository;

	public static void main(String[] args) {

		SpringApplication.run(Lab1Application.class, args);

	}

    @PostConstruct
    public void init() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        Set<Player> players = new HashSet<>();
        players.add(new Player("Curly Neal", "Cap'n"));
        players.add(new Player("Meadowlark Lemon", "Clown Prince"));
        team.setPlayers(players);
        list.add(team);

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        players = new HashSet<>();
        players.add(new Player("Ryan Lancaster", "Shooting Guard"));
        players.add(new Player("Bill Spivey", "Center"));
        team.setPlayers(players);
        list.add(team);

        team = new Team();
        team.setLocation("New Orleans");
        team.setName("Pelicans");
        players = new HashSet<>();
        players.add(new Player("Anthony Davis", "Captain"));
        players.add(new Player("Quincy Poindexter", "Swingman"));
        team.setPlayers(players);
        list.add(team);

        teamRepository.save(list);
    }
}
