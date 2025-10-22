package edu.froliak.security.config;

/*
  @author eugen
  @project security
  @class AuditorAwareImpl
  @version 1.0.0
  @since 10/15/2025 - 08.17
*/

import org.springframework.data.domain.AuditorAware;
import java.util.Optional;

public class AuditorAwareImpl implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {
        return Optional.of(System.getProperty("user.name"));
    }
}
