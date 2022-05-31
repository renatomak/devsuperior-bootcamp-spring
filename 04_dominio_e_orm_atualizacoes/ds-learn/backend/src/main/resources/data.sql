INSERT INTO tb_user (name, email, password) VALUES ('Alex Brown', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Bob Brown', 'bob@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria Green', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Renato Marques', 'renato@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (4, 3);

INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Java', 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png', 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('Spring', 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png', 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png');
INSERT INTO tb_course (name, img_uri, img_gray_uri) VALUES ('MySQL', 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png', 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png');

INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('1.0', TIMESTAMP WITH TIME ZONE '2020-11-13T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-11-13T03:00:00Z', 1);
INSERT INTO tb_offer (edition, start_moment, end_moment, course_id) VALUES ('2.0', TIMESTAMP WITH TIME ZONE '2020-12-13T03:00:00Z', TIMESTAMP WITH TIME ZONE '2021-12-13T03:00:00Z', 1);

INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Trilha HTML', 'Trilha principal do curso', 1, 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png', 1, 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Forum', 'Tire suas duvidas', 2, 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png', 2, 1);
INSERT INTO tb_resource (title, description, position, img_uri, type, offer_id) VALUES ('Lives', 'Lives exclusivas para a turma', 3, 'https://sinajuve.ibict.br/wp-content/uploads/2020/08/%C3%ADcone-cursos.png', 0, 1);