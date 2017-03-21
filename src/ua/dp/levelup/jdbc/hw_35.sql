# create database address_book;
use address_book;
drop table IF EXISTS street;
create table street (id INT AUTO_INCREMENT PRIMARY KEY , street_name VARCHAR(64) UNIQUE , INDEX(id));

drop table IF EXISTS citizen;
create table citizen
(id INT AUTO_INCREMENT , first_name VARCHAR(32) NOT NULL , last_name VARCHAR(32) NOT NULL ,
  age TINYINT UNSIGNED NOT NULL , street_id INT NULL, PRIMARY KEY(id), FOREIGN KEY (street_id) REFERENCES street(id));

INSERT into street (street_name) VALUE ('Гоголя');
INSERT into street (street_name) VALUE ('Рабочая');
INSERT into street (street_name) VALUE ('Глинки');
INSERT into street (street_name) VALUE ('Литейная');
INSERT into street (street_name) VALUE ('Гагарина');

TRUNCATE citizen;
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Вася', 'Пупкин', 30, 1);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Гейб', 'Ньюэл', 52, 2);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Людвиг', 'Аристархович', 30, NULL);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Петр', 'Первый', 99, 3);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Всеволод', 'Рождественский', 70, NULL);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Андрей', 'Полетаев', 29, 4);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Андрей', 'Полетаев', 29, 4);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Дэвид', 'Бкхэм', 39, 4);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Петр', 'Порошенко', 57, NULL);
INSERT into citizen (first_name, last_name, age, street_id) VALUES ('Виктор', 'Янукович', 67, NULL);

# Вывести общее число жителей
select count(*) from citizen;
# Вывести средний возраст жителей
select avg(age) from citizen;
# Вывести отсортированный по алфавиту список фамилий без повторений
select DISTINCT last_name from citizen order by last_name;
# Вывести список фамилий, с указанием количества повторений этих фамилий в общем списке
select last_name, count(*) as repeated from citizen GROUP BY last_name;
# Вывести фамилии, которые содержат в середине букву «n»
select DISTINCT  last_name from citizen where last_name like '%а%';
# Вывести список «бомжей»
select * from citizen where street_id is NULL;
# Вывести список несовершеннолетних, проживающих на улице
select * from citizen where age < 18;
# Вывести упорядоченный по алфавиту список всех улиц с указанием, сколько жильцов живет на улице
select street_name, (select count(*) from citizen where citizen.street_id = street.id) as count from street ORDER BY street_name;
# Вывести список улиц, название которых состоит из 6-ти букв
select street_name from street where LENGTH(street_name) = 6;
# Вывести список улиц с количеством жильцов на них меньше 3
select street_name from street where (select count(*) from citizen where citizen.street_id = street.id) < 3