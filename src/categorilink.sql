DROP TABLE CATEGORYLINK
CASCADE CONSTRAINTS;

CREATE TABLE CATEGORYLINK (
    MEMBERNUM NUMBER,
    CONSTRAINT FK_CATEGORYLINK_01 FOREIGN KEY(MEMBERNUM)
    REFERENCES MEMBERS(MEMBERNUM),
    CATEGORIES NUMBER
);

