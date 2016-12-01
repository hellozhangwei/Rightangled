package uk.co.rightangled

import com.stripe.exception.StripeException
import com.stripe.model.Charge
import com.stripe.net.RequestOptions

RequestOptions requestOptions = (new RequestOptions.RequestOptionsBuilder()).setApiKey("sk_test_tdIDSV5UHlH6G8N1ua1nAs9f ").build();
Map<String, Object> chargeMap = new HashMap<String, Object>();
chargeMap.put("amount", 1799);
chargeMap.put("currency", "gbp");
Map<String, Object> cardMap = new HashMap<String, Object>();
cardMap.put("number", "4242424242424242");
cardMap.put("exp_month", 12);
cardMap.put("exp_year", 2020);
chargeMap.put("card", cardMap);
try {
    Charge charge = Charge.create(chargeMap, requestOptions);
    System.out.println(charge);
} catch (StripeException e) {
    e.printStackTrace();
}

println "====================10============================================"