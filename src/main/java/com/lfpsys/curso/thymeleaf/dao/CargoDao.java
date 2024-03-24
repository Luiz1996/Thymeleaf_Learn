package com.lfpsys.curso.thymeleaf.dao;

import java.util.List;

import com.lfpsys.curso.thymeleaf.domain.Cargo;
import com.lfpsys.curso.thymeleaf.util.PaginacaoUtil;

public interface CargoDao {

    void save(Cargo cargo );

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();
    
    PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);
}
