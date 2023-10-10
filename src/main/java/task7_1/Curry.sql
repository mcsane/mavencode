DROP DATABASE IF EXISTS currency_converter;
CREATE DATABASE currency_converter;
USE currency_converter;

CREATE TABLE currencies (
    id INT NOT NULL AUTO_INCREMENT,
    currency VARCHAR(3) NOT NULL,
    rate DECIMAL(10, 4) NOT NULL,
    PRIMARY KEY (id)
);
INSERT INTO currencies(currency, rate) VALUES
    ('USD', 1.00),
    ('EUR', 0.85),
    ('GBP', 0.73),
    ('JPY', 110.85),
    ('AUD', 1.36),
    ('CAD', 1.25),
    ('CHF', 0.92),
    ('CNY', 6.45);


DROP USER IF EXISTS 'appuser'@'localhost';
CREATE USER 'appuser'@'localhost' IDENTIFIED BY 'password';

GRANT SELECT, INSERT, UPDATE, DELETE ON currency_converter.* TO 'appuser'@'localhost';
GRANT CREATE, DROP ON currency_converter.* TO 'appuser'@'localhost';

-- testaus
SELECT * FROM currencies;
SELECT * FROM transactions;
SELECT * FROM currencies WHERE abbreviation = 'EUR';
SELECT COUNT(*) FROM currencies;
SELECT * FROM currencies ORDER BY conversion_rate DESC LIMIT 1;