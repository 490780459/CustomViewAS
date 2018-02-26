package junte.customview.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * <br> ClassName:   DrawColorView
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      liupeiyang
 * <br> Date:        2018/2/24 15:29
 */
public class DrawColorView extends View {

    Paint mPaint = new Paint();


    public DrawColorView(Context context) {
        super(context);
    }

    public DrawColorView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public DrawColorView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
//        canvas.drawColor(Color.parseColor("#88880000"));// 半透明红色
        mPaint.setColor(Color.RED);
        mPaint.setStyle(Paint.Style.STROKE);// // Style 修改为画线模式
//        mPaint.setStrokeWidth(20);// 线条宽度为 20 像素
        mPaint.setAntiAlias(true);//抗锯齿

//        canvas.drawCircle(300, 300, 300, mPaint);//画圆形
//
//        mPaint.setStyle(Paint.Style.FILL);//实心
//        canvas.drawRect(100,100,500,500,mPaint);//画矩形
//
//        mPaint.setStyle(Paint.Style.STROKE);//空心
//        canvas.drawRect(700,100,1100,500,mPaint);//画矩形
//
//        mPaint.setStrokeWidth(20);
//        mPaint.setStrokeCap(Paint.Cap.ROUND);//点的形状
//        canvas.drawPoint(50,50,mPaint);//画图-点
//
//        mPaint.setStyle(Paint.Style.FILL);//实心
//        canvas.drawOval(50,50,350,200,mPaint);//画图-椭圆
//
//        mPaint.setStyle(Paint.Style.STROKE);//空心
//        canvas.drawOval(400,50,700,200,mPaint);//画图-椭圆
//
//        canvas.drawLine(200,200,800,500,mPaint);//画图-线
//
//
//        float[] points = {20, 20, 120, 20, 70, 20, 70, 120, 20, 120, 120, 120, 150, 20, 250, 20, 150, 20, 150, 120, 250, 20, 250, 120, 150, 120, 250, 120};
//        canvas.drawLines(points, mPaint);//画图-复数的线


//        canvas.drawRoundRect(100,100,500,300,50,50,mPaint);//画圆角矩形

//        mPaint.setStyle(Paint.Style.FILL);//填充模式
//        canvas.drawArc(200, 100, 800, 500, -110, 100, true, mPaint);// 绘制扇形
//        canvas.drawArc(200, 100, 800, 500, 20, 140, false, mPaint); // 绘制弧形
//
        mPaint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, mPaint); // 绘制不封口的弧形




    }

}
