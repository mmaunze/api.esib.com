package com.esib.esib.model.dto;

import java.util.logging.Logger;
import lombok.Data;

/**
 *
 * @author Meldo Maunze
 */
@Data

public class MultaDTO {

    /**
     *
     */
    private static final Logger logger = Logger.getLogger(MultaDTO.class.getName());

    /**
     *
     */
    private Long id;

    /**
     *
     */
    private Double valor;

    /**
     *
     */
    private Long emprestimo;

    /**
     *
     */
    private String estado;

}
