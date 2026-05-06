-- CONSTRAINT in tables sets specific conditions/rule for values inserted.
CREATE TABLE party (
    -- 'PRIMARY KEY' is limited to only one (1) per table, it has the property of UNIQUE and NOT NULL constraint
    -- 'AUTO_INCREMENT' can only be added along with key constraint and automatically up their value per added row.
    party_id INT PRIMARY KEY AUTO_INCREMENT,

    -- 'NOT NULL' must always have a value
    name VARCHAR(25) NOT NULL,

    -- 'UNIQUE' must not be duplicated
    role VARCHAR(50) UNIQUE,

    -- 'DEFAULT' can be used with other SQL functions like 'NOW()'
    -- Automatically have assigned values if value is not set
    has_superpowers BOOLEAN DEFAULT FALSE,
    created DATETIME DEFAULT NOW(),

    -- 'CHECK' must follow given statement
    -- Not adding 'CONSTRAINT' name auto-generates constraint name instead
    age INT,
    CONSTRAINT chk_age CHECK (age > 0),
    join_date DATE CHECK (join_date <= '1990-01-31'),
    CHECK (join_date >= '1980-01-31'),
    CONSTRAINT chk_join_date CHECK (join_date >= '1980-01-31'),

    -- 'FOREIGN KEY' references a key from another table like 'subject'
    -- SQL will prevent actions that destroy the link of the reference table
    subject_number INT,
    CONSTRAINT fk_subject_number FOREIGN KEY (subject_number) REFERENCES subject(subject_number),
    FOREIGN KEY (subject_number) REFERENCES subject(subject_number)
);

-- Adding constraints to an existing table
-- 'CONSTRAINT constraint_name' can be added after 'ADD' to customize constraint name
ALTER TABLE subject ADD PRIMARY KEY (subject_number); -- PRIMARY KEY
ALTER TABLE subject ADD UNIQUE(name); -- UNIQUE
ALTER TABLE subject ADD CHECK(height > 1.5) ; -- CHECK
ALTER TABLE party ADD FOREIGN KEY (subject_number) REFERENCES subject(subject_number);

ALTER TABLE subject MODIFY COLUMN powers BOOLEAN DEFAULT TRUE; -- DEFAULT
ALTER TABLE subject MODIFY COLUMN name VARCHAR(50) NOT NULL; -- NOT NULL
ALTER TABLE subject AUTO_INCREMENT = 001; -- Adjust 'AUTO_INCREMENT' starting point

-- Removing constraints from a table
ALTER TABLE party DROP CONSTRAINT party_chk_1;
ALTER TABLE party DROP CHECK party_chk_2;
ALTER TABLE party DROP FOREIGN KEY party_ibfk_1;

-- Sample Data
INSERT INTO party (name, age, join_date)
VALUES ('Mike', 12, '1980-02-12'),
       ('Dustin', 12, '1982-05-01'),
       ('Lucas', 12, '1980-02-12'),
       ('Will', 12, '1983-11-06');

INSERT INTO party (name, role, has_superpowers, age, subject_number)
VALUES ('Eleven', 'Mage', TRUE, 12, 011);