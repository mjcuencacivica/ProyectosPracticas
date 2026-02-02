package com.mjcuenca.arquitectura;

import com.mjcuenca.arquitectura.model.Task;
import com.mjcuenca.arquitectura.service.TaskService;

import java.util.List;
import java.util.Scanner;

import com.mjcuenca.arquitectura.model.Task;
import com.mjcuenca.arquitectura.service.TaskService;

public class TaskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;
        TaskService taskService = new TaskService();

        while (!salir) {
            System.out.println("==== Menú de Tareas ====");
            System.out.println("1. Crear tarea");
            System.out.println("2. Listar todas las tareas");
            System.out.println("3. Actualizar tarea");
            System.out.println("4. Eliminar tarea");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea pendiente

            switch (opcion) {
                case 1:
                    System.out.println("Nombre de la tarea: ");
                    String name = scanner.nextLine();
                    System.out.println("Descripción de la tarea: ");
                    String description = scanner.nextLine();
                    System.out.println("Propietario/a de la tarea: ");
                    String owner = scanner.nextLine();
                    try {
                        Task savedTask = taskService.addTask(name, description, owner);

                        System.out.println("Tarea creada correctamente: " + savedTask);
                        System.out.println(savedTask);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al crear la tarea: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.println("Has seleccionado: Listar todas las tareas");

                    try {
                        List<Task> tasks = taskService.getAllTasks();
                        if (tasks.isEmpty()) {
                            System.out.println("No hay tareas registradas.");
                        } else {
                            System.out.println("Listado de tareas:");
                            for (Task task : tasks) {
                                System.out.println(task);
                            }
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("No se pueden visualizar las tareas: " + e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Has seleccionado: Actualizar tarea");
                    System.out.print("Introduce el ID de la tarea a actualizar: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        Task task = taskService.getTaskById(id);
                        System.out.println("Nombre actual: " + task.getName());
                        System.out.println("Descripción actual: " + task.getDescription());
                        System.out.println("Propietario actual: " + task.getOwner());
                        System.out.println("Estado actual: " + task.getStatus());

                        System.out.print("Nuevo nombre (ENTER para mantener el actual): ");
                        name = scanner.nextLine();
                        if (!name.isEmpty()) {
                            task.setName(name);
                        }

                        System.out.print("Nueva descripción (ENTER para mantener la actual): ");
                        description = scanner.nextLine();
                        if (!description.isEmpty()) {
                            task.setDescription(description);
                        }

                        System.out.print("Nuevo propietario (ENTER para mantener el actual): ");
                        owner = scanner.nextLine();
                        if (!owner.isEmpty()) {
                            task.setOwner(owner);
                        }

                        System.out.println("Estado actual: " + task.getStatus());
                        System.out.println("Selecciona nuevo estado (ENTER para mantener el actual):");
                        System.out.println("1. pending");
                        System.out.println("2. in_progress");
                        System.out.println("3. done");
                        System.out.print("Opción: ");

                        String option = scanner.nextLine();
                        if (!option.isEmpty()) {
                            switch (option) {
                                case "1":
                                    task.setStatus(Task.TaskStatus.pending);
                                    break;
                                case "2":
                                    task.setStatus(Task.TaskStatus.in_progress);
                                    break;
                                case "3":
                                    task.setStatus(Task.TaskStatus.done);
                                    break;
                                default:
                                    System.out.println("Opción no válida. Se mantiene el estado actual.");
                            }
                        }

                        taskService.updateTask(task);
                        System.out.println("Tarea actualizada correctamente.");

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al actualizar la tarea: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Has seleccionado: Eliminar tarea");
                    System.out.print("Introduce el ID de la tarea a eliminar: ");
                    id = scanner.nextInt();
                    scanner.nextLine();
                    try {
                        System.out.println("Tarea seleccionada:");
                        System.out.println(taskService.getTaskById(id));
                        System.out.print("¿Estás seguro de que deseas eliminar esta tarea? (s/n): ");
                        String confirmacion = scanner.nextLine();
                        if (confirmacion.equalsIgnoreCase("s")) {
                            taskService.deleteTask(id);
                            System.out.println("Tarea eliminada correctamente.");
                        } else {
                            System.out.println("Eliminación cancelada.");
                        }

                    } catch (IllegalArgumentException e) {
                        System.out.println("Error al eliminar la tarea: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }

            System.out.println();
        }

        scanner.close();
    }
}
