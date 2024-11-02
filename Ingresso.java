public class Ingresso{
    private  String localizacaoIngresso;
    private  String tipoDeIngresso;

    public Ingresso(String localizacaoIngresso, String tipoDeIngresso){
        this.localizacaoIngresso = localizacaoIngresso;
        this.tipoDeIngresso = tipoDeIngresso;
    }

    public String getLocalizacaoIngresso() {
        return localizacaoIngresso;
    }

    public void setLocalizacaoIngresso(String localizacaoIngresso) {
        this.localizacaoIngresso = localizacaoIngresso;
    }

    public String getTipoDeIngresso() {
        return tipoDeIngresso;
    }

    public void setTipoDeIngresso(String tipoDeIngresso) {
        this.tipoDeIngresso = tipoDeIngresso;
    }
}

