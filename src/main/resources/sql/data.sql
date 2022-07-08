insert into restaurant (id, name, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518200', 'Mensa Garching', 5.0, 2, 'hunger.tum.sexy', 7);

insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518200', 48.267873, 11.672376, '069f72db-2157-43de-8e88-21661b518200');

INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518200',
        parsedatetime('02-07-2022 13:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 17:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518200');



insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518100', '/serverFile/serverImages/corporateIdentity/logo.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518200', '/serverFile/serverImages/floorplan/table4-1.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518201', '/serverFile/serverImages/floorplan/table4-2.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518202', '/serverFile/serverImages/floorplan/table8-1.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518203', '/serverFile/serverImages/floorplan/floorplan-temporary.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518300', '/serverFile/serverImages/restaurant/mensa-außen-1.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518301', '/serverFile/serverImages/restaurant/mensa-außen-2.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518302', '/serverFile/serverImages/restaurant/mensa-außen-3.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518303', '/serverFile/serverImages/restaurant/mensa-innen-1.png');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518304', '/serverFile/serverImages/restaurant/mensa-innen-2.png');

// https://www.mockaroo.com/;
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE )
values ('069f72db-2157-43de-8e88-21661b518201', 'Cronin-Hagenes', 2, 2, 'www.tum.de', 5);
INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518201',
        parsedatetime('02-07-2022 14:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 17:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518201');
insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518201', 48.147154, 11.566124, '069f72db-2157-43de-8e88-21661b518201');

insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518202', 'Schultz, Abshire and Yost', 3, 3, 'www.tum.de', 2);
INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518202',
        parsedatetime('02-07-2022 15:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 17:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518202');
insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518202', 48.147154, 11.586124, '069f72db-2157-43de-8e88-21661b518202');

insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE )
values ('069f72db-2157-43de-8e88-21661b518203', 'Ferry-Steuber', 4, 1, 'www.tum.de', 0);
INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518203',
        parsedatetime('02-07-2022 13:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 18:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518203');
insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518203', 48.168154, 11.576124, '069f72db-2157-43de-8e88-21661b518203');

insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE
)
values ('069f72db-2157-43de-8e88-21661b518204', 'Balistreri-Quigley', 5, 2, 'www.google.de', 4);
INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518204',
        parsedatetime('02-07-2022 16:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 17:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518204');
insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518204', 48.157154, 11.556124, '069f72db-2157-43de-8e88-21661b518204');

insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Friesen-Brakus', 1, 3, 'www.google.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Haley Inc', 2, 1, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Haag, Zulauf and Davis', 3, 2, 'www.duckduckgo.com', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Wilderman, Gusikowski and Hahn', 4, 3, 'www.google.de', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Johnston LLC', 5, 1, 'www.tum.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Runte-Bode', 1, 2, 'www.duckduckgo.com', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hilpert Group', 2, 3, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Tremblay and Sons', 3, 1, 'www.tum.de', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Wiegand Inc', 4, 2, 'www.google.de', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hammes Inc', 5, 3, 'www.tum.de', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Borer, Casper and Denesik', 1, 1, 'www.google.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Kiehn Group', 2, 2, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Murazik and Sons', 3, 3, 'www.tum.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Corwin, Lesch and Parisian', 4, 1, 'www.tum.de', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Jerde and Sons', 5, 2, 'www.duckduckgo.com', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Goldner LLC', 1, 3, 'www.google.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hills-Kozey', 2, 1, 'www.tum.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Rolfson Group', 3, 2, 'www.google.de', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Bartell-Bernier', 4, 3, 'www.duckduckgo.com', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Lang, Ward and Adams', 5, 1, 'www.google.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Prosacco Group', 1, 2, 'www.duckduckgo.com', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Rice, Monahan and Abbott', 2, 3, 'www.duckduckgo.com', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('MacGyver-Rohan', 3, 1, 'www.tum.de', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Pagac-Nienow', 4, 2, 'www.duckduckgo.com', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Reichert LLC', 5, 3, 'www.google.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Jenkins LLC', 1, 1, 'www.google.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Torp-Marks', 2, 2, 'www.duckduckgo.com', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Kohler-Sipes', 3, 3, 'www.google.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Stiedemann, McKenzie and Stark', 4, 1, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hansen and Sons', 5, 2, 'www.google.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Metz-Roberts', 1, 3, 'www.duckduckgo.com', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Jerde Inc', 2, 1, 'www.duckduckgo.com', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Beier, Klein and Okuneva', 3, 2, 'www.duckduckgo.com', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Little LLC', 4, 3, 'www.tum.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Muller-Stanton', 5, 1, 'www.tum.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Roberts, Shanahan and Morar', 1, 2, 'www.google.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Sporer-Boyer', 2, 3, 'www.tum.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Grant-Cruickshank', 3, 1, 'www.duckduckgo.com', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hamill, Champlin and Quitzon', 4, 2, 'www.google.de', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Predovic, Kertzmann and Hansen', 5, 3, 'www.tum.de', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Ruecker, Stanton and Heathcote', 1, 1, 'www.google.de',7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Sauer Group', 2, 2, 'www.google.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Macejkovic, Senger and Torp', 3, 3, 'www.duckduckgo.com', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Runolfsson-O''Hara', 4, 1, 'www.tum.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Maggio, Gislason and Rogahn', 5, 2, 'www.tum.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Stanton, Towne and Herman', 1, 3, 'www.google.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hodkiewicz, Grady and Conn', 2, 1, 'www.tum.de', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('MacGyver-Lubowitz', 3, 2, 'www.google.de', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Marks, Parisian and Heathcote', 4, 3, 'www.duckduckgo.com', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Kihn-Bartoletti', 5, 1, 'www.tum.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Torphy-Cassin', 1, 2, 'www.tum.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Turcotte, Mueller and Fadel', 2, 3, 'www.google.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Ullrich, Larson and Hartmann', 3, 1, 'www.google.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Rowe-Dicki', 4, 2, 'www.tum.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Schultz Group', 5, 3, 'www.duckduckgo.com', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Paucek, Witting and Rogahn', 1, 1, 'www.google.de', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Rodriguez-Hessel', 2, 2, 'www.tum.de', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Kshlerin and Sons', 3, 3, 'www.duckduckgo.com', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Streich-Graham', 4, 1, 'www.duckduckgo.com', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Heaney Group', 5, 2, 'www.tum.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Gaylord-Powlowski', 1, 3, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Sporer and Sons', 2, 1, 'www.duckduckgo.com', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Mante and Sons', 3, 2, 'www.tum.de', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Gleason-Daniel', 4, 3, 'www.google.de', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Jast, Bayer and Hoppe', 5, 1, 'www.duckduckgo.com', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Powlowski, Marvin and Collins', 1, 2, 'www.tum.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('DuBuque-Huel', 2, 3, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Sauer, Jones and Bruen', 3, 1, 'www.tum.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hilpert Group', 4, 2, 'www.google.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Dicki, Beatty and Collier', 5, 3, 'www.tum.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Sawayn, Watsica and Gulgowski', 1, 1, 'www.duckduckgo.com', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Barton and Sons', 2, 2, 'www.google.de', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Streich Group', 3, 3, 'www.tum.de', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Gibson and Sons', 4, 1, 'www.google.de', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Metz, Schowalter and Thompson', 5, 2, 'www.google.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Swift Group', 1, 3, 'www.tum.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Considine-Prohaska', 2, 1, 'www.duckduckgo.com', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Hayes, Hilpert and Hodkiewicz', 3, 2, 'www.duckduckgo.com', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Gutkowski-Quitzon', 4, 3, 'www.duckduckgo.com', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Turner-Renner', 5, 1, 'www.tum.de', 0);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Bahringer Group', 1, 2, 'www.tum.de', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Grimes, Hudson and Goodwin', 2, 3, 'www.duckduckgo.com', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Kihn and Sons', 3, 1, 'www.tum.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Kozey-Morissette', 4, 2, 'www.duckduckgo.com', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Wiegand, Crist and West', 5, 3, 'www.tum.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Cassin and Sons', 1, 1, 'www.duckduckgo.com', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Abernathy Inc', 2, 2, 'www.duckduckgo.com', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Ankunding-Gerhold', 3, 3, 'www.tum.de', 8);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Deckow-Gerlach', 4, 1, 'www.tum.de', 7);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Upton, Leannon and Renner', 5, 2, 'www.duckduckgo.com', 6);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Grimes-Kautzer', 1, 3, 'www.google.de', 5);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Williamson LLC', 2, 1, 'www.tum.de', 4);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Nolan Group', 3, 2, 'www.tum.de', 3);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Bergnaum and Sons', 4, 3, 'www.google.de', 2);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Steuber and Sons', 5, 1, 'www.google.de', 1);
insert into restaurant (NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('Breitenberg Inc', 1, 2, 'www.duckduckgo.com', 0);


insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518300');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518301');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518302');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518303');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518304');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518201', '069f72db-2157-43de-8e88-21661b518304');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518202', '069f72db-2157-43de-8e88-21661b518302');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518203', '069f72db-2157-43de-8e88-21661b518303');
insert into RESTAURANT_IMAGES (RESTAURANT_ID, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518204', '069f72db-2157-43de-8e88-21661b518304');


insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518201', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518202', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518203', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518204', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518205', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518206', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518207', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518208', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518209', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518210', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518211', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');
insert into comment (id, rating, comment, name, restaurant_id)
values ('069f72db-2157-43de-8e88-21661b518212', 1, 'Super DB', 'DB-Admin', '069f72db-2157-43de-8e88-21661b518200');

insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518200', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518203',
        '069f72db-2157-43de-8e88-21661b518200');

insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518201', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518203',
        '069f72db-2157-43de-8e88-21661b518201');

insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518202', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518203',
        '069f72db-2157-43de-8e88-21661b518202');

insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518203', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518203',
        '069f72db-2157-43de-8e88-21661b518203');

insert into RESTAURANT_FLOOR_PLAN(ID, HEIGHT, WIDTH, IMAGE_ID, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518204', 600 * 2, 1000 * 2, '069f72db-2157-43de-8e88-21661b518203',
        '069f72db-2157-43de-8e88-21661b518204');


insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518200', 100 * 2, 100 * 2, 20 * 2, 20 * 2,
        '069f72db-2157-43de-8e88-21661b518200');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b518200', 3, '069f72db-2157-43de-8e88-21661b518200',
        '069f72db-2157-43de-8e88-21661b518200');


insert into reservation(ID, CONFIRMED, RESERVATION_FROM, RESERVATION_TO, USER_EMAIL, USER_NAME)
values ('069f72db-2157-43de-8e88-21661b518200', false,
        parsedatetime('10-06-2022 13:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('10-06-2022 13:30:00.000', 'dd-MM-yyyy hh:mm:ss.SS'), 'jonas.ladner@tum.de',
        'LadnerJonas');

insert into RESERVATION_RESTAURANT_TABLES(RESERVATION_ID, RESTAURANT_TABLES_ID)
values ('069f72db-2157-43de-8e88-21661b518200', '069f72db-2157-43de-8e88-21661b518200');


insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518201', 100 * 2, 100 * 2, 20 * 2, 250 * 2,
        '069f72db-2157-43de-8e88-21661b518201');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b518201', 3, '069f72db-2157-43de-8e88-21661b518200',
        '069f72db-2157-43de-8e88-21661b518201');

insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518202', 160 * 2, 100 * 2, 700 * 2, 50 * 2,
        '069f72db-2157-43de-8e88-21661b518202');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b518202', 3, '069f72db-2157-43de-8e88-21661b518200',
        '069f72db-2157-43de-8e88-21661b518202');

insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518203', 100 * 2, 100 * 2, 700 * 2, 300 * 2,
        '069f72db-2157-43de-8e88-21661b518201');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b518203', 3, '069f72db-2157-43de-8e88-21661b518200',
        '069f72db-2157-43de-8e88-21661b518203');

insert into TABLE_FLOOR_PLAN(ID, HEIGHT, WIDTH, X, Y, IMAGE_ID)
values ('069f72db-2157-43de-8e88-21661b518204', 100 * 2, 100 * 2, 700 * 2, 70 * 2,
        '069f72db-2157-43de-8e88-21661b518200');
insert into restaurant_table(id, seats, restaurant_id, FLOOR_PLAN_ID)
values ('069f72db-2157-43de-8e88-21661b518205', 3, '069f72db-2157-43de-8e88-21661b518204',
        '069f72db-2157-43de-8e88-21661b518204');


/*Restaurants*/
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY)
values ('069f72db-2157-43de-8e88-21661b518224', 'Test 1', 3.5, 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY)
values ('069f72db-2157-43de-8e88-21661b518226', 'Test 2', 2.4, 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE)
values ('069f72db-2157-43de-8e88-21661b518246' ,'Breitenberg Inc', 1, 2, 'www.duckduckgo.com');


/*Locations*/
insert into restaurant_location (ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518223', 48.187120304469374, 16.313691501443913,'069f72db-2157-43de-8e88-21661b518224');
insert into restaurant_location (ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518224', 48.26898700522353, 11.670421906144792,
        '069f72db-2157-43de-8e88-21661b518226');
insert into restaurant_location (ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2257-43de-8e88-21661b518225', 48.13747187109867, 11.575427029351456,'069f72db-2157-43de-8e88-21661b518246');


/*Tables*/
insert into restaurant_table (ID, SEATS ,RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518227', 5, '069f72db-2157-43de-8e88-21661b518226');
insert into restaurant_table (ID, SEATS ,RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518228', 7, '069f72db-2157-43de-8e88-21661b518226');
insert into restaurant_table (ID, SEATS ,RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518229', 6, '069f72db-2157-43de-8e88-21661b518224');
insert into restaurant_table (ID, SEATS ,RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518245', 4, '069f72db-2157-43de-8e88-21661b518246');

/*Reservation*/
insert into reservation (ID, RESERVATION_FROM, RESERVATION_TO, CONFIRMED)
values ('069f72db-2157-43de-8e88-21661b518230', '2008-01-01 10:00:01', '2008-01-02 11:00:01', true);

/*Reservation to Tables*/
insert into RESERVATION_RESTAURANT_TABLES (Reservation_ID, Restaurant_Tables_ID)
values ('069f72db-2157-43de-8e88-21661b518230', '069f72db-2157-43de-8e88-21661b518228');
