package com.iampfac.demo.data.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserJpaEntity, Long> {

}
