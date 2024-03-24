package com.lfpsys.curso.thymeleaf.web.validator;

import java.time.LocalDate;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.lfpsys.curso.thymeleaf.domain.Funcionario;

public class FuncionarioValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return Funcionario.class.equals(clazz);
	}

	@Override
	public void validate(Object object, Errors errors) {
		Funcionario f = (Funcionario) object;
		
		LocalDate entrada = f.getDataEntrada();
		
		if (f.getDataEntrada() != null && f.getDataSaida() != null && f.getDataSaida().isBefore(entrada)) {
  		errors.rejectValue("dataSaida", "PosteriorDataEntrada.funcionario.dataSaida");
		}
	}
}
