package in.soren.khoborkagoj.util;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import in.soren.khoborkagoj.R;

public class Util {

    public static void shareApp(Context context){
        try {
            Intent i = new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.app_name));
            i.putExtra(Intent.EXTRA_TEXT, "https://play.google.com/store/apps/details?id=in.soren.khoborkagoj");
            context.startActivity(Intent.createChooser(i, "choose one"));
        } catch(Exception e) {
            Log.e("ERROR",""+e.getMessage());
        }
    }

}
