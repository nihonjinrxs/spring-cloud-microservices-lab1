package org.guru.datascientist.udemy.microservices;

import org.guru.datascientist.udemy.microservices.lab1.Team;
import org.guru.datascientist.udemy.microservices.lab1.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

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
        list.add(team);

        team = new Team();
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        team = new Team();
        team.setLocation("New Orleans");
        team.setName("Saints");
        list.add(team);

        teamRepository.save(list);
    }
}
