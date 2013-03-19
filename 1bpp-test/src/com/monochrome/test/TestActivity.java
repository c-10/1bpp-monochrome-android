package com.monochrome.test;

import java.io.InputStream;

import com.bitmap.monochrome.BitmapConvertor;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;

public class TestActivity extends Activity {
    /** Called when the activity is first created. */
	private static final String TAG = "TestActivity";
	public InputStream is;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        try{
        	is = getAssets().open("test.jpg");
        	Bitmap inputBitmap = BitmapFactory.decodeStream(is);
        	System.out.println(inputBitmap.getHeight() + " " +inputBitmap.getWidth());
            BitmapConvertor convertor = new BitmapConvertor(this);
            convertor.convertBitmap(inputBitmap, "my_monochrome_image");
            }
        catch (Exception e) {
			// TODO: handle exception
        	Log.e(TAG, e.toString());
		}
        
        
    }
}