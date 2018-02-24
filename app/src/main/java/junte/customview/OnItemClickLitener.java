package junte.customview;

import android.view.View;

/**
 * Created by liupeiyang on 2018/2/24.
 */

public interface OnItemClickLitener {
    void onItemClick(View view, int position);

    void onItemClick(int position, Object data);
    void onItemLongClick(int position, Object data);
}
