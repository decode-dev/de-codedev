package space.apps.space_smiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class Image_Loaded extends RelativeLayout {
	
	public TextView username_txt, date_txt, desc_txt, stars_txt;
	public ImageView image, star_img;
	public RelativeLayout star_btn;

	public Image_Loaded(Context context) {
		super(context);
		
		LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE); 
		View view = inflater.inflate(R.layout.image_desc_rating, null);
		
		username_txt = (TextView) view.findViewById(R.id.username_txt);
		date_txt = (TextView) view.findViewById(R.id.date_txt);
		desc_txt = (TextView) view .findViewById(R.id.desc_txt);
		stars_txt = (TextView) view.findViewById(R.id.stars_txt);
		star_img = (ImageView) view.findViewById(R.id.starimg);
		
		image = (ImageView) view.findViewById(R.id.image);
		
		star_btn = (RelativeLayout) view.findViewById(R.id.star_btn);

		this.addView(view);
	}

}
