// Classe Receiver
public class Robo {
    private int posicaoX;
    private int posicaoY;
    private String direcao;
    
    public Robo(){
        this.posicaoX = 0;
        this.posicaoY = 0;
        this.direcao = "NORTE";
    }
    
    public void avancar(int distancia) {
        switch (direcao) {
            case "NORTE" -> posicaoY += distancia;
            case "SUL" -> posicaoY -= distancia;
            case "LESTE" -> posicaoX += distancia;
            case "OESTE" -> posicaoX -= distancia;
        }
        System.out.println("Robo avancou " + distancia + " metros.");
    }
    
    public void girarEsquerda() {
        switch (direcao) {
            case "NORTE" -> direcao = "OESTE";
            case "OESTE" -> direcao = "SUL";
            case "SUL" -> direcao = "LESTE";
            case "LESTE" -> direcao = "NORTE";
        }
        System.out.println("Robo girou para a esquerda.");
    }
    
    public void girarDireita() {
        switch (direcao) {
            case "NORTE" -> direcao = "LESTE";
            case "LESTE" -> direcao = "SUL";
            case "SUL" -> direcao = "OESTE";
            case "OESTE" -> direcao = "NORTE";
        }
        System.out.println("Robo girou para a direita.");
    }
    
    public void recuar(int distancia) {
        switch (direcao) {
            case "NORTE" -> posicaoY -= distancia;
            case "SUL" -> posicaoY += distancia;
            case "LESTE" -> posicaoX -= distancia;
            case "OESTE" -> posicaoX += distancia;
        }
    }
    
    public void tirarFotografia() {
        System.out.println("FOtografia realizada!");
    }
    
    public void retornarPosicaoInicial() {
        posicaoX = 0;
        posicaoY = 0;
        direcao = "NORTE";
        
        System.out.println("Robo retornou a posicao inicial.");
    }
    
    public void exibirEstado() {
        System.out.println("Posicao: (" + posicaoX + ", " + posicaoY + ")" + " | Direcao: " + direcao);
    }
}
