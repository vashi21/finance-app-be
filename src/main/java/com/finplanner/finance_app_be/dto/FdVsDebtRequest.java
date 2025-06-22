package com.finplanner.finance_app_be.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FdVsDebtRequest {
    private double principal;      // Principal amount
    private double fdRate;         // FD annual rate (%)
    private int tenureYears;       // Tenure in years
    private double fundReturnRate; // Debt-fund annual return rate (%)
}
