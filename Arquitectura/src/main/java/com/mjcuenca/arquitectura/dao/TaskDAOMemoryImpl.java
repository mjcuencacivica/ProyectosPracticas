package com.mjcuenca.arquitectura.dao;

import java.util.ArrayList;
import java.util.List;

import com.mjcuenca.arquitectura.model.Task;

public class TaskDAOMemoryImpl implements TaskDAO {

    private List<Task> tasks = new ArrayList<>(); // Simula la base de datos, bbdd en memoria
    private int nextId = 1; // empieza desde 1 ya que en DAO el 0 puede considerarse "sin asignar"

    @Override
    public Task save(Task task) {
        task.setId(nextId++);
        tasks.add(task);
        return task;
    }

    @Override
    public Task findById(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                return task;
            }
        }
        throw new IllegalArgumentException("No existe la tarea con id " + id);

    }

    @Override
    public List<Task> findAll() {
        return new ArrayList<>(tasks);
    }

    @Override
    public void update(Task task) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == task.getId()) {
                tasks.set(i, task);
                return;
            }
        }
        throw new IllegalArgumentException("No se puede actualizar: tarea con id " + task.getId() + " no encontrada.");

    }

    @Override
    public void delete(int id) {
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == id) {
                tasks.remove(i);
                return;
            }
        }
        throw new IllegalArgumentException("No se puede eliminar: tarea con id " + id + " no encontrada");
    }

}