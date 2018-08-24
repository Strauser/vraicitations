use truequotes;

CREATE TABLE IF NOT EXISTS authors (
    author_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255),

    PRIMARY KEY (author_id)
);

CREATE TABLE IF NOT EXISTS quotes (
    quote_id INT AUTO_INCREMENT NOT NULL,
    quote VARCHAR(2000),
    truequote VARCHAR(2000),
    author INT NOT NULL,

    PRIMARY KEY (quote_id),
    FOREIGN KEY (author) REFERENCES authors(author_id) ON DELETE CASCADE
);
