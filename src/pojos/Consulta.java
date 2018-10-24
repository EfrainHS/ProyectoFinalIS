package pojos;

public class Consulta {
    private Integer idConsulta;
    private String observaciones;
    private Integer idPaciente;
    private Integer idDoctor;
    private Integer idDieta;
    private Integer idMedicion;

    public Consulta() {
    }

    public Consulta(Integer idConsulta, String observaciones, Integer idPaciente, Integer idDoctor, Integer idDieta, Integer idMedicion) {
        this.idConsulta = idConsulta;
        this.observaciones = observaciones;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.idDieta = idDieta;
        this.idMedicion = idMedicion;
    }

    public Integer getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(Integer idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Integer getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Integer getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(Integer idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Integer getIdDieta() {
        return idDieta;
    }

    public void setIdDieta(Integer idDieta) {
        this.idDieta = idDieta;
    }

    public Integer getIdMedicion() {
        return idMedicion;
    }

    public void setIdMedicion(Integer idMedicion) {
        this.idMedicion = idMedicion;
    }
    
    
}
