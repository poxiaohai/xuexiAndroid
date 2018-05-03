package com.example.cheng.android.shijian;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * @ClassName: ListViewForScrollView
 * @Description: 自定义可适应ScrollView的ListView
 * @author chenzheng
 * @date 2014-6-27 上午11:45:10
 *
 */
public class ListViewForScrollView extends ListView {
	private int mPosition;
	public ListViewForScrollView(Context context) {
		super(context);
	}

	public ListViewForScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public ListViewForScrollView(Context context, AttributeSet attrs,
								 int defStyle) {
		super(context, attrs, defStyle);
	}

	@Override
	/**
	 * 重写该方法，达到使ListView适应ScrollView的效果
	 */
	protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
		int expandSpec = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2,
				MeasureSpec.AT_MOST);
		super.onMeasure(widthMeasureSpec, expandSpec);
	}

	/*
	 * 这个方法有一个毛病，就是默认显示的首项是ListView，需要手动把ScrollView滚动至最顶端。 sv = (ScrollView)
	 * findViewById(R.id.act_solution_4_sv); sv.smoothScrollTo(0, 0);
	 */


}
