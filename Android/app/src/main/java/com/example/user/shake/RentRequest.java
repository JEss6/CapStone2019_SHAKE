package com.example.user.shake;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import java.util.HashMap;
import java.util.Map;

public class RentRequest extends StringRequest{

    final static private String URL = "http://13.125.229.179/Rent.php";
    private Map<String, String> parameters;

    public RentRequest(String userID, String userPassword, Response.Listener<String> listener){
        super(Method.POST, URL, listener, null);
        parameters = new HashMap<>();
        parameters.put("userID", userID);
        parameters.put("userPassword", userPassword);
    }

    //Use Later
    @Override
    public Map<String, String> getParams(){
        return parameters;
    }

}
