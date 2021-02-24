--<ScriptOptions statementTerminator=";"/>

ALTER TABLE alumno DROP PRIMARY KEY;

ALTER TABLE curso DROP PRIMARY KEY;

ALTER TABLE asignacion DROP PRIMARY KEY;

ALTER TABLE contacto DROP PRIMARY KEY;

ALTER TABLE domicilio DROP PRIMARY KEY;

ALTER TABLE alumno DROP INDEX fk_contacto_idx;

ALTER TABLE asignacion DROP INDEX fk_curso_idx;

ALTER TABLE alumno DROP INDEX fk_domicilio_idx;

ALTER TABLE asignacion DROP INDEX fk_alumno_idx;

DROP TABLE contacto;

DROP TABLE curso;

DROP TABLE domicilio;

DROP TABLE asignacion;

DROP TABLE alumno;

CREATE TABLE contacto (
	id_contacto INT NOT NULL,
	telefono VARCHAR(45),
	email VARCHAR(45),
	PRIMARY KEY (id_contacto)
);

CREATE TABLE curso (
	id_curso INT NOT NULL,
	nombre VARCHAR(45),
	precio DOUBLE,
	PRIMARY KEY (id_curso)
);

CREATE TABLE domicilio (
	id_domicilio INT NOT NULL,
	calle VARCHAR(45),
	no_calle VARCHAR(45),
	pais VARCHAR(45),
	PRIMARY KEY (id_domicilio)
);

CREATE TABLE asignacion (
	id_asignacion INT NOT NULL,
	id_alumno INT,
	id_curso INT,
	turno VARCHAR(45),
	PRIMARY KEY (id_asignacion)
);

CREATE TABLE alumno (
	id_alumno INT NOT NULL,
	id_domicilio INT,
	id_contacto INT,
	nombre VARCHAR(45),
	apellido VARCHAR(45),
	PRIMARY KEY (id_alumno)
);

CREATE INDEX fk_contacto_idx ON alumno (id_contacto ASC);

CREATE INDEX fk_curso_idx ON asignacion (id_curso ASC);

CREATE INDEX fk_domicilio_idx ON alumno (id_domicilio ASC);

CREATE INDEX fk_alumno_idx ON asignacion (id_alumno ASC);

