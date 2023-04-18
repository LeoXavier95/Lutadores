import javax.swing.JOptionPane;

public class Lutador {
    private  String nome;
    private  String nacionalidade;
    private  int idade;
    private  float altura;
    private  float peso;
    private  String categoria;
    private  int vitorias;
    private  int derrotas;
    private  int empartes;

    public void apresentar(){
        JOptionPane.showMessageDialog(null, "CHEGOU O MOMENTO QUE ESPERÁVAMOS\n" + 
        "Apresemtamos o lutador " + this.getNome() + 
        "\nDiretamente de " + this.getNacionalidade() +
        "\nCom " + this.getIdade() + " anos e " + this.altura + " de altura" + 
        "\nPessando " + this.getPeso() + " Kg\n" +
        this.getVitorias() + " vitorias\n" + 
        this.getDerrotas() + " derrotas\n" + 
        this.getEmpartes() + " empates");
    }

    public void status(){
        System.out.println("------------------------------------------------");
        System.out.println(this.getNome() + " é um peso " + this.getCategoria());
        System.out.println("Ganhou " + this.getVitorias() + " vezes");
        System.out.println("Perdeu " + this.getDerrotas() + " vezes");
        System.out.println("Empatou " + this.getEmpartes() + " vezes");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void enpataarLuta(){
        this.setEmpartes(getEmpartes() + 1);
    }

    public Lutador(String no, String na, int id , float al, float pe, int vi, int de, int em) {
        this.nome = no;
        this.nacionalidade = na;
        this.idade = id;
        this.altura = al;
        this.setPeso(pe);
        this.vitorias = vi;
        this.derrotas = de;
        this.empartes = em;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < 52.2) {
            this.categoria = "Inválido";
        } else if (this.peso < 70.3) {
            this.categoria = "Leve";
        }else if(this.peso < 83.9) {
            this.categoria = "Médio";
        }else if(this.peso < 120.2) {
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpartes() {
        return empartes;
    }

    public void setEmpartes(int empartes) {
        this.empartes = empartes;
    }

    

}
