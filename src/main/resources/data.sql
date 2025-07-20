

INSERT INTO profile (name, title, location, summary, street, city, country) VALUES (
'Prashan Srivastava', 'Backend/DuckCreek Developer', 'Pune', 'Experienced engineer with strong Java/Spring Boot skills',
'SampleStreet', 'Pune', 'India'
);

INSERT INTO contact ( email, linkedin, github, profile_id)
VALUES ( 'prashansrivastava77@gmail.com', 'https://www.linkedin.com/in/prashan-srivastava-43b260169/', 'https://github.com/Prashan070', 1);

INSERT INTO experience (company, position, start_date, end_date, profile_id)
VALUES
( 'Coforge', 'Senior Software Engineer', '2021-01-01', '2025-07-21', 1),
( 'Capgemini', 'Software Engineer', '2019-06-01', '2020-12-31', 1);

INSERT INTO skill ( name, skill_level, profile_id)
VALUES
( 'Java', 'ADVANCED', 1),
( 'Spring Boot', 'ADVANCED', 1),
( 'RESTful WebServices', 'ADVANCED', 1),
( 'RDBMS', 'INTERMEDIATE', 1);

INSERT INTO contact_phone_number ( contact_id, phone_number)
VALUES
(1, '+91-9999999999'),
(1, '+91-9999999998');
