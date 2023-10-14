INSERT INTO categories(id, category_name)
VALUES
    (1,'Concerts'),
    (2,'Stand-up'),
    (3,'Theater'),
    (4,'Children');

INSERT INTO performers(id,performer_name,performer_description)
VALUES
    (1,'The MACHINE performs PINK FLOYD Symphonic Orchestra Live','The Machine is one of the oldest Pink Floyd tribute bands, having over 30 years of experience. The New York-based group embodies the spirit of Floyd, particularly seen in the improvisation, a Pink Floyd trademark, during their live performances. The Machine now plays over 15 albums and a mix of songs ranging from Floyd’s obscurities to the classics and their own cover versions.'),
    (2,'KOVACS','The Dutch artist Sharon Kovacs has been making music from an early age inspired by singers such as Betty Davis, Etta James and Tina Turner. In 2014 she released her first EP My Love. Success followed with the singles ''My Love'' and ''Diggin'' and her debut album Shades Of Black, charted in 36 countries, making the Top Ten in Germany and hitting Number One in her Dutch homeland.'),
    (3,'«LORD OF THE RINGS» - Lords of the Sound Orchestra','The famous symphony orchestra "Lords of the Sound" presents the musical program "The Music of Hans Zimmer", which encompasses the most famous compositions of the musical genius of our time, Hans Zimmer! "The Music of Hans Zimmer" is an exhilarating journey into the world of unique sounds, bringing the extraordinary atmosphere of cinematic masterpieces to the stage through the performance of a symphony orchestra.'),
    (4,'ANTYTILA','Musicians will live play Fortress Bakhmut, a collaboration with Ed Sheeran 2Step, as well as favorite songs of Ukrainians - TDME, Catch the moment, Viryla, Vse krasyvo and others.'),
    (5,'MAX BARSKIH','The American magazine Forbes called him "the musical ambassador of Ukraine in the world." His work is pop mainstream, which independent Ukraine can confidently present on major music venues around the world.
All fans of quality music and modern performances can expect an unforgettable show with the most famous hits and completely new compositions by Max, which can be heard only at the concerts of the tour.'),
    (6,'GAROU','Pierre Garand (Garou) is not only a singer, but also a composer and actor. One of his roles that brought him fame is the role of Quasimodo in the musical Notre Dame de Paris. The song "Belle", performed by him, has long been number one in the French charts. Pierre Garand''s singing style is fascinating and creates a pleasant and relaxed atmosphere. At the concert in Prague you will hear such popular songs as “Gitan”, “Seul”, “Belle”,as well as new recordings dedicated to Joe Dassin: “À toi”, “Siffler sur la colline”, “Si tu t''appelles mélancolie”. The romantic mood of French music, Garou''s beautiful voice, and deep songs are the attributes of this evening.'),
    (7,'ARTEM PIVOVAROV','For Artem, music is not just a hobby, but his true element. He radiates powerful energy and has incredible charisma. His understanding of what message he wants to put in his songs is crystal clear and insightful.

Pivovarov has already released four exciting solo albums, dozens of unforgettable singles and many visualizations, and he doesn''t stop there, he is constantly looking for new sounds, recording new duets with famous Ukrainian artists and creating new projects. It is important to highlight the singer''s contribution not only to the development of Ukrainian music, but also to the fight against the Ukrainian enemy. '),
    (8,'STAND-UP COMEDY IN ENGLISH','American comedian and TikTok celebrity Jordan Thomas Gray is bringing a selection of Warsaw''s best comedians to Bottegas in Warsaw for a raucous, unforgettable international standup showcase!Eat pizza, drink beer, and make some new friends!'),
    (9,'Comedy Confessions: An Interactive English Comedy Show','Comedy Confessions is a one of a kind, interactive stand up comedy show in English featuring you, the audience!

Who is ŽANA?

Born in Bosnia, raised in Florida, and living in Berlin, Žana’s comedy mirrors her eclectic cultural background and is best described as Balkan pessimism battling delusional American positivity sprinkled in with reggaeton flair.

Within 5 months of starting comedy she became a finalist in the 2022 Berlin New Stand Up Awards and is now hosting & producing shows in Berlin & across Europe. You can catch her perform regularly to hear her fresh take on the absurdity of immigration laws, her Balkan background, and growing up in Florida.'),
    (10,'KYIV MODERN BALLET','You will see two beautiful productions by the genius of modern choreography, Radu Poklitaru - "Bolero" and "Rain".

The work "Bolero" by Maurice Ravel, created at the beginning of the 20th century, experiences a completely unexpected embodiment in the production of the Kyiv Modern-Ballet Theater. Courage and the spirit of contradiction permeate the ballet, revealing the struggle of the individual for his "I" - with the faceless crowd.

"Rain" to the music of Johann Sebastian Bach is a choreographic suite in which ethnic music is interwoven. This is how the main idea of the Poklitaru Council is realized: different cultures and different nations unite the main human values.'),
    (11,'WARDROBE. BALLET "FREEDOM"','Ballet "Freedom" in Lviv is possible thanks to The Armed Forces of Ukraine! Don`t miss 2023-10-23 в 18:00 on the Lviv Theatre of Opera and Ballet, Lviv.
Buy WARDROBE. Ballet "Freedom" tickets at Concert.ua online or with delivery.');

INSERT INTO venues (capacity, zone_amount, id, address, city, country, venue_name)
VALUES
    (1200, 1, 1, '123 Golovna St', 'Warsaw', 'Poland', 'Klub Stodoła'),
    (4000, 2, 2, '12 Krakowska St', 'Warsaw', 'Poland', 'Arena Ursynów'),
    (3200, 3, 3, '56 Masovetska St', 'Krakow', 'Poland', 'ICE Krakow Congress Centre'),
    (1800, 1, 4, '67 Pomorska St', 'Katowice', 'Poland', 'Hala Spodek'),
    (1400, 3, 5, '101 Nova St', 'Gdansk', 'Poland', 'Polska Filharmonia Bałtycka im. Fryderyka Chopina'),
    (1100, 1, 6, '23 Lyon St', 'Krakow', 'Poland', 'Klub Studio'),
    (2200, 2, 7, '2 Mezhyhirska St', 'Kyiv', 'Ukraine', 'Kiev Opera and Ballet Theater for Children and Youth'),
    (3000, 2, 8, '3 Panteleimonivska St', 'Odessa', 'Ukraine', 'Odessa Academic Theatre of Musical Comedy'),
    (900, 3, 9, '4 Alicante St', 'Alicante', 'Spain', 'VB Spaces Grand Hall'),
    (700, 1, 10, '333 Budapest St', 'Budapest', 'Hungary', ' A38'),
    (1000, 2, 11, '34 Bratis St', 'Bratislava', 'Slovakia', 'Majestic Music Club'),
    (900, 3, 12, 'Francouzská 75/4', 'Prague', 'Czech Republic', 'Retro Music Hall'),
    (1600, 1, 13, '59 Bd Macdonald', 'Paris', 'France', 'Cabaret Sauvage'),
    (1400, 4, 14, '28 Svobody Ave St', 'Lviv', 'Ukraine', ' Lviv Theatre of Opera and Ballet'),
    (1500, 3, 15, 'Hasenheide 107', 'Berlin', 'Germany', 'Huxleys Neue Welt'),
    (2200, 1, 16, '3 Haupt St', 'Hamburg', 'Germany', 'Club Schwartz'),
    (800, 2, 17, '143 Koln St', 'Koln', 'Germany', 'Die Kantine'),
    (1600, 1, 18, '39 Frankfurt St', 'Frankfurt', 'Germany', 'Haus Sindlingen'),
    (1400, 2, 19, '101 Vienna St', 'Vienna', 'Austria', 'Szene Wien'),
    (2100, 3, 20, '123 Munich St', 'Munich', 'Germany', 'TonHalle München'),
    (1200, 2, 21, '123 Freedom St', 'Manchester', 'United Kingdom', 'Manchester Academy'),
    (600, 1, 22, '21 St Johns Hill', 'London', 'United Kingdom', 'The Clapham Grand'),
    (500, 1, 23, '123 Edinburgh St', 'Edinburgh', 'United Kingdom', 'The Liquid Room'),
    (800, 2, 24, 'Schanzenstraße 6-20', 'Koln', 'Germany', 'Carlswerk Viktoria'),
    (300, 1, 25, 'Reitknechtstraße 6', 'Munich', 'Germany', 'Backstage'),
    (800, 2, 26, '5. května 1640/65', 'Prague', 'Czech Republic', 'Prague Congress Centre'),
    (300, 1, 27, '12 Pochinku St', 'Warsaw', 'Poland', 'Bazar Klub'),
    (400, 1, 28, '65 Hiesepatt St', 'Berlin', 'Germany', 'Z-Bar'),
    (400, 2, 29, '101 Blau St', 'Vienna', 'Austria', 'The Black Sheep Pub');


INSERT INTO events (id, performer_id, venue_id,  event_image,category_id, booking_deadline, event_date_time)
VALUES
    (1,1,2,'/images/1.jpeg',1,'2023-12-02T20:00:00', '2023-12-03T20:00:00'),
    (2,2,1,'/images/2.jpeg',1,'2023-10-15T14:00:00', '2023-11-20T19:00:00'),
    (3,3,2,'/images/3.jpeg',1,'2024-01-27T17:00:00', '2024-01-27T19:00:00'),
    (4,3,3,'/images/4.jpeg',1,'2024-01-29T17:00:00', '2024-01-29T19:00:00'),
    (5,3,4,'/images/5.jpeg',1,'2024-01-20T17:00:00', '2024-01-20T19:00:00'),
    (6,2,5,'/images/6.jpeg',1,'2023-11-15T15:00:00', '2023-11-15T20:00:00'),
    (7,2,6,'/images/7.jpeg',1,'2023-11-13T15:00:00', '2023-11-13T20:00:00'),
    (8,4,9,'/images/8.jpeg',1,'2023-11-06T19:00:00', '2023-11-06T20:00:00'),
    (9,4,10,'/images/9.jpeg',1,'2023-10-21T18:30:00','2023-10-21T19:30:00'),
    (10,4,11,'/images/10.jpeg',1,'2023-10-22T18:30:00', '2023-10-22T19:30:00'),
    (11,4,12,'/images/11.jpeg',1,'2023-10-24T19:00:00', '2023-10-24T20:00:00'),
    (12,4,17,'/images/12.jpeg',1,'2023-10-26T19:00:00', '2023-10-26T20:00:00'),
    (13,4,18,'/images/13.jpeg',1,'2023-10-27T18:30:00', '2023-10-27T19:30:00'),
    (14,4,19,'/images/14.jpeg',1,'2023-10-29T18:00:00', '2023-10-29T20:00:00'),
    (15,4,20,'/images/15.jpeg',1,'2023-10-30T18:30:00', '2023-10-30T19:30:00'),
    (16,4,21,'/images/16.jpeg',1,'2023-11-26T18:00:00', '2023-11-26T19:00:00'),
    (17,4,22,'/images/17.jpeg',1, '2023-11-27T18:00:00', '2023-11-27T19:30:00'),
    (18,4,23,'/images/18.jpeg',1, '2023-11-29T18:00:00', '2023-11-29T19:30:00'),
    (19,5,22,'/images/19.jpeg',1,'2023-10-22T18:00:00', '2023-10-22T20:00:00'),
    (20,5,23,'/images/20.jpeg',1,'2023-10-09T18:00:00',  '2023-10-09T20:00:00'),
    (21,5,24,'/images/21.jpeg',1,'2023-10-13T18:00:00', '2023-10-13T20:00:00'),
    (22,5,15,'/images/22.jpeg',1,'2023-10-15T18:00:00', '2023-10-15T20:00:00'),
    (23,5,24,'/images/23.jpeg',1,'2023-10-19T18:00:00', '2023-10-19T20:00:00'),
    (24,5,25,'/images/24.jpeg',1,'2023-10-18T18:00:00','2023-10-18T20:00:00'),
    (25,6,26,'/images/25.jpeg',1,'2023-10-31T17:00:00','2023-10-31T19:00:00'),
    (26,6,22,'/images/26.jpeg',1,'2023-10-29T17:00:00','2023-10-29T19:00:00'),
    (27,7,22,'/images/27.jpeg',1,'2023-11-19T17:00:00','2023-11-19T18:00:00'),
    (28,7,12,'/images/28.jpeg',1,'2023-11-07T17:00:00','2023-11-07T19:00:00'),
    (29,7,13,'/images/28.jpeg',1,'2023-11-16T16:00:00','2023-11-16T18:00:00'),
    (30,7,16,'/images/28.jpeg',1,'2023-11-20T17:00:00','2023-11-20T19:00:00'),
    (31,7,1,'/images/28.jpeg',1,'2024-02-14T17:00:00','2024-02-14T19:00:00'),
    (32,7,15,'/images/28.jpeg',1,'2024-01-12T17:00:00','2024-01-12T19:00:00'),
    (33,8,1,'/images/29.jpeg',2,'2024-10-09T16:00:00','2024-10-09T20:00:00'),
    (34,9,27,'/images/30.jpeg',2,'2024-10-21T18:00:00','2024-10-21T20:00:00'),
    (35,9,28,'/images/31.jpeg',2,'2024-10-06T18:00:00','2024-10-06T20:30:00'),
    (36,9,6,'/images/32.jpeg',2,'2024-10-20T18:00:00','2024-10-20T20:30:00'),
    (37,9,29,'/images/33.jpeg',2,'2024-10-27T18:00:00','2024-10-27T20:30:00'),
    (38,10,7,'/images/34.jpeg',3,'2023-11-05T17:59:00','2023-11-05T18:00:00'),
    (39,10,14,'/images/34.jpeg',3,'2023-11-14T17:59:00','2023-11-14T18:00:00'),
    (40,11,14,'/images/35.jpeg',3,'2023-12-05T17:59:00','2023-11-14T18:00:00'),
    (41,11,8,'/images/36.jpeg',3,'2023-12-05T17:59:00','2023-11-14T18:00:00');



/*
(1900, 6, 38, '333 Dusseldorf St', 'Dusseldorf', 'Germany', 'Venue 38'),
(1800, 7, 41, '789 Florence St', 'Florence', 'Italy', 'Venue 41'),
(1400, 4, 42, '101 Salzburg St', 'Salzburg', 'Austria', 'Venue 42'),
(2200, 6, 43, '555 Rotterdam St', 'Rotterdam', 'Netherlands', 'Venue 43'),
(750, 2, 44, '777 Porto St', 'Porto', 'Portugal', 'Venue 44'),
(1600, 5, 45, '555 Geneva St', 'Geneva', 'Switzerland', 'Venue 45'),
(900, 3, 46, '222 Antwerp St', 'Antwerp', 'Belgium', 'Venue 46'),*/
