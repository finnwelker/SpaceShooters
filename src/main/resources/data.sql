CREATE TABLE IF NOT EXISTS HIGHSCORES (
    id LONG PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100) NOT NULL,
    highscore INT NOT NULL
    );
INSERT INTO HIGHSCORES(name, highscore)
VALUES ('Gandalf', 100),
       ('Detlef', 550),
       ('Sara', 300),
       ('Kira', 2000),
       ('Franz', 800);
