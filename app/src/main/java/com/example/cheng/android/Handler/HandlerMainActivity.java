package com.example.cheng.android.Handler;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import com.example.cheng.android.R;

public class HandlerMainActivity extends  Activity {
	//第1组
	Button mButton11,mButton12;
	TextView mTextView12;
	//第2组
	Button mButton21,mButton22;
	TextView mTextView22;
	//第3组
	Button mButton31,mButton32;
	TextView mTextView32;
	//第4组
	Button mButton41,mButton42;
	TextView mTextView42;
	//第5组
	Button mButton51,mButton52;
	TextView mTextView52;
	//线程
	CountThread mThreads[]=new CountThread[5];
	Button mButtons[][]=new Button[5][2];
	TextView mTextViews[]=new TextView[5];
	//处理线程消息的Handler 
	/*Handler mHandlerThread=new Handler(){
		public void handleMessage(Message msg) {
			
		};
	};*/
	Handler mHandlerThread=null;
	//定义3种消息类型
	public static final int  THREAD_MEG_WHAR_BEGIN=1;  //开始 
	public static final int  THREAD_MEG_WHAR_COUNT=2;  //计数
	public static final int  THREAD_MEG_WHAR_END=3;    //结束
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler_main);
        initRootViewForFind();
        initRootViewForEvent();
        initHandlerThread();
    }


    private void initHandlerThread() {
		// TODO Auto-generated method stub
    	//处理线程发送的消息
		mHandlerThread =new Handler(){
			//手工添加
			@Override
			public void handleMessage(Message msg) {
				switch(msg.what){
				case THREAD_MEG_WHAR_BEGIN:
					mTextViews[msg.arg1].setText("开始计数");
					break;
				case THREAD_MEG_WHAR_COUNT:
					mTextViews[msg.arg1].setText(""+msg.arg2);
					break;
				case THREAD_MEG_WHAR_END:
					mTextViews[msg.arg1].setText("停止计数");
					//还需要处理停止按钮.....
					break;
				}
				// TODO Auto-generated method stub
				super.handleMessage(msg);
			}
		};
	}


	private void initRootViewForFind() {
		// TODO Auto-generated method stub
    	mButton11=(Button) findViewById(R.id.button11);
    	mButton12=(Button) findViewById(R.id.button12);
    	mTextView12=(TextView) findViewById(R.id.textView12);

    	mButton21=(Button) findViewById(R.id.button21);
    	mButton22=(Button) findViewById(R.id.button22);
    	mTextView22=(TextView) findViewById(R.id.textView22);

    	mButton31=(Button) findViewById(R.id.button31);
    	mButton32=(Button) findViewById(R.id.button32);
    	mTextView32=(TextView) findViewById(R.id.textView32);

    	mButton41=(Button) findViewById(R.id.button41);
    	mButton42=(Button) findViewById(R.id.button42);
    	mTextView42=(TextView) findViewById(R.id.textView42);

    	mButton51=(Button) findViewById(R.id.button51);
    	mButton52=(Button) findViewById(R.id.button52);
    	mTextView52=(TextView) findViewById(R.id.textView52);
    	
    	mButtons[0][0]=mButton11;
    	mButtons[0][1]=mButton12;
    	mTextViews[0]=mTextView12;
    	
    	mButtons[1][0]=mButton21;
    	mButtons[1][1]=mButton22;
    	mTextViews[1]=mTextView22;

    	mButtons[2][0]=mButton31;
    	mButtons[2][1]=mButton32;
    	mTextViews[2]=mTextView32;

    	mButtons[3][0]=mButton41;
    	mButtons[3][1]=mButton42;
    	mTextViews[3]=mTextView42;

    	mButtons[4][0]=mButton51;
    	mButtons[4][1]=mButton52;
    	mTextViews[4]=mTextView52;
    	//getFragmentManager()
    }


    private void initRootViewForEvent() {
		// TODO Auto-generated method stub
    	View.OnClickListener clickListener=new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				int id=v.getId();
				switch(id){
				case R.id.button11:
					doButtonX1(0);
					break;
				case R.id.button21:
					doButtonX1(1);					
					break;
				case R.id.button31:
					doButtonX1(2);					
					break;
				case R.id.button41:
					doButtonX1(3);					
					break;
				case R.id.button51:
					doButtonX1(4);					
					break;
				case R.id.button12:
					doButtonX2(0);					
					break;
				case R.id.button22:
					doButtonX2(1);					
					break;
				case R.id.button32:
					doButtonX2(2);					
					break;
				case R.id.button42:
					doButtonX2(3);					
					break;
				case R.id.button52:
					doButtonX2(4);					
					break;
				}
			}
		};
		
		mButton11.setOnClickListener(clickListener);
		mButton12.setOnClickListener(clickListener);
		
		mButton21.setOnClickListener(clickListener);
		mButton22.setOnClickListener(clickListener);

		mButton31.setOnClickListener(clickListener);
		mButton32.setOnClickListener(clickListener);

		mButton41.setOnClickListener(clickListener);
		mButton42.setOnClickListener(clickListener);

		mButton51.setOnClickListener(clickListener);
		mButton52.setOnClickListener(clickListener);
    }    
    
    private void doButtonX1(int index){
    	mButtons[index][0].setText("开始...");
    	mButtons[index][0].setEnabled(false);
    	mButtons[index][1].setText("停止");
    	mButtons[index][1].setEnabled(true);
    	mTextViews[index].setText("开始:0000秒");
    	//启动线程
    	stopThread(index);
    	mThreads[index]=new CountThread(index, mHandlerThread);
    	mThreads[index].start();
    }

    private void doButtonX2(int index){
    	mButtons[index][0].setText("开始");
    	mButtons[index][0].setEnabled(true);
    	mButtons[index][1].setText("...停止");
    	mButtons[index][1].setEnabled(false);
    	mTextViews[index].setText("停止:0000秒");
    	//停止线程   	
    	stopThread(index);
    }
    
    private void stopThread(int index ){
    	//先判断线程是否为空，不为空说明可能正在运行中
    	if(mThreads[index]!=null){
    		//进一步判断是否正在运行
    		if(mThreads[index].isAlive()){
    			//停止线程运行
    			mThreads[index].over();
    			try {
					mThreads[index].join(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
    			//
    		}
    		//把变量的位置设置为空    		
    		mThreads[index]=null;
    	}
    }
    
    @Override
    protected void onDestroy() {
    	// TODO Auto-generated method stub
    	//要把所有的线程停止
    	for(int i=0;i< mThreads.length;i++ ){    		
    		stopThread(i);
    	}
    	super.onDestroy();
    }
    
}
