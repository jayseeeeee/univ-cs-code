-- CREATE DATABASE laboratoryExercise5;
CREATE TABLE movie (
    mov_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 901 INCREMENT BY 1),
    mov_title VARCHAR(50) NOT NULL,
    mov_year INT NOT NULL,
    mov_time INT NOT NULL,
    move_lang VARCHAR(50),
    mov_dt_rel DATE,
    mov_rel_country VARCHAR (10)
);

CREATE TABLE actor (
    act_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 101 INCREMENT BY 1),
    act_fname VARCHAR(50) NOT NULL,
    act_lname VARCHAR(50) NOT NULL,
    act_gender VARCHAR(2) NOT NULL
);

CREATE TABLE movie_cast (
    act_id INT NOT NULL,
    mov_id INT NOT NULL,
    role VARCHAR(100) NOT NULL,
    FOREIGN KEY (act_id) REFERENCES actor(act_id),
    FOREIGN KEY (mov_id) REFERENCES movie(mov_id)
);

CREATE TABLE genre (
    gen_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 1001 INCREMENT BY 1),
    gen_title VARCHAR (50)
);

CREATE TABLE movie_genres (
    mov_id INT NOT NULL,
    gen_id INT NOT NULL,
    FOREIGN KEY (mov_id) REFERENCES movie(mov_id),
    FOREIGN KEY (gen_id) REFERENCES genre(gen_id)
);

CREATE TABLE director (
    dir_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 201 INCREMENT BY 1),
    dir_fname VARCHAR(50) NOT NULL,
    dir_lname VARCHAR(50) NOT NULL
);

CREATE TABLE movie_director (
    dir_id INT NOT NULL,
    mov_id INT NOT NULL,
    FOREIGN KEY (dir_id) REFERENCES director(dir_id),
    FOREIGN KEY (mov_id) REFERENCES movie(mov_id)
);

CREATE TABLE reviewer (
    rev_id INT PRIMARY KEY GENERATED ALWAYS AS IDENTITY (START WITH 9001 INCREMENT BY 1),
    rev_name VARCHAR (50)
);

CREATE TABLE rating (
    mov_id INT NOT NULL,
    rev_id INT NOT NULL,
    rev_stars DECIMAL(3,2),
    num_o_ratings INT,
    FOREIGN KEY (mov_id) REFERENCES movie(mov_id),
    FOREIGN KEY (rev_id) REFERENCES reviewer(rev_id)
);

INSERT INTO movie (mov_title, mov_year, mov_time, move_lang, mov_dt_rel, mov_rel_country)
VALUES ('Vertigo', 1958, 128, 'English', '1958-08-24', 'UK'),
       ('The Innocents', 1961, 100, 'English', '1962-02-19', 'SW'),
       ('Lawrence of Arabia', 1962, 216, 'English', '1962-12-11', 'UK'),
       ('The Deer Hunter', 1978, 183, 'English', '1979-03-08', 'UK'),
       ('Amadeus', 1984, 160, 'English', '1985-01-07', 'UK'),
       ('Blade Runner', 1982, 117, 'English', '1982-09-09', 'UK'),
       ('Eyes Wide Shut', 1999, 159, 'English', NULL, 'UK'),
       ('The Usual Suspects', 1995, 106, 'English', '1995-08-25', 'UK'),
       ('Chinatown', 1974, 130, 'English', '1974-08-09', 'UK'),
       ('Boogie Nights', 1997, 155, 'English', '1998-02-16', 'UK'),
       ('Annie Hall', 1977, 93, 'English', '1977-04-20', 'USA'),
       ('Princess Mononoke', 1997, 134, 'Japanese', '2001-10-19', 'UK'),
       ('The Shawshank Redemption', 1994, 142, 'English', '1995-02-17', 'UK'),
       ('American Beauty', 1999, 122, 'English', NULL, 'UK'),
       ('Titanic', 1997, 194, 'English', '1998-01-23', 'UK'),
       ('Good Will Hunting', 1997, 126, 'English', '1998-06-03', 'UK'),
       ('Deliverance', 1972, 109, 'English', '1982-10-05', 'UK'),
       ('Trainspotting', 1996, 94, 'English', '1996-02-23', 'UK'),
       ('The Prestige', 2006, 130, 'English', '2006-11-10', 'UK'),
       ('Donnie Darko', 2001, 113, 'English', NULL, 'UK'),
       ('Slumdog Millionaire', 2008, 120, 'English', '2009-01-09', 'UK'),
       ('Aliens', 1986, 137, 'English', '1986-08-29', 'UK'),
       ('Beyond the Sea', 2004, 118, 'English', '2004-11-26', 'UK'),
       ('Avatar', 2009, 162, 'English', '2009-12-17', 'UK'),
       ('Seven Samurai', 1954, 207, 'Japanese', '1954-04-26', 'JP'),
       ('Spirited Away', 2001, 125, 'Japanese', '2003-09-12', 'UK'),
       ('Back to the Future', 1985, 116, 'English', '1985-12-04', 'UK'),
       ('Braveheart', 1995, 178, 'English', NULL, 'UK');

