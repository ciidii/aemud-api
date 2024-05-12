package com.amud.io.aemudapi.repositories;

import com.amud.io.aemudapi.entities.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
