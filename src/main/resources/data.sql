INSERT INTO departamento (id, nome, sigla) VALUES
  (1, 'Recursos Humanos', 'RH'),
  (2, 'Desenvolvimento', 'DEV'),
  (3, 'Suporte', 'SUP');


INSERT INTO funcao (id, nome, cbo) VALUES
  (1, 'Auxiliar Administrativo', '4110-10'),
  (2, 'Analista de Desenvolvimento de Sistemas ', '2124-05'),
  (3, 'Suporte', '3172-10');



INSERT INTO funcionario (id, matricula,id_departamento,id_funcao) VALUES
  (1, '123', 1,1);

INSERT INTO dados_basicos (id, nome,cpf,rg,nome_pai,nome_mae,id_funcionario) VALUES
  (1, 'teste', '000.000.000-00','12345678','joao','maria',1);


INSERT INTO endereco (id, endereco,descricao,complemento,cep,bairro,cidade,uf,id_funcionario) VALUES
  (1, 'Rua 10', 'Minha Casa','Numero 0','74000','Bairro','Goiania','GO',1);


INSERT INTO contato (id, contato,tipo_contato,id_funcionario) VALUES
  (1, '111111', '1',1);


INSERT INTO registro_ponto (id,id_funcionario, data,entrada1,saida1,entrada2,saida2) VALUES
  (1, 1,
  DATE '2021-01-01',
  TIMESTAMP '2021-01-01 08:00:00',
  TIMESTAMP '2021-01-01 12:00:00',
  TIMESTAMP '2021-01-01 14:00:00',
  TIMESTAMP '2021-01-01 18:00:00'),
  (2, 1,
  DATE '2021-01-02',
  TIMESTAMP '2021-01-02 08:00:00',
  TIMESTAMP '2021-01-02 12:00:00',
  TIMESTAMP '2021-01-02 14:00:00',
  TIMESTAMP '2021-01-02 18:00:00'),
  (3, 1,
  DATE '2021-01-03',
  TIMESTAMP '2021-01-03 08:00:00',
  TIMESTAMP '2021-01-03 12:00:00',
  TIMESTAMP '2021-01-03 14:00:00',
  TIMESTAMP '2021-01-03 18:00:00'),
  (4, 1,
  DATE '2021-01-04',
  TIMESTAMP '2021-01-04 08:00:00',
  TIMESTAMP '2021-01-04 12:00:00',
  TIMESTAMP '2021-01-04 14:00:00',
  TIMESTAMP '2021-01-04 18:00:00'),
  (5, 1,
  DATE '2021-01-05',
  TIMESTAMP '2021-01-05 08:00:00',
  TIMESTAMP '2021-01-05 12:00:00',
  TIMESTAMP '2021-01-05 14:00:00',
  TIMESTAMP '2021-01-05 18:00:00'),
  (6, 1,
  DATE '2021-01-06',
  TIMESTAMP '2021-01-06 08:00:00',
  TIMESTAMP '2021-01-06 12:00:00',
  TIMESTAMP '2021-01-06 14:00:00',
  TIMESTAMP '2021-01-06 18:00:00');