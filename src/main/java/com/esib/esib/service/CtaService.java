package com.esib.esib.service;

import com.esib.esib.model.Cta;
import com.esib.esib.repository.CtaRepository;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import javax.transaction.Transactional;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 *
 * @author Meldo Maunze
 */
@Service
@RequiredArgsConstructor
@Data
public class CtaService {

    /**
     *
     */
    private static final Logger logger = Logger.getLogger(CtaService.class.getName());

    /**
     *
     */
    private final CtaRepository ctaRepository;

    // CRUD methods
    /**
     *
     * @param cta
     * @return
     */
    @Transactional
    public Cta create(Cta cta) {
        return ctaRepository.save(cta);
    }

    /**
     *
     * @param id
     * @return
     */
    public Optional<Cta> findById(Long id) {
        return ctaRepository.findById(id);
    }

    /**
     *
     * @return
     */
    public List<Cta> findAll() {
        return ctaRepository.findAll();
    }

    /**
     *
     * @param cta
     * @return
     */
    @Transactional
    public Cta update(Cta cta) {
        return ctaRepository.save(cta);
    }

    /**
     *
     * @param id
     */
    @Transactional
    public void delete(Long id) {
        ctaRepository.deleteById(id);
    }

    /**
     *
     * @param username
     * @return
     */
    public Optional<Cta> findCtaPorUsername(String username) {
        return ctaRepository.findByUsername(username);
    }

    /**
     *
     * @param contacto
     * @return
     */
    public Optional<Cta> findByContacto(String contacto) {

        return ctaRepository.findByContacto(contacto);
    }

    /**
     *
     * @param email
     * @return
     */
    public Optional<Cta> findByEmail(String email) {
        return ctaRepository.findByEmail(email);
    }

}
