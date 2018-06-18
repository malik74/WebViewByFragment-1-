package awaludinar.material.design;

import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class Tab4Fragment extends Fragment
{
	public static Tab4Fragment newInstance()
	{
		return new Tab4Fragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		View v = inflater.inflate(R.layout.tab4, container, false);
		return v;
	}
}
