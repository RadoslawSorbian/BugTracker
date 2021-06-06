package com.wsb.wsb_bugtracker.auth;

import com.wsb.wsb_bugtracker.enums.AuthorityName;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Authority findByName(AuthorityName name);
}
