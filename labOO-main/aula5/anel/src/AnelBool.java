package aula5.anel.src;

public class AnelBool implements AnelAbstrato<Boolean> {

    @Override
    public Boolean zero() {
        return false;
    }

    @Override
    public Boolean um() {
        return true;
    }

    @Override
    public Boolean soma(Boolean este, Boolean outro) {
        return (este && !outro) || (!este && outro);
    }

    @Override
    public Boolean produto(Boolean este, Boolean outro) {
        if(este && outro) return true;
        return false;
    }

    @Override
    public Boolean negativo(Boolean outro) {
        if(outro) return false;
        return true;
    }
    
    public Boolean disjuncaoLogica(Boolean este, Boolean outro) {
        if(este || outro) return true;
        return false;
    }
    
}
