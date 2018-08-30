CREATE TABLE IF NOT EXISTS authors (
    author_id INT AUTO_INCREMENT NOT NULL,
    name VARCHAR(255),

    PRIMARY KEY (author_id)
);

CREATE TABLE IF NOT EXISTS contents (
    content_id INT AUTO_INCREMENT NOT NULL,
    content VARCHAR(2000),
    type VARCHAR(47) NOT NULL,
    person VARCHAR(47),
    tense VARCHAR(47),

    PRIMARY KEY (content_id)
);

CREATE TABLE IF NOT EXISTS quotes (
    quote_id INT AUTO_INCREMENT NOT NULL,
    quote VARCHAR(2000) NOT NULL,
    content INT NOT NULL,
    truequote VARCHAR(2000),
    author INT NOT NULL,

    PRIMARY KEY (quote_id),
    FOREIGN KEY (author) REFERENCES authors(author_id) ON DELETE CASCADE,
    FOREIGN KEY (content) REFERENCES contents(content_id)
);
