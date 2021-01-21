IF EXISTS (SELECT * FROM sys.databases WHERE Name='BookLibrary')
DROP DATABASE BookLibrary
GO
CREATE DATABASE BookLibrary
GO
USE BookLibrary
GO

--Tao bang
CREATE TABLE Book (
	BookCode int PRIMARY KEY,
	BookTitle varchar(100) NOT NULL,
	Author varchar(50) NOT NULL,
	Edition int, 
	BookPrice money,
	Copies int
)
GO
INSERT INTO Book VALUES (01,'TOAN','GUM',3,10,100);
INSERT INTO Book VALUES (02,'VAN','BOO',6,11,101);
INSERT INTO Book VALUES (03,'HOA','SAM',4,19,107);
INSERT INTO Book VALUES (04,'VATLY','TIM',2,23,109);
INSERT INTO Book VALUES (05,'LICHSU','RAY',8,15,104);
GO
SELECT * FROM Book
GO

--Bang Member(luu thong tin nguoi muon)
CREATE TABLE Member (
	MemberCode int PRIMARY KEY,
	Name varchar(50) NOT NULL,
	Address varchar(100) NOT NULL,
	PhoneNumber int
)
GO
INSERT INTO Member(MemberCode,Name,Address,PhoneNumber) VALUES (1,'CUONG DEW','MY DINH - HA NOI',0356623270);
INSERT INTO Member(MemberCode,Name,Address,PhoneNumber) VALUES (2,'DANG KIM THI','HAI BA TRUNG - HA NOI',0397587828);
INSERT INTO Member(MemberCode,Name,Address,PhoneNumber) VALUES (3,'TRUNG SA DOA','CAU GIAY - HA NOI',0375890854);
INSERT INTO Member(MemberCode,Name,Address,PhoneNumber) VALUES (4,'HIEP LUON','BAC TU NIEM - HA NOI',0584037463);
INSERT INTO Member(MemberCode,Name,Address,PhoneNumber) VALUES (5,'DO MAP','THANH XUAN - HA NOI',0373536489);
GO
SELECT * FROM Member
GO
--Bang IssueDetails(Thông tin mượn sách)
CREATE TABLE IssueDetails (
	BookCode int,
	MemberCode int,
	IssueDate datetime,
	ReturnDate datetime,
	CONSTRAINT fk FOREIGN KEY (BookCode) REFERENCES Book(BookCode),
	CONSTRAINT fk2 FOREIGN KEY (MemberCode) REFERENCES Member(MemberCode)
)
GO
INSERT INTO IssueDetails(BookCode,MemberCode,IssueDate,ReturnDate) VALUES (01,1,11,21);
INSERT INTO IssueDetails(BookCode,MemberCode,IssueDate,ReturnDate) VALUES (02,2,12,22);
INSERT INTO IssueDetails(BookCode,MemberCode,IssueDate,ReturnDate) VALUES (03,3,13,23);
INSERT INTO IssueDetails(BookCode,MemberCode,IssueDate,ReturnDate) VALUES (04,4,14,24);
INSERT INTO IssueDetails(BookCode,MemberCode,IssueDate,ReturnDate) VALUES (05,5,15,25);
GO
SELECT * FROM IssueDetails
GO

--Xoa bo cac rang buoc khoa ngoai bang IssueDetails
ALTER TABLE IssueDetails
	DROP CONSTRAINT fk,
		CONSTRAINT fk2;
GO
--Xóa bỏ Ràng buộc Khóa chính của bảng Member và Book
ALTER TABLE Book 
	DROP CONSTRAINT BookCode;
GO
ALTER TABLE Member
	DROP CONSTRAINT MemberCode;
GO
--Them moi rang buoc khoa chinh cho bang Member va Book
ALTER TABLE Book
	ADD CONSTRAINT BookCode PRIMARY KEY (Book);
GO
ALTER TABLE Member
	ADD CONSTRAINT MemberCode PRIMARY KEY (Member);
GO
--Them moi cac rang buoc khoa ngoai cho bang IssueDetails
ALTER TABLE IssueDetails
	ADD CONSTRAINT fk FOREIGN KEY (BookCode) REFERENCES Book(BookCode),
		CONSTRAINT fk2 FOREIGN KEY (MemberCode) REFERENCES Member(MemberCode);
GO
--Bo sung then rang buoc gia ban sach >0 va <200
ALTER TABLE Book
	ADD CONSTRAINT BookCode CHECK (BookPrice>0 and BookPrice<200);
GO
--Bo sung them rang buoc duy nhat cho PhoneNumber cua bang Member
ALTER TABLE Member
	ADD CONSTRAINT PhoneNumber UNIQUE (Phone);
GO
--Bo sung them rang buoc NOT NULL cho BookCode, MemberCode trong bang IssueDetails
ALTER TABLE IssueDetails
ALTER COLUMN MemberCode int NOT NULL;
ALTER TABLE IssueDetails
ALTER COLUMN BookCode int NOT NULL;
GO
--Tao khoa chinh gom 2 cot BookCode, MemberCode cho bang IssueDetails
CREATE TABLE IssueDetails (
	BookCodeID int,
	MemberCodeID int,
	Location varchar(2),
	CONSTRAINT PK PRIMARY KEY (BookCodeID, MemberCodeID)
)
GO
--Chen du lieu hop ly cho cac bang(su dung SQL)
INSERT INTO Cities (Location) VALUES (CONVERT(Point,'13.2:46.2'));