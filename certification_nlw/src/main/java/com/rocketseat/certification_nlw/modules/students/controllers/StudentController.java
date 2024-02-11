package com.rocketseat.certification_nlw.modules.students.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rocketseat.certification_nlw.modules.students.studentsDTO.VerifyifHasCertificationDTO;
import com.rocketseat.certification_nlw.modules.students.useCases.VerifyifHasCertificationUseCase;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private VerifyifHasCertificationUseCase verifyifHasCertificationUseCase;
	
	@PostMapping("/verifyifHasCertification")
	public String verifyifHasCertification(@RequestBody VerifyifHasCertificationDTO verifyifHasCertificationDTO) {
		
		var result = this.verifyifHasCertificationUseCase.execute(verifyifHasCertificationDTO);
		
		if(result) {
			return "Usuario ja fez a prova";
		}
		return "Usuario poder fazer a prova";
	}
}
