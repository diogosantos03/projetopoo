package br.com.ufpb.projetopoo;

import java.util.Collection;
import java.util.List;
public class ExercicioFacade {
	private GerenteDeAluno gerenteDeAluno;
	private GerenteDeExercicio gerenteDeExercicio;
	private GerenteDeFeedback gerenteDeFeedback;
	private GerenteDeProfessor gerenteDeProfessor;
	public ExercicioFacade(){
		this.gerenteDeExercicio = new GerenteDeExercicio();
		this.gerenteDeAluno = new GerenteDeAluno();
		this.gerenteDeProfessor = new GerenteDeProfessor();
		this.gerenteDeFeedback = new GerenteDeFeedback();
	}
	public void cadastrarExercicio(Exercicio e){
		this.gerenteDeExercicio.cadastrarExercicio(e);
	}
	public List<Exercicio> listarExercíciosCadastrados() {
		return this.gerenteDeExercicio.listarExercíciosCadastrados();
	}
	public Exercicio pesquisarExercicio(String nomeExercicio)
			throws ExercicioInexistenteException {
		return this.gerenteDeExercicio.pesquisarExercicio(nomeExercicio);
	}
	public Exercicio sortearExercício() {
		return this.gerenteDeExercicio.sortearExercício();
	}
	public void atualizarExercício(String nomeExercicio, int numQuestao, String questao) 
			throws ExercicioInexistenteException {
		this.gerenteDeExercicio.atualizarExercicio(nomeExercicio, numQuestao, questao);
	}
	public boolean corrigirExercicio(String nomeExercicio, String matriculaAluno) throws ExercicioInexistenteException {
		return this.gerenteDeExercicio.corrigirExercicio(nomeExercicio,matriculaAluno);
	}
	public void enviarFeedbackParaAlunos() {
		// TODO Auto-generated method stub
	}
	public void enviarFeedbackParaProfessor() {
		// TODO Auto-generated method stub
	}
	public Questao pesquisaQuestaoDeExercicio(String nomeExercicio, int numQuestao)
			throws QuestaoInexistenteException, ExercicioInexistenteException{
		return this.gerenteDeExercicio.pesquisaQuestaoDeExercicio(nomeExercicio, numQuestao);
	}
	public void cadastrarProfessor(String nome, String matricula)
			throws ProfessorJaExisteException {
		this.gerenteDeProfessor.cadastrarProfessor(nome, matricula);
	}
	public void removeProfessor(String matriculaProf)
			throws ProfessorInexistenteException {
		this.gerenteDeProfessor.removeProfessor(matriculaProf);
	}
	public Professor pesquisaProfessorPelaMatricula(String matricula)
			throws ProfessorInexistenteException {
		return this.gerenteDeProfessor.pesquisaProfessorPelaMatricula(matricula);
	}
	public List<Professor> obterListaDeProfessores() {
		return this.gerenteDeProfessor.obterListaDeProfessores();
	}
	public void cadastraAluno(String nome, String matricula)
			throws AlunoJaExisteException {
		this.gerenteDeAluno.cadastraAluno(nome, matricula);
	}
	public Aluno pesquisaAlunoPelaMatricula(String matricula)
			throws AlunoInexistenteException {
		return this.gerenteDeAluno.pesquisaAlunoPelaMatricula(matricula);
	}
	public void removeAluno(String matricula) throws AlunoInexistenteException {
		this.gerenteDeAluno.removeAluno(matricula);
	}
	public Collection<Aluno> obterListaDeAlunos() {
		return this.gerenteDeAluno.obterListaDeAlunos();
	}
}