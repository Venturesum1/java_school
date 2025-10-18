package com.edu.Model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.io.Serializable;

@Data
@Document(collection = "UserMaster")
public class UserMaster implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Field("_id")
    private String id;

    @Field("USERNAME")
    private String username;

    @Field("PASSWORD")
    private String password;

    @Field("ROLE")
    private String role;

    @Field("EMAIL")
    private String email;
}
