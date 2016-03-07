package org.guru.datascientist.udemy.microservices.lab1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 3/7/16.
 */
@RestController
public class TeamController {

    @RequestMapping("/teams")
    List<Team> getTeams() {
        List<Team> list = new ArrayList<>();

        Team team = new Team();
        team.setId(0l);
        team.setLocation("Harlem");
        team.setName("Globetrotters");
        list.add(team);

        team = new Team();
        team.setId(1l);
        team.setLocation("Washington");
        team.setName("Generals");
        list.add(team);

        team = new Team();
        team.setId(2l);
        team.setLocation("New Orleans");
        team.setName("Saints");
        list.add(team);

        return list;
    }
}
