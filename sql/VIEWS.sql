-- VIEWS are virtual table based on result of queries from tables
-- Behaves like an actual table and updates changes automatically

-- Create VIEW from table 'party'
CREATE VIEW party_members_only AS
SELECT name, role FROM party;

-- Delete VIEW
DROP VIEW party_members_only;

SELECT * FROM party_members_only;