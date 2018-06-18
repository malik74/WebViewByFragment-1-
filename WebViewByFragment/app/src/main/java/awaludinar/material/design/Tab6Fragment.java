package awaludinar.material.design;

import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class Tab6Fragment extends Fragment
{
	public static Tab6Fragment newInstance()
	{
		return new Tab6Fragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		View v = inflater.inflate(R.layout.tab6, container, false);
		return v;
	}
}
