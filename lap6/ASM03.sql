create table subscription(
subscripId int,
number int,
species varchar(2423),
date datetime
)
go
drop table subscription
go

insert into subscription(number,species,date) values (123456789,'trả trước','2000/06/29')
insert into subscription(subscripId,number,species,date) values (2,0343619450,'trả sau','2000/06/29')
insert into subscription(subscripId,number,species,date) values (1,123456789,'trả trước','2000/06/29')
insert into subscription(number,species,date) values (0379784029,'trả sau','2021/01/28')

go

select * from subscription
go

create table customer_ok(
customerId int,
name nvarchar(355),
number int,
address nvarchar(2355)
)
go
drop table customer_ok
go

insert into customer_ok(name,number,address) values ('chu duc long',123456789,'phú thọ')
insert into customer_ok(name,number,address) values ('chu thi huong',123454789,'hà nội')
insert into customer_ok(name,number,address) values ('nguyen van tuyen',123456749,'hà nội')
insert into customer_ok(name,number,address) values ('nguoi yeu long',123456789,'phú thọ')
insert into customer_ok(name,number,address) values ('vo cua long ',123456789,'phú thọ')
go

select * from customer_ok
go

--câu 2
create table subscription ()
create table customer_ok ()

select * from subcription ()
select * from customer_ok ()


--câu 3 
insert into subscription () values ()
insert into customer_ok () values ()

--câu 4
--A hiển thị toàn bộ thông tin khách hàng
select * from subscription
go
--B hiển thị toàn bộ thông tin số thuê bao
select * from customer_ok
go

--câu 5
--A hiển thị toàn bộ thông tin khách hàng có số 123456789
select * from subscription
where number = '123456789'
go
--B hiển thị toàn bộ số thuê bao có số 123456789
select * from customer_ok 
where number = '123456789'
go
--C liệt kê các thuê bao đăng kí vào ngày 29/06/2000
select * from subscription
where date = '2000/06/29'
go
--D liệt kê các thuê bao có địa chỉ hà nội
select * from customer_ok
where address = 'hà nội'
go

--câu 6
--A tổng số thuê bao của công ty là
select sum(subscripId) from subscription
go
--B tổng khách hàng của công ty là
select sum(customerId) from customer_ok
go
--C tổng thuê bao đăng kí ngày 2000/06/29
select sum(customerId) from customer_ok
go
