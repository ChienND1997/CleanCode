INSERT INTO user(full_name) VALUES ('1st Author');
INSERT INTO user(full_name) VALUES ('2nd Author');
INSERT INTO user(full_name) VALUES ('3rd Author');

INSERT INTO post(user_id, title, content) VALUES(1, '1st Author - 1st Post', 'The 1st Post');
INSERT INTO post(user_id, title, content) VALUES(1, '1st Author - 2nd Post', 'The 2nd Post');
INSERT INTO post(user_id, title, content) VALUES(2, '2nd Author - 1st Post', 'The 3rd Post');
INSERT INTO post(user_id, title, content) VALUES(2, '2nd Author - 1st Post', 'The 4th Post');
INSERT INTO post(user_id, title, content) VALUES(3, '3rd Author - 1st Post', 'The 5th Post');
INSERT INTO post(user_id, title, content) VALUES(3, '3rd Author - 2nd Post', 'The 6th Post');

INSERT INTO comment(user_id, post_id, title) VALUES(2, 1, '2nd Author - 1st Post - 1st Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(1, 1, '1st Author - 1st Post - 2nd Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(3, 1, '3rd Author - 1st Post - 3rd Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(1, 2, '1st Author - 2nd Post - 4th Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(1, 2, '1st Author - 2nd Post - 5th Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(1, 4, '1st Author - 4th Post - 6th Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(1, 5, '1st Author - 5th Post - 7th Comment');
INSERT INTO comment(user_id, post_id, title) VALUES(2, 6, '2nd Author - 6th Post - 8th Comment');