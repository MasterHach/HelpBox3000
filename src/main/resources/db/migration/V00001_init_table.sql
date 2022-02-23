CREATE TABLE IF NOT EXISTS Users
(
    id SERIAL,
    email VARCHAR(120) PRIMARY KEY,
    password VARCHAR(255),
    name VARCHAR(32),
    surname VARCHAR(32),
    role VARCHAR(1)
);