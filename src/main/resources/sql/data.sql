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
values ('069f72db-2157-43de-8e88-21661b518200', '/serverFile/serverImages/floorplan/table4-1.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518201', '/serverFile/serverImages/floorplan/table4-2.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518202', '/serverFile/serverImages/floorplan/table8-1.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518203', '/serverFile/serverImages/floorplan/floorplan-temporary.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518300', '/serverFile/serverImages/restaurant/mensa-außen-1.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518301', '/serverFile/serverImages/restaurant/mensa-außen-2.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518302', '/serverFile/serverImages/restaurant/mensa-außen-3.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518303', '/serverFile/serverImages/restaurant/mensa-innen-1.webp');
insert into IMAGE (ID, IMAGEURL)
values ('069f72db-2157-43de-8e88-21661b518304', '/serverFile/serverImages/restaurant/mensa-innen-2.webp');

-- https://www.mockaroo.com/;
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
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

insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518203', 'Ferry-Steuber', 4, 1, 'www.tum.de', 0);
INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518203',
        parsedatetime('02-07-2022 13:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 18:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518203');
insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518203', 48.168154, 11.576124, '069f72db-2157-43de-8e88-21661b518203');

insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518204', 'Balistreri-Quigley', 5, 2, 'www.google.de', 4);
INSERT INTO TIMESLOT
values ('069f72db-2157-43de-8e98-21661b518204',
        parsedatetime('02-07-2022 16:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        parsedatetime('03-07-2022 17:00:00.000', 'dd-MM-yyyy hh:mm:ss.SS'),
        '069f72db-2157-43de-8e88-21661b518204');
insert into RESTAURANT_LOCATION(ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518204', 48.157154, 11.556124, '069f72db-2157-43de-8e88-21661b518204');

-- fully generated
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518501', 'Friesen-Brakus', 1, 3, 'www.google.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518502', 'Haley Inc', 2, 1, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518503', 'Haag, Zulauf and Davis', 3, 2, 'www.duckduckgo.com', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518504', 'Wilderman, Gusikowski and Hahn', 4, 3, 'www.google.de', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518505', 'Johnston LLC', 5, 1, 'www.tum.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518506', 'Runte-Bode', 1, 2, 'www.duckduckgo.com', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518507', 'Hilpert Group', 2, 3, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518508', 'Tremblay and Sons', 3, 1, 'www.tum.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518509', 'Wiegand Inc', 4, 2, 'www.google.de', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518510', 'Hammes Inc', 5, 3, 'www.tum.de', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518511', 'Borer, Casper and Denesik', 1, 1, 'www.google.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518512', 'Kiehn Group', 2, 2, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518513', 'Murazik and Sons', 3, 3, 'www.tum.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518514', 'Corwin, Lesch and Parisian', 4, 1, 'www.tum.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518515', 'Jerde and Sons', 5, 2, 'www.duckduckgo.com', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518516', 'Hills-Kozey', 2, 1, 'www.tum.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518517', 'Rolfson Group', 3, 2, 'www.google.de', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518518', 'Bartell-Bernier', 4, 3, 'www.duckduckgo.com', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518519', 'Lang, Ward and Adams', 5, 1, 'www.google.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518520', 'Prosacco Group', 1, 2, 'www.duckduckgo.com', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518521', 'Rice, Monahan and Abbott', 2, 3, 'www.duckduckgo.com', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518522', 'MacGyver-Rohan', 3, 1, 'www.tum.de', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518523', 'Pagac-Nienow', 4, 2, 'www.duckduckgo.com', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518524', 'Reichert LLC', 5, 3, 'www.google.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518525', 'Jenkins LLC', 1, 1, 'www.google.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518526', 'Torp-Marks', 2, 2, 'www.duckduckgo.com', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518527', 'Kohler-Sipes', 3, 3, 'www.google.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518528', 'Stiedemann, McKenzie and Stark', 4, 1, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518529', 'Hansen and Sons', 5, 2, 'www.google.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518530', 'Metz-Roberts', 1, 3, 'www.duckduckgo.com', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518531', 'Jerde Inc', 2, 1, 'www.duckduckgo.com', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518532', 'Beier, Klein and Okuneva', 3, 2, 'www.duckduckgo.com', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518533', 'Little LLC', 4, 3, 'www.tum.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518534', 'Muller-Stanton', 5, 1, 'www.tum.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518535', 'Roberts, Shanahan and Morar', 1, 2, 'www.google.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518536', 'Sporer-Boyer', 2, 3, 'www.tum.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518537', 'Grant-Cruickshank', 3, 1, 'www.duckduckgo.com', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518538', 'Hamill, Champlin and Quitzon', 4, 2, 'www.google.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518539', 'Predovic, Kertzmann and Hansen', 5, 3, 'www.tum.de', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518540', 'Ruecker, Stanton and Heathcote', 1, 1, 'www.google.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518541', 'Sauer Group', 2, 2, 'www.google.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518542', 'Macejkovic, Senger and Torp', 3, 3, 'www.duckduckgo.com', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518543', 'Runolfsson-O''Hara', 4, 1, 'www.tum.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518544', 'Maggio, Gislason and Rogahn', 5, 2, 'www.tum.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518545', 'Stanton, Towne and Herman', 1, 3, 'www.google.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518546', 'Hodkiewicz, Grady and Conn', 2, 1, 'www.tum.de', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518547', 'MacGyver-Lubowitz', 3, 2, 'www.google.de', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518548', 'Marks, Parisian and Heathcote', 4, 3, 'www.duckduckgo.com', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518549', 'Kihn-Bartoletti', 5, 1, 'www.tum.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518550', 'Torphy-Cassin', 1, 2, 'www.tum.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518551', 'Turcotte, Mueller and Fadel', 2, 3, 'www.google.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518552', 'Ullrich, Larson and Hartmann', 3, 1, 'www.google.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518553', 'Rowe-Dicki', 4, 2, 'www.tum.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518554', 'Schultz Group', 5, 3, 'www.duckduckgo.com', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518555', 'Paucek, Witting and Rogahn', 1, 1, 'www.google.de', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518556', 'Rodriguez-Hessel', 2, 2, 'www.tum.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518557', 'Kshlerin and Sons', 3, 3, 'www.duckduckgo.com', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518558', 'Streich-Graham', 4, 1, 'www.duckduckgo.com', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518559', 'Heaney Group', 5, 2, 'www.tum.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518560', 'Gaylord-Powlowski', 1, 3, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518561', 'Sporer and Sons', 2, 1, 'www.duckduckgo.com', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518562', 'Mante and Sons', 3, 2, 'www.tum.de', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518563', 'Gleason-Daniel', 4, 3, 'www.google.de', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518564', 'Jast, Bayer and Hoppe', 5, 1, 'www.duckduckgo.com', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518565', 'Powlowski, Marvin and Collins', 1, 2, 'www.tum.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518566', 'DuBuque-Huel', 2, 3, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518567', 'Sauer, Jones and Bruen', 3, 1, 'www.tum.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518568', 'Hilpert Group', 4, 2, 'www.google.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518569', 'Dicki, Beatty and Collier', 5, 3, 'www.tum.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518570', 'Sawayn, Watsica and Gulgowski', 1, 1, 'www.duckduckgo.com', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518571', 'Barton and Sons', 2, 2, 'www.google.de', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518572', 'Streich Group', 3, 3, 'www.tum.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518573', 'Gibson and Sons', 4, 1, 'www.google.de', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518574', 'Metz, Schowalter and Thompson', 5, 2, 'www.google.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518575', 'Swift Group', 1, 3, 'www.tum.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518576', 'Breitenberg Inc', 1, 2, 'www.duckduckgo.com', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518577', 'Goldner LLC', 1, 3, 'www.google.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518578', 'Considine-Prohaska', 2, 1, 'www.duckduckgo.com', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518579', 'Hayes, Hilpert and Hodkiewicz', 3, 2, 'www.duckduckgo.com', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518580', 'Gutkowski-Quitzon', 4, 3, 'www.duckduckgo.com', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518581', 'Turner-Renner', 5, 1, 'www.tum.de', 0);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518582', 'Bahringer Group', 1, 2, 'www.tum.de', 1);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518583', 'Grimes, Hudson and Goodwin', 2, 3, 'www.duckduckgo.com', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518584', 'Kihn and Sons', 3, 1, 'www.tum.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518585', 'Kozey-Morissette', 4, 2, 'www.duckduckgo.com', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518586', 'Wiegand, Crist and West', 5, 3, 'www.tum.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518587', 'Cassin and Sons', 1, 1, 'www.duckduckgo.com', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518588', 'Abernathy Inc', 2, 2, 'www.duckduckgo.com', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518589', 'Ankunding-Gerhold', 3, 3, 'www.tum.de', 8);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518590', 'Deckow-Gerlach', 4, 1, 'www.tum.de', 7);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518591', 'Upton, Leannon and Renner', 5, 2, 'www.duckduckgo.com', 6);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518592', 'Grimes-Kautzer', 1, 3, 'www.google.de', 5);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518593', 'Williamson LLC', 2, 1, 'www.tum.de', 4);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518594', 'Nolan Group', 3, 2, 'www.tum.de', 3);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518595', 'Bergnaum and Sons', 4, 3, 'www.google.de', 2);
insert into restaurant (ID, NAME, AVERAGE_RATING, PRICE_CATEGORY, WEBSITE, TYPE)
values ('069f72db-2157-43de-8e88-21661b518596', 'Steuber and Sons', 5, 1, 'www.google.de', 1);


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


