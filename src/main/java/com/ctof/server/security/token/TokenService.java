package com.ctof.server.security.token;

import org.springframework.security.core.userdetails.UserDetails;

public interface TokenService {

    String getUsernameFromToken(String token);

    String generateToken(UserDetails userDetails);

    boolean validateToken(String token, UserDetails userDetails);

    void refreshToken(String token);
}
