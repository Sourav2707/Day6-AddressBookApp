create database addressbook_db;
create user 'addressbookuser'@'%' identified by 'password';
grant all on addressbook_db.* to 'addressbookuser'@'%';