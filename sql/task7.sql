CREATE SCHEMA `human_friends` ;

USE human_friends;

DROP TABLE IF EXISTS animal;
CREATE TABLE animal
(
	id SERIAL PRIMARY KEY,
    subclass_name VARCHAR(20)
);

DROP TABLE IF EXISTS pet;
CREATE TABLE pet
(
	id SERIAL PRIMARY KEY,
    family_name VARCHAR(20)
)

DROP TABLE IF EXISTS dog;
CREATE TABLE dog
(
	id SERIAL PRIMARY KEY,
    dog_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

DROP TABLE IF EXISTS cat;
CREATE TABLE cat
(
	id SERIAL PRIMARY KEY,
    cat_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

DROP TABLE IF EXISTS hamster;
CREATE TABLE hamster
(
	id SERIAL PRIMARY KEY,
    hamster_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

DROP TABLE IF EXISTS horse;
CREATE TABLE horse
(
	id SERIAL PRIMARY KEY,
    horse_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

DROP TABLE IF EXISTS camel;
CREATE TABLE camel
(
	id SERIAL PRIMARY KEY,
    camel_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

DROP TABLE IF EXISTS donkey;
CREATE TABLE donkey
(
	id SERIAL PRIMARY KEY,
    donkey_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

INSERT INTO dog(dog_name, birth_date, commands)
VALUES 
('Bobik', '2014-11-06', 'sit, stand, eat'),
('Ceasar', '2023-12-21', 'stand, eat'),
('Chip', '2024-03-11', 'roll, eat'),
('Anda', '2021-08-10', 'sit, stand, rollback, eat'),
('Archie', '2020-10-27', 'sit, stand, beside, eat');

INSERT INTO cat(cat_name, birth_date, commands)
VALUES
('Kesha', '2014-06-15', 'meow, purr, eat'),
('Tisha', '2014-05-08', 'purr, eat'),
('Artie', '2022-07-29', 'meow, purr'),
('Smokey', '2023-12-10', 'meow, eat'),
('Axel', '2020-09-16', 'purr, eat');

INSERT INTO hamster(hamster_name, birth_date, commands)
VALUES
('Homa', '2020-08-12', 'eat, hrum'),
('Pups', '2019-12-09', 'eat, hrum'),
('Buch', '2021-01-19', 'eat, hrum'),
('Agath', '2022-06-12', 'eat, hrum'),
('Sirius', '2023-10-16', 'eat');

INSERT INTO horse(horse_name, birth_date, commands)
VALUES
('Babylon', '2016-08-30', 'eat, tprrr'),
('Spirit', '2017-04-21', 'hey!, tprrr, eat'),
('Volt', '2015-02-03', 'tprrr, eat, roll'),
('Star', '2013-09-22', 'tprrr, eat, hey!'),
('Mirage', '2022-05-16', 'eat, hey!, tprrr');

INSERT INTO camel(camel_name, birth_date, commands)
VALUES
('Ida', '2016-07-11', 'eat, yah!, ts-ts'),
('Twist', '2014-09-19', 'yah!, ts-ts, eat'),
('Jared', '2012-08-05', 'ts-ts, yah!, eat'),
('Maria', '2020-06-03', 'ts-ts, ta-ta, eat'),
('Lancelot', '2022-10-13', 'eat, ta-ta, yah!');

INSERT INTO donkey(donkey_name, birth_date, commands)
VALUES
('Dora', '2016-08-02', 'eat, move'),
('Damsel', '2020-09-11', 'eat, move'),
('Dune', '2023-08-15', 'move'),
('Roxy', '2024-01-19', 'eat'),
('Comma', '2021-12-17', 'eat, move');

TRUNCATE camel;

DROP TABLE IF EXISTS artiodactyl;
CREATE TABLE artiodactyl
(
    id SERIAL PRIMARY KEY,
    artiodactyl_name VARCHAR(20),
    birth_date DATE,
    commands TEXT
);

INSERT INTO artiodactyl(artiodactyl_name, birth_date, commands)
SELECT(horse_name, birth_date, commands)
FROM horse;

INSERT INTO artiodactyl(artiodactyl_name, birth_date, commands)
SELECT(donkey_name, birth_date, commands)
FROM donkey;

DROP TABLE IF EXISTS horse;
DROP TABLE IF EXISTS donkey;


