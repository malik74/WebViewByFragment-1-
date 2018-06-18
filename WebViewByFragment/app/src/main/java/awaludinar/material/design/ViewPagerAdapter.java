package awaludinar.material.design;

import android.content.*;
import android.support.v4.app.*;
import awaludinar.material.design.browser.*;
import awaludinar.material.design.proggram.*;

public class ViewPagerAdapter extends FragmentPagerAdapter
{
	// For Count Tabs
    final int PAGE_COUNT = 6;
	//For Context
    final Context context;
	
	public ViewPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }
	@Override
    public Fragment getItem(int position)
	{
		Fragment fragment = null;
		switch (position){
            case 0:
				//For Tab1 Possition
                fragment = BrowserFragment.newInstance();
                break;
            case 1:
				//For Tab2 Possition
                fragment = ProggramFragment.newInstance();
                break;
            case 2:
				//For Tab3 Possition
                fragment = Tab3Fragment.newInstance();
                break;
			case 3:
				//For Tab4 Possition
                fragment = Tab4Fragment.newInstance();
                break;
			case 4:
				//For Tab5 Possition
                fragment = Tab5Fragment.newInstance();
                break;
			case 5:
				//For Tab6 Possition
                fragment = Tab6Fragment.newInstance();
                break;
			}
			return fragment;
	}
	@Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
				//For Name Tab1
                return context.getResources().getString(R.string.tab1);
            case 1:
				//For Name Tab2
                return context.getResources().getString(R.string.tab2);
            case 2:
				//For Name Tab3
                return context.getResources().getString(R.string.tab3);
			case 3:
				//For Name Tab4
                return context.getResources().getString(R.string.tab4);
			case 4:
				//For Name Tab5
                return context.getResources().getString(R.string.tab5);
			case 5:
				//For Name Tab6
                return context.getResources().getString(R.string.tab6);
				}
				return null;
		}
	@Override
    public int getCount() {
        return PAGE_COUNT;
    }
}
