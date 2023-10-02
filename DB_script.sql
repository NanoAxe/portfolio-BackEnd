create DATABASE db_portfolio;
use db_portfolio;

create table usuario (
	id_u int AUTO_INCREMENT PRIMARY KEY,
	usuario varchar(255),
	contrasena varchar(255),
	correo varchar(255)
);

create table perfiles(
	id_perfil int AUTO_INCREMENT PRIMARY KEY,
    about_me varchar(255),
    banner varchar(255),
    dir_banner varchar(255),
    dir_foto varchar(255),
    foto varchar(255),
    nombre varchar(255),
    titulo varchar(255),
    id_u int,
    FOREIGN KEY(id_u) REFERENCES usuario(id_u)
);

create table domicilio(
	id_d int AUTO_INCREMENT PRIMARY KEY,
    barrio varchar(255),
    calle varchar(255),
    id_usuario int,
    numero int,
    pais varchar(255),
    provincia varchar(255),
    FOREIGN KEY(id_usuario) REFERENCES usuario(id_u)
);

create table educacion(
	id_edu int AUTO_INCREMENT PRIMARY KEY,
    institucion varchar(255),
    titulo varchar(255),
    periodof int,
    periodoi int,
    icono_ins varchar(255),
    dir_icono varchar(255),
    id_u int,
    FOREIGN KEY (id_u) REFERENCES usuario(id_u)
);

create table experiencia(
	id_exp int AUTO_INCREMENT PRIMARY KEY,
    lugar varchar(255),
    puesto varchar(255),
    descripcion varchar(255),
    logo_org varchar(255),
    dir_logo varchar(255),
    periodof int,
    periodoi int,
    id_u int,
    FOREIGN KEY(id_u) REFERENCES usuario(id_u)
);

create table habilidad(
	id_h int AUTO_INCREMENT PRIMARY KEY,
    descripcion varchar(255),
    nivel varchar(255),
    id_u int,
    FOREIGN KEY(id_u) REFERENCES usuario(id_u)
);

create table proyectos(
	id_pj int AUTO_INCREMENT PRIMARY KEY,
    proyecto varchar(255),
    descripcion varchar(255),
    enlace varchar(255),
    fechaf int,
    fechai int,
    icono_pj varchar(255),
    dir_icono_pj varchar(255),
    id_u int,
    FOREIGN KEY(id_u) REFERENCES usuario(id_u)
);

INSERT into usuario(usuario,contrasena,correo) values("Miguel015","Miguel015","timoteoalexblade@gmail.com");

INSERT into perfiles (nombre, titulo, about_me, banner, dir_banner,foto ,dir_foto,id_u)
values("Miguel Alejandro Barconte", "Full Stack Developer Jr.", " apasionado por no morir de hambre. Enfocado en nada. Comprometido con [buscar solucion a problemas]. Habilidades en [ns xd]. Aspiro a [a no morir de hambre].",  "banner.jpg", "../../../assets/Imagenes/banner.jpg", "perfil.png", "../../../assets/Imagenes/perfil.png", 1);


select * from educacion;
update perfiles set dir_foto = "../../../assets/Imagenes/perfil.jpg" where id_perfil=1;