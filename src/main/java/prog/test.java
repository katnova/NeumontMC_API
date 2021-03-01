package prog;

import Controllers.NAPI;
import Models.ustats.Ustats;

import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        NAPI napi = new NAPI();
        ArrayList<Ustats> users;
        try {
            users = napi.getORMUserStats();
            int i = 0;
            for(Ustats u : users){
                System.out.println("User UUID #"+i+": " + u.getUUID());
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
