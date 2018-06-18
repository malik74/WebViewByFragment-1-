package awaludinar.material.design;

import android.content.*;
import android.net.*;
import android.widget.*;

public class CustomTabsCopyLink extends BroadcastReceiver
 {

    @Override
    public void onReceive(Context context, Intent intent) {
        Uri uri = intent.getData();
        //if (uri != null) {
            ClipboardManager clipboardManager =
				(ClipboardManager) context.getSystemService(Context.CLIPBOARD_SERVICE);
            ClipData clipData = ClipData.newUri(null, uri.toString(), uri);
            clipboardManager.setPrimaryClip(clipData);
			Toast.makeText(context,"Copyed", Toast.LENGTH_SHORT).show();
        //}
    }
}
