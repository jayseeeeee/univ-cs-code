-- Insert new row to table 'subject' by following column order of table
INSERT INTO subject
VALUES  (11, 'Jane', 'Ives', 1.65, '1971-06-07', '03:15:00', 'Telekinesis, Telepathy, Remote Viewing', TRUE, 'Three Waterfalls, Iceland', NULL, '{ "favorite_food": "Eggo waffles", "friends": ["Mike", "Dustin", "Lucas", "Will", "Max"] }', "Friends don't lie!"),
        (8, 'Kali', 'Prasad', 1.52, '1964-01-01', '05:45:00', 'Illusion Casting, Telepathy', TRUE, 'Chicago, Illinois', NULL, '{ "favorite_food": "Indian curry", "friends": ["Axel", "Mick", "Funshine", "Dottie"] }', "Don't cry Jane, my story was always going to end here. But yours doesn't have to.");

-- Insert new row and only fill specific column by specifying it (order does not matter)
INSERT INTO subject (subject_number, birth_date, residence, powers, is_alive)
VALUES (2, '1962-01-01', 'Hawkins, Indiana', 'Telekinesis', FALSE)