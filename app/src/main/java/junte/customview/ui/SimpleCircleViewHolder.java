package junte.customview.ui;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import junte.customview.R;

/**
 * <br> ClassName:   SimpleCircleViewHolder
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      liupeiyang
 * <br> Date:        2018/2/24 14:08
 */
public class SimpleCircleViewHolder extends RecyclerView.ViewHolder {
    public LinearLayout mLlContainer;
    public TextView mTvName;
    public View line;

    public SimpleCircleViewHolder(View view) {
        super(view);
        mLlContainer = (LinearLayout) view.findViewById(R.id.ll_content);
        mTvName = (TextView) view.findViewById(R.id.tv_name);
        line  = (View)view.findViewById(R.id.view_line);
    }
}