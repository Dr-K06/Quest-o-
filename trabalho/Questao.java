import java.util.Scanner;

public class Questao {
    String pergunta = "";
    String opcaoA = "";
    String opcaoB = "";
    String opcaoC = "";
    String opcaoD = "";
    String opcaoE = "";
    String correta = "";
    
    public boolean isCorreta(String resposta) {
        if (resposta.equalsIgnoreCase(this.correta)) {
            System.out.println("Parabéns resposta Correta! - Letra: " + this.correta);
            System.out.println("");
            return true;
        } else {
            System.out.println("Resposta Errada!");
            System.out.println("A opção correta é a letra: " + this.correta);
            System.out.println("");
            return false;
        }
    }
 
    public String leiaResposta() {
        Scanner ler = new Scanner(System.in);
        String resp;
        do {
            System.out.println("Digite a resposta: ");
            resp = ler.next();
        } while (!respostaValida(resp));
        return resp;
    }
 
    private boolean respostaValida(String resp) {
        if (resp.equalsIgnoreCase("A") || resp.equalsIgnoreCase("B") || resp.equalsIgnoreCase("C") ||
            resp.equalsIgnoreCase("D") || resp.equalsIgnoreCase("E")) {
            return true;
        }
        System.out.println("Resposta inválida! Digite opção A, B, C, D ou E.");
        System.out.println("");
        return false;
    }
    
    public void escrevaQuestao() {
        System.out.println(this.pergunta);
        System.out.println();
        System.out.println(this.opcaoA);
        System.out.println(this.opcaoB);
        System.out.println(this.opcaoC);
        System.out.println(this.opcaoD);
        System.out.println(this.opcaoE);
        System.out.println();
    }
    
    public static void main(String[] args) {
        Questao[] quiz = new Questao[15];

        // Criando as 15 questões sobre capitais de países
        quiz[0] = new Questao();
        quiz[0].pergunta = "Qual é a capital da França?";
        quiz[0].opcaoA = "A) Paris";
        quiz[0].opcaoB = "B) Londres";
        quiz[0].opcaoC = "C) Roma";
        quiz[0].opcaoD = "D) Madri";
        quiz[0].opcaoE = "E) Berlim";
        quiz[0].correta = "A";
        
        quiz[1] = new Questao();
        quiz[1].pergunta = "Qual é a capital da Alemanha?";
        quiz[1].opcaoA = "A) Viena";
        quiz[1].opcaoB = "B) Amsterdã";
        quiz[1].opcaoC = "C) Berlim";
        quiz[1].opcaoD = "D) Paris";
        quiz[1].opcaoE = "E) Bruxelas";
        quiz[1].correta = "C";
        
        quiz[2] = new Questao();
        quiz[2].pergunta = "Qual é a capital do Japão?";
        quiz[2].opcaoA = "A) Seul";
        quiz[2].opcaoB = "B) Pequim";
        quiz[2].opcaoC = "C) Tóquio";
        quiz[2].opcaoD = "D) Bangkok";
        quiz[2].opcaoE = "E) Hong Kong";
        quiz[2].correta = "C";
        
        quiz[3] = new Questao();
        quiz[3].pergunta = "Qual é a capital do Canadá?";
        quiz[3].opcaoA = "A) Montreal";
        quiz[3].opcaoB = "B) Ottawa";
        quiz[3].opcaoC = "C) Toronto";
        quiz[3].opcaoD = "D) Vancouver";
        quiz[3].opcaoE = "E) Calgary";
        quiz[3].correta = "B";

        quiz[4] = new Questao();
        quiz[4].pergunta = "Qual é a capital da Rússia?";
        quiz[4].opcaoA = "A) Moscou";
        quiz[4].opcaoB = "B) São Petersburgo";
        quiz[4].opcaoC = "C) Kiev";
        quiz[4].opcaoD = "D) Varsóvia";
        quiz[4].opcaoE = "E) Tbilisi";
        quiz[4].correta = "A";

        quiz[5] = new Questao();
        quiz[5].pergunta = "Qual é a capital da Argentina?";
        quiz[5].opcaoA = "A) Santiago";
        quiz[5].opcaoB = "B) Buenos Aires";
        quiz[5].opcaoC = "C) Lima";
        quiz[5].opcaoD = "D) Montevidéu";
        quiz[5].opcaoE = "E) Bogotá";
        quiz[5].correta = "B";

        quiz[6] = new Questao();
        quiz[6].pergunta = "Qual é a capital do Brasil?";
        quiz[6].opcaoA = "A) Rio de Janeiro";
        quiz[6].opcaoB = "B) São Paulo";
        quiz[6].opcaoC = "C) Brasília";
        quiz[6].opcaoD = "D) Salvador";
        quiz[6].opcaoE = "E) Porto Alegre";
        quiz[6].correta = "C";

    }
}

