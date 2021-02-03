CREATE DATABASE ToyzUnlimited
GO
USE ToyzUnlimited
GO

CREATE TABLE Toys
(
	ProductCode varchar(5) PRIMARY KEY,
	Name varchar(30),
	Category varchar(30),
	Manufactuner varchar(40),
	AgeRange varchar(15),
	UnitPrice money,
	Netweight int,
	QtyOnHand int
)
GO

INSERT INTO Toys VALUES ('T100','Fisher Price Kid Tough','machine','CAMERA COMPANY','3-10',15,510,100),
						('T101','Etch-A-Sketch','table','TABLE COMPANY','4-15',19,250,353),
						('T102','Cabbage Patch Kids Doll','doll','DOLL COMPANY','3-12',25,350,647),
						('T103','Barbie Dolls','doll','DOLL COMPANY','3-12',20,250,846),
						('T104','skateboard','plank','SKATEBOARD COMPANY','9-18',30,1500,567),
						('T105','Robots','robot','ROBOT COMPANY','5-15',35,620,478),
						('T107','G.I. Joe','paradigm','PARADIGM COMPANY','3-15',33,450,628),
						('T108','Hot Wheels','car','CAR COMPANY','3-16',15,150,975),
						('T109','LEGOs','lego','LEGO COMPANY','5-18',45,700,830),
						('T110','Mr. Potato Head','paradigm','PARADIGM COMPANY','3-10',23,200,495),
						('T111','Star Wars Action Figures','paradigm','PARADIGM COMPANY','3-17',30,130,313),
						('T112','Rubik’s Cube','cube','CUBE COMPANY','5-18',10,150,999),
						('T113','UNO','card','CARD COMPANY','7-18',10,70,875),
						('T114','Teddy Bear','stuffed animal','STUFFED ANIMAL COMPANY','3-12',25,200,989),
						('T115','Kid Connection Juinor Doctor','doctor','DOCTOR COMPANY','6-13',50,860,241)
GO
SELECT * FROM Toys
GO


--2. Viết câu lệnh tạo Thủ tục lưu trữ có tên là HeavyToys cho phép liệt kê tất cả các loại đồ chơi có trọng lượng lớn hơn 500g.
CREATE PROCEDURE HeavyToys AS
SELECT * FROM Toys
WHERE Netweight > 500
go

EXEC HeavyToys
GO

--3. Viết câu lệnh tạo Thủ tục lưu trữ có tên là PriceIncreasecho phép tăng giá của tất cả các loại đồ chơi lên thêm 10 đơn vị giá.
CREATE PROCEDURE PriceIncrease AS
SELECT * FROM Toys
WHERE UnitPrice= UnitPrice + 10
GO 

EXEC PriceIncrease
GO

--4. Viết câu lệnh tạo Thủ tục lưu trữ có tên là QtyOnHand làm giảm số lượng đồ chơi còn trong của hàng mỗi thứ 5 đơn vị.
CREATE PROCEDURE QtyOnHand AS
SELECT * FROM Toys
WHERE QtyOnHand= QtyOnHand - 5
GO

EXEC QtyOnHand 
GO