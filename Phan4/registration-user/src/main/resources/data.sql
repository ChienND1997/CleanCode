INSERT INTO user(id, name, email, password) VALUES
 (1, 'Alice', 'alice@gmail.com', '123456'),
 (2, 'Bob', 'bob@gmail.com', '123456'),
 (3, 'Hub', 'hub@gmail.com', '123456'),
 (4, 'Foo', 'foo@gmail.com', '123456');

INSERT INTO teacher(phone, experiences, id) VALUES
 ('0981023023', 10, 1),
 ('0967876545',5, 2);

 INSERT INTO student(year, id) VALUES
  (3, 3),
  (4,4);

INSERT INTO course(name, description, location, opened, teacher_id) VALUES
 ('WPYTHON', 'Training SQL', 'HN','20201010',1),
 ('PYTHON', 'Training Python', 'HCM','20210101',2);