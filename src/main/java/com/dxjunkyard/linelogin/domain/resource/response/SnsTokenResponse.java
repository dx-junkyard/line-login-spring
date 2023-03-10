package com.dxjunkyard.linelogin.domain.resource.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SnsTokenResponse {
    private String token;
    private String result;
}
