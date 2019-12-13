SELECT sum(P.VALOR_TOTAL) FROM PEDIDO P WHERE P.PAGO = 1 AND P.ID_CLIENTE = :id and P.DATA >= :dataInicial and P.DATA <= :dataFinal
