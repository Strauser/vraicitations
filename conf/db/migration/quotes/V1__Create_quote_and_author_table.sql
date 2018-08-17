CREATE DATABASE truequotes;

use truequotes;

CREATE TABLE authors (
    author_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    name VARCHAR(255)
);

CREATE TABLE quotes (
    quote_id INT PRIMARY KEY AUTO_INCREMENT NOT NULL,
    quote VARCHAR(2000),
    truequote VARCHAR(2000),
    author INT FOREIGN KEY REFERENCES authors(author_id)
);
