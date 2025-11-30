package edu.froliak.security.auth;

/*
  @author eugen
  @project security
  @class AuthenticationRequest
  @version 1.0.0
  @since 11/8/2025 - 20.06
*/

import lombok.Data;

@Data
public class AuthenticationRequest {
    private String email;

    private String password;
}