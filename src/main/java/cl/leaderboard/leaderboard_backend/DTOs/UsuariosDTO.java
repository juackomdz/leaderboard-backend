package cl.leaderboard.leaderboard_backend.DTOs;

public class UsuariosDTO {

    private String username;
    private String email;
    private int puntos;
    
    public UsuariosDTO() {
    }

    public UsuariosDTO(String username, String email, int puntos) {
        this.username = username;
        this.email = email;
        this.puntos = puntos;
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

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

   
}
