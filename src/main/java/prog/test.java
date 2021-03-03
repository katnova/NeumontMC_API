package prog;

import com.neumontmc.api.Controllers.NAPI;
import com.neumontmc.api.Models.ustats.Ustats;

import java.io.IOException;
import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        NAPI napi = new NAPI();
        ArrayList<Ustats> users;
        try {
            users = napi.getORMUserStats();
            int i = 0;
            for (Ustats u : users) {
                try {
                    System.out.println("User Activity times joined #" + i + ": " + u.getContent().getActivity().getTimesLeft().getAmount().toString());
                }catch (Exception e){}
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
