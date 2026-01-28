package com.mjcuenca.arquitectura.dao;

import java.util.List;
import com.mjcuenca.arquitectura.model.Task;

public interface TaskDAO {

    Task save(Task task);
    Task findById(int id);
    List<Task> findAll();
    void update(Task task);
    void delete(int id);
   
} 