INSERT INTO actor (act_fname, act_lname, act_gender)
VALUES ('James', 'Stewart', 'M'),
       ('Deborah', 'Kerr', 'F'),
       ('Peter', 'OToole', 'M'),
       ('Robert', 'De Niro', 'M'),
       ('F. Murray', 'Abraham', 'M'),
       ('Harrison', 'Ford', 'M'),
       ('Nicole', 'Kidman', 'F'),
       ('Stephen', 'Baldwin', 'M'),
       ('Jack', 'Nicholson', 'M'),
       ('Mark', 'Wahlberg', 'M'),
       ('Woody', 'Allen', 'M'),
       ('Claire', 'Danes', 'F'),
       ('Tim', 'Robbins', 'M'),
       ('Kevin', 'Spacey', 'M'),
       ('Kate', 'Winslet', 'F'),
       ('Robin', 'Williams', 'M'),
       ('Jon', 'Voight', 'M'),
       ('Ewan', 'McGregor', 'M'),
       ('Christian', 'Bale', 'M'),
       ('Maggie', 'Gyllenhaal', 'F'),
       ('Dev', 'Patel', 'M'),
       ('Sigourney', 'Weaver', 'F'),
       ('David', 'Aston', 'M'),
       ('Ali', 'Astin', 'F');


INSERT INTO movie_cast (act_id, mov_id, role)
VALUES (101, 901, 'John Scottie Ferguson'),
       (102, 902, 'Miss Giddens'),
       (103, 903, 'T.E. Lawrence'),
       (104, 904, 'Michael'),
       (105, 905, 'Antonio Salieri'),
       (106, 906, 'Rick Deckard'),
       (107, 907, 'Alice Harford'),
       (108, 908, 'McManus'),
       (109, 909, 'J.J. Gittes'),
       (110, 910, 'Eddie Adams'),
       (111, 911, 'Alvy Singer'),
       (112, 912, 'San'),
       (113, 913, 'Andy Dufresne'),
       (114, 914, 'Lester Burnham'),
       (115, 915, 'Rose DeWitt Bukater'),
       (116, 916, 'Sean Maguire'),
       (117, 917, 'Ed'),
       (118, 918, 'Renton'),
       (119, 919, 'Alfred Borden'),
       (120, 920, 'Elizabeth Darko'),
       (121, 921, 'Older Jamal'),
       (122, 922, 'Ripley'),
       (114, 923, 'Bobby Darin');

INSERT INTO genre (gen_title)
VALUES ('Action'),
       ('Adventure'),
       ('Animation'),
       ('Biography'),
       ('Comedy'),
       ('Crime'),
       ('Drama'),
       ('Horror'),
       ('Music'),
       ('Mystery'),
       ('Romance'),
       ('Thriller'),
       ('War');

