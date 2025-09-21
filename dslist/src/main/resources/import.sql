INSERT INTO tb_game (title, game_year, genre, platform, img_url, short_description, long_description, score) VALUES ('The Legend of Zelda', 1986, 'Adventure', 'NES', 'https://example.com/zelda.jpg', 'A classic adventure game', 'The Legend of Zelda is a high fantasy action-adventure game series created by Nintendo.', 0.0);

INSERT INTO tb_game (title, game_year, genre, platform, img_url, short_description, long_description, score) VALUES ('Fortnite', 2017, 'Battle Royale', 'PC', 'https://example.com/fortnite.jpg', 'Online survival game', 'Fortnite is an online video game developed by Epic Games focusing on building and combat in a last-player-standing environment.', 0.0);

INSERT INTO tb_game (title, game_year, genre, platform, img_url, short_description, long_description, score) VALUES ('The Witcher 3: Wild Hunt', 2015, 'RPG', 'PC', 'https://example.com/witcher3.jpg', 'Epic fantasy RPG', 'The Witcher 3: Wild Hunt is an action role-playing game developed by CD Projekt, set in a vast open world.', 0.0);

INSERT INTO tb_game (title, game_year, genre, platform, img_url, short_description, long_description, score) VALUES ('Among Us', 2018, 'Party', 'PC', 'https://example.com/amongus.jpg', 'Social deduction game', 'Among Us is a multiplayer game where players work together and against each other to complete tasks and identify impostors.', 0.0);

INSERT INTO tb_gamelist (name) VALUES ('Minha Lista de Favoritos');
INSERT INTO tb_gamelist (name) VALUES ('Jogos Clássicos');
INSERT INTO tb_gamelist (name) VALUES ('Jogos Recentes de Aventura');
INSERT INTO tb_gamelist (name) VALUES ('Jogos para Jogar com Amigos');
INSERT INTO tb_gamelist (name) VALUES ('RPG para Fim de Semana');

INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (1, 2, 0);
INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (2, 2, 1);
INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (3, 3, 0);
INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (3, 1, 0);
INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (4, 4, 0);


INSERT INTO tb_game (title, game_year, genre, platform, img_url, short_description, long_description, score) VALUES ('Super Mario Bros', 1985, 'Platform', 'NES', 'https://example.com/mario.jpg','Clássico de plataforma', 'Super Mario Bros é um jogo de plataforma desenvolvido pela Nintendo.', 0.0);

INSERT INTO tb_game (title, game_year, genre, platform, img_url, short_description, long_description, score) VALUES ('Minecraft', 2011, 'Sandbox', 'PC', 'https://example.com/minecraft.jpg','Jogo sandbox', 'Minecraft é um jogo de construção em um mundo aberto feito pela Mojang.', 0.0);

INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (5, 2, 2);
INSERT INTO tb_belonging (game_id, game_list_id, position) VALUES (6, 2, 3);
