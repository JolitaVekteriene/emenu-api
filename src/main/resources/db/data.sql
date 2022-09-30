INSERT INTO PRODUCTS(id, name, description, genre, quantity, price)
VALUES ('48a95af7-8b83-4a08-8001-0f865db8ea26', 'Minecraft', 'The whole Minecraft PS4 world around you is made out of blocks, reality itself is made out of blocks! And the best part is that you can collect everything and use anything while building your own designs!', 'Adventure', 4, 29.99),
('15a95af7-8b83-4a08-8001-0f865db8ea27', 'Marvels Spider-Man', 'Spider-Man features the acrobatic abilities, improvisation and web-slinging that the wall-crawler is famous for. It’s Spider-Man unlike any you’ve played before', 'Action', 10, 24.99),
('ebdee4f9-5763-4afc-85ed-98b2fdefb35f', 'Worms Battleground', 'Worms™ Battlegrounds brings friends and families together in the noble pursuit of self‐improvement, world domination and exploding sheep.', 'Strategy', 9, 25),
('d06cb831-9427-41ee-adcc-271f7b02d626', 'Cars 3: Driven to Win', 'Play with over 20 customizable characters including Lightning McQueen, Jackson Storm, Cruz Ramirez and the next generation of racers in over 20 tracks set in iconic locations from the film such as Radiator Springs.', 'Racing', 5, 18.99),
('ef90aee5-5337-4ebf-899f-e2823271f8c5', 'FIFA 22', 'New ball physics reimagine every pass, shot, and goal, and explosive sprint lets you feel the acceleration of the game’s quickest players.', 'Sport', 2, 45.00),
('0e706d6b-31f1-4349-a49b-9aea3400db6a', 'Elden Ring', 'The Elden Ring, the source of the Erdtree, has been shattered. Marika is offspring, demigods all, claimed the shards of the Elden Ring and the mad taint of their newfound strength triggered a war: The Shattering.', 'Action', 14, 49.99),
('bb2db642-6681-4e96-bff9-d226d6384efb', 'Horizon Forbidden West', 'Explore distant lands, fight bigger and more awe-inspiring machines, and encounter astonishing new tribes as you return to the far-future, post-apocalyptic world of Horizon.', 'Action', 19, 29.99),
('abdee4f9-5763-4afc-85ed-98b2fdefb35d', 'Diablo III: Eternal Collection', 'Generations of gamers have battled the demonic hordes of Diablo, and now it’s your turn to take part in the action-RPG legacy.  Prepare yourself, mortal hero. The hellgates are opening.', 'Action', 1, 29.99);

INSERT INTO USERS(id, name, surname, username, email, country, city, street, post_code, phone, password)
VALUES ('97591abe-5108-4bc2-afaa-6bc6a339619c', 'test_user', 'test_user', 'user', 'user@gmail.com', 'LT', 'Vilnius', 'Savanoriu av.', 'LT-96555', '+37065285774', '{bcrypt}$2a$10$AsRCsrfh4423vjPr0xKpZeNpYixVcNtDpiGdM5xcIejUXOttH2jcu'), /*USER*/
       ('1c6eb4cd-b644-4932-8d88-ec97b3ba0b7b', 'test_admin', 'test_admin', 'admin', 'admin@gmail.com', 'LT', 'Kaunas', 'Kauno Str.', 'LT-57555', '+37065285666', '{bcrypt}$2a$10$9Ox9WgR8X5SD04lLSdCwJ.AITH/cAZmcZ9tMkqJUFYSc0krItXT9W'); /*admin*/

INSERT INTO ROLES(id, name)
VALUES ('7f74bb02-9f14-43ce-8b28-8c0c889d1558', 'USER'),
('25dde1c9-f740-46a7-a598-d62f37126950', 'ADMIN');

INSERT INTO USERS_ROLES(user_id, role_id)
VALUES ('97591abe-5108-4bc2-afaa-6bc6a339619c', '7f74bb02-9f14-43ce-8b28-8c0c889d1558'),
('1c6eb4cd-b644-4932-8d88-ec97b3ba0b7b', '7f74bb02-9f14-43ce-8b28-8c0c889d1558'),
('1c6eb4cd-b644-4932-8d88-ec97b3ba0b7b', '25dde1c9-f740-46a7-a598-d62f37126950');