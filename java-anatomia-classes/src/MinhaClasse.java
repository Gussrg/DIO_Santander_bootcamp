public class MinhaClasse {

    public static void main (String [] args){
        
        System.out.print("Olá turma!");

        String primeiroNome = "Gustavo";
        String segundoNome = "Rebelo";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    
    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return primeiroNome.concat("").concat(segundoNome);
            
    }
}

