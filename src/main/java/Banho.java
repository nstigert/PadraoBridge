public class Banho extends Servico{
    public Banho(float precoPadrao) {
        super(precoPadrao);
    }

    public float calcularPreco() {
        return this.precoPadrao * (1 + this.porte.percentualAumento() + this.pelagem.percentualAumento());
    }

}
