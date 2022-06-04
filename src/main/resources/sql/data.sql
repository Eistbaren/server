insert into restaurant (id, name, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, FLOOR_PLAN_ID, LOCATION_ID)
values ('069f72db-2157-43de-8e88-21661b518200', 'Mensa Garching', 5.0, 2, 'hunger.tum.sexy', null, null);

insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518201', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518202', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518203', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518204', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518205', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518206', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518207', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518208', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518209', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518210', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518211', 1, 'Super DB', 'DB-Admin');
insert into comments (id, rating, comment, name)
values ('069f72db-2157-43de-8e88-21661b518212', 1, 'Super DB', 'DB-Admin');

insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518201');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518202');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518203');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518204');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518205');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518206');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518207');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518208');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518209');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518210');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518211');
insert into RESTAURANT_COMMENTS (RESTAURANT_ID, COMMENTS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518212');

insert into reservation(ID, CONFIRMED, RESERVATION_FROM, RESERVATION_TO, USER_EMAIL, USER_NAME)
values ('069f72db-2157-43de-8e88-21661b518201', false, parsedatetime('08-06-2022 13:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'), parsedatetime('08-06-2022 13:30:00.000', 'dd-MM-yyyy hh:mm:ss.SS'), 'jonas.ladner@tum.de',
        'LadnerJonas');
insert into RESTAURANT_RESERVATIONS (RESTAURANT_ID, RESERVATIONS_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518201');

// https://www.mockaroo.com/
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Cronin-Hagenes', 2, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Schultz, Abshire and Yost', 3, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Ferry-Steuber', 4, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Balistreri-Quigley', 5, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Friesen-Brakus', 1, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Haley Inc', 2, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Haag, Zulauf and Davis', 3, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Wilderman, Gusikowski and Hahn', 4, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Johnston LLC', 5, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Runte-Bode', 1, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hilpert Group', 2, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Tremblay and Sons', 3, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Wiegand Inc', 4, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hammes Inc', 5, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Borer, Casper and Denesik', 1, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Kiehn Group', 2, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Murazik and Sons', 3, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Corwin, Lesch and Parisian', 4, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Jerde and Sons', 5, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Goldner LLC', 1, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hills-Kozey', 2, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Rolfson Group', 3, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Bartell-Bernier', 4, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Lang, Ward and Adams', 5, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Prosacco Group', 1, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Rice, Monahan and Abbott', 2, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('MacGyver-Rohan', 3, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Pagac-Nienow', 4, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Reichert LLC', 5, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Jenkins LLC', 1, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Torp-Marks', 2, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Kohler-Sipes', 3, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Stiedemann, McKenzie and Stark', 4, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hansen and Sons', 5, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Metz-Roberts', 1, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Jerde Inc', 2, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Beier, Klein and Okuneva', 3, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Little LLC', 4, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Muller-Stanton', 5, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Roberts, Shanahan and Morar', 1, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Sporer-Boyer', 2, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Grant-Cruickshank', 3, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hamill, Champlin and Quitzon', 4, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Predovic, Kertzmann and Hansen', 5, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Ruecker, Stanton and Heathcote', 1, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Sauer Group', 2, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Macejkovic, Senger and Torp', 3, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Runolfsson-O''Hara', 4, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Maggio, Gislason and Rogahn', 5, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Stanton, Towne and Herman', 1, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hodkiewicz, Grady and Conn', 2, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('MacGyver-Lubowitz', 3, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Marks, Parisian and Heathcote', 4, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Kihn-Bartoletti', 5, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Torphy-Cassin', 1, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Turcotte, Mueller and Fadel', 2, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Ullrich, Larson and Hartmann', 3, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Rowe-Dicki', 4, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Schultz Group', 5, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Paucek, Witting and Rogahn', 1, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Rodriguez-Hessel', 2, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Kshlerin and Sons', 3, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Streich-Graham', 4, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Heaney Group', 5, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Gaylord-Powlowski', 1, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Sporer and Sons', 2, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Mante and Sons', 3, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Gleason-Daniel', 4, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Jast, Bayer and Hoppe', 5, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Powlowski, Marvin and Collins', 1, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('DuBuque-Huel', 2, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Sauer, Jones and Bruen', 3, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hilpert Group', 4, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Dicki, Beatty and Collier', 5, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Sawayn, Watsica and Gulgowski', 1, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Barton and Sons', 2, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Streich Group', 3, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Gibson and Sons', 4, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Metz, Schowalter and Thompson', 5, 2, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Swift Group', 1, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Considine-Prohaska', 2, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Hayes, Hilpert and Hodkiewicz', 3, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Gutkowski-Quitzon', 4, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Turner-Renner', 5, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Bahringer Group', 1, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Grimes, Hudson and Goodwin', 2, 3, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Kihn and Sons', 3, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Kozey-Morissette', 4, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Wiegand, Crist and West', 5, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Cassin and Sons', 1, 1, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Abernathy Inc', 2, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Ankunding-Gerhold', 3, 3, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Deckow-Gerlach', 4, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Upton, Leannon and Renner', 5, 2, 'www.duckduckgo.com');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Grimes-Kautzer', 1, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Williamson LLC', 2, 1, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Nolan Group', 3, 2, 'www.tum.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Bergnaum and Sons', 4, 3, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Steuber and Sons', 5, 1, 'www.google.de');
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('Breitenberg Inc', 1, 2, 'www.duckduckgo.com');
