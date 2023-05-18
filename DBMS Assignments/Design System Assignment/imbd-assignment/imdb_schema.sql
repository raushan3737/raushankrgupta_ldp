CREATE DATABASE imdb;
use imdb;

-- Table for Movie
CREATE TABLE Movie (
  MovieID INT PRIMARY KEY,
  Title VARCHAR(255),
  ReleaseDate DATE,
  Genre VARCHAR(255),
  Director VARCHAR(255)
);

-- Table for Actor
CREATE TABLE Actor (
  ActorID INT PRIMARY KEY,
  ActorName VARCHAR(255),
  BirthDate DATE,
  Nationality VARCHAR(255)
);

-- Association Table for Movie and Actor
CREATE TABLE MovieActor (
  MovieID INT,
  ActorID INT,
  PRIMARY KEY (MovieID, ActorID),
  FOREIGN KEY (MovieID) REFERENCES Movie(MovieID),
  FOREIGN KEY (ActorID) REFERENCES Actor(ActorID)
);

-- Table for TV Series
CREATE TABLE TVSeries (
  SeriesID INT PRIMARY KEY,
  Title VARCHAR(255),
  ReleaseDate DATE,
  Genre VARCHAR(255),
  Director VARCHAR(255)
);

-- Association Table for TV Series and Actor
CREATE TABLE TVSeriesActor (
  SeriesID INT,
  ActorID INT,
  PRIMARY KEY (SeriesID, ActorID),
  FOREIGN KEY (SeriesID) REFERENCES TVSeries(SeriesID),
  FOREIGN KEY (ActorID) REFERENCES Actor(ActorID)
);
