package junte.customview.ui.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by liupeiyang on 2018/2/24.
 */

public abstract class BaseActivity extends AppCompatActivity {

    protected abstract int getContentViewLayoutID();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        super.setContentView(R.layout.activity_main);
        if (getContentViewLayoutID() != 0) {
            setContentView(getContentViewLayoutID());
        } else {
            throw new IllegalArgumentException("You must return refund_select_cb_normal right contentView layout resource Id");
        }
        ButterKnife.bind(this);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}
