public class GirarEsquerdaComando implements Comando {
    private Robo robo;
    
    public GirarEsquerdaComando(Robo robo) {
        this.robo = robo;
    }

    @Override
    public void executar() {
        robo.girarEsquerda();
    }

    @Override
    public void desfazer() {
        robo.girarDireita();
        System.out.println("Comando de giro a esquerda desfeito.");
    }    
}