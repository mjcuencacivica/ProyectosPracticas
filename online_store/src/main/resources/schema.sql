
CREATE TABLE categories (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL);

CREATE TABLE products (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
description TEXT,
price DECIMAL(12, 2) NOT NULL,
stock INT NOT NULL,
category_id INT NOT NULL,
update_date DATETIME,
FOREIGN KEY (category_id) REFERENCES categories(id)
);
CREATE TABLE customers (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
first_name VARCHAR(50) NOT NULL,
last_name VARCHAR(50) NOT NULL,
email VARCHAR(50) UNIQUE,
phone VARCHAR(20) NOL NULL,
registration_date DATE NOT NULL,
active BOOLEAN
);
CREATE TABLE orders (
id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
customer_id INT NOT NULL,
order_date DATE NOT NULL,
status ENUM ('Pendiente', 'En_proceso', 'Enviado', 'Entregado') NOT NULL DEFAULT 'Pendiente',
total DECIMAL(65, 2) NOT NULL,
FOREIGN KEY (customer_id) REFERENCES customers(id)
);
CREATE TABLE order_details (
order_id INT NOT NULL,
product_id INT NOT NULL,
quantity INT NOT NULL,
unit_price DECIMAL (65, 2) NOT NULL,
PRIMARY KEY (order_id, product_id),
FOREIGN KEY (order_id) REFERENCES orders(id),
FOREIGN KEY (product_id) REFERENCES products(id)
);







