package org.guru.datascientist.udemy.microservices.lab1;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by ryan on 3/7/16.
 */

public interface TeamRepository extends CrudRepository<Team, Long> {
}
