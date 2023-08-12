package org.strata.issues;

import com.opengamma.strata.basics.currency.Currency;
import com.opengamma.strata.basics.currency.BigMoney;
import com.opengamma.strata.basics.currency.Money;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IssuesApplication implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		final var currency = Currency.USD;

		final var money = Money.of(currency, 123.456789);
		System.out.println("Money.value=" + money.getValue());

		final var bigMoney = BigMoney.of(currency, 123.456789);
		System.out.println("BigMoney.value=" + bigMoney.getValue());
	}

	public static void main(String[] args) {
		SpringApplication.run(IssuesApplication.class, args);
	}

}
