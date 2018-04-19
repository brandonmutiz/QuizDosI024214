package com.example.aula7.quizdosi024214.Parser;

import com.example.aula7.quizdosi024214.Model.Users;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AULA 7 on 19/04/2018.
 */

public class Json {
    public static List<Users> getData(String content) throws JSONException {

        JSONArray jsonArray = new JSONArray(content);
        List<Users> UsersList = new ArrayList<>();

        for (int i = 0; i < jsonArray.length(); i++) {

            JSONObject item = jsonArray.getJSONObject(i);
            JSONObject item2 = item.getJSONObject("address");

            Users users = new Users();
            users.setName(item.getString("name"));
            users.setUsername(item.getString("username"));
            users.setEmail(item.getString("email"));
            users.setStreet(item2.getString("street"));



            UsersList.add(users);

        }

        return UsersList;



    }
}
