package awaludinar.material.design;

import android.os.*;
import android.support.design.widget.*;
import android.support.v4.view.*;
import android.support.v4.widget.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.*;
import java.util.*;

import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity
{
	private TabLayout tabLayout;
	private ViewPager viewPager;
	
	private ExpandableListView mExpandableListView;
    private ExpandableListAdapter mExpandableListAdapter;
    private List<String> mExpandableListTitle;
    private NavigationManager mNavigationManager;
	private String[] items;

    private Map<String, List<String>> mExpandableListData;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		Toolbar toolbar =(Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
		
		mExpandableListView = (ExpandableListView) findViewById(R.id.navList);
        mNavigationManager = FragmentNavigationManager.obtain(this);
		initItems();
		
		LayoutInflater inflater = getLayoutInflater();
        View listHeaderView = inflater.inflate(R.layout.nav_header_main, null, false);
		
		mExpandableListView.addHeaderView(listHeaderView);
		
		mExpandableListData = ExpandableListDataSource.getData(this);
        mExpandableListTitle = new ArrayList(mExpandableListData.keySet());
		
		addDrawerItems();
		
		
		//For ID Navigation Drawer
		DrawerLayout drawer = (DrawerLayout)findViewById(R.id.drawer_layout);
		//For Toggle Drawer
		ActionBarDrawerToggle toggle =
			new ActionBarDrawerToggle(this, drawer,toolbar,
									  R.string.buka,
									  R.string.tutup);
		drawer.setDrawerListener(toggle);
        toggle.syncState();

		
		
		
		tabLayout = (TabLayout) findViewById(R.id.tabs);
		viewPager = (ViewPager) findViewById(R.id.viewPager);
		init();
    }
	//Handler Navigation Drawer
	private void init(){
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
		tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
    }
	private void setupViewPager(final ViewPager viewPager) {
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager(), this);
        viewPager.setAdapter(viewPagerAdapter);
        viewPager.setOffscreenPageLimit(3);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.setTabsFromPagerAdapter(viewPagerAdapter);
    }
	private void initItems() {
        items = getResources().getStringArray(R.array.title);
    }
	private void addDrawerItems() {
        mExpandableListAdapter = new CustomExpandableListAdapter(this, mExpandableListTitle, mExpandableListData);
        mExpandableListView.setAdapter(mExpandableListAdapter);
        mExpandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
				@Override
				public void onGroupExpand(int groupPosition) {
					getSupportActionBar().setTitle(mExpandableListTitle.get(groupPosition).toString());
				}
			});

        mExpandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {
				@Override
				public void onGroupCollapse(int groupPosition) {
				}
			});

        mExpandableListView.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
				@Override
				public boolean onChildClick(ExpandableListView parent, View v,
											int groupPosition, int childPosition, long id) {
					String selectedItem = ((List) (mExpandableListData.get(mExpandableListTitle.get(groupPosition))))
						.get(childPosition).toString();
					DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);

					if (items[0].equals(mExpandableListTitle.get(groupPosition))) {
						mNavigationManager.showFragmentAction(selectedItem);
					} else if (items[1].equals(mExpandableListTitle.get(groupPosition))) {
						mNavigationManager.showFragmentComedy(selectedItem);
					} else if (items[2].equals(mExpandableListTitle.get(groupPosition))) {
						mNavigationManager.showFragmentDrama(selectedItem);
					} else {
						throw new IllegalArgumentException("Not supported fragment type");
					}

					drawer.closeDrawer(GravityCompat.START);
					return false;
				}
			});
    }
}
