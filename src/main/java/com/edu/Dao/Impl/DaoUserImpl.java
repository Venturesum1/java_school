package com.edu.Dao.Impl;

import com.edu.Dao.DaoUser;
import com.edu.Model.UserMaster;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

@Repository
public class DaoUserImpl implements DaoUser {

    private final MongoTemplate mongoTemplate;

    @Autowired
    public DaoUserImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public UserMaster getUserByUsername(String username, String password){
        Query query = new Query();
        query.addCriteria(Criteria.where("USERNAME").is(username).and("PASSWORD").is(password));
        return mongoTemplate.findOne(query, UserMaster.class);
    }

    @Override
    public UserMaster getUserByUsernameOnly(String username){
        Query query = new Query();
        query.addCriteria(Criteria.where("USERNAME").is(username));
        return mongoTemplate.findOne(query, UserMaster.class);
    }
}


