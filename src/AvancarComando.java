public class AvancarComando implements Comando {
    private Robo robo;
    private int distancia;
    
    public AvancarComando(Robo robo, int distancia) {
        this.robo = robo;
        this.distancia = distancia;
    }

    @Override
    public void executar() {
        robo.avancar(distancia);
    }

    @Override
    public void desfazer() {
        robo.recuar(distancia);
        System.out.println("Comando de avanco desfeito.");
    }
}