INSERT INTO movie_genres
VALUES (922, 1001),
       (917, 1002),
       (903, 1002),
       (912, 1003),
       (911, 1005),
       (908, 1006),
       (913, 1006),
       (926, 1007),
       (928, 1007),
       (918, 1007),
       (921, 1007),
       (902, 1008),
       (923, 1009),
       (907, 1010),
       (927, 1010),
       (901, 1010),
       (914, 1011),
       (906, 1012),
       (904, 1013);

INSERT INTO director (dir_fname, dir_lname)
VALUES ('Alfred', 'Hitchcock'),
       ('Jack', 'Clayton'),
       ('David', 'Lean'),
       ('Michael', 'Cimino'),
       ('Milos', 'Forman'),
       ('Ridley', 'Scott'),
       ('Stanley', 'Kubrick'),
       ('Bryan', 'Singer'),
       ('Roman', 'Polanski'),
       ('Paul', 'Thomas Anderson'),
       ('Woody', 'Allen'),
       ('Hayao', 'Miyazaki'),
       ('Frank', 'Darabont'),
       ('Sam', 'Mendes'),
       ('James', 'Cameron'),
       ('Gus', 'Van Sant'),
       ('John', 'Boorman'),
       ('Danny', 'Boyle'),
       ('Christopher', 'Nolan'),
       ('Richard', 'Kelly'),
       ('Kevin', 'Spacey'),
       ('Andrei', 'Tarkovsky'),
       ('Peter', 'Jackson');

INSERT INTO movie_director
VALUES (201, 901),
       (202, 902),
       (203, 903),
       (204, 904),
       (205, 905),
       (206, 906),
       (207, 907),
       (208, 908),
       (209, 909),
       (210, 910),
       (211, 911),
       (212, 912),
       (213, 913),
       (214, 914),
       (215, 915),
       (216, 916),
       (217, 917),
       (218, 918),
       (219, 919),
       (220, 920),
       (218, 921),
       (215, 922),
       (221, 923);

INSERT INTO reviewer(rev_name)
VALUES ('Righty Sock'),
       ('Jack Malvern'),
       ('Flagrant Baronessa'),
       ('Alec Shaw'),
       (NULL),
       ('Victor Woeltjen'),
       ('Simon Wright'),
       ('Neal Wruck'),
       ('Paul Monks'),
       ('Mike Salvati'),
       (NULL),
       ('Wesley S. Walker'),
       ('Sasha Goldshtein'),
       ('Josh Cates'),
       ('Krug Stillo'),
       ('Scott LeBrun'),
       ('Hannah Steele'),
       ('Vincent Cadena'),
       ('Brandt Sponseller'),
       ('Richard Adams');

INSERT INTO rating
VALUES (901, 9001, 8.40, 263575),
       (902, 9002, 7.90, 20207),
       (903, 9003, 8.30, 202778),
       (906, 9005, 8.20, 484746),
       (924, 9006, 7.30, NULL),
       (908, 9007, 8.60, 779489),
       (909, 9008, NULL, 227235),
       (910, 9009, 3.00, 195961),
       (911, 9010, 8.10, 203875),
       (912, 9011, 8.40, NULL),
       (914, 9013, 7.00, 862618),
       (915, 9001, 7.70, 830095),
       (916, 9014, 4.00, 642132),
       (925, 9015, 7.70, 81328),
       (918, 9016, NULL, 580301),
       (920, 9017, 8.10, 609451),
       (921, 9018, 8.00, 667758),
       (922, 9019, 8.40, 511613),
       (923, 9020, 6.70, 13091);

-- 1. Write a SQL query to find all reviewers whose ratings contain a NULL value.
-- Return reviewer name.
SELECT rev.rev_name
FROM rating rat
INNER JOIN reviewer rev
ON rat.rev_id = rev.rev_id
WHERE rat.rev_stars IS NULL OR rat.num_o_ratings IS NULL;

