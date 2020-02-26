BEGIN;

DROP TABLE IF EXISTS product CASCADE;
CREATE TABLE product (id bigserial PRIMARY KEY, title VARCHAR(255), price numeric(8, 2));
INSERT INTO product (title, price) VALUES
('women''s dress', 35500.00),
('women''s boots', 20500.00),
('men''s shoes', 5900.00),
('electric drill', 6500.00),
('screwdriver', 12450.00),
('winter tires', 48000.00),
('perfume', 18240.00),
('shaving cream', 190.00),
('robot vacuum cleaner', 25500.00),
('Tefal frying pan', 5500.00),
('computer keyboard', 1820.00),
('computer mouse', 3500.00),
('glasses case', 1200.00),
('shaver', 35000.00),
('table clock', 8200.00),
('headphones', 16350.00),
('computer chair', 52300.00),
('bedroom Slippers', 3100.00),
('electric chandelier', 7500.00),
('dashboard camera', 12160.00);

COMMIT;