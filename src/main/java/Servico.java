public abstract class Servico {

    protected  Porte porte;
    protected Pelagem pelagem;
    protected float precoPadrao;

    public Servico(float precoPadrao){
        this.precoPadrao = precoPadrao;
    }

    public void setPorte(Porte porte){
        this.porte = porte;
    }

    public void setPelagem(Pelagem pelagem) { this.pelagem = pelagem; }

    public void setPrecoPadrao(float precoPadrao) {
        this.precoPadrao = precoPadrao;
    }

    public abstract float calcularPreco();

}


