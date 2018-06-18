package awaludinar.material.design.browser;

import android.os.*;
import android.support.v4.app.*;
import android.support.v7.widget.*;
import android.view.*;
import awaludinar.material.design.*;

public class BrowserFragment extends Fragment 
{

	private RecyclerView recyclerView;

	private StaggeredGridLayoutManager stag;

	private BrowserAdapter adapter;
	public static BrowserFragment newInstance()
	{
		return new BrowserFragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		View v = inflater.inflate(R.layout.tab1, container, false);
		
		recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);

		recyclerView.setHasFixedSize(true);
		stag = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
		stag.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerView.setLayoutManager(stag);

		adapter = new BrowserAdapter(getContext());
        recyclerView.setAdapter(adapter);
		
		return v;
	}
}
