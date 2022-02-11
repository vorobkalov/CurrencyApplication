package com.currencyaplication.conversion;

import java.util.Set;

import com.currencyaplication.model.Output;
import com.currencyaplication.model.TKCurrency;

public interface Converter {
	Output convert(TKCurrency from, TKCurrency to);

	Set<TKCurrency> getAllCurrencies();
}
