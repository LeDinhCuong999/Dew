SELECT SalesOrderID, CustomerID, SalePersonID, TerritoryID, YEAR(OrderDate)
AS CurrentYear, YEAR(OrderDate)+1 AS NextYear
FROM Sales.SalesOrderHeader