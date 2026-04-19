-- Creates a new database
CREATE DATABASE myDatabase;

-- Use a database for editing
USE myDatabase;

-- Deletes a specified database
DROP DATABASE myDatabase;

-- Make database read only making it unmodifiable but still accessible
ALTER DATABASE myDatabase READ ONLY = 1;

-- Make database modifiable again
ALTER DATABASE myDatabase READ ONLY = 0;