CREATE DATABASE database_snapshot_name
ON 
(
NAME=logical_file_name,
FILENAME='os_file_name'
) [,...n]
AS SNAPSHOT OF sources_database_name
[;]