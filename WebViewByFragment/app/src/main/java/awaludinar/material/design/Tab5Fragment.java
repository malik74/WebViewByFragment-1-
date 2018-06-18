package awaludinar.material.design;

import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class Tab5Fragment extends Fragment
{
	public static Tab5Fragment newInstance()
	{
		return new Tab5Fragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		View v = inflater.inflate(R.layout.tab5, container, false);
		return v;
	}
}
