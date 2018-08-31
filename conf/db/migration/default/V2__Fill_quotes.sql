INSERT INTO authors(name) VALUES ("Jacques Chirac");
INSERT INTO authors(name) VALUES ("Ghandi");

INSERT INTO contents(content, type, person, tense) VALUES ("dab", 4, 3, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("pue", 4, 3, 1);

INSERT INTO contents(content, type, person, tense) VALUES ("dabait", 4, 3, 2);
INSERT INTO contents(content, type, person, tense) VALUES ("dabera", 4, 3, 3);
INSERT INTO contents(content, type, person, tense) VALUES ("as dabé", 4, 2, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("a dabé", 4, 3, 4);

INSERT INTO contents(content, type, person, tense) VALUES ("j'ai dabé", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("je suis rentré", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("j'ai effectué le dab", 1, 1, 4);

INSERT INTO contents(content, type, person, tense) VALUES ("dans ton cul", 3, NULL, NULL);

INSERT INTO quotes(quote, truequote, type, person, tense) VALUES ("Ta mère [...]", "Ta mère aime le sport", 4, 3, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense) VALUES ("Je suis venu, j'ai vu, [...]", "Je suis venu, j'ai vu, j'ai vaincu", 1, 1, 4);
INSERT INTO quotes(quote, truequote, type, person, tense) VALUES ("La loi du plus fort est [...]", "La loi du plus fort est toujours la meilleure", 3, NULL, NULL);
""