USE AdventureWorks2012
GO
--tao 1 thu tuc luu tru lay ra toan bo nhan vien vao lam theo nam co tham so dau vao la 1 nam
CREATE PROCEDURE sp_DisplayEmployeesHireYear
	@HireYear int
AS
SELECT * FROM HumanResources
WHERE DATEPART(YY, HireDate)=@HireYear
GO
--de chay thu tuc nay can phai truyen tham so vao la nam ma nhan vien vao lam
EXECUTE sp_DisplayEmployeesHireYear 2003
GO

--tao thu tuc luu tru dem so nguoi vao lam trong 1 nam xac dinh co tham so dau vao la 1 nam,
--tham so dau ra la so nguoi vao lam trong nam nay 
CREATE PROCEDURE sp_EmployeesHireYearCount
	@HireYear int,
	@Count int OUTPUT
AS 
SELECT @Count=COUNT(*) FROM HumanResources.Employee
WHERE DATEPART(YY, HireDate)=@HireYear
GO 
--chay thu tuc luu tru can phai truyen vao mot tham so dau vao va mot tham so dau ra
DECLARE @Number int 
EXECUTE sp_EmployeesHireYearCount 2003, @Number OUTPUT
PRINT @Number
GO

--tao thu tuc luu tru dem so nguoi vao lam trong mot nam xac dinh co tham so dau vao la 1 nam, ham tra ve la so nguoi vao lam nam do
CREATE PROCEDURE sp_EmployeesHireYearCount2
	@HireYear int 
AS 
DECLARE @Count int
SELECT @Count=COUNT(*) FROM HumanResources.Employee
WHERE DATEPART(YY, HireDate)=@HireYear
RETURN @Count
GO
--chay thu tuc luu tru can phai truyen vao 1 tham so dau va lay ve so nguoi lam trong nam do
DECLARE @Nummber int
EXECUTE @Number = sp_EmployeesHireYearCount2 2003
PRINT @Number
GO 

--tao bang tam #Students
CREATE TABLE #Students 
(
	RollNo varchar(6) CONSTRAINT PK_Students PRIMARY KEY,
	FullName nvarchar(100),
	Birthday datetime CONSTRAINT DF_StudentsBirthday DEFAULT DATEADD(YY, -18, GETDATE())
)
GO
--tao thu tuc luu tru tam de chen du lieu vao bang tam
CREATE PROC #spInsertStudents
	@rollno varchar(6),
	@fullname nvarchar(100),
	@birthday datetime
AS BEGIN
	IF(@birthday IS NULL) SET @birthday=DATEADD(YY, -18, GETDATE())
	INSERT INTO #Students(@RollNo, @FullName, @Birthday) VALUES (@rollno, @fullname, @birthday)
END
GO
--su dung thu tuc luu tru de chen du lieu vao bang tam 
EXEC #spStudents 'A12345', 'abc', 'NULL'
EXEC #spStudents 'A54321', 'abc', '12/24//2011'
SELECT * FROM #Students
--tao thu tuc luu tru tam de xoa du lieu tu bang tam thao RollNo
CREATE PROC #spDeleteStudents
	@rollNo varchar(6)
AS BEGIN 
	DELETE FROM #Students WHERE RollNo=@rollNo 
END
--xoa du lieu thu tuc luu tru 
EXEC #spDeleteStudents 'A12345'
GO
 
--tao 1 thu tuc luu tru su dung lenh RETURN de tra ve 1 so nguyen'
CREATE PROC Cal_Square @num int=0 
AS 
BEGIN
	RETURN (@num * @num)
End
GO

--xem dinh nghia thu tuc luu tru bang ham OBJECT_DEFINITION
SELECT OBJECT_DEFINITION(OBJECT_ID('HumanResources.uspUpdateEmployeePersonalInfo')) AS DEFINITION 

--xem dinh nghia thu tuc luu tru bang 
SELECT definition FROM sys.sql_modules
WHERE object_id=OBJECT_ID('HumanResources.uspUpdateEmployeePersonalInfo')
GO
--thu tuc luu tru he thong xem cac thanh phan ma thu tuc luu tru phu thuoc
sp_depends 'HumanResources.uspUpdateEmployeePersonalInfo'
GO
USE AdventureWorks
GO
--tao thu tuc luu tru sp_DisplayEmployees
CREATE PROC sp_DisplayEmployees AS
SELECT * FROM HumanResources.Employee
GO
--thay doi thu tuc luu tru sp_DisplayEmployees 
ALTER PROC sp_DisplayEmloyees AS
SELECT * FROM HumanResources.Employee
WHERE Gender='F'
GO
--chay thu tuc luu tru sp_DisplayEmployees
EXEC sp_DisplayEmployees
GO
--xoa mot thu tuc luu tru 
DROP PROC sp_DisplayEmployees
GO

--
CREATE PROC sp_EmloyeeHire
AS
BEGIN
	--Hien thi 
	EXEC sp_DisplayEmployeesHireYear 1999
	DEC @Number int 
	EXEC sp_EmployeesHireYearCount 1999, @Number OUTPUT
	PRINT N'so nhan vien vao lam nam 1999 la: ' + CONVERT(varchar(3), @Number)
END
GO
--chay thu tuc luu tru 
EXEC sp_EmployeeHire
GO
--thay doi thu tuc luu tru sp_EmployeeHire co khoi TRY ... CATCH
ALTER PROC sp_EmployeeHire
@HireYear int
AS 
BEGIN 
	BEGIN TRY 
		EXEC sp_DisplayEmployeesHireYear @HireYear
		DEC @Number int
		--loi xay ra o day co thu tuc sp_EmployysHireYearCount chi tuyen 2 tham so ma ta truyen 3
		EXEC sp_EmployeesHireYearCount @HireYear, @Number OUTPUT, '123'
		PRINT N'so nhan vien vao lam nam la: ' + CONVERT(varchar(3),@Number)
	END TRY
	BEGIN CATCH		
		PRINT N'co loi xay ra trong khi thuc hien thu tuc luu tru'
	END CATCH 
	PRINT N'ket thuc thu tuc luu tru'
END
GO
--chay thu tuc sp_EmployeeHire
EXEC sp_EmloyeeHire 1999
--xem thong bao loi tren Message khong phai ben Result
GO

--thay doi thu tuc luu tru sp_EmloyeeHire su dung ham @@ERROR
ALTER PROC sp_EmployeeHire
	@HireYear int
AS
BEGIN 
	EXEC sp_DisplayEmployeesHireYear @HireYear
	DEC @Number int
	--loi xay ra o day co thu tuc sp_EmployeeHireYearCount chi truyen 2 tham so ma ta truyen 3
	EXEC sp_EmployeesHireYearCount @HireYear, @Number OUTPUT, '123'
	IF @@ERROR <> 0 
		PRINT N'co loi xay ra trong khi thuc hien thu tuc luu tru'
	PRINT N'so nhan vien vao lam nam la: ' + CONVERT(varchar(3), @Number)
END
GO
--chay thu tuc sp_EmployeeHire
EXEC sp_EmloyeeHire 1999 
--xem thong bao loi ben Messages khong phai ben Result