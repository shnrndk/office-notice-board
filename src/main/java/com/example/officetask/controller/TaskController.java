package com.example.officetask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.officetask.dao.taskRepo;
import com.example.officetask.model.Task;

@Controller
public class TaskController {
	
	@Autowired
	private taskRepo TaskRepo;
	
	@PostMapping("/add") 
	public @ResponseBody String addNewTask(
			@RequestBody
		    Task task
			)
	{
		//System.out.println(task);
		TaskRepo.save(task);
		return "Saved";
	}
	
	@GetMapping("/getTasks")
	public @ResponseBody Iterable<Task> getTasks() {
		return TaskRepo.findAll();
	}
	
}
