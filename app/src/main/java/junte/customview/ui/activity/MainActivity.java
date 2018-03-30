package junte.customview.ui.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import butterknife.BindView;
import junte.customview.OnItemClickLitener;
import junte.customview.R;
import junte.customview.Tools;
import junte.customview.ui.DividerGridItemDecoration;
import junte.customview.ui.SimpleCircleViewHolder;

/**
 * <br> ClassName:   MainActivity
 * <br> Description: 首页啦
 * <br>
 * <br> Author:      liupeiyang
 * <br> Date:        2018/2/24 11:24
 */


public class MainActivity extends BaseActivity implements OnItemClickLitener {

    @BindView(R.id.rv_root)
    RecyclerView mRvData;
    private HomeAdapter mAdapter;
    private RecyclerView.ItemDecoration mDecoration;

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //设置为垂直布局，这也是默认的
        layoutManager.setOrientation(OrientationHelper.VERTICAL);

        //设置布局管理器
        mRvData.setLayoutManager(layoutManager);
        mRvData.setHasFixedSize(true);

        //设置分隔线
        mRvData.addItemDecoration(new DividerGridItemDecoration(this));
        //设置增加或删除条目的动画
        mRvData.setItemAnimator(new DefaultItemAnimator());

        List<String> datas = new ArrayList<>();
        datas.add("Simple Circle");
        datas.add("Draw Color");

        datas.add("Draw Path");
        datas.add("Shader");



        mAdapter = new HomeAdapter(this, this, datas);
        mRvData.setAdapter(mAdapter);
    }


    @Override
    public void onItemClick(View view, int position) {

    }

    @Override
    public void onItemClick(int position, Object data) {
        if (!Tools.isEmpty(data.toString())) {
            if ("Simple Circle".equals(data)) {
                startActivity(new Intent(MainActivity.this, SimpleCircleActivity.class));
            } else if ("Draw Color".equals(data)) {
                startActivity(new Intent(MainActivity.this, DrawColorActivity.class));
            } else if ("Draw Path".equals(data)) {
                startActivity(new Intent(MainActivity.this, DrawPathActivity.class));
            }else if ("Shader".equals(data)) {
                startActivity(new Intent(MainActivity.this, ShaderActivity.class));
            }


        }


    }

    @Override
    public void onItemLongClick(int position, Object data) {

    }

    public class HomeAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

        public static final int TYPE_NORMAL = 1;

        private OnItemClickLitener mOnItemClickLitener;
        private List<String> list;
        private Context mContext;


        public HomeAdapter(Context mContext, OnItemClickLitener mOnItemClickLitener, List<String> list) {
            this.mContext = mContext;
            this.mOnItemClickLitener = mOnItemClickLitener;
            if (list == null) {
                List<String> listStr = new ArrayList<>();
                this.list = listStr;
            } else {
                this.list = list;
            }
        }

        @Override
        public SimpleCircleViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//            View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.repayment_default_refund_way_listview_item_new_cardview, parent, false);
            View layout = LayoutInflater.from(parent.getContext()).inflate(R.layout.simple_circle_listview_item, parent, false);
            return new SimpleCircleViewHolder(layout);
        }

        public int getRealPosition(RecyclerView.ViewHolder holder) {
            int position = holder.getLayoutPosition();
            return position;
        }

        @Override
        public void onBindViewHolder(final RecyclerView.ViewHolder holder, final int position) {

            final String data = list.get(position);

//            if (list.size() - 1 == position) {
            ((SimpleCircleViewHolder) holder).line.setVisibility(View.GONE);
//            }

            ((SimpleCircleViewHolder) holder).mTvName.setText(list.get(position));
            //设置Tag,方便等下进行点击事件数据的处理
            ((SimpleCircleViewHolder) holder).mLlContainer.setTag(position);
            if (mOnItemClickLitener != null) {
                ((SimpleCircleViewHolder) holder).mLlContainer.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        mOnItemClickLitener.onItemClick(position, data);
                    }
                });
                ((SimpleCircleViewHolder) holder).mLlContainer.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View v) {
                        mOnItemClickLitener.onItemLongClick(position, data);
                        return false;
                    }
                });
            }

        }

        public void setData(LinkedList<String> data) {
            list = data;
            notifyDataSetChanged();
        }


        @Override
        public int getItemViewType(int position) {
            return TYPE_NORMAL;
        }

        @Override
        public int getItemCount() {
            return list.size();
        }
    }


}
