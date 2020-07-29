package com.example.officetask.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.officetask.model.Task;

public interface taskRepo extends CrudRepository<Task, Integer>{

}
