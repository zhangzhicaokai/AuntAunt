package cn.zhz.auntaunt.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import auntanut.zhz.cn.auntaunt.R;
import cn.zhz.auntaunt.javebean.Users;

public class Aboutme_Fragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private String mParam1;
    private View view;
    private String[] title={"头像","姓名","电话","我的地址","我的地址","我的擅长","我的资质"};
    private String[] main={"","name","","","","",""};
    private ListView lv_aboutme;
    private List<Users> list;


    public Aboutme_Fragment() {
    }

    public static Aboutme_Fragment newInstance(String param1) {
        Aboutme_Fragment fragment = new Aboutme_Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.fragment_aboutme, container, false);
        lv_aboutme=(ListView)view.findViewById(R.id.lv_aboutme);
        MyAdapter adapter=new MyAdapter();
        lv_aboutme.setAdapter(adapter);

        return view;
    }
    class MyAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return title.length;
        }

        @Override
        public Object getItem(int i) {
            return i;
        }

        @Override
        public long getItemId(int i) {
            return i;
        }
        class Wrapper{
            private TextView title,main;
            private View row;
            public Wrapper(View row){
                super();
                this.row=row;
            }

            public TextView getTitle() {
                if(title==null){
                    title=(TextView)row.findViewById(R.id.tv_aboutme_item_title);
                }
                return title;
            }

            public TextView getMain() {
                if(main==null){
                    main=(TextView)row.findViewById(R.id.tv_aboutme_item_main);
                }
                return main;
            }
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            Wrapper wrapper;
            View row=view;
            if(row==null){
                LayoutInflater inflater=LayoutInflater.from(getActivity());
                row=inflater.inflate(R.layout.fragment_aboutme_item, viewGroup,false);
                wrapper=new Wrapper(row);
                row.setTag(wrapper);
            }else{
                wrapper=(Wrapper)row.getTag();
            }
            TextView title1=wrapper.getTitle();
            TextView main1=wrapper.getMain();
            title1.setText(title[i]);
            main1.setText(main[i]);
            return row;
        }
    }
}
