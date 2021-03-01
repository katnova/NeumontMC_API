package prog;

import Controllers.NAPI;
import Models.User;
import Models.mcmmo_user;

import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args){
        NAPI napi = new NAPI();
        ArrayList<mcmmo_user> arr;
//        try {
//            arr = napi.getUserArrayList();
//            for (User i : arr)
//                System.out.println(i.toString());
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        try {
            arr = napi.getUserArrayListWithMcmmoStats();
            for (User i : arr)
                System.out.println(i.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
