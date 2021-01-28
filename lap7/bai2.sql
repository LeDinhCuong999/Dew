CREATE DATABASE CodeLean 

CREATE TABLE classes (
	classname char(6),
	teacher varchar(30),
	timeslot varchar(30),
	class int,
	lab int
)
GO 
INSERT INTO classes VALUES ('T2010A','DANG KIM THI','13H30-17H30',1,1)
GO 
SELECT * FROM classes 
GO

CREATE UNIQUE INDEX MyClusteredIndex ON classes
CREATE CLUSTERED INDEX MyClusteredIndex ON classes


CREATE NONCLUSTERED INDEX TeacherIndex ON teacher 


DROP INDEX TeacherIndex ON teacher 


ALTER INDEX MyClusteredIndex ON classes REBUILD WITH(FILLFACTOR=60)


CREATE INDEX ClassLabIndex ON classes 
CREATE INDEX ClassLabIndex ON lab


DBCC SHOW_STATISTICS(classes, Statistics_classes)