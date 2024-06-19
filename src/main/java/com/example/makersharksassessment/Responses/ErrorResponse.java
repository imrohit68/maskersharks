package com.example.makersharksassessment.Responses;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResponse {
    @Schema(
            description = "Response Message of APIs Endpoints",
            example = "The request was not successful"
    )
    private String message;
    @Schema (
            description = "Status of Request",
            example = "false"
    )
    private boolean status;
}
