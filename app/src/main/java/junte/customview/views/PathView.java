package junte.customview.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import junte.customview.R;

/**
 * Created by liupeiyang on 2018/2/24.
 */

public class PathView extends View {

    Paint mPaint = new Paint();


    public PathView(Context context) {
        super(context);
    }

    public PathView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public PathView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onDraw(Canvas canvas) {

        super.onDraw(canvas);
        Path path = new Path();
        //画图-画心形
        // 使用 path 对图形进行描述（这段描述代码不必看懂）
//        path.addArc(200, 200, 400, 400, -225, 225);
//        path.arcTo(400, 200, 600, 400, -180, 225, false);
//        path.lineTo(400, 542);]
//        path.addCircle(300, 300, 200, Path.Direction.CW);//画圆


        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setAntiAlias(true);
//        path.lineTo(100, 100); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
//        path.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条直线

//        path.lineTo(100,100);//画斜线
//        path.moveTo(200,100);//移动
//        path.lineTo(200,0);//画竖线

//        mPaint.setStyle(Paint.Style.STROKE);//加粗
//        path.moveTo(100,100);
//        path.lineTo(100,200);
//        path.lineTo(200,200);
//        path.close();

        mPaint.setStyle(Paint.Style.FILL);//填充
//        path.moveTo(200,200);
//        path.lineTo(200,400);
//        path.lineTo(400,250);
//        // 这里只绘制了两条边，但由于 Style 是 FILL ，所以绘制时会自动封口


//        path.setFillType(Path.FillType.WINDING);//填充方式
//        path.addCircle(150, 150, 150, Path.Direction.CW);
//        path.addCircle(300, 300, 150, Path.Direction.CW);
//
//        canvas.drawPath(path, mPaint); // 绘制出 path 描述的图形（心形），大功告成


//        canvas.drawCircle();
//        Bitmap mBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.vertical_img);
//        或
//        BitmapDrawable bitmapDrawable = (BitmapDrawable) getResources().getDrawable(R.drawable.vertical_img);
//        Bitmap mBitmap = bitmapDrawable.getBitmap();


//        canvas.drawBitmap(mBitmap, 200, 100, mPaint);//贴一个图片出来


        canvas.drawText("我是要成为程序网的男人", 200, 100, mPaint);

    }

}
