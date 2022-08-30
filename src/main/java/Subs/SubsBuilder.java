package Subs;

public class SubsBuilder implements Builder {
    public Boolean bebida, combo, galleta, papas;
    public String pan, queso, vegetales, salsas, termino, adiciones;

    public SubsBuilder(boolean bebida, boolean combo, boolean galleta, boolean papas,
                       String pan, String queso, String vegetales, String salsas, String termino, String adiciones){
        this.bebida = bebida;
        this.combo = combo;
        this.galleta = galleta;
        this.papas = papas;
        this.pan = pan;
        this.queso = queso;
        this.vegetales = vegetales;
        this.salsas = salsas;
        this.termino = termino;
        this.adiciones = adiciones;
    }
    public SubsBuilder bebida(boolean val){
        bebida = val;
        return this;
    }

    public SubsBuilder combo(boolean val){
        combo = val;
        return this;
    }

    public SubsBuilder galleta(boolean val){
        galleta = val;
        return this;
    }

    public SubsBuilder papas(boolean val){
        papas = val;
        return this;
    }

    public SubsBuilder pan(String val){
        pan = val;
        return this;
    }

    public SubsBuilder queso(String val){
        queso = val;
        return this;
    }

    public SubsBuilder vegetales(String val){
        vegetales = val;
        return this;
    }

    public SubsBuilder salsas(String val){
        salsas = val;
        return this;
    }

    public SubsBuilder termino(String val){
        termino = val;
        return this;
    }

    public SubsBuilder adiciones(String val){
        adiciones = val;
        return this;
    }

    @Override
    public Sub build() {
        Sub sub = new Sub();
        sub.setpan(this.pan);
        sub.setqueso(this.queso);
        sub.setvegetales(this.vegetales);
        sub.setsalsas(this.salsas);
        sub.settermino(this.termino);
        sub.setadiciones(this.adiciones);
        sub.setbebida(this.bebida);
        sub.setcombo(this.combo);
        sub.setgalleta(this.galleta);
        sub.setpapas(this.papas);
        return sub;
    }
}
