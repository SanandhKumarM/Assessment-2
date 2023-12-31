package com.example.Assignment2.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;

@Data
@NoArgsConstructor
@AllArgsConstructor // Lombok annotations
@JsonIgnoreProperties(ignoreUnknown = true)

public class Employee {
    @JsonSerialize(using = ToStringSerializer.class) //Serializing ObjectId using ToStringSerializer
    private ObjectId id;
    private String name;
    private String email;
    private String password;
    private int salary;
}
