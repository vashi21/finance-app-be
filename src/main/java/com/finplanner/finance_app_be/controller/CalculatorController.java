package com.finplanner.finance_app_be.controller;

import com.finplanner.finance_app_be.dto.FdVsDebtRequest;
import com.finplanner.finance_app_be.dto.FdVsDebtResponse;
import com.finplanner.finance_app_be.service.CalculatorService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/calculators")
public class CalculatorController {

    private final CalculatorService calc;

    public CalculatorController(CalculatorService calc) {
        this.calc = calc;
    }

    @PostMapping("/fd-vs-debt")
    public FdVsDebtResponse fdVsDebt(@RequestBody FdVsDebtRequest req) {
        return calc.calculateFdVsDebt(req);
    }
}
