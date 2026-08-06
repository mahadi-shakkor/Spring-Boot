package com.easybytes.jobportal.dto;

import java.io.Serializable;

/**
 * DTO for {@link com.easybytes.jobportal.entity.Contact}
 */
public record ContactRequestDto(String name,String email,   String userType,String subject,String message
                              ) implements Serializable {
}