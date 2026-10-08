public class ControleRobo {
    private Comando comandoAtual;
    
    public void definirComando(Comando comando) {
        this.comandoAtual = comando;
    }
    
    public void executarComando() {
        comandoAtual.executar();
    }
    
    public void desfazerComando() {
        comandoAtual.desfazer();
    }
}
