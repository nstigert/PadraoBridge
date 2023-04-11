public class TosaHigienica extends Servico{

    public TosaHigienica(float precoPadrao) {
        super(precoPadrao);
    }

    public float calcularPreco() {
        return this.precoPadrao;
    }
}
