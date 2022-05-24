package com.sign.repository;

import com.sign.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

   User findFirstByIdNumber(String idNumber);
}
