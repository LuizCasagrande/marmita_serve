SELECT P.ID as id, NOME as nome, pt.QUANTIDADE as quantidade , TA.PESO_MARMITA as peso, P.VALOR_TOTAL as valorTotal, SUM(pt.VALOR_TOTAL)  as valorTotalPorPeso FROM  PEDIDO P INNER JOIN CLIENTES AS C
ON P.ID_CLIENTE = C.ID INNER JOIN PEDIDO_TAMANHO pt inner join TAMANHOS TA on pt.ID_TAMANHO = TA.ID LEFT JOIN PEDIDO AS PI ON pt.ID_PEDIDO =
PI.ID INNER JOIN TAMANHOS AS t ON t.ID = pt.ID_TAMANHO where P.DIA_SEMANA = :diaSemana GROUP BY TA.ID, TA.PESO_MARMITA
