package com.mjcuenca.arquitectura.dao;

import com.mjcuenca.arquitectura.model.Task;
import com.mjcuenca.arquitectura.util.DatabaseConnection;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

public class TaskDAOMySQLImpl implements TaskDAO {

    @Override
    public Task save(Task task) {
        String sql = "INSERT INTO tasks(name, description, owner, creation_date, status) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, task.getName());
            stmt.setString(2, task.getDescription());
            stmt.setString(3, task.getOwner());
            stmt.setDate(4, java.sql.Date.valueOf(task.getCreationDate()));
            stmt.setString(5, task.getStatus().name());
            stmt.executeUpdate();

            try (ResultSet generatedKeys = stmt.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    task.setId(generatedKeys.getInt(1));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return task;
    }

    @Override
    public Task findById(int id) {
        String sql = "SELECT * FROM tasks WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            ResultSet taskResult = stmt.executeQuery();

            if (taskResult.next()) {
                Task task = new Task(
                        taskResult.getInt("id"),
                        taskResult.getString("name"),
                        taskResult.getString("description"),
                        taskResult.getString("owner"),
                        taskResult.getDate("creation_date").toLocalDate(),
                        Task.TaskStatus.valueOf(taskResult.getString("status")));
                return task;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Task> findAll() {
        String sql = "SELECT * FROM tasks";
        List<Task> tasks = new ArrayList<>();

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {

            ResultSet taskResult = stmt.executeQuery();

            while (taskResult.next()) {
                Task task = new Task(
                        taskResult.getInt("id"),
                        taskResult.getString("name"),
                        taskResult.getString("description"),
                        taskResult.getString("owner"),
                        taskResult.getDate("creation_date").toLocalDate(),
                        Task.TaskStatus.valueOf(taskResult.getString("status"))

                );
                tasks.add(task);
            }
            return tasks;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tasks;
    }

    @Override
    public void update(Task task) {
        String sql = "UPDATE tasks SET name = ?, description = ?, owner = ?, status = ? WHERE id = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, task.getName());
            stmt.setString(2, task.getDescription());
            stmt.setString(3, task.getOwner());
            stmt.setString(4, task.getStatus().name());
            stmt.setInt(5, task.getId());

            int filas = stmt.executeUpdate();
            if (filas == 0) {
                System.out.println("No se ha podido actualizar la tarea. ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(int id) {
        String sql = "DELETE FROM tasks WHERE id=?";

        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);

            int filas = stmt.executeUpdate();
            if (filas == 0) {
                System.out.println("No se encontró la tarea con id " + id);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}