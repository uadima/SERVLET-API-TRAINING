DROP DATABASE market;
CREATE DATABASE market;
USE market;

CREATE TABLE roles(
    id VARCHAR(36) NOT NULL,
    role_name VARCHAR(40) NOT NULL,
    PRIMARY KEY ( id )
);

INSERT INTO roles (id, role_name) values ("admin", "ADMIN");
INSERT INTO roles (id, role_name) values ("customer", "CUSTOMER");

CREATE TABLE users(
    id VARCHAR(36) NOT NULL,
    name VARCHAR(40) NOT NULL,
    surName VARCHAR(40) NOT NULL,
    psw VARCHAR(40) NOT NULL,
    role_id VARCHAR(36) NOT NULL,
    email VARCHAR(40) NOT NULL,
    PRIMARY KEY ( id ),
      FOREIGN KEY (role_id)
            REFERENCES roles(id)
            ON DELETE CASCADE
);

INSERT INTO users (id, name, surName, psw, role_id, email)
 values ("1", "Yevhenij", "Chornenkiy", "Admin123", "admin", "yevhenij.chornenkiy@gmail.com");
