package junte.customview.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import junte.customview.R;

/**
 * <br> ClassName:   CustomView1
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      liupeiyang
 * <br> Date:        2018/2/24 11:03
 */
public class CustomView1 extends View {

    Paint mPaint = new Paint();


    public CustomView1(Context context) {
        super(context);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomView1(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        //绘制一个圆
        mPaint.setColor(getResources().getColor(R.color.red));//设置颜色
        mPaint.setAntiAlias(true);//设置抗锯齿开关
//        mPaint.setStyle();//设置绘制模式
//        mPaint.setStrokeWidth();//设置线条宽度
//        mPaint.setTextSize();//设置文字大小
        canvas.drawCircle(300, 300, 200, mPaint);

    }


}
