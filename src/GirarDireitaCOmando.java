public class GirarDireitaComando implements Comando {
    private Robo robo;
    
    public GirarDireitaComando(Robo robo) {
        this.robo = robo;
    }
    
    @Override
    public void executar() {
        robo.girarDireita();
    }

    @Override
    public void desfazer() {
        robo.girarEsquerda();
        System.out.println("Comando de giro a direita desfeito.");
    }
}
