-- Inserting data into Movie table
INSERT INTO Movie (MovieID, Title, ReleaseDate, Genre, Director)
VALUES
  (1, 'MS Dhoni: The Untold story', '2016-04-01', 'Biography', 'Nitesh Tiwari'),
  (2, 'Swadesh', '2004-02-15', 'Drama', 'Ashutosh Gowariker'),
  (3,'Kuch kuch hota hai' , '1998-12-02','Drama', 'Karan Johar'),
  (4,'The Revenant','2015-08-01' , 'Drama', 'Alejandro' ),
  (5, 'Border', '1997-09-30', 'Drama', 'J. P. Dutta');

-- Inserting data into Actor table
INSERT INTO Actor (ActorID, ActorName, BirthDate, Nationality)
VALUES
  (1, 'Shahrukh Khan', '1965-05-15', 'India'),
  (2, 'Shushant Singh Rajput', '1987-12-10', 'India'),
  (3,'Leonardo Decaprio', '1963-07-17','USA'),
  (4, 'Sunny Deol', '1963-07-20', 'India');

-- Inserting data into MovieActor table
INSERT INTO MovieActor (MovieID, ActorID)
VALUES
  (1, 2),
  (2, 1),
  (3, 1),
  (4, 3),
  (5,4);

-- Inserting  data into TVSeries table
INSERT INTO TVSeries (SeriesID, Title, ReleaseDate, Genre, Director)
VALUES
  (1, 'Pavitra Rishta', '2009-06-01', 'Drama', 'Tanushree'),
  (2, 'Dil Dariya', '1988-12-31', 'Drama', 'Ravi Shankar');

-- Inserting data into TVSeriesActor table
INSERT INTO TVSeriesActor (SeriesID, ActorID)
VALUES
  (1, 2),
  (2, 1);
