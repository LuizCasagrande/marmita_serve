CREATE TABLE ALERGIA(
ID INTEGER AUTO_INCREMENT NOT NULL PRIMARY KEY,
ID_CLIENTE INTEGER NOT NULL,
ID_INGREDIENTE INTEGER NOT NULL,
CONSTRAINT FK_ALERGIA_CLIENTE FOREIGN KEY (ID_CLIENTE) REFERENCES CLIENTES (ID),
CONSTRAINT FK_ALERGIA_ALERGIA FOREIGN KEY (ID_INGREDIENTE) REFERENCES INGREDIENTES(ID)
);
