package com.example.Assignment2.Repository;

import com.example.Assignment2.Model.Admin;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface AdminRepository extends MongoRepository<Admin, ObjectId> {

    @Query("{email: \"?0\"}")
    List<Admin> getAdminByEmail(String email);
}
