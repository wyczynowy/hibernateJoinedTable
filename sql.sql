create database animalsdb;

use animalsdb;

CREATE TABLE animals (
  animal_id bigint NOT NULL AUTO_INCREMENT,
  species varchar(45) NOT NULL,
  PRIMARY KEY (animal_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE pets (
  pet_id bigint NOT NULL,
  name varchar(45) NOT NULL,
  PRIMARY KEY (pet_id),
  FOREIGN KEY (pet_id) REFERENCES animals(animal_id)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;