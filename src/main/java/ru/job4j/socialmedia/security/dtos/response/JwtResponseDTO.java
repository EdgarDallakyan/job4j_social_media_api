
package ru.job4j.socialmedia.security.dtos.response;

import lombok.Data;

import java.util.List;
@Data
public class JwtResponseDTO {
    private String token;
    private String type = "Bearer";
    private Integer id;
    private String username;
    private String email;
    private List<String> roles;

    public JwtResponseDTO(String accessToken, Integer id, String username, String email, List<String> roles) {
        this.token = accessToken;
        this.id = id;
        this.username = username;
        this.email = email;
        this.roles = roles;
    }
}