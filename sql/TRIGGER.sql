-- TRIGGER automatically runs query when another query happens

-- Create new trigger
CREATE TRIGGER update_subject_residence
BEFORE -- BEFORE, AFTER
UPDATE -- INSERT, DELETE, UPDATE
ON subject
FOR EACH ROW
IF NEW.is_alive IS FALSE THEN -- Use 'NEW' keyword if referring to the UPDATED value (OLD if referring to OUTDATED)
    SET NEW.residence = NULL;
END IF;

-- Show all triggers
SHOW TRIGGERS;

-- Remove trigger
DROP TRIGGER update_subject_residence;

-- Sample trigger event
UPDATE subject
SET is_alive = FALSE
WHERE subject_number = 8;