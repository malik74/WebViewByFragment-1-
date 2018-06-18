package awaludinar.material.design;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.widget.*;

/**
 * A Fallback that opens a Webview when Custom Tabs is not available
 */
public class WebviewFallback implements CustomTabActivityHelper.CustomTabFallback {
    @Override
    public void openUri(Activity activity, Uri uri) {
        /*Intent intent = new Intent(activity, MainActivity.class);
		 intent.putExtra(WebviewActivity.EXTRA_URL, uri.toString());
		 activity.startActivity(intent);*/
		Toast.makeText(activity,"",Toast.LENGTH_SHORT).show();
    }
}
