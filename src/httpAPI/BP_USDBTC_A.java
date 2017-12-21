package httpAPI;

import java.io.IOException;

import org.json.JSONException;
import org.json.JSONObject;

public class BP_USDBTC_A extends exAPI{
	public BP_USDBTC_A() throws IOException, JSONException{
	        exchange = "BP-A";
	        base = "BTC";
	        counter = "USD";
	        link = "https://www.bitstamp.net/api/v2/ticker/btcusd";
	        JSONObject json = getInfo(link);
	        data = getData(json);
	        amount = getAmount(json,"ask");
	        date = getDate();
	        time = getTime();
	}
}

