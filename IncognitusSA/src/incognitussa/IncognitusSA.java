package incognitussa;

public class IncognitusSA {

    public static void main(String[] args) {
        
        PessoaJ pessoa = new PessoaJ();
        pessoa.setNome("Gustavo");
        pessoa.setLv(1);
        pessoa.setTempMes(1);
        pessoa.setUltFerias(4);
        pessoa.pedirFerias();
        pessoa.contraCheque();
        pessoa.pAlmento();
        
        pessoa.status();
    }
    
}
