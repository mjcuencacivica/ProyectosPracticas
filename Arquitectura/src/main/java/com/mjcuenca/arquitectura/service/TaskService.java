package com.mjcuenca.arquitectura.service;

import java.time.LocalDate;
import java.util.List;

import com.mjcuenca.arquitectura.dao.TaskDAO;
import com.mjcuenca.arquitectura.dao.TaskDAOMySQLImpl;
import com.mjcuenca.arquitectura.model.Task;


public class TaskService {

    private TaskDAO taskDAO = new TaskDAOMySQLImpl();

    /**
     * Crea una nueva tarea y la guarda en la base de datos.
     * Valida que el nombre y el propietario no estén vacíos.
     *
     * @param name        Nombre de la tarea.
     * @param description Descripción de la tarea.
     * @param owner       Propietario de la tarea.
     * @return La tarea creada con su ID asignado.
     * @throws IllegalArgumentException Si name o owner están vacíos.
     */

    public Task addTask(String name, String description, String owner) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El nombre de la tarea no puede estar vacío.");
        }

        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("El propietario de la tarea no puede estar vacío.");
        }
        LocalDate creationDate = LocalDate.now();
        Task.TaskStatus status = Task.TaskStatus.pending;
        Task task = new Task(0, name, description, owner, creationDate, status);
        Task savedTask = taskDAO.save(task);
        return savedTask;
    }

    /**
     * Recupera una tarea por su ID.
     *
     * @param id ID de la tarea a buscar.
     * @return La tarea correspondiente al ID, en caso de no existir recibiremos una
     *         excepción.
     * @throws IllegalArgumentException Si el ID es <= 0.
     */

    public Task getTaskById(int id) {
        if (id <= 0) {// Nuestro id empezará en 1 tal y como se indica en TaskDAOMemoryImpl
            throw new IllegalArgumentException("El ID indicado es inválido: no puede ser negativo ni igual a 0.");
        }
        return taskDAO.findById(id);
    }

    /**
     * Devuelve todas las tareas almacenadas.
     *
     * @return Lista de todas las tareas.
     */

    public List<Task> getAllTasks() {
        return taskDAO.findAll();
    }

    /**
     * Actualiza los datos de una tarea existente.
     * Valida que la tarea no sea null, que el ID sea válido,
     * que name y owner no estén vacíos o sean null y que el estado no sea null.
     *
     * @param task Objeto Task con los datos actualizados.
     * @throws IllegalArgumentException Si task es null, ID inválido, name/owner
     *                                  vacíos o status null, o si el ID no existe
     *                                  en la base de datos.
     */

    public void updateTask(Task task) {
        if (task == null) {
            throw new IllegalArgumentException("No se ha recibido ninguna tarea correcta.");
        }
        if (task.getId() <= 0) {
            throw new IllegalArgumentException("El ID indicado es inválido: no puede ser negativo ni igual a 0.");
        }
        if (task.getName() == null || task.getName().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la tarea no puede estar vacío.");
        }
        if (task.getOwner() == null || task.getOwner().isEmpty()) {
            throw new IllegalArgumentException("El propietario de la tarea no puede estar vacío.");
        }
        if (task.getStatus() == null) {
            throw new IllegalArgumentException("El estado de la tarea no puede estar vacío.");
        }
        taskDAO.update(task);

    }

    /**
     * Elimina una tarea según su ID.
     *
     * @param id ID de la tarea a eliminar (debe ser mayor que 0).
     * @throws IllegalArgumentException Si el ID es <= 0 o no existe en la base de
     *                                  datos.
     */

    public void deleteTask(int id) {
        if (id <= 0) {// Nuestro ID empezará en 1 tal y como se indica en TaskDAOMemoryImpl
            throw new IllegalArgumentException("El ID indicado es inválido: no puede ser negativo ni igual a 0.");
        }
        taskDAO.delete(id);
    }

}
