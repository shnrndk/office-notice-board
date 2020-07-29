package com.example.officetask.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@DeleteMapping("/deleteTask/{tid}")
	public String deleteTask(@PathVariable int tid) {
		TaskRepo.deleteById(tid);
		return "Deleted";
	}
	
	@PutMapping("/finishTask/{tid}")
	public @ResponseBody String finishTask(@PathVariable int tid) {
		Task temp = TaskRepo.findById(tid).orElse(new Task());
		temp.setIs_done(true);
		TaskRepo.deleteById(tid);
		TaskRepo.save(temp);
		return "Updated";
	}
}