-- 2. Write a SQL query to find out who was cast in the movie 'Annie Hall'.
-- Return actor first name, last name and role.
SELECT a.act_fname, a.act_lname, mc.role
FROM actor a
INNER JOIN movie_cast mc
ON a.act_id = mc.act_id
INNER JOIN movie m
ON mc.mov_id = m.mov_id
WHERE m.mov_title = 'Annie Hall';

-- 3. Write a SQL query to find the director who directed a movie that featured a role in 'Eyes Wide Shut'.
-- Return director first name, last name and movie title.
SELECT d.dir_fname, d.dir_lname, m.mov_title
FROM director d
INNER JOIN movie_director md ON d.dir_id = md.dir_id
INNER JOIN movie m ON md.mov_id = m.mov_id
WHERE m.mov_title = 'Eyes Wide Shut';

-- 4. Write a SQL query to find the director of a movie that cast a role as Sean Maguire.
-- Return director first name, last name and movie title.
SELECT d.dir_fname, d.dir_lname
FROM director d
INNER JOIN movie_director md ON d.dir_id = md.dir_id
INNER JOIN movie_cast mc ON md.mov_id = mc.mov_id
WHERE mc.role = 'Sean Maguire';

-- 5. Write a SQL query to find out which actors have not appeared in any movies between 1990 and 2000 (Begin and end values are included.).
-- Return actor first name, last name, movie title and release year.
SELECT a.act_fname, a.act_lname, m.mov_title, m.mov_year
FROM actor a
INNER JOIN movie_cast mc ON a.act_id = mc.act_id
INNER JOIN movie m ON mc.mov_id = m.mov_id
WHERE m.mov_year NOT BETWEEN 1990 AND 2000;

-- 6. Write a SQL query to find the directors who have directed films in a variety of genres.
-- Group the result set on director first name, last name and generic title. Sort the result-set in ascending order by director first name and last name.
-- Return director first name, last name and number of genres movies.
SELECT d.dir_fname, d.dir_lname, COUNT(g.gen_title) AS no_of_genres
FROM director d
LEFT JOIN movie_director md
ON d.dir_id = md.dir_id
LEFT JOIN movie_genres mg on md.mov_id = mg.mov_id
LEFT JOIN genre g on g.gen_id = mg.gen_id
GROUP BY d.dir_fname, d.dir_lname, g.gen_title
ORDER BY d.dir_fname, d.dir_lname;

-- 7. Write a SQL query to find the movies with year and genres. Return movie title, movie year and generic title.
SELECT m.mov_title, m.mov_year, g.gen_title
FROM movie m
LEFT JOIN movie_genres mg ON m.mov_id = mg.mov_id
LEFT JOIN genre g ON mg.gen_id = g.gen_id;

-- 8. Write a SQL query to find the movies released before 1st January 1989.
-- Sort the result-set in descending order by date of release.
-- Return movie title, release year, date of release, duration, and first and last name of the director.
SELECT m.mov_title, m.mov_year, m.mov_dt_rel, m.mov_time, d.dir_fname, d.dir_lname
FROM movie m
LEFT JOIN movie_director md on m.mov_id = md.mov_id
LEFT JOIN director d on d.dir_id = md.dir_id
WHERE m.mov_dt_rel < '1989-1-1'
ORDER BY m.mov_dt_rel DESC;

-- 9. Write a SQL query to calculate the average movie length and count the number of movies in each genre.
-- Return genre title, average time and number of movies for each genre.
SELECT g.gen_title, AVG(m.mov_time) as average_time, COUNT(*) as no_of_movies
FROM movie m
INNER JOIN movie_genres mg on m.mov_id = mg.mov_id
INNER JOIN genre g on g.gen_id = mg.gen_id
GROUP BY gen_title;

-- 10. Write a SQL query to find the years in which a movie received a rating of 3 or 4. Sort the result in increasing order on movie year.
SELECT m.mov_title, m.mov_year
FROM movie m
INNER JOIN rating r on m.mov_id = r.mov_id
WHERE r.rev_stars BETWEEN 3 AND 4
ORDER BY m.mov_year