package com.esib.esib.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Table(name = "pagamento_multa")
@Data // Lombok annotation para gerar getters, setters e outros métodos
public class PagamentoMulta {

    @Id // Identifica a propriedade como chave primária
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "pagamentoMultaSequenceGenerator")
    @GenericGenerator(name = "pagamentoMultaSequenceGenerator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
            @org.hibernate.annotations.Parameter(name = "sequence_name", value = "pagamento_multa_id_pagamento_seq"),
            @org.hibernate.annotations.Parameter(name = "initial_value", value = "1"),
            @org.hibernate.annotations.Parameter(name = "increment_size", value = "1")
    })
    @Column(name = "id_pagamento")
    private Integer idPagamento;

    @ManyToOne(fetch = FetchType.EAGER) // Opcionalmente, especifique aqui o comportamento de carregamento
    @JoinColumn(name = "id_multa", nullable = false)
    private Multa multa;

    @Column(name = "valor_pago", nullable = false)
    private Double valorPago;

    @Column(name = "data_pagamento", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date dataPagamento;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "id_bibliotecario", nullable = false)
    private Bibliotecario bibliotecario;

}