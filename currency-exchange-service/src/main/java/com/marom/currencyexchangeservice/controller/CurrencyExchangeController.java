package com.marom.currencyexchangeservice.controller;

import com.marom.currencyexchangeservice.domain.ExchangeValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) {
        ExchangeValue exchangeValue = new ExchangeValue(1000L, from, to, BigDecimal.valueOf(4.98));
        exchangeValue.setPort(8000);
        return exchangeValue;
    }
}
