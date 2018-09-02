INSERT INTO authors(name) VALUES ("Jacques Chirac");
INSERT INTO authors(name) VALUES ("Ghandi");
INSERT INTO authors(name) VALUES ("Les frères Bogdanov");
INSERT INTO authors(name) VALUES ("Emy Whinehouse");
INSERT INTO authors(name) VALUES ("Johny Halliday");
INSERT INTO authors(name) VALUES ("Vercingetorix");
INSERT INTO authors(name) VALUES ("José Einstein");
INSERT INTO authors(name) VALUES ("Jean-Michel");
INSERT INTO authors(name) VALUES ("Nabilla");
INSERT INTO authors(name) VALUES ("Mamie");

INSERT INTO true_authors(name) VALUES ("Jules Caesar");
INSERT INTO true_authors(name) VALUES ("Jean de la Fontaine");
INSERT INTO true_authors(name) VALUES ("Descartes");
INSERT INTO true_authors(name) VALUES ("Platon");
INSERT INTO true_authors(name) VALUES ("Confiscius");
INSERT INTO true_authors(name) VALUES ("Jean-Jacques Rousseau");

INSERT INTO contents(content, type, person, tense) VALUES ("dab", 4, 3, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("pue", 4, 3, 1);

INSERT INTO contents(content, type, person, tense) VALUES ("dabait", 4, 3, 2);
INSERT INTO contents(content, type, person, tense) VALUES ("dabera", 4, 3, 3);
INSERT INTO contents(content, type, person, tense) VALUES ("a dabé", 4, 3, 4);

INSERT INTO contents(content, type, person, tense) VALUES ("daber", 4, NULL, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("puer", 4, NULL, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("parler avec des plantes", 4, NULL, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("se masturber", 4, NULL, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("boire jusqu'au comas éthylique", 4, NULL, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("se remonter discrètement les boules", 4, 3, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("vous remonter discrètement les boules", 4, 5, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("nous remonter discrètement les boules", 4, 5, 5);
INSERT INTO contents(content, type, person, tense) VALUES ("faire du poney", 4, NULL, 5);

INSERT INTO contents(content, type, person, tense) VALUES ("je dab", 1, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("je vole des vêtements dans les points relais", 1, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("j'écoute le dernier single de Laurie", 1, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("je teste la chute sans parachute", 1, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("je meurs instantanément", 1, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("je t'invite à insérer ton opinion dans ton cul", 1, 1, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("j'enfile des perles", 1, 1, 1);

INSERT INTO contents(content, type, person, tense) VALUES ("j'avais poney", 1, 1, 2);
INSERT INTO contents(content, type, person, tense) VALUES ("je matais un film de cul", 1, 1, 2);

INSERT INTO contents(content, type, person, tense) VALUES ("j'ai dabé", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("j'ai bu", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("je suis rentré", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("j'ai effectué le dab", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("je me suis auto-installé en position latérale de sécurité", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("je me suis discrètement passé le doigt dans le sillon inter-fessier", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("je me suis maté un film de boule", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("j'ai démoulé un cake", 1, 1, 4);
INSERT INTO contents(content, type, person, tense) VALUES ("je me suis chié dessus", 1, 1, 4);

INSERT INTO contents(content, type, person, tense) VALUES ("vous soyez envoyé en prison", 1, 4, 6);
INSERT INTO contents(content, type, person, tense) VALUES ("vous la fermiez", 1, 4, 6);
INSERT INTO contents(content, type, person, tense) VALUES ("vous deveniez le meilleur dresseur de pokemon", 1, 4, 6);
INSERT INTO contents(content, type, person, tense) VALUES ("vous puissiez gagner une entrée gratuite à l'année à la piscine", 1, 4, 6);

INSERT INTO contents(content, type, person, tense) VALUES ("se masse les couilles", 6, 3, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("se met en PLS", 6, 3, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("se chatouille le trou de balle", 6, 3, 1);

INSERT INTO contents(content, type, person, tense) VALUES ("te masse les couilles", 6, 2, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("te met en PLS", 6, 2, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("te chatouille le trou de balle", 6, 2, 1);

INSERT INTO contents(content, type, person, tense) VALUES ("se massent les couilles", 6, 6, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("se mettent en PLS", 6, 6, 1);
INSERT INTO contents(content, type, person, tense) VALUES ("se chatouillent le trou de balle", 6, 3, 1);

INSERT INTO contents(content, type, person, tense) VALUES ("dans ton cul", 3, NULL, NULL);
INSERT INTO contents(content, type, person, tense) VALUES ("à la piscine", 3, NULL, NULL);
INSERT INTO contents(content, type, person, tense) VALUES ("ailleurs", 3, NULL, NULL);
INSERT INTO contents(content, type, person, tense) VALUES ("dans ta gueule", 3, NULL, NULL);
INSERT INTO contents(content, type, person, tense) VALUES ("chez mémé", 3, NULL, NULL);

INSERT INTO contents(content, type, person, tense) VALUES ("les frères Bogdanov", 5, 6, NULL);
INSERT INTO contents(content, type, person, tense) VALUES ("ta mère", 5, 3, NULL);
INSERT INTO contents(content, type, person, tense) VALUES ("Jacques Chirac", 5, 3, NULL);

INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Ta mère [...].", "Ta mère...", 4, 3, NULL, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Je suis venu, j'ai vu, [...].", "Je suis venu, j'ai vu, j'ai vaincu.", 1, 1, 4, 1);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("La loi du plus fort est toujours [...].", "La loi du plus fort est toujours la meilleure.", 3, NULL, NULL, 2);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Mieux vaut tard que [...].", "Mieux vaut tard que jamais.", 3, NULL, NULL, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Je pense donc [...].", "Je pense donc je suis.", 1, 1, 1, 3);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("L'homme est un loup pour [...].", "L'homme est un loup pour l'homme.", 5, NULL, NULL, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Si tu n’es pas [...], tu dois vivre comme si tu voulais être [...].", "Si tu n’es pas Socrate, tu dois vivre comme si tu voulais être Socrate.", 5, NULL, NULL, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Choisissez un travail que vous aimez et vous n'aurez pas à [...] un seul jour de votre vie.", "Choisissez un travail que vous aimez et vous n'aurez pas à travailler un seul jour de votre vie.", 4, 5, 5, 5);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Notre plus grande gloire n'est point de tomber, mais de [...].", "Notre plus grande gloire n'est point de tomber, mais de savoir nous relever chaque fois que nous tombons.", 4, 4, 5, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Je ne suis pas d’accord avec ce que vous dites, mais je me battrai jusqu’à la mort pour que [...].", "Je ne suis pas d’accord avec ce que vous dites, mais je me battrai jusqu’à la mort pour que vous ayez le droit de le dire.", 1, 4, 6, 6);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Aimer, ce n'est pas se regarder l'un l'autre, c'est [...].", "Aimer, ce n'est pas se regarder l'un l'autre, c'est regarder ensemble dans la même direction.", 4, 3, 5, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Le secret ça n'est pas de faire ce que l'on aime, mais de [...].", "Le secret ça n'est pas de faire ce que l'on aime, mais d'aimer ce que l'on fait.", 4, 3, 5, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Il faut souffrir pour [...].", "Il faut souffrir pour être belle.", 4, 3, 5, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Il faut [...] pour être belle.", "Il faut souffrir pour être belle.", 4, 3, 5, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Je ne cherche pas à connaître les réponses, je cherche à [...].", "Je ne cherche pas à connaître les réponses, je cherche à comprendre les questions.", 4, 1, 5, 5);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Qui va à la chasse [...].", "Qui va à la chasse perd sa place.", 6, 3, 1, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("L'avenir appartient à ceux qui [...] !", "L'avenir appartient à ceux qui se lèvent tôt !", 6, 6, 1, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Ce qui ne te tue pas [...].", "Ce qui ne te tue pas te rend plus fort.", 6, 2, 1, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Qui vivra, [...].", "Qui vivra, verra.", 4, 3, 3, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Quand le chat n'est pas là, [...].", "Quand le chat n'est pas là, les souris dansent.", 1, NULL, 1, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Je pouvais pas, [...].", "Je pouvais pas...", 1, NULL, 2, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Comme le dirait [...], \"On s'en bat les couilles\"", "Comme le dirait Farid, \"On s'en bat les couilles\"", 5, 3, NULL, NULL);
INSERT INTO quotes(quote, truequote, type, person, tense, true_author)
    VALUES ("Quand l'apétit va [...]", "Quand l'apétit va tout va", 1, NULL, 1, NULL);


--"Mange ta main et garde l'autre pour demain"
--"Qui vole un oeuf vole un boeuf"
--"L'apétit vient en mangeant"
--"J'ai bien mangé et j'ai bien bu, j'ai la peau du ventre bien tendue"
--"Trouver chaussure à son pied"
--"C'est celui qui dit qui y est"
--"Ne fait pas aux autres ce que tu ne voudrait pas qu'on te fasse"
--"Qui s'endort avec le cul qui gratte, se réveille avec le doigt qui pue"
--"Croustibat, qui peut te battre"
--"Les produits laitiers, des sensations pures"
--"Qui sème le vent, récolte la tempete"
--"Tu t'es vu quand t'as bu ?"
--"Si ce n'est toi c'est donc ton frère"
--"Les chiens ne font pas des chats"
--"Résiste ! Prouve que tu existe !"
--"Excité comme une puce."
--"Se la couler douce."
--"Être beau comme un camion."
--"Donner sa langue au chat."
--"S'en mordre les doigts."
--"Tout vient à point à qui sait attendre."
--"Rien ne sert de courir, il faut partir à temps."
--"Boire ou conduire, il faut choisir."
--"A plus dans l'bus."
--"A bientôt dans l'métro."
--"Tout ce qui est petit est mignon."
