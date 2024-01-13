package com.lab01.demo.responsitory;

import com.lab01.demo.entity.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
@Transactional
public interface User_Responsitory extends JpaRepository<User, String> {

}
