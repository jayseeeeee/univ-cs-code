-- Updates all row with the specified data
UPDATE subject
SET birth_time = null;

-- Updates row that meet the specified condition with specified data
UPDATE subject
SET is_alive = NULL, residence = 'Three Waterfall Village, Iceland'
WHERE subject_number = 11;