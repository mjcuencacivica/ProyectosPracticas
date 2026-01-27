-- ==========================================
-- TABLA TASKS
-- ==========================================
CREATE TABLE tasks (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    description TEXT,
    owner VARCHAR(50) NOT NULL,
    creation_date DATE NOT NULL,
    status ENUM('pending','in_progress','done') NOT NULL
);

-- ==========================================
-- CONSULTAS SQL
-- ==========================================

-- Insertar tarea
INSERT INTO tasks(name, description, owner, creation_date, status)
VALUES (?, ?, ?, ?, ?);

-- Buscar tarea por id
SELECT * FROM tasks WHERE id = ?;

-- Listar todas las tareas
SELECT * FROM tasks;

-- Actualizar tarea
UPDATE tasks
SET name = ?, description = ?, owner = ?, status = ?
WHERE id = ?;

-- Eliminar tarea
DELETE FROM tasks WHERE id = ?;