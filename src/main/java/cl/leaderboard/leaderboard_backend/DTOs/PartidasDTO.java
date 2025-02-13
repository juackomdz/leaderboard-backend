package cl.leaderboard.leaderboard_backend.DTOs;


public class PartidasDTO {

    private String username;
    private String email;
    private Integer puntos;
    private String nombrePartida;
    private String descripcion;
    
    public PartidasDTO() {
    }

    public PartidasDTO(String username, String email, Integer puntos, String nombrePartida, String descripcion) {
        this.username = username;
        this.email = email;
        this.puntos = puntos;
        this.nombrePartida = nombrePartida;
        this.descripcion = descripcion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPuntos() {
        return puntos;
    }

    public void setPuntos(Integer puntos) {
        this.puntos = puntos;
    }

    public String getPartida() {
        return nombrePartida;
    }

    public void setPartida(String partida) {
        this.nombrePartida = partida;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
}
