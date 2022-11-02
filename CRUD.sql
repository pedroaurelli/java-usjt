-- Create
INSERT INTO tb_pessoa (nome, telefone, email) 
VALUES
('Pedro', '11999999', 'pedro@email.com'),
('Joao', '11999999', 'joao@email.com'),
('Maria', '11999999', 'maria@email.com');

-- Read 
SELECT nome, email FROM tb_pessoa;
SELECT * from tb_pessoa tp ;

-- Update
UPDATE tb_pessoa SET nome='Pedro Aureliano' WHERE id=1;
UPDATE tb_pessoa SET telefone='77887788' WHERE nome='Maria'

-- Delete 
DELETE FROM tb_pessoa WHERE id=2