-- locations 
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.37245230463217, 11.225794777025762, '069f72db-2157-43de-8e88-21661b518501');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.09995798194585, 11.920367048902529, '069f72db-2157-43de-8e88-21661b518502');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.91391058168214, 11.17623249510473, '069f72db-2157-43de-8e88-21661b518503');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.1309982406967, 11.52102263744859, '069f72db-2157-43de-8e88-21661b518504');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.52649883381867, 11.266206266373478, '069f72db-2157-43de-8e88-21661b518505');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.56184467485058, 11.986655001298724, '069f72db-2157-43de-8e88-21661b518506');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.4259173212638, 11.161340045599783, '069f72db-2157-43de-8e88-21661b518507');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.42712421846831, 11.344026940508414, '069f72db-2157-43de-8e88-21661b518508');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.03073116767046, 11.524246279045304, '069f72db-2157-43de-8e88-21661b518509');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.32294024482248, 11.345900723135001, '069f72db-2157-43de-8e88-21661b518510');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.967159254105006, 11.346270449285825, '069f72db-2157-43de-8e88-21661b518511');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.00958129394239, 11.79774293719508, '069f72db-2157-43de-8e88-21661b518512');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.50152603832917, 11.10722415693482, '069f72db-2157-43de-8e88-21661b518513');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.412890830928, 11.943634198188962, '069f72db-2157-43de-8e88-21661b518514');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.23741445762419, 11.931675639513756, '069f72db-2157-43de-8e88-21661b518515');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.06513977436096, 11.248626020763552, '069f72db-2157-43de-8e88-21661b518516');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.55271733188795, 11.752372992146244, '069f72db-2157-43de-8e88-21661b518517');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.97758282061245, 11.61644882831927, '069f72db-2157-43de-8e88-21661b518518');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.93435770881337, 11.106255575154053, '069f72db-2157-43de-8e88-21661b518519');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.085159336359375, 11.130526816497705, '069f72db-2157-43de-8e88-21661b518520');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.085321212212705, 11.703988068308918, '069f72db-2157-43de-8e88-21661b518521');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.497759937304565, 11.528099491250522, '069f72db-2157-43de-8e88-21661b518522');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.32183753026308, 11.229507292610606, '069f72db-2157-43de-8e88-21661b518523');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.01472646875172, 11.168310069968788, '069f72db-2157-43de-8e88-21661b518524');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.06602834682222, 11.6825122797351, '069f72db-2157-43de-8e88-21661b518525');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.313165525307205, 11.478025252504768, '069f72db-2157-43de-8e88-21661b518526');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.390105087903954, 11.864193878025876, '069f72db-2157-43de-8e88-21661b518527');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.90481773764137, 11.346016302521427, '069f72db-2157-43de-8e88-21661b518528');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.3053321919312, 11.40807534188794, '069f72db-2157-43de-8e88-21661b518529');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.983724418667094, 11.108815213641643, '069f72db-2157-43de-8e88-21661b518530');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.41525035139066, 11.616113300275021, '069f72db-2157-43de-8e88-21661b518531');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.96021988402343, 11.966113837153378, '069f72db-2157-43de-8e88-21661b518532');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.40932321212768, 11.016223964394994, '069f72db-2157-43de-8e88-21661b518533');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.3870343350557, 11.851090512082813, '069f72db-2157-43de-8e88-21661b518534');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.34861742812714, 11.526933618453256, '069f72db-2157-43de-8e88-21661b518535');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.39902952967056, 11.913082945101463, '069f72db-2157-43de-8e88-21661b518536');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.062947272248664, 11.784353356119531, '069f72db-2157-43de-8e88-21661b518537');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.27313605413871, 11.928865690653616, '069f72db-2157-43de-8e88-21661b518538');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.29108919294159, 11.087006757050725, '069f72db-2157-43de-8e88-21661b518539');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.02208984301438, 11.245394546085016, '069f72db-2157-43de-8e88-21661b518540');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.15499155965209, 11.601298409888129, '069f72db-2157-43de-8e88-21661b518541');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.40458612904532, 11.956437184107338, '069f72db-2157-43de-8e88-21661b518542');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.455025366743385, 11.348816566014793, '069f72db-2157-43de-8e88-21661b518543');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.47927886547131, 11.624629942073733, '069f72db-2157-43de-8e88-21661b518544');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.29279669666856, 11.149292240006911, '069f72db-2157-43de-8e88-21661b518545');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.29109709958062, 11.477133532541767, '069f72db-2157-43de-8e88-21661b518546');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.150744234445455, 11.880933453156889, '069f72db-2157-43de-8e88-21661b518547');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.53686331238842, 11.769019680460653, '069f72db-2157-43de-8e88-21661b518548');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.53612759049813, 11.374503147833622, '069f72db-2157-43de-8e88-21661b518549');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.14637028561182, 11.929926629122367, '069f72db-2157-43de-8e88-21661b518550');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.343411706676825, 11.85311132688229, '069f72db-2157-43de-8e88-21661b518551');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.27332305844962, 11.76853482820543, '069f72db-2157-43de-8e88-21661b518552');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.17396333578806, 11.215110179808663, '069f72db-2157-43de-8e88-21661b518553');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.37298990064241, 11.780211779883134, '069f72db-2157-43de-8e88-21661b518554');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.40283949016854, 11.055504171981864, '069f72db-2157-43de-8e88-21661b518555');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.942980346410685, 11.91295003795192, '069f72db-2157-43de-8e88-21661b518556');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.15847327854483, 11.102307564353307, '069f72db-2157-43de-8e88-21661b518557');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.33736202066966, 11.00359637782071, '069f72db-2157-43de-8e88-21661b518558');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.997657569889, 11.307347309846456, '069f72db-2157-43de-8e88-21661b518559');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.97748743413426, 11.189289700021503, '069f72db-2157-43de-8e88-21661b518560');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.17274269766877, 11.133370199579298, '069f72db-2157-43de-8e88-21661b518561');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.47823188938616, 11.517058460099886, '069f72db-2157-43de-8e88-21661b518562');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.960865277945295, 11.019327404178538, '069f72db-2157-43de-8e88-21661b518563');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.36677549301245, 11.334442296507483, '069f72db-2157-43de-8e88-21661b518564');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.35136228457961, 11.676168624961106, '069f72db-2157-43de-8e88-21661b518565');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.90109638710011, 11.251178493361651, '069f72db-2157-43de-8e88-21661b518566');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.34400838071668, 11.025139519753317, '069f72db-2157-43de-8e88-21661b518567');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.90322964760111, 11.92319430441896, '069f72db-2157-43de-8e88-21661b518568');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.13189675437573, 11.621451217476862, '069f72db-2157-43de-8e88-21661b518569');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.31864146429019, 11.03329349601246, '069f72db-2157-43de-8e88-21661b518570');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.06539106206312, 11.805338654256998, '069f72db-2157-43de-8e88-21661b518571');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.52366277123718, 11.727686251491605, '069f72db-2157-43de-8e88-21661b518572');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.53128421263215, 11.36384886902927, '069f72db-2157-43de-8e88-21661b518573');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.28362495259789, 11.180184423759487, '069f72db-2157-43de-8e88-21661b518574');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.21009679216782, 11.042383344671109, '069f72db-2157-43de-8e88-21661b518575');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.57602430303043, 11.00192326943804, '069f72db-2157-43de-8e88-21661b518576');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.946303998875806, 11.017053623101587, '069f72db-2157-43de-8e88-21661b518577');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.162570441136495, 11.548623638652051, '069f72db-2157-43de-8e88-21661b518578');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.22188232970246, 11.044912552553498, '069f72db-2157-43de-8e88-21661b518579');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.29724787988333, 11.768833611451214, '069f72db-2157-43de-8e88-21661b518580');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.46269429173261, 11.28170422859919, '069f72db-2157-43de-8e88-21661b518581');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.237648806911885, 11.249164747787875, '069f72db-2157-43de-8e88-21661b518582');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.93557608007618, 11.41000482558313, '069f72db-2157-43de-8e88-21661b518583');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.005299767199936, 11.195320415026401, '069f72db-2157-43de-8e88-21661b518584');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.362324398697055, 11.543117577794582, '069f72db-2157-43de-8e88-21661b518585');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.1162408751089, 11.845779945153076, '069f72db-2157-43de-8e88-21661b518586');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.31189005962923, 11.7783544079264, '069f72db-2157-43de-8e88-21661b518587');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.35081586957734, 11.81034573728263, '069f72db-2157-43de-8e88-21661b518588');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (47.914412871498726, 11.650382327588606, '069f72db-2157-43de-8e88-21661b518589');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.51532272321824, 11.828361257559035, '069f72db-2157-43de-8e88-21661b518590');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.316683883548215, 11.229907161041464, '069f72db-2157-43de-8e88-21661b518591');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.4127838775925, 11.21312973937249, '069f72db-2157-43de-8e88-21661b518592');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.08788017761284, 11.149573326168607, '069f72db-2157-43de-8e88-21661b518593');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.23280297320048, 11.858454899408333, '069f72db-2157-43de-8e88-21661b518594');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.03892138044372, 11.306943368868447, '069f72db-2157-43de-8e88-21661b518595');
insert into RESTAURANT_LOCATION(LAT, LON, RESTAURANT_ID)
values (48.1852651620345, 11.45550206902536, '069f72db-2157-43de-8e88-21661b518596');

