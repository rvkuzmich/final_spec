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