package com.wsb.BugTracker.auth;

import com.wsb.BugTracker.enums.AuthorityName;
import org.springframework.data.repository.CrudRepository;

public interface AuthorityRepository extends CrudRepository<Authority, Long> {

    Authority findByName(AuthorityName name);
}
