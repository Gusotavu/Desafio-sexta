package incognitussa;

import java.util.Random;

public class PessoaJ {
    //Atributos:
    private String endereco;
    private String nome;
    private int CNPJ;
    private String email;
    private String setor;
    private String dataAdmissao;
    private String dataDemissao;
    private float salarioB = 1000;
    private int lv;
    private int tempMes;
    private int ultFerias;
    private boolean ferias;
    
    public void status() {
        System.out.println("-------------------------------------------------");
        System.out.println(this.endereco);
        System.out.println(this.nome);
        System.out.println(this.CNPJ);
        System.out.println(this.email);
        System.out.println(this.setor);
        System.out.println(this.dataAdmissao);
        System.out.println(this.dataDemissao);
        System.out.println(this.salarioB);
        System.out.println(this.lv);
        System.out.println(this.tempMes);
        System.out.println(this.ultFerias);
        System.out.println(this.ferias);
    }
    //Mátodos:
    public void contraCheque() {
        if(lv == 1) { //Funcionário.
            this.salarioB = salarioB;
            System.out.println(salarioB);
        } else if (lv == 2) { //Supervisor
            this.salarioB += (this.salarioB * 0.08);
            System.out.println(salarioB);
        } else if(lv == 3) {
            this.salarioB += (this.salarioB * 0.12);
            System.out.println(salarioB);
        } else {
            System.out.println("Cargo inexistente");
        } 
    }
    
    public void pedirFerias() {
        if(tempMes >= 11 && ultFerias >= 4) {
            ferias = true;
            System.out.println("Aproveite suas férias!!!");
        } else {
            ferias = false;
            System.out.println("Você ainda não pode pedir férias");
        }
    }
    
    public void demitir(String demitido) {
        if(lv == 3) {
            System.out.println("Sinto muito  " + demitido + ", mas você foi demitid@, anão ser que você seja um gerente");
        } else if (lv == 2) {
            System.out.println("Sinto muito  " + demitido + ", mas você foi demitid@, anão ser que você seja um gerente, ou supervisor!");
        } else {
            System.out.println("Você não pode demitir ninguém");
        }
    }
    
    public void trabalhar() {
        if(ferias == false) {
            System.out.println("Eu estou trabalhando no momento, favor não incomodar.");
        } else {
            System.out.println("Vá simbora, você tá de férias!");
        }
    }
    
    public void pTrabalhar() {
        System.out.println("Já trabalhei de mais  por hoje, até amanhã pessoal!");
    }
    
    public void demissao() {
        System.out.println("Não ponho mais meus pés aqui! Pesso demissão e se fosse você, pedia também!");
    }
    
    public void dAlmento(String nome) {
        int yon = (int)(Math.random() * 2);
        if(yon == 0) {
            System.out.println("Sisnto muito, mas seu pedido de almento foi recusado");
        } else {
            Random increase = new Random();
            this.salarioB += (this.salarioB * increase.nextFloat()); 
            System.out.println("Parabéns, " + nome +  "seu novo salário base é: " + salarioB + "R$.");
        }
    }
    
    public void pAlmento() {
        int yon = (int)(Math.random() * 2);
        if(yon == 0) {
            System.out.println("Sisnto muito, mas seu pedido de almento foi recusado");
        } else {
            Random increase = new Random();
            this.salarioB += (this.salarioB * increase.nextFloat()); 
            System.out.println("Parabéns, seu novo salário base é: " + salarioB + "R$.");
        }
    }
    
    public void PessoaF() {
        
    }
    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getEndereco() {
        return this.endereco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return this.nome;
    }
    
    public void setCPF(int CPF) {
        this.CNPJ = CNPJ;
    }
    public int getCPF() {
        return this.CNPJ;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setSetir(String setor) {
        this.setor = setor;
    }
    public String getSetor() {
        return this.setor;
    }
    
    public void setSalarioB(float salarioB) {
        this.salarioB = salarioB;
    }
    public float getSalarioB() {
        return this.salarioB;
    }
    
    public void setLv(int lv) {
        this.lv = lv;
    }
    public int getLv() {
        return this.lv;
    }
    
    public void setTempMes(int tempMes) {
        this.tempMes = tempMes;
    }
    public int getTempMes() {
        return this.tempMes;
    }
    
    public void setUltFerias(int ultFerias) {
        this.ultFerias = ultFerias;
    }
    public int getUltFerias() {
        return this.ultFerias;
    }
    
    public void setFerias(boolean ferias) {
        this.ferias = ferias;
    }
    public boolean getFerias() {
        return this.ferias;
    }
}
