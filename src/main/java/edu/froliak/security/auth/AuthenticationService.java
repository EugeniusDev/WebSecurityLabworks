package edu.froliak.security.auth;

/*
  @author eugen
  @project security
  @class AuthenticationService
  @version 1.0.0
  @since 11/8/2025 - 20.10
*/

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        return null;
    }
}