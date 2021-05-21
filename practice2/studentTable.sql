create database if not exists school;
use school;
create table Students(
    studentId varchar(10) primary key not null,
    studentName varchar(50) not null,
    address varchar(50),
    phone inbt(10)
);
insert into Students values
    ('A02150','Le Dinh Cuong','Hai Duong', 0356623270),
    ('B10230','Nguyen Minh Hiep','Ha Nam',0359794266);