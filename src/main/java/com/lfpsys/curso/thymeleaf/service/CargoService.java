package com.lfpsys.curso.thymeleaf.service;

import com.lfpsys.curso.thymeleaf.domain.Cargo;
import com.lfpsys.curso.thymeleaf.util.PaginacaoUtil;
import java.util.List;

public interface CargoService {

	void salvar(Cargo cargo);
	
	void editar(Cargo cargo);
	
	void excluir(Long id);
	
	Cargo buscarPorId(Long id);
	
	List<Cargo> buscarTodos();
	
	boolean cargoTemFuncionarios(Long id);
	
	PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);
}
