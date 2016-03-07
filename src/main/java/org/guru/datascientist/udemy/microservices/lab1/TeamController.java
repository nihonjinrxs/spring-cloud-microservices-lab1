package org.guru.datascientist.udemy.microservices.lab1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ryan on 3/7/16.
 */

public class TeamController {

    @Autowired TeamRepository teamRepository;

    @RequestMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @RequestMapping("/teams/{id}")
    public Team getTeam(@PathVariable Long id) {
        return teamRepository.findOne(id);
    }
}
