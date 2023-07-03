package aula5.anel.src;

public class AnelInteiro implements AnelAbstrato<Integer> {
    private Integer valor;

    public AnelInteiro() {
        this.valor = Integer.valueOf(valor);
    }
    @Override
    public Integer zero() {
        return 0;
    }

    @Override
    public Integer um() {
        return 1;
    }

    @Override
    public Integer soma(Integer este, Integer outro) {
        return este + outro;
    }

    @Override
    public Integer produto(Integer este, Integer outro) {
        return este * outro;
    }

    @Override
    public Integer negativo(Integer outro) {
        return -(outro);
    }


}