CREATE DATABASE COMPANY
GO
USE COMPANY
GO
--Tao bang
CREATE TABLE DonDatHang (
	MS int PRIMARY KEY,
	KhachHang varchar(30) NOT NULL,
	DiaChi varchar(100) NOT NULL,
	SDT int,
	NgayDatHang datetime
)
GO 
INSERT INTO DonDatHang VALUES (123, 'NGUYEN VAN AN', '111-NGUYENTRAI-THANHXUAN-HANOI',987654321, 11/18/09);
INSERT INTO DonDatHang VALUES (124, 'LE MINH DUC', 'GIANGVO-DONGDA-HANOI',123456789, 25/06/04);
INSERT INTO DonDatHang VALUES (125, 'NGUYEN LONG NHAT', 'METRI-MYDINH-HANOI',123498765, 11/18/09);
GO
SELECT * FROM DonDatHang
GO

CREATE TABLE DanhSachMatHang (
	STT int,
	TenHang varchar(50),
	MoTa varchar(50),
	DonVi varchar(30),
	Gia int,
	SoLuong int,
	ThanhTien money
)
INSERT INTO DanhSachMatHang VALUES (1,'May Tinh T450','May nhap moi','Chiec',1000,1,1000);
INSERT INTO DanhSachMatHang VALUES (2,'Dien Thoai Nokia5670','Dien thoai dang hot','Chiec',200,2,400);
INSERT INTO DanhSachMatHang VALUES (3,'May In Samsung450','May in dang e','Chiec',100,1,100);
GO
SELECT * FROM DanhSachMatHang
GO
SELECT SUM(ThanhTien) AS "TongTien" FROM DanhSachMatHang
GO

--4
SELECT DISTINCT KhachHang FROM DonDatHang
GO
SELECT DISTINCT TenHang FROM DanhSachMatHang
GO
SELECT DISTINCT MS FROM DonDatHang
GO

--5
SELECT DISTINCT KhachHang  FROM DonDatHang
ORDER BY KhachHang;
GO
SELECT DISTINCT Gia FROM DanhSachMatHang
ORDER BY Gia DESC;
GO

