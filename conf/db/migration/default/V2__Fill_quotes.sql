INSERT INTO authors(name) VALUES ("Jacques Chirac");
INSERT INTO authors(name) VALUES ("Ghandi");

INSERT INTO contents(content, type, person, tense) VALUES ("dab", 4, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("pue", 4, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("dans ton cul", 3, NULL, NULL);

INSERT INTO quotes(quote, truequote, type, person, tense, author) VALUES ("Ta mère [...]", "Ta mère aime le sport", 4, 1, 1, 1);
INSERT INTO quotes(quote, truequote, type, person, tense, author) VALUES ("La loi du plus fort est [...]", "La loi du plus fort est toujours la meilleure", 3, NULL, NULL, 2);
