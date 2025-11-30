package edu.froliak.security.auth;

/*
  @author eugen
  @project security
  @class AuthenticationResponse
  @version 1.0.0
  @since 11/8/2025 - 20.10
*/

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class AuthenticationResponse {
    private String token;
}