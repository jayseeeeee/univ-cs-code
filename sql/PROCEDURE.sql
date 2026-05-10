-- STORED PROCEDURE is savable prepared SQL query

-- Create procedure
DELIMITER $$ -- Prevents semicolon conflict in some compiler by changing it temporarily
CREATE PROCEDURE get_party_subject()
BEGIN
    SELECT p.party_id, s.subject_number, s.name, s.powers, p.role FROM party AS p
    INNER JOIN subject AS s
    ON p.subject_number = s.subject_number;
END $$
DELIMITER ; -- Restore original delimiter

-- Create procedure with parameter
CREATE PROCEDURE get_party_name(IN id INT)
BEGIN
    SELECT * FROM party
    WHERE party_id = id;
END;

-- Create procedure with parameter
CREATE PROCEDURE get_party_name(IN id INT)
BEGIN
    SELECT * FROM party
    WHERE party_id = id;
END;

-- Create procedure with multiple parameter
CREATE PROCEDURE create_party_member(IN par_name VARCHAR(50), IN par_role VARCHAR(50), IN par_age INT, IN par_join_date DATE)
BEGIN
    INSERT INTO party (name, role, age, join_date)
    VALUES (par_name, par_role, par_age, par_join_date);
    SELECT * FROM party;
END;

-- Execute procedure
CALL get_party_subject();
CALL get_party_name(5);
CALL create_party_member('Max', 'Zoomer', 14, '1984-11-06');

-- Delete procedure
DROP PROCEDURE get_party_subject;
DROP PROCEDURE get_party_name;
DROP PROCEDURE create_party_member;