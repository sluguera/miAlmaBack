USE master ;  
GO  
Create database almacenMiAlma;
go
use almacenMiAlma;
go
Create table cliente(
cedula varchar(15)  primary key,
nombre varchar(50)
);
go
Create table producto(
id int primary key identity(1,1),
nombre varchar(100),
descripcion varchar(200),
imagen varchar(400),
precio float
);
create table precio(
 idproducto int primary key identity(1,1),
 valor float
)
go
Create table pedido(
id int identity(1,1),
idproducto int, 
idcliente varchar(15),
fechacompra date,
detalle varchar(200),
FOREIGN KEY (idProducto) REFERENCES producto(id),
FOREIGN KEY (idCliente) REFERENCES cliente(cedula),
);
go
CREATE PROCEDURE registrarCliente
@cedula VARCHAR(15), 
@nombre VARCHAR(50)
AS 
INSERT INTO cliente (cedula,nombre)
VALUES (@cedula, @nombre)
GO
/* editar cliente*/
CREATE PROCEDURE editarCliente 
@cedula VARCHAR(15),
@nombre VARCHAR(50)
AS 
update cliente set nombre = @nombre
where cedula = @cedula
GO

/*eliminar cliente*/
CREATE PROCEDURE eliminarcliente 
@cedula VARCHAR(15)
AS 
delete cliente where cedula = @cedula
GO

/* crear pedido */
CREATE PROCEDURE registrarPedido
@idproducto int, 
@idcliente VARCHAR(15),
@fechacompra date,
@detalle VARCHAR(200)
AS 
INSERT INTO pedido (idproducto,idcliente,fechacompra,detalle)
VALUES (@idProducto, @idCliente, @fechaCompra, @detalle)
GO

/*Editar pedido*/
CREATE PROCEDURE editarPedido
@id INT,
@idproducto int, 
@idcliente VARCHAR(15),
@fechacompra DATE ,
@detalle VARCHAR(200)
AS 
update pedido set fechacompra=@fechacompra,detalle=@detalle
 where id=@id
GO

/*Eliminar pedido*/
CREATE PROCEDURE eliminarPedido
@id int
AS 
delete pedido where id=@id
GO

/*crear producto*/
CREATE PROCEDURE registrarProducto
@nombre varchar(100),
@descripcion varchar(200),
@imagen varchar(400),
@precio float
AS
INSERT INTO producto (nombre,descripcion,imagen,precio)
VALUES (@nombre, @descripcion,@imagen,@precio)
GO
/*editar producto*/
CREATE PROCEDURE editarproducto 
@id int,
@nombre varchar(100),
@descripcion varchar(200),
@imagen varchar(400),
@precio float
AS 
update producto set nombre = @nombre, descripcion = @descripcion, imagen=@imagen, precio=@precio
where id = @id
GO
/*eliminar producto*/
CREATE PROCEDURE eliminarproducto 
@id int
AS 
delete producto
where id = @id
GO

create procedure registrarPrecio
@valor float
as
 insert into precio(valor) values(@valor)
GO

create procedure eliminarPrecio
@id int
as
 delete  precio where idproducto=@id
GO

create procedure actualizarPrecio
@id int,
@precio float
as
 update  precio set valor=@precio where idproducto=@id
GO
