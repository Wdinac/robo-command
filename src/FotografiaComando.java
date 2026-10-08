public class FotografiaComando implements Comando {
    private Robo robo;
    public FotografiaComando(Robo robo) {
        this.robo = robo;
    }
    
    @Override
    public void executar() {
        robo.tirarFotografia();
    }
    
    @Override
    public void desfazer() {
        System.out.println("Nao e possivel desfazer uma fotografia.");
    }
}