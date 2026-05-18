import java.util.Random;

public class Main {
	public static void main(String[] args) {
		long totalPontos = 100_000_000L; 
        long pontosDentroCirculo = 0;
        
        Random random = new Random();
        
        System.out.println("Iniciando a simulação com" + totalPontos + " pontos...");
        
        long tempoInicial = System.currentTimeMillis();
        
        for (long i = 0; i < totalPontos; i++) {
            double x = random.nextDouble();
            double y = random.nextDouble();
            
            if ((x * x) + (y * y) <= 1.0) {
                pontosDentroCirculo++;
            }
        }

        long tempoFinal = System.currentTimeMillis();
        
        double piEstimado = 4.0 * pontosDentroCirculo / totalPontos;
        double erroAbsoluto = Math.abs(piEstimado - Math.PI);
        
        System.out.println("\n=== RESULTADOS DA SIMULAÇÃO ===");
        System.out.println("Pontos dentro do círculo: " + pontosDentroCirculo);
        System.out.println("Quantidade total de pontos: " + totalPontos);
        System.out.println("Valor estimado de Pi:   " + piEstimado);
        System.out.println("Valor real de Pi: " + Math.PI);
        System.out.println("Erro absoluto do modelo:    " + erroAbsoluto);
        System.out.println("Tempo total de execução:    " + (tempoFinal - tempoInicial) + " ms");
	}

}
