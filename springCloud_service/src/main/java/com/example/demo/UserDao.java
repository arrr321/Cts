package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
@EnableTransactionManagement
public interface UserDao extends JpaRepository<User, Integer> {

//	 public List<User> findbyEmail();
}
