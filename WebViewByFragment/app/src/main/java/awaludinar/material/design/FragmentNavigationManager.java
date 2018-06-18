package awaludinar.material.design;

import android.annotation.*;
import android.support.v4.app.*;
import android.widget.*;
import android.content.*;

public class FragmentNavigationManager implements NavigationManager
 {

    private static FragmentNavigationManager sInstance;

    private FragmentManager mFragmentManager;
    private MainActivity mActivity;
	private Context context;

    public static FragmentNavigationManager obtain(MainActivity activity) {
        if (sInstance == null) {
            sInstance = new FragmentNavigationManager();
        }
        sInstance.configure(activity);
        return sInstance;
    }

    private void configure(MainActivity activity) {
        mActivity = activity;
        mFragmentManager = mActivity.getSupportFragmentManager();
    }

    @Override
    public void showFragmentAction(String title) {
        Toast.makeText(mActivity,"Clicked",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFragmentComedy(String title) {
		Toast.makeText(mActivity,"Clicked",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showFragmentDrama(String title) {
		Toast.makeText(mActivity,"Clicked",Toast.LENGTH_SHORT).show();
    }

   /* private void showFragment(Fragment fragment, boolean allowStateLoss) {
        FragmentManager fm = mFragmentManager;

        @SuppressLint("CommitTransaction")
			FragmentTransaction ft = fm.beginTransaction()
            .replace(R.id.container, fragment);

        ft.addToBackStack(null);

        if (allowStateLoss || !BuildConfig.DEBUG) {
            ft.commitAllowingStateLoss();
        } else {
            ft.commit();
        }

        fm.executePendingTransactions();
    }*/ 
	//Delete comment if use fragment
}
