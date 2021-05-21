create database if not exists school;
use school;
create table student(
    StudentID varchar(10) primary key not null,
    StudentName varchar(50) not null,
    Address varchar(50),
    Phone varchar(10)
);
insert into student values
    (A123,"Le Dinh Cuong","Hai Duong", 0356623270),
    (A456, "Nguyen Minh Hiep","Ha Nam",0359794266);