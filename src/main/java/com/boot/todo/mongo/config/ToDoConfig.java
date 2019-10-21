package com.boot.todo.mongo.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mongodb.MongoClientOptions;

@Configuration
public class ToDoConfig extends MongoAutoConfiguration {

    public ToDoConfig(
        MongoProperties properties,
        ObjectProvider<MongoClientOptions> options,
        Environment environment) {
        super();
    }
}