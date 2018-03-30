package junte.customview.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by liupeiyang on 29/3/2018.
 */



public class ShaderView extends View {

    Paint mPaint = new Paint();

    public ShaderView(Context context) {
        super(context);
    }


    public ShaderView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public ShaderView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void onDraw(Canvas canvas){

        //Shader绘图
        Shader shader = new LinearGradient(100,100,500,500, Color.parseColor("#E91E63"),
                Color.parseColor("#2196F3"),Shader.TileMode.CLAMP);
        mPaint.setShader(shader);


        canvas.drawCircle(300,300,200,mPaint);





    }


}
