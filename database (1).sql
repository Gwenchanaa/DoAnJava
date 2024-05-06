create database leatherManagerSystem
go
use leatherManagerSystem;

create table Customers(
CustomerID nvarchar(7) not null primary key,
CustomerName nvarchar(100) not null,
CustomerPhone nvarchar(20) not null,
CustomerAddress nvarchar(20) not null,
Statuss int											--	FIX
);

create table Companies(
CompanyID nvarchar(7) not null primary key,
CompanyName nvarchar(100) not null,
Statuss int											--	FIX
);

create table Categories(
CategoryID nvarchar(7) not null primary key,
CategoryName nvarchar(50) not null,
Statuss int											--	FIX
);

create table Products(
ProductID nvarchar(7) not null primary key,
ProductName nvarchar(50) not null,
ProductQuantity int not null,
ProductPrice money not null,
ProductImage nvarchar(100) not null,
CategoryID nvarchar(7) not null,
Statuss int											--	FIX
foreign key (CategoryID) references [Categories](CategoryID)
);

create table Users( 
UserID nvarchar(7) not null primary key,
UserPassword nvarchar(20) not null,
UserName nvarchar(100) not null,
UserRoll nvarchar(5),								--	FIX
Statuss int											--	FIX
);

create table Orders(
OrderID nvarchar(7) not null primary key, 
UserID nvarchar(7) not null,
CustomerID nvarchar(7) not null,
OrderDate date not null,
Statuss int,										--	FIX
TotalPrice money
Foreign key (UserID) references [Users](UserID),
Foreign key (CustomerID) references [Customers](CustomerID)
);

CREATE TABLE OrderDetails (
    OrderID nvarchar(7) not null,
    ProductID nvarchar(7) not null,
    OrderPrice money not null,
    OrderQuantity smallint not null,
    PRIMARY KEY (OrderID, ProductID),
    FOREIGN KEY (OrderID) REFERENCES Orders(OrderID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);


create table Receipts(
ReceiptID nvarchar(7) not null primary key, 
ReceiptCompany nvarchar(7) not null,
UserID nvarchar(7) not null,
ReceiptDate date not null,
Statuss int,										--	FIX
TotalPrice money 
Foreign key (UserID) references [Users](UserID),
Foreign key (ReceiptCompany) references [Companies](CompanyID)
);

CREATE TABLE ReceiptDetails (
    ReceiptID nvarchar(7) not null,
    ProductID nvarchar(7) not null,
    ReceiptPrice money not null,
    ReceiptQuantity smallint not null,
    PRIMARY KEY (ReceiptID, ProductID),
    FOREIGN KEY (ReceiptID) REFERENCES Receipts(ReceiptID),
    FOREIGN KEY (ProductID) REFERENCES Products(ProductID)
);
/*Kho hàng
mã quản lý trỏ khóa ngoại vào người dùng Users
*/



-- Insert customer
INSERT INTO Customers (CustomerID, CustomerName, CustomerPhone, CustomerAddress, Statuss)
VALUES ('cus1', N'Nguyễn Văn A', '0911111111', N'123 Đường A', 1);

INSERT INTO Customers (CustomerID, CustomerName, CustomerPhone, CustomerAddress, Statuss)
VALUES ('cus2', N'Trần Thị B', '0123456780', N'456 Đường B', 1);

INSERT INTO Customers (CustomerID, CustomerName, CustomerPhone, CustomerAddress, Statuss)
VALUES ('cus3', N'Lê Văn C', '0123456781', N'789 Đường C', 1);

INSERT INTO Customers (CustomerID, CustomerName, CustomerPhone, CustomerAddress, Statuss)
VALUES ('cus4', N'Phạm Thị D', '0123456782', N'321 Đường D', 1);

INSERT INTO Customers (CustomerID, CustomerName, CustomerPhone, CustomerAddress, Statuss)
VALUES ('cus5', N'Hoàng Văn E', '0922222222', N'654 Đường E', 1);

-- Insert company
INSERT INTO Companies(CompanyID, CompanyName, Statuss)
VALUES ('cty1', N'Cty sản xuất da', 1);

INSERT INTO Companies(CompanyID, CompanyName, Statuss)
VALUES ('cty2', N'Cty dệt Sài Gòn', 1);

INSERT INTO Companies(CompanyID, CompanyName, Statuss)
VALUES ('cty3', N'Cty Cao Su Kenda', 1);

-- Insert category
INSERT INTO Categories (CategoryID, CategoryName, Statuss)
VALUES ('cate1', N'Quần', 1);

INSERT INTO Categories (CategoryID, CategoryName, Statuss)
VALUES ('cate2', N'Áo', 1);

INSERT INTO Categories (CategoryID, CategoryName, Statuss)
VALUES ('cate3', N'Giày', 1);

INSERT INTO Categories (CategoryID, CategoryName, Statuss)
VALUES ('cate4', N'Phụ kiện', 1);


-- Insert products
INSERT INTO Products (ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage, CategoryID, Statuss)
VALUES ('pro1', N'vi da mau den', 10, 50000, N'D:\04.PTTKhttt\images\anh1.png', 'cate4', 1);

INSERT INTO Products (ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage, CategoryID, Statuss)
VALUES ('pro2', N'that lung da bo', 5, 75000, N'D:\04.PTTKhttt\images\anh2.png', 'cate4', 1);

INSERT INTO Products (ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage, CategoryID, Statuss)
VALUES ('pro3', N'ao thun trang', 3, 120000, N'D:\04.PTTKhttt\images\anh3.png', 'cate2', 1);

INSERT INTO Products (ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage, CategoryID, Statuss)
VALUES ('pro4', N'quan jeans xanh', 8, 90000, N'D:\04.PTTKhttt\images\anh4.png', 'cate1', 1);

INSERT INTO Products (ProductID, ProductName, ProductQuantity, ProductPrice, ProductImage, CategoryID, Statuss)
VALUES ('pro5', N'giay the thao nam', 12, 60000, N'D:\04.PTTKhttt\images\anh5.png', 'cate3', 1);

-- Insert Users
INSERT INTO Users (UserID, UserPassword, UserName, UserRoll)
VALUES ('user1', '123', N'Nguyễn Văn A', 'user');

INSERT INTO Users (UserID, UserPassword, UserName, UserRoll)
VALUES ('user2', '123', N'Trần Thị B', 'user');

INSERT INTO Users (UserID, UserPassword, UserName, UserRoll)
VALUES ('admin1', '123', N'Phạm Thị D', 'admin');

INSERT INTO Users (UserID, UserPassword, UserName, UserRoll)
VALUES ('admin2', '123', N'Hoàng Văn E', 'admin');