-- comments
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The chicken was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518501');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518501');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518501');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The chicken was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518502');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The chicken was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518502');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518502');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518503');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518503');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518503');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The wrap was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518504');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518504');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518504');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518505');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The taco was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518505');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The pasta was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518505');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518506');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The meat was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518506');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fish was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518506');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518507');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518507');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518507');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518508');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518508');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The chicken was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518508');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518509');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The meat was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518509');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518509');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518510');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518510');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518510');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518511');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518511');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The steak was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518511');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518512');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The meat was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518512');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518512');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518513');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The steak was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518513');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518513');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518514');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The wrap was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518514');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518514');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518515');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The pasta was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518515');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518515');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518516');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518516');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518516');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518517');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518517');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Dieter', '069f72db-2157-43de-8e88-21661b518517');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518518');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518518');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518518');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518519');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518519');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518519');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518520');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The steak was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518520');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518520');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518521');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518521');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The taco was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518521');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The steak was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518522');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518522');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The wrap was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518522');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518523');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518523');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518523');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The meat was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518524');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The taco was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518524');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The chicken was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518524');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518525');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The meat was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518525');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518525');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518526');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518526');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518526');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fish was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518527');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518527');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The chicken was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518527');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518528');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518528');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518528');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518529');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518529');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518529');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518530');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518530');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518530');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518531');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518531');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518531');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The pasta was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518532');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518532');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518532');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518533');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518533');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518533');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518534');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518534');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518534');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518535');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The steak was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518535');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518535');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The pasta was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518536');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518536');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518536');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The steak was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518537');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518537');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518537');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The steak was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518538');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518538');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Dieter', '069f72db-2157-43de-8e88-21661b518538');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The steak was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518539');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518539');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fish was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518539');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518540');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518540');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The meat was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518540');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518541');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518541');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518541');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The pasta was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518542');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518542');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The steak was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518542');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The meat was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518543');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518543');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The taco was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518543');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518544');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518544');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518544');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518545');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fish was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518545');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518545');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518546');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The steak was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518546');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518546');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518547');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518547');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518547');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518548');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518548');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518548');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518549');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518549');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518549');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518550');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518550');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The taco was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518550');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518551');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518551');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518551');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The chicken was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518552');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518552');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The meat was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518552');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518553');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fish was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518553');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518553');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518554');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518554');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The chicken was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518554');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The wrap was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518555');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518555');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518555');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518556');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518556');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The steak was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518556');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The chicken was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518557');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518557');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518557');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518558');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Dieter', '069f72db-2157-43de-8e88-21661b518558');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The chicken was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518558');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518559');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518559');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518559');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518560');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518560');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518560');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518561');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The chicken was great.', 'Dieter', '069f72db-2157-43de-8e88-21661b518561');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518561');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518562');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518562');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518562');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518563');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518563');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518563');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518564');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The chicken was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518564');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The taco was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518564');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518565');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The taco was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518565');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518565');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518566');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Dieter', '069f72db-2157-43de-8e88-21661b518566');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518566');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518567');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518567');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518567');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518568');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The chicken was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518568');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518568');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518569');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The steak was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518569');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518569');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518570');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518570');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518570');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Emma', '069f72db-2157-43de-8e88-21661b518571');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518571');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518571');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The meat was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518572');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518572');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The steak was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518572');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The pasta was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518573');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518573');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The fillet was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518573');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518574');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518574');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518574');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518575');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The chicken was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518575');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The chicken was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518575');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fish was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518576');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The taco was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518576');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518576');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518577');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518577');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518577');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518578');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Dieter', '069f72db-2157-43de-8e88-21661b518578');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518578');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518579');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518579');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518579');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The pasta was poor.', 'Emma', '069f72db-2157-43de-8e88-21661b518580');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The steak was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518580');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518580');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fish was stunning!', 'Luis', '069f72db-2157-43de-8e88-21661b518581');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The chicken was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518581');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518581');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The meat was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518582');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The steak was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518582');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518582');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518583');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Luis', '069f72db-2157-43de-8e88-21661b518583');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518583');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518584');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fillet was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518584');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Emma', '069f72db-2157-43de-8e88-21661b518584');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The fillet was stunning!', 'Carl', '069f72db-2157-43de-8e88-21661b518585');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518585');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518585');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The fish was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518586');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The chicken was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518586');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The taco was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518586');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518587');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518587');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The meat was stunning!', 'Dieter', '069f72db-2157-43de-8e88-21661b518587');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518588');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Luis', '069f72db-2157-43de-8e88-21661b518588');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518588');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The pasta was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518589');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The taco was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518589');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fillet was poor.', 'Carl', '069f72db-2157-43de-8e88-21661b518589');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The meat was okay.', 'Dieter', '069f72db-2157-43de-8e88-21661b518590');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The pasta was great.', 'Carl', '069f72db-2157-43de-8e88-21661b518590');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fillet was disgusting!', 'Emma', '069f72db-2157-43de-8e88-21661b518590');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The fish was poor.', 'Fritz', '069f72db-2157-43de-8e88-21661b518591');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The wrap was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518591');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The pasta was stunning!', 'Emma', '069f72db-2157-43de-8e88-21661b518591');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(2, 'The wrap was poor.', 'Dieter', '069f72db-2157-43de-8e88-21661b518592');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The steak was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518592');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The meat was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518592');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518593');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The wrap was disgusting!', 'Luis', '069f72db-2157-43de-8e88-21661b518593');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The fish was disgusting!', 'Fritz', '069f72db-2157-43de-8e88-21661b518593');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Carl', '069f72db-2157-43de-8e88-21661b518594');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The meat was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518594');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(5, 'The wrap was stunning!', 'Fritz', '069f72db-2157-43de-8e88-21661b518594');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The chicken was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518595');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Carl', '069f72db-2157-43de-8e88-21661b518595');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Luis', '069f72db-2157-43de-8e88-21661b518595');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(3, 'The taco was okay.', 'Fritz', '069f72db-2157-43de-8e88-21661b518596');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(1, 'The taco was disgusting!', 'Dieter', '069f72db-2157-43de-8e88-21661b518596');
insert into comment(rating, comment, name, RESTAURANT_ID)
values(4, 'The steak was great.', 'Fritz', '069f72db-2157-43de-8e88-21661b518596');


