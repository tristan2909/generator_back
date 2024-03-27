DROP TABLE IF EXISTS number_options;

CREATE TABLE IF NOT EXISTS number_options (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    minC INT(9),
    maxC INT(9),
    nb INT(9),
    no_repeat BOOLEAN,
    sort BOOLEAN
);

INSERT INTO number_options(minC, maxC, nb, no_repeat, sort) VALUES (1, 5, 1, TRUE, FALSE);

SELECT * FROM number_options;

DELETE FROM number_options WHERE id <> 1;

DROP TABLE IF EXISTS password_options;

CREATE TABLE IF NOT EXISTS password_options (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    no_repeat BOOLEAN,
    lengthC INT(9),
    use_digits BOOLEAN,
    use_spec_chars BOOLEAN,
    only_digits BOOLEAN,
    only_hexa BOOLEAN
);

INSERT INTO password_options(no_repeat, lengthC, use_digits, use_spec_chars, only_digits, only_hexa) VALUES (TRUE, 5, TRUE, TRUE, TRUE, TRUE);

SELECT * FROM password_options;

DELETE FROM password_options WHERE id <> 1;