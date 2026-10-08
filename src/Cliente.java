public class Cliente {
    public static void main(String[] args) {
        // Receiver
        Robo robo = new Robo();
        
        // Invoker
        ControleRobo controle = new ControleRobo();
        
        // ==========================================
        // 1. Avançar 10 metros
        // ==========================================
        
        Comando avancar10 = new AvancarComando(robo, 10);
        
        controle.definirComando (avancar10);
        controle.executarComando();
        robo.exibirEstado();
        
        // ==========================================
        // 2. Girar para a direita
        // ==========================================
        
        Comando girarDireita = new GirarDireitaComando(robo);
        controle.definirComando(girarDireita);
        controle.executarComando();

        robo.exibirEstado();
        
        // ==========================================
        // 3. Avançar 5 metros
        // ==========================================
        
        Comando avancar5 = new AvancarComando(robo, 5);
        
        controle.definirComando(avancar5);
        controle.executarComando();
        
        robo.exibirEstado();
        
        // ==========================================
        // 4. Tirar fotografia
        // ==========================================
        
        Comando fotografia = new FotografiaComando(robo);
        
        controle.definirComando(fotografia);
        controle.executarComando();
        
        // ==========================================
        // 5. Girar para a esquerda
        // ==========================================
        
        Comando girarEsquerda = new GirarEsquerdaComando(robo);
        controle.definirComando(girarEsquerda);
        controle.executarComando();
        robo.exibirEstado();
        
        // ==========================================
        // 6. Avançar 3 metros
        // ==========================================
        
        Comando avancar3 = new AvancarComando(robo, 3);
        controle.definirComando(avancar3);
        controle.executarComando();
        robo.exibirEstado();
        
        // ==========================================
        // 7. Desfazer último comando
        // ==========================================
        
        System.out.println("\n--- DESAZENDO ---");
        controle.desfazerComando();
        robo.exibirEstado();
        
        // ==========================================
        // 8. Executar novamente outro comando
        // ==========================================
        
        controle.definirComando(girarEsquerda);
        controle.executarComando();
        robo.exibirEstado();
    }
}
