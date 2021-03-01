package prog;

import Controllers.NAPI;
import Models.User;

import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        NAPI napi = new NAPI();
        ArrayList<User> arr;
        try {
            arr = napi.getUserArrayList();
            for (User i : arr)
                System.out.println(i.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
