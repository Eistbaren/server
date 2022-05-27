/* SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO"; */
/* SET AUTOCOMMIT = 0; */
/* START TRANSACTION; */
/* SET time_zone = "+00:00"; */
-- --------------------------------------------------------
-- 
-- Table structure for table `Comment` generated from model 'Comment'
-- 
CREATE TABLE IF NOT EXISTS `comment`
(
    `id`      varchar(255) PRIMARY KEY,
    `rating`  TINYINT UNSIGNED DEFAULT NULL,
    `comment` TEXT DEFAULT NULL,
    `name`    TEXT DEFAULT NULL
);

-- 
-- Table structure for table `inline_object` generated from model 'inlineUnderscoreobject'
-- 
--CREATE TABLE IF NOT EXISTS `inline_object` (
--    `confirmed` TINYINT(1) DEFAULT NULL
--    ) ;
-- 
-- Table structure for table `inline_response_200` generated from model 'inlineUnderscoreresponseUnderscore200'
-- 
--CREATE TABLE IF NOT EXISTS `inline_response_200` (
--                                                     `Paginated` TEXT DEFAULT NULL,
--                                                     `results` JSON DEFAULT NULL
--) ;
-- 
-- Table structure for table `inline_response_200_1` generated from model 'inlineUnderscoreresponseUnderscore200Underscore1'
-- 
--CREATE TABLE IF NOT EXISTS `inline_response_200_1` (
--                                                       `Paginated` TEXT DEFAULT NULL,
--                                                       `results` JSON DEFAULT NULL
--) ;
-- 
-- Table structure for table `inline_response_200_2` generated from model 'inlineUnderscoreresponseUnderscore200Underscore2'
-- 
--CREATE TABLE IF NOT EXISTS `inline_response_200_2` (
--                                                       `Paginated` TEXT DEFAULT NULL,
--                                                       `results` JSON DEFAULT NULL
--) ;
-- 
-- Table structure for table `inline_response_200_3` generated from model 'inlineUnderscoreresponseUnderscore200Underscore3'
-- 
--CREATE TABLE IF NOT EXISTS `inline_response_200_3` (
--                                                       `Paginated` TEXT DEFAULT NULL,
--                                                       `results` JSON DEFAULT NULL
--) ;
-- 
-- Table structure for table `inline_response_200_4` generated from model 'inlineUnderscoreresponseUnderscore200Underscore4'
-- 
--CREATE TABLE IF NOT EXISTS `inline_response_200_4` (
--                                                       `Paginated` TEXT DEFAULT NULL,
--                                                       `results` JSON DEFAULT NULL
--) ;
-- 
-- Table structure for table `inline_response_200_4_results` generated from model 'inlineUnderscoreresponseUnderscore200Underscore4Underscoreresults'
-- 
--CREATE TABLE IF NOT EXISTS `inline_response_200_4_results` (
--                                                               `timeslot` TEXT DEFAULT NULL,
--                                                               `reservedTables` JSON DEFAULT NULL COMMENT 'ids of the reserved tables of the timeslot'
--) ;
-- 
-- Table structure for table `Paginated` generated from model 'Paginated'
-- 
CREATE TABLE IF NOT EXISTS `paginated`
(
    `totalpages`  DECIMAL(20, 9) DEFAULT NULL,
    `currentpage` DECIMAL(20, 9) DEFAULT NULL,
    `pagesize`    DECIMAL(20, 9) DEFAULT NULL,
    `results`     JSON DEFAULT NULL
    );

-- 
-- Table structure for table `Reservation` generated from model 'Reservation'
-- 
CREATE TABLE IF NOT EXISTS `reservation`
(
    `id`        TEXT DEFAULT NULL,
    `tables`    JSON DEFAULT NULL,
    `time`      JSON DEFAULT NULL,
    `username`  TEXT DEFAULT NULL,
    `useremail` TEXT DEFAULT NULL,
    `confirmed` TINYINT(1) DEFAULT NULL
    );

-- 
-- Table structure for table `ReservationCreationRequest` generated from model 'ReservationCreationRequest'
-- 
CREATE TABLE IF NOT EXISTS `reservationcreationrequest`
(
    `tables`    JSON DEFAULT NULL,
    `time`      JSON DEFAULT NULL,
    `username`  TEXT DEFAULT NULL,
    `useremail` TEXT DEFAULT NULL
);

-- 
-- Table structure for table `Restaurant` generated from model 'Restaurant'
-- 
CREATE TABLE IF NOT EXISTS `restaurant`
(
    `id`            TEXT DEFAULT NULL,
    `images`        JSON DEFAULT NULL,
    `website`       TEXT DEFAULT NULL,
    `openinghours`  TEXT DEFAULT NULL,
    `averagerating` DECIMAL(20, 9) UNSIGNED DEFAULT NULL,
    `pricecategory` TINYINT UNSIGNED DEFAULT NULL,
    `location`      TEXT DEFAULT NULL,
    `floorplan`     TEXT DEFAULT NULL
    );

-- 
-- Table structure for table `Restaurant_floorPlan` generated from model 'RestaurantUnderscorefloorPlan'
-- 
CREATE TABLE IF NOT EXISTS `restaurant_floorplan`
(
    `image` TEXT DEFAULT NULL comment
    'image of the floor plan of the restaurant without tables',
    `size`  TEXT DEFAULT NULL
);

-- 
-- Table structure for table `Restaurant_floorPlan_size` generated from model 'RestaurantUnderscorefloorPlanUnderscoresize'
-- size of the floor plan
-- 
CREATE TABLE IF NOT EXISTS `restaurant_floorplan_size`
(
    `width`  INT DEFAULT NULL,
    `height` INT DEFAULT NULL
);

-- 
-- Table structure for table `Restaurant_location` generated from model 'RestaurantUnderscorelocation'
-- 
CREATE TABLE IF NOT EXISTS `restaurant_location`
(
    `lat` DECIMAL(20, 9) DEFAULT NULL,
    `lon` DECIMAL(20, 9) DEFAULT NULL
    );

-- 
-- Table structure for table `Table` generated from model 'Table'
-- 
CREATE TABLE IF NOT EXISTS `table`
(
    `id`           TEXT DEFAULT NULL,
    `restaurantid` TEXT DEFAULT NULL,
    `seats`        INT DEFAULT NULL,
    `floorplan`    TEXT DEFAULT NULL
);

-- 
-- Table structure for table `Table_floorPlan` generated from model 'TableUnderscorefloorPlan'
-- position on the floor plan
-- 
CREATE TABLE IF NOT EXISTS `table_floorplan`
(
    `position` TEXT DEFAULT NULL,
    `size`     TEXT DEFAULT NULL,
    `image`    TEXT DEFAULT NULL
);

-- 
-- Table structure for table `Table_floorPlan_position` generated from model 'TableUnderscorefloorPlanUnderscoreposition'
-- 
CREATE TABLE IF NOT EXISTS `table_floorplan_position`
(
    `x` INT DEFAULT NULL,
    `y` INT DEFAULT NULL
);

-- 
-- Table structure for table `Timeslot` generated from model 'Timeslot'
-- 
CREATE TABLE IF NOT EXISTS `timeslot`
(
    `from` INT DEFAULT NULL,
    `to`   INT DEFAULT NULL
);
