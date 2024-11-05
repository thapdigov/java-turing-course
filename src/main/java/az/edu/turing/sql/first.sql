CREATE DATABASE Instagram;
USE Instagram;
CREATE TABLE IF NOT EXISTS USERS
(
    ID         INT UNSIGNED PRIMARY KEY AUTO_INCREMENT,
    NAME       VARCHAR(30)                                      NOT NULL UNIQUE,
    PASSWORD   VARCHAR(30)                                      NOT NULL UNIQUE,
    GENDER     VARCHAR(6) CHECK ( GENDER IN ('MALE', 'FEMALE')) NOT NULL,
    EMAIL      VARCHAR(255)                                     NOT NULL UNIQUE CHECK ( EMAIL LIKE '%@%' ),
    CATEGORY   VARCHAR(20) DEFAULT 'HUMAN',
    TITLE      VARCHAR(255),
    FOLLOWERS  BIGINT      DEFAULT 0,
    FOLLOWING  BIGINT      DEFAULT 0,
    POST_COUNT INT         DEFAULT 0,
    CREATED_AT TIMESTAMP   DEFAULT CURRENT_TIMESTAMP
);

create table IF NOT EXISTS POSTS
(
    ID            INT PRIMARY KEY,
    TITLE         VARCHAR(300),
    LOCATION      VARCHAR(50) DEFAULT 'AZERBAIJAN',
    LIKE_COUNT    BIGINT      DEFAULT 0,
    COMMENT_COUNT BIGINT      DEFAULT 0,
    SAVED_COUNT   BIGINT      DEFAULT 0,
    SEND_COUNT    BIGINT      DEFAULT 0,
    USER_ID       INT UNSIGNED NOT NULL,
    CREATED_AT    TIMESTAMP   DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK FOREIGN KEY (USER_ID) REFERENCES USERS (ID) ON DELETE CASCADE
);

create table IF NOT EXISTS COMMENT
(
    ID            SERIAL PRIMARY KEY,
    COMMENT       VARCHAR(100),
    LIKE_COUNT    INT       DEFAULT 0,
    REPLY_COMMENT VARCHAR(100),
    CREATED_AT    TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    POST_ID       INT          NOT NULL UNIQUE,
    USERS_ID      INT UNSIGNED NOT NULL UNIQUE,
    FOREIGN KEY (POST_ID) REFERENCES POSTS (ID) ON DELETE CASCADE,
    FOREIGN KEY (USERS_ID) REFERENCES USERS (ID) ON DELETE CASCADE
);
CREATE TABLE IF NOT EXISTS LIKES
(
    ID         INT PRIMARY KEY,
    POST_ID    INT          NOT NULL,
    USER_ID    INT UNSIGNED NOT NULL,
    CREATED_AT TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (POST_ID) REFERENCES POSTS (ID) ON DELETE CASCADE,
    FOREIGN KEY (USER_ID) REFERENCES USERS (ID) ON DELETE CASCADE

);
CREATE VIEW INFO AS
SELECT NAME, USERS.TITLE U_TITLE, FOLLOWERS, FOLLOWING, P.TITLE P_TITLE, P.LOCATION, C.COMMENT
FROM USERS
         INNER JOIN POSTS P on USERS.ID = P.USER_ID
         INNER JOIN COMMENT C on P.ID = C.POST_ID
         INNER JOIN LIKES L on P.ID = L.POST_ID;

SELECT *
FROM INFO;



