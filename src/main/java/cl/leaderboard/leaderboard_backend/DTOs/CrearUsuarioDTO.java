package cl.leaderboard.leaderboard_backend.DTOs;

public class CrearUsuarioDTO {

    private String username;
    private String pass;
    private String email;
    
    public CrearUsuarioDTO() {
    }

    public CrearUsuarioDTO(String username, String pass, String email) {
        this.username = username;
        this.pass = pass;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
}