-- mensa comments
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
values ('069f72db-2157-43de-8e88-21661b518246', 'Breitenberg Inc', 1, 2, 'www.duckduckgo.com');


/*Locations*/
insert into restaurant_location (ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518223', 48.187120304469374, 16.313691501443913,
        '069f72db-2157-43de-8e88-21661b518224');
insert into restaurant_location (ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518224', 48.26898700522353, 11.670421906144792,
        '069f72db-2157-43de-8e88-21661b518226');
insert into restaurant_location (ID, LAT, LON, RESTAURANT_ID)
values ('069f72db-2257-43de-8e88-21661b518225', 48.13747187109867, 11.575427029351456,
        '069f72db-2157-43de-8e88-21661b518246');


/*Tables*/
insert into restaurant_table (ID, SEATS, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518227', 5, '069f72db-2157-43de-8e88-21661b518226');
insert into restaurant_table (ID, SEATS, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518228', 7, '069f72db-2157-43de-8e88-21661b518226');
insert into restaurant_table (ID, SEATS, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518229', 6, '069f72db-2157-43de-8e88-21661b518224');
insert into restaurant_table (ID, SEATS, RESTAURANT_ID)
values ('069f72db-2157-43de-8e88-21661b518245', 4, '069f72db-2157-43de-8e88-21661b518246');

/*Reservation*/
insert into reservation (ID, RESERVATION_FROM, RESERVATION_TO, CONFIRMED)
values ('069f72db-2157-43de-8e88-21661b518230', '2008-01-01 10:00:01', '2008-01-02 11:00:01', true);

/*Reservation to Tables*/
insert into RESERVATION_RESTAURANT_TABLES (Reservation_ID, Restaurant_Tables_ID)
values ('069f72db-2157-43de-8e88-21661b518230', '069f72db-2157-43de-8e88-21661b518228');
