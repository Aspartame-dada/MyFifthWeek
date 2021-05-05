package com.example.myfifthweek.Fragment;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myfifthweek.Adapter.UserInfo;
import com.example.myfifthweek.Adapter.UserMessageAdapter;
import com.example.myfifthweek.R;

import java.util.ArrayList;

public class firstFragment extends Fragment implements UserMessageAdapter.onListItemClickListener {

    private FirstViewModel mViewModel;
    private int[] imageId={R.drawable.ic_baseline_emoji_emotions_24,
            R.drawable.ic_baseline_emoji_emotions_24,R.drawable.ic_baseline_emoji_emotions_24,
            R.drawable.ic_baseline_emoji_emotions_24,R.drawable.ic_baseline_emoji_emotions_24,
            R.drawable.ic_baseline_emoji_emotions_24,R.drawable.ic_baseline_emoji_emotions_24};
    private RecyclerView recyclerView;
    private ArrayList<UserInfo> mList;
    private UserMessageAdapter muserMessageAdapter;
    public static firstFragment newInstance() {
        return new firstFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
       View view=  inflater.inflate(R.layout.first_fragment, container, false);
        recyclerView=view.findViewById(R.id.first_recycler);
        mList=new ArrayList<>();
        muserMessageAdapter=new UserMessageAdapter(this.getContext(),mList,this);
        recyclerView.setAdapter(muserMessageAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        initData();
    return view;
    }
    private void initData(){
        for (int i=1;i<imageId.length+1;i++){
            mList.add(new UserInfo(imageId[i-1],"用户"+i,"这是第"+i+"条消息"));
        }
        muserMessageAdapter.notifyDataSetChanged();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FirstViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onItemClick(int position) {
        Toast.makeText(this.getContext(), mList.get(position).getUserName(), Toast.LENGTH_SHORT).show();

    }
}