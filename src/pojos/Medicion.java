package pojos;

public class Medicion {
    private Integer idMedicion;
    private String estatura;
    private String peso;
    private String imc;
    private String talla;

    public Medicion() {
    }

    public Medicion(Integer idMedicion, String estatura, String peso, String imc, String talla) {
        this.idMedicion = idMedicion;
        this.estatura = estatura;
        this.peso = peso;
        this.imc = imc;
        this.talla = talla;
    }

    public Integer getIdMedicion() {
        return idMedicion;
    }

    public void setIdMedicion(Integer idMedicion) {
        this.idMedicion = idMedicion;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getImc() {
        return imc;
    }

    public void setImc(String imc) {
        this.imc = imc;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }
    
    
}
