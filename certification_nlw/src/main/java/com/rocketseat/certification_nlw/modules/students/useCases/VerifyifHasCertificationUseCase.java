package com.rocketseat.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import com.rocketseat.certification_nlw.modules.students.studentsDTO.VerifyifHasCertificationDTO;

@Service
public class VerifyifHasCertificationUseCase {
	public boolean execute( VerifyifHasCertificationDTO dto) {
		if(dto.getEmail().equals("joao.fnnt@gmail.com") && dto.getTecnology()
				.equals("JAVA")) {
			return true;
		}
		return false;
	}
}
