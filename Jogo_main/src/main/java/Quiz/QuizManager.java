package Quiz;

import Quiz.Telas.TelaLousa;
import Quiz.Telas.TelaErro;
import Quiz.Telas.TelaHistorinha;
import Quiz.Telas.TelaQuiz;
import javax.swing.JOptionPane;
import telaInicial.EfeitoSonoro;
import telaInicial.TelaPrincipal;
import SistemaPontos.Pontuacao;
import java.util.Set;

public class QuizManager {
    
    private TelaQuiz telaQuiz;
    private int numeroPergunta = 0;
    private Fase faseAtual;
    private FaseService fs;
    
    public void proximaFase() {
        //checar se proxima fase existe
        if (faseAtual.getIdFase() < 9){
            numeroPergunta = 0;
            faseAtual = fs.getFase(faseAtual.getIdFase() + 1);
            if(faseAtual.isBonus()){ JOptionPane.showMessageDialog(null, "temporario: a proxima fase é bonus, vale o dobro de pontos");}
            telaQuiz.atualizarTela(faseAtual, numeroPergunta);
            telaQuiz.setVisible(true);
        }
        else{
            Pontuacao.setTempoFim(System.currentTimeMillis());
            TelaHistorinha th = new TelaHistorinha(new String[]{"src/main/resources/imagens_telas/final_0.jpg","src/main/resources/imagens_telas/final_1.jpg","src/main/resources/imagens_telas/final_2.jpg"}, "final", this);
            telaQuiz.setVisible(false);
            th.setVisible(true);
        }
    }
    
    public void proximaPergunta() {
        if (numeroPergunta < faseAtual.getQuestoes().size() - 1){
            telaQuiz.setVisible(true);
            numeroPergunta++;
            faseAtual.proximaImagem();
            telaQuiz.atualizarTela(faseAtual, numeroPergunta);
        }
        else{
            System.out.println("IR PARA A PROXIMA FASE(Atual: " + faseAtual.getIdFase() + ")");
            proximaFase(); //CASO O NÚMERO DA PRÓXIMA PERGUNTA EXCEDA A QUANTIDADE DE PERGUNTAS NA FASE
        }
    }
    
    public void responder(char resposta){
        if(faseAtual.getQuestao(numeroPergunta).getAlternativaCorreta() == resposta){
            Pontuacao.adicionarPontos(faseAtual.getQuestao(numeroPergunta).getDificuldade(), faseAtual.isBonus());
            var telaLousa = new TelaLousa(this, faseAtual.getQuestao(numeroPergunta).getCorrecao());
            telaQuiz.setVisible(false);
        }
        else{
            var telaErro = new TelaErro(this, faseAtual, faseAtual.getQuestao(numeroPergunta).getCorrecao());
            telaQuiz.setVisible(false);         
        }
    }
    
    public void avisarFimHistoria(String nomeHistoria){
        switch(nomeHistoria){
            case("inicio"):
                telaQuiz.setVisible(true);
                Pontuacao.setTempoInicio(System.currentTimeMillis());
                break;
            case("final"):
                Pontuacao.exibirMensagemParabens();
                TelaPrincipal tp = new TelaPrincipal();
                tp.setVisible(true);
                telaQuiz.dispose();
                break;
        }
    }
    
    public QuizManager() throws Exception {
        fs = new FaseService(); // QUANDO O QUIZ COMEÇA (OU SEJA QND QUIZMANAGER É CRIADO) JA INSTANCIO UM FASESERVICE QUE VAI GERAR AS FASES
        faseAtual = fs.getFase(0);
        TelaHistorinha th = new TelaHistorinha(new String[]{"src/main/resources/imagens_telas/inicial_0.jpg", "src/main/resources/imagens_telas/inicial_1.jpg"}, "inicio", this);
        th.setVisible(true);
        this.telaQuiz = new TelaQuiz(this);
        telaQuiz.atualizarTela(faseAtual, numeroPergunta);
        telaQuiz.setVisible(false);
    }

    public int getNumeroPergunta() {
        return numeroPergunta;
    }

    public void setNumeroPergunta(int numeroPergunta) {
        this.numeroPergunta = numeroPergunta;
    }

    public Fase getFaseAtual() {
        return faseAtual;
    }
//    
    public void setFaseAtual(Fase faseAtual) {
        this.faseAtual = faseAtual;
    }
    
    public TelaQuiz getTelaQuiz(){
        return telaQuiz;
    }
}
