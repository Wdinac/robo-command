public class RetornarInicioComando  implements Comando {
    private Robo robo;

    public RetornarInicioComando(Robo robo) {
        this.robo = robo;
    }

    @Override
    public void executar() {
        robo.retornarPosicaoInicial();
    }

    @Override
    public void desfazer() {
        System.out.println("Nao e possivel desfazer o retorno a posicao inicial.");
    }
}
