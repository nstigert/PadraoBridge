public class Tosa extends Servico{
    public Tosa(float precoPadrao) {
        super(precoPadrao);
    }

    public float calcularPreco() {
        return this.precoPadrao * (1 + this.pelagem.percentualAumento());

    }

}
