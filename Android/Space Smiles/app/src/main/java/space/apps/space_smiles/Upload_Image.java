package space.apps.space_smiles;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Upload_Image extends Fragment {

	private Context cntxt;
	private LinearLayout home_root;
	
	private File photoFile = null;
	
	public Upload_Image() {
		this.cntxt = getActivity();
	}
	

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View rootView = inflater.inflate(R.layout.upload_layout, container, false);
		home_root = (LinearLayout) rootView.findViewById(R.id.homeRootLayout);
		
		ImageButton camera_btn = (ImageButton) rootView.findViewById(R.id.camera_btn);
		camera_btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);

				cntxt = getActivity();
			    // Camera Activity to handle the Intent
			    if (takePictureIntent.resolveActivity(cntxt.getPackageManager()) != null) {
			        // File where the picture should go
			        photoFile = null;
			        try {
			            photoFile = createImageFile();
			        } catch (IOException ex) {
			            // Error handling during File Creation
			        }
			        // Continue after successful creation.
			        if (photoFile != null) {
			            takePictureIntent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(photoFile));
			            startActivityForResult(takePictureIntent, 1);
			        }
			    }
			}
		});
		
		return rootView;
	}
	
	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (requestCode == 1 && resultCode == Activity.RESULT_OK) {            
            Intent i = new Intent(cntxt, Image_Description.class);
            Bundle extras = new Bundle();
            extras.putString("imgpath", photoFile.getAbsolutePath());
            i.putExtras(extras);
            startActivity(i);
        }
	}

	public LinearLayout getHome_root() {
		return home_root;
	}

	private File createImageFile() throws IOException {
	    // Create an image file name
	    String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    String imageFileName = "JPEG_" + timeStamp + "_";
	    File storageDir = Environment.getExternalStoragePublicDirectory(
	            Environment.DIRECTORY_PICTURES);
	    File image = File.createTempFile(
	        imageFileName,  /* prefix */
	        ".jpg",         /* suffix */
	        storageDir      /* directory */
	    );
	    return image;
	}
}