package awaludinar.material.design.proggram;

import android.app.*;
import android.content.*;
import android.graphics.*;
import android.net.*;
import android.support.customtabs.*;
import android.support.v7.appcompat.*;
import android.support.v7.widget.*;
import android.view.*;
import android.widget.*;
import awaludinar.material.design.*;

import android.support.v7.appcompat.R;

public class ProggramAdapter extends RecyclerView.Adapter<ProggramAdapter.ViewHolder> 
{
	private Context context;
	private String url;
	private Typeface gaya;

	//For title on CardView
    private String[] titles = 
	{
		"GitHub",
		"Stack OverFlow"
	};

	//For Subtitle on CardView
    private String[] details = 
	{
		"http://github.com",
		"http://stackoverflow.com"
	};

	//For Image on CardView
    private int[] images =
	{ 
		R.drawable.ic_launcher,
		R.drawable.ic_launcher
	};


	public ProggramAdapter(Context context) {
		this.context = context;

	}

    class ViewHolder extends RecyclerView.ViewHolder
	{

        public int currentItem;
        public ImageView itemImage;
        public TextView itemTitle;
        public TextView itemDetail;
		public Context con;

        public ViewHolder(View itemView)
		{
            super(itemView);
            itemImage = (ImageView)itemView.findViewById(R.id.item_image);
            itemTitle = (TextView)itemView.findViewById(R.id.item_title);
            itemDetail = (TextView)itemView.findViewById(R.id.item_detail);
			con = itemView.getContext();

			//For Control Click on CardView
            itemView.setOnClickListener(new View.OnClickListener() 
				{
					@Override 
					public void onClick(View v)
					{
						int position = getAdapterPosition();
						switch(getAdapterPosition())
						{
							case 0:
								url = "https://github.com";
								break;

							case 1:
								url = "https://stackoverflow.com";
								break;
						}
						CustomTabsIntent customTabsIntent = new CustomTabsIntent.Builder()
							.setStartAnimations(con, android.R.anim.slide_out_right, android.R.anim.slide_in_left)
							.setExitAnimations(con, android.R.anim.slide_in_left, android.R.anim.slide_out_right)
							.setShowTitle(true)
							.build();
						CustomTabActivityHelper.openCustomTab(
							(Activity)con, customTabsIntent, Uri.parse(url), new WebviewFallback());
						
					}
				});
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)
	{
        View v = LayoutInflater.from(viewGroup.getContext())
			.inflate(R.layout.card_item, viewGroup, false);
        final ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i)
	{
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }

    @Override
    public int getItemCount() 
	{
        return titles.length;
    }

}
