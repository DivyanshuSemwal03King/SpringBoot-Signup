package com.Signup.UserSignUp.repository;

import com.Signup.UserSignUp.controller.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {

}
