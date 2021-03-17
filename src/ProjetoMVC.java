

import Controller.*;
import Model.*;
import View.*;

public class ProjetoMVC {

	public static void main(String[] args) {
		
		Escola escolaModel = new Escola("Católica de Santa Catarina");
		EscolaView escolaView = new EscolaView();
		EscolaController escolaController = new EscolaController(escolaModel, escolaView);
		
		escolaController.printEscolaDetalhe();
		
		Diretor diretorModel = new Diretor("Maurício", escolaModel);	
		DiretorView diretorView = new DiretorView();
		DiretorController diretorController = new DiretorController(diretorModel, diretorView);
		
		diretorController.printDiretorDetalhe();
		
		Professor professorModel = new Professor("Joe Vogel", escolaModel, "Arquitetura");	
		ProfessorView professorView = new ProfessorView();
		ProfessorController professorController = new ProfessorController(professorModel, professorView);
		
		professorController.printProfessorDetalhe();
		
		
		Estudante estudanteModel = new Estudante("G",5,escolaModel);	
		EstudanteView estudanteView = new EstudanteView();
		EstudanteController estudanteController = new EstudanteController(estudanteModel, estudanteView);
		
		estudanteController.printEstudanteDetalhe();
		
		
		
		
		

	}

}
