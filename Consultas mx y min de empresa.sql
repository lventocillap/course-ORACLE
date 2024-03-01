
select count(*) 'Numero_total_de_filas' from Products 

select ProductID as 'Id_del_prudcto', 
ProductName as 'Nombre_del_producto',
SupplierID as 'ID_del_Proveedor',
CategoryID as 'ID_de_la_categoria'
from Products

select * from Products

select avg(UnitPrice) from Products
select avg(UnitPrice) as promedio_de_categoria_2 from Products where CategoryID in (2, 8)

select * from Products where UnitPrice between 20 and 50
select * from Products where (UnitPrice between 50 and 60) and Discontinued = 0

select sum(UnitPrice) from Products 
select CategoryID, avg(UnitPrice) as 'promedio' from Products Group by CategoryID

select CategoryID, sum(UnitPrice) as 'Suma_de_Categoria'from Products Group by CategoryID
select * from Products where ProductName like '[^A-E]%'

select min(UnitPrice) as precio_minimo, max(UnitPrice) as precio_maximo from Products
select * from Products where UnitPrice between min(UnitPrice) AND max(UnitPrice)

SELECT * FROM PRODUCTS
WHERE UnitPrice BETWEEN (SELECT MIN(UNITPRICE) FROM Products) AND (SELECT MAX(UNITPRICE)/2 FROM Products)
ORDER BY UnitPrice ASC

select ProductID, ProductName from Products where CategoryID = 1
union
select ProductID, ProductName from Products where CategoryID = 2

SELECT * FROM Territories
SELECT * FROM Region

SELECT TerritoryID,TerritoryDescription,
case 
when RegionID=1 then 'Eastem'
when RegionID=2 then 'Westem'
when RegionID=3 then 'Northem'
when RegionID=4 then 'Southern'
else 'NO HAY REGION'
end as Region
FROM Territories
