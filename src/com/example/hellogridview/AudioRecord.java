package com.example.hellogridview;
import java.io.IOException;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ProgressBar;
public class AudioRecord extends Activity
{
	private static final String LOG_TAG = "AudioRecordTest";
	private static String mFileName = null;
	private RecordButton mRecordButton = null;
	private MediaRecorder mRecorder = null;
	private PlayButton   mPlayButton = null;
	private MediaPlayer   mPlayer = null;
	boolean mStartRecording = true;
	private void onRecord(boolean start) {
		if (start) {
			startRecording();
		} else {
			stopRecording();
		}
	}
	private void onPlay(boolean start) {
		if (start) {
			startPlaying();
		} else {
			stopPlaying();
		}
	}
	private void startPlaying() {
		mPlayer = new MediaPlayer();
		try {
			mPlayer.setDataSource(mFileName);
			mPlayer.prepare();
			mPlayer.start();
		} catch (IOException e) {
			Log.e(LOG_TAG, "prepare() failed");
		}
	}

	private void stopPlaying() {
		mPlayer.release();
		mPlayer = null;
	}

	private void startRecording() {
		mRecorder = new MediaRecorder();
		mRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
		mRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
		mRecorder.setOutputFile(mFileName);
		mRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);
		try {
			mRecorder.prepare();
			mRecorder.start();
			mStartRecording = false;
		} catch (IOException e) {
			Log.e(LOG_TAG, "prepare() failed");
		}
	}
	private void stopRecording() {
		mRecorder.stop();
		mRecorder.release();
		mRecorder = null;
		Intent newIntent = new Intent(AudioRecord.this, churp_it.class);
		startActivity(newIntent);
	}
	class RecordButton extends Button {
		boolean mStartRecording = true;
		OnClickListener clicker = new OnClickListener() {
			public void onClick(View v) {
				onRecord(mStartRecording);
				if (mStartRecording) {
					setText("Stop recording");
				} else {
					setText("Start recording");
				}
				mStartRecording = !mStartRecording;
			}
		};
		public RecordButton(Context ctx) {
			super(ctx);
			setText("Start recording");
			setOnClickListener(clicker);
		}
	}
	class PlayButton extends Button {
		boolean mStartPlaying = true;
		OnClickListener clicker = new OnClickListener() {
			public void onClick(View v) {
				onPlay(mStartPlaying);
				if (mStartPlaying) {
					setText("Stop playing");
				} else {
					setText("Start playing");
				}
				mStartPlaying = !mStartPlaying;
			}
		};
		public PlayButton(Context ctx) {
			super(ctx);
			setText("Start playing");
			setOnClickListener(clicker);
		}
	}
	///////////RECORING FILE/////////////////////////
	public AudioRecord() {
		mFileName = Environment.getExternalStorageDirectory().getAbsolutePath();
		mFileName += "/audiorecordtest.3gp";
		System.out.println(mFileName);
	}

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		//	        new AudioRecord();
		//	        LinearLayout ll = new LinearLayout(this);
		//	        mRecordButton = new RecordButton(this);
		//	        ll.addView(mRecordButton,
		//	            new LinearLayout.LayoutParams(
		//	                ViewGroup.LayoutParams.WRAP_CONTENT,
		//	                ViewGroup.LayoutParams.WRAP_CONTENT,
		//	                0));
		//	        mPlayButton = new PlayButton(this);
		//	        ll.addView(mPlayButton,
		//	            new LinearLayout.LayoutParams(
		//	                ViewGroup.LayoutParams.WRAP_CONTENT,
		//	                ViewGroup.LayoutParams.WRAP_CONTENT,
		//	                0));
		//	        setContentView(ll);
		setContentView(R.layout.loading);
		ImageButton b1 = (ImageButton)findViewById(R.id.loading_x);
		b1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent newIntent = new Intent(AudioRecord.this, row_temp.class);
				startActivity(newIntent);
			}});
		
		ProgressBar churp1 = (ProgressBar)findViewById(R.id.loading01);
		churp1.setOnClickListener(new OnClickListener() {

			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				onRecord(mStartRecording);
			}});
	}
	@Override
	public void onPause() {
		super.onPause();
		if (mRecorder != null) {
			mRecorder.release();
			mRecorder = null;
		}
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
	}
}
