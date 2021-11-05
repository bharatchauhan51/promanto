--liquibase formatted sql
--changeset bharat.chauhan:0001.systemSetup.addRoles dbms=mysql
--validCheckSum: any

INSERT INTO tUserRole
(
Name
)
VALUES
(
'admin'
),
(
'mod'
),
(
'user'
)