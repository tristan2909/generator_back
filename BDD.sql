DROP TABLE IF EXISTS number_options;

CREATE TABLE IF NOT EXISTS number_options (
    id BIGINT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    minC INT(9),
    maxC INT(9),
    nb INT(9),
    no_repeat INT(1),
    sort INT(1)
);

INSERT INTO number_options(minC, maxC, nb, no_repeat, sort) VALUES (1, 5, 1, 1, 0);

SELECT * FROM number_options;

delete FROM number_options where id <> 1;