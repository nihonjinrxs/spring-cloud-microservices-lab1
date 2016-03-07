package org.guru.datascientist.udemy.microservices.lab1;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

/**
 * Created by ryan on 3/7/16.
 */

@RestResource(path="players", rel="player")
public interface PlayerRepository extends CrudRepository<Player, Long> {
}
