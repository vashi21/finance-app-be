package com.finplanner.finance_app_be.service;

import com.finplanner.finance_app_be.dto.FdVsDebtRequest;
import com.finplanner.finance_app_be.dto.FdVsDebtResponse;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public FdVsDebtResponse calculateFdVsDebt(FdVsDebtRequest req) {
        double P = req.getPrincipal();
        double rFd  = req.getFdRate() / 100.0;
        double rFund = req.getFundReturnRate() / 100.0;
        int n = req.getTenureYears();

        // Compound interest formula: A = P * (1 + r)^n
        double fdAmount   = P * Math.pow(1 + rFd,  n);
        double fundAmount = P * Math.pow(1 + rFund, n);

        String recommendation = fdAmount > fundAmount ? "FD" : "Debt Fund";
        return new FdVsDebtResponse(fdAmount, fundAmount, recommendation);
    }
}
