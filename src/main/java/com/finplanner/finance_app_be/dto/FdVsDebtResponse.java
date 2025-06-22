package com.finplanner.finance_app_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FdVsDebtResponse {
    private double fdReturns;      // Estimated value from FD after tenure
    private double fundReturns;    // Estimated value from Debt Fund after tenure
    private String recommendation; // Recommendation based on comparison
}
