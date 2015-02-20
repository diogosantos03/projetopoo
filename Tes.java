package br.com.ufpb.projetopoo;

public class Tes {

	public static void main(String[] args) throws ExercicioInexistenteException {
		ExercicioFacade sistema = new ExercicioFacade();
		GerenteDeFeedback feedback = new GerenteDeFeedback();
		Aluno a = new Aluno("fernando", "99");
		Professor p = new Professor("Diogo", "03");
		
		Exercicio exer = new Exercicio();
		exer.setNomeExercicio("poo");
		exer.cadastrarQuestao(1, "Libras � uma lingua de sinais V ou F?", TipoQuestao.QUESTAO_V_OU_F);
		exer.cadastrarQuestao(2, "Alta coes�o e baixo acoplamento � um bom design para um projeto V ou F?", TipoQuestao.QUESTAO_V_OU_F);
		exer.cadastrarRespostaDeQuestao(1, "v", TipoQuestao.QUESTAO_V_OU_F);
		exer.cadastrarRespostaDeQuestao(2, "v", TipoQuestao.QUESTAO_V_OU_F);
		
		exer.cadastrarQuestao(3, "Quais os tipos primitivos na liguagem de programa��o Java?", TipoQuestao.QUESTAO_DISSERTATIVA);
		exer.cadastrarRespostaDeQuestao(3, "byte, short, int, long, float, double, char e boolean", TipoQuestao.QUESTAO_DISSERTATIVA);
		
		feedback.CadastarFeedback(exer.getNomeExercicio(), p.getMatricula(),"A resposta dever� ter no m�nimo esses cinco tipos: int, double, boolean, short e long");
		//Na linha acima ser� gravado um feedback do professor para o aluno.
		
		feedback.CadastarFeedback(exer.getNomeExercicio(), a.getMatricula(), "Professor, eu s� consegui lembrar desses tr�s tipos: boolean, short e long");
		
		CadastroDeRespostaDoAluno respostaAluno = new CadastroDeRespostaDoAluno();
		respostaAluno.setAluno(a);
		respostaAluno.cadastrarRespostaDeQuestao(1, "v", TipoQuestao.QUESTAO_V_OU_F);
		respostaAluno.cadastrarRespostaDeQuestao(2, "v", TipoQuestao.QUESTAO_V_OU_F);
		
		exer.adicionaCadastroDeRespostaDoAluno(respostaAluno);
		sistema.cadastrarExercicio(exer);
		
		
		try {
			System.out.println("Feedback do professor: "+feedback.PesquisaFeedback(exer.getNomeExercicio(), p.getMatricula()));
			System.out.println("Feedback do aluno: "+feedback.PesquisaFeedback(exer.getNomeExercicio(), a.getMatricula()));
		} catch (FeedbackInexistenteException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	
		//boolean cc = sistema.corrigirExercicio("poo", "99");
		//System.out.println(cc);	
	}
}
