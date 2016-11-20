package com.tutorials.hp.navviewlistview.mFragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.tutorials.hp.navviewlistview.R;


/**
  * Created by Oclemy on 9/18/2016.
 */
public class InterStellar extends Fragment {

    private ListView lv;
    private static String[] spacecrafts={"Kepler","Hubble","Rosetter","Discovery","Endeavor"};

    public static InterStellar newInstance()
    {
        return new InterStellar();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.interstellar,null);


        //REFERENCE
        lv= (ListView) rootView.findViewById(R.id.interstellar_LV);

        //ADAPTER
        lv.setAdapter(new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,spacecrafts));

        //ITEM CLICKS
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), spacecrafts[i], Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

    @Override
    public String toString() {
        return "InterStellar";
    }
}
