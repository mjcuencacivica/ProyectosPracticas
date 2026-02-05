INSERT INTO categories (name) VALUES ('Electrónica');
INSERT INTO categories (name) VALUES ('Hogar');
INSERT INTO categories (name) VALUES ('Textil');
INSERT INTO categories (name) VALUES ('Alimentación');

-- Electrónica
INSERT INTO products (name, description, price, stock, category_id) VALUES 
('Portatil MSI 15¨','Portatil MSI de 15 pulgadas, 1Gb de RAM, i7, Windows 11.',895.95,10,1),
('Smartphone Samsung S23','Smartphone Samsung Galaxy S23, 128GB, 8GB RAM, Android 13.',799.99,20,1),
('Auriculares Bluetooth Sony','Auriculares inalámbricos Sony con cancelación de ruido.',149.95,30,1),
('Tablet iPad 10ª Gen','iPad de 10ª generación, 64GB, pantalla 10.9 pulgadas.',599.99,15,1),
('Smartwatch Garmin','Reloj inteligente Garmin con GPS y pulsómetro.',249.95,25,1);

-- Hogar
INSERT INTO products (name, description, price, stock, category_id) VALUES 
('Freidora de aire','Freidora de aire 1200W 2L',89.99,12,2),
('Cafetera DLongui Smart','Cafetera eléctrica marca DLongui de 1 litro, inteligente con varios modos de café.',120,15,2),
('Lámpara de mesa LED','Lámpara de mesa con luz LED regulable.',35.50,40,2),
('Aspiradora Robot','Robot aspirador inteligente con sensor de obstáculos.',299.99,10,2),
('Plancha vapor','Plancha a vapor con sistema anti-goteo y 2000W.',45.99,20,2),
('Juego de ollas 5 piezas','Juego de ollas de acero inoxidable 5 piezas.',79.99,15,2),
('Extractor de jugos','Extractor de jugos eléctrico con 2 velocidades.',89.99,12,2),
('Humidificador ultrasónico','Humidificador de ambiente ultrasónico 1.5L.',34.95,25,2);

-- Textil
INSERT INTO products (name, description, price, stock, category_id) VALUES 
('Toalla baño bebé', 'Toalla 60*70', 10, 25, 3),
('Toalla deportiva', 'Toalla de microfibra 60*60', 8, 15, 3),
('Alfombra baño', 'Alfombra baño algodón 30*30', 5, 50, 3),
('Juego de sábanas 150x200','Juego de sábanas de algodón para cama individual.',25.99,30,3),
('Cojín decorativo','Cojín cuadrado de 40x40cm para sofá.',12.50,50,3),
('Manta polar 130x180','Manta suave de polar para sofá o cama.',18.75,40,3),
('Cortina baño','Cortina de baño poliéster 180x180 cm.',15.00,25,3),
('Alfombra cocina','Alfombra de cocina antideslizante 50x70cm.',12.99,20,3),
('Alfombra sala 120x180','Alfombra de sala moderna 120x180cm.',45.50,20,3),
('Cortina sala 140x200','Cortina para sala poliéster 140x200cm.',28.75,25,3);

-- Alimentación
INSERT INTO products (name, description, price, stock, category_id) VALUES 
('Aceite de Oliva Virgen Extra 5L','Garrafa aceite virgen extra marca La Masía de 5 litros.',18.95,50,4),
('Arroz SOS 1kg','Paquete de arroz marca SOS 1kg',1.90,120,4),
('Leche Entera 1L','Leche fresca entera pasteurizada 1 litro.',1.20,100,4),
('Pan de Molde 500g','Pan de molde integral de 500 gramos.',2.10,80,4),
('Huevos de gallina 12u','Docena de huevos frescos de gallina.',3.50,60,4),
('Queso Manchego 250g','Queso manchego curado 250 gramos.',5.95,30,4),
('Tomate Raff','Caja de 1kg de tomates frescos tipo Raff.',2.50,50,4),
('Galletas integrales','Paquete 200g de galletas integrales.',2.30,70,4),
('Cereal Cornflakes','Caja 500g de cereal Cornflakes.',3.10,60,4),
('Miel natural 250g','Tarro 250g de miel natural pura.',4.50,40,4),
('Pasta espagueti 500g','Paquete de pasta espagueti marca Barilla 500g.',1.75,80,4),
('Salsa de tomate 350g','Tarro de salsa de tomate natural 350g.',2.20,60,4),
('Chocolate negro 100g','Tableta de chocolate negro 70% cacao 100g.',1.50,100,4);

INSERT INTO customers (first_name, last_name, email, phone, registration_date, active) VALUES
('Juan', 'Pérez', 'juan.perez@email.com', '600123456', '2025-12-01', TRUE),
('María', 'Gómez', 'maria.gomez@email.com', '600234567', '2025-11-15', TRUE),
('Carlos', 'López', 'carlos.lopez@email.com', '600345678', '2025-10-20', TRUE),
('Ana', 'Martínez', 'ana.martinez@email.com', '600456789', '2025-12-05', FALSE),
('Lucía', 'Sánchez', 'lucia.sanchez@email.com', '600567890', '2025-11-30', TRUE),
('David', 'Ramírez', 'david.ramirez@email.com', '600678901', '2025-12-02', TRUE),
('Laura', 'Torres', 'laura.torres@email.com', '600789012', '2025-12-01', TRUE),
('Javier', 'Hernández', 'javier.hernandez@email.com', '600890123', '2025-11-25', TRUE);

INSERT INTO orders (customer_id, order_date, status, total) VALUES
(1, '2026-01-10', 'Pendiente', 945.90),
(2, '2026-01-08', 'Enviado', 299.99),
(3, '2026-01-09', 'En_proceso', 120.00),
(4, '2026-01-11', 'Entregado', 79.99),
(5, '2026-01-12', 'Pendiente', 49.95),
(6, '2026-01-10', 'En_proceso', 154.95),
(7, '2026-01-13', 'Pendiente', 1.90),
(8, '2026-01-14', 'Enviado', 45.50);

INSERT INTO order_details (order_id, product_id, quantity, unit_price) VALUES
(2, 1, 1, 895.95),
(2, 3, 1, 149.95),
(3, 8, 1, 299.99),
(3, 6, 1, 120.00),
(4, 6, 1, 79.99),
(5, 3, 1, 45.95),
(5, 10, 1, 4.00),
(6, 3, 1, 149.95),
(6, 4, 1, 5.00),
(7, 2, 1, 1.90),
(8, 9, 1, 45.50);
