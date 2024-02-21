package com.esib.esib.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.esib.esib.modelo.Bibliotecario;

@Repository
public interface BibliotecarioRepository extends JpaRepository<Bibliotecario, Long> {

    @Query(value = " SELECT b from Bibliotecario b where b.utilizador.nome =:nome")
    List<Bibliotecario> findByutilizadorNome(@Param("nome") String nome);

    @Query(value = " SELECT b from Bibliotecario b where b.faculdade.descricao =:descricao")
    List<Bibliotecario> findByIdFaculdade(@Param("descricao") String descricao);

    @Query(value = " SELECT b from Bibliotecario b where b.utilizador.contacto =:contacto")
    Optional<Bibliotecario> findBibliotecarioPorContacto(@Param("contacto") String contacto);

    @Query(value = " SELECT b from Bibliotecario b where b.utilizador.username =:username")
    Optional<Bibliotecario> findBibliotecarioPorUsername(@Param("username") String username);

    @Query(value = " SELECT b from Bibliotecario b where b.utilizador.email =:email")
    Optional<Bibliotecario> findBibliotecarioPorEmail(@Param("email") String email);

}
