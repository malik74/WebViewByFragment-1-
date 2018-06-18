package awaludinar.material.design.proggram;
import android.os.*;
import android.support.v4.app.*;
import android.support.v7.widget.*;
import android.view.*;
import awaludinar.material.design.*;

public class ProggramFragment extends Fragment
{

	private RecyclerView recyclerView;

	private StaggeredGridLayoutManager stag;

	private ProggramAdapter adapter;
	public static ProggramFragment newInstance()
	{
		return new ProggramFragment();
	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		View pr = inflater.inflate(R.layout.tab2,container, false);
		
		recyclerView = (RecyclerView) pr.findViewById(R.id.recycler_view);

		recyclerView.setHasFixedSize(true);
		stag = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
		stag.setGapStrategy(StaggeredGridLayoutManager.GAP_HANDLING_NONE);
        recyclerView.setLayoutManager(stag);

		adapter = new ProggramAdapter(getContext());
        recyclerView.setAdapter(adapter);
		return pr;
	}
}
