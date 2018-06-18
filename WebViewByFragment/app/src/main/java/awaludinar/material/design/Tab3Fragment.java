package awaludinar.material.design;

import android.support.v4.app.*;
import android.view.*;
import android.os.*;

public class Tab3Fragment extends Fragment
{
	public static Tab3Fragment newInstance()
	{
		return new Tab3Fragment();
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
	{
		// TODO: Implement this method
		View v = inflater.inflate(R.layout.tab3, container, false);
		return v;
	}
}
