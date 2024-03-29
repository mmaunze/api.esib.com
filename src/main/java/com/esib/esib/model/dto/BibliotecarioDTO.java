package com.esib.esib.model.dto;

import java.util.logging.Logger;
import lombok.Data;

/**
 *
 * @author Meldo Maunze
 */
@Data
public class BibliotecarioDTO {

    /**
     *
     */
    private static final Logger logger = Logger.getLogger(BibliotecarioDTO.class.getName());

    /**
     *
     */
    private Long id;

    /**
     *
     */
    private String nome;

    /**
     *
     */
    private Long contacto;

    /**
     *
     */
    private String email;

    /**
     *
     */
    private Character sexo;

    /**
     *
     */
    private String username;

    /**
     *
     */
    private String areaCientifica;

    /**
     *
     */
    private String departamento;

    /**
     *
     */
    private String faculdade;

}
