package com.phonegap.plugins.cookies;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;
import android.webkit.CookieManager;

public class Cookies extends CordovaPlugin {
	
	private final String TAG = "CookiesPlugin";
	
	@Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if ("clear".equals(action)) {
            this.clear();
            callbackContext.success();
            return true;
        }
        return false;  // Returning false results in a "MethodNotFound" error.
    }
	
	public void clear() {
		Log.v(TAG, "Clearing cookies...");
        CookieManager.getInstance().removeAllCookie();
    }
	

}
