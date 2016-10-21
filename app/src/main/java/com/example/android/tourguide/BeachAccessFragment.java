package com.example.android.tourguide;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link Fragment} that displays a list of beach access locations.
 */
public class BeachAccessFragment extends Fragment {


    public BeachAccessFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.word_list, container, false);


        // Create a list of locations
        final ArrayList<Location> locations = new ArrayList<Location>();
        locations.add(new Location(R.string.beach_access_hightower,
                R.string.address_hightower, R.drawable.hightowerbeach, R.raw.phrase_where_are_you_going));
        locations.add(new Location(R.string.phrase_what_is_your_name,
                R.string.miwok_phrase_what_is_your_name, R.raw.phrase_what_is_your_name));
     //   locations.add(new Location(R.string.phrase_my_name_is,
     //           R.string.miwok_phrase_my_name_is, R.raw.phrase_my_name_is));
        locations.add(new Location(R.string.phrase_how_are_you_feeling,
                R.string.miwok_phrase_how_are_you_feeling, R.raw.phrase_how_are_you_feeling));
        locations.add(new Location(R.string.phrase_im_feeling_good,
                R.string.miwok_phrase_im_feeling_good, R.raw.phrase_im_feeling_good));
        locations.add(new Location(R.string.phrase_are_you_coming,
                R.string.miwok_phrase_are_you_coming, R.raw.phrase_are_you_coming));
        locations.add(new Location(R.string.phrase_yes_im_coming,
                R.string.miwok_phrase_yes_im_coming, R.raw.phrase_yes_im_coming));
        locations.add(new Location(R.string.phrase_im_coming,
                R.string.miwok_phrase_im_coming, R.raw.phrase_im_coming));
        locations.add(new Location(R.string.phrase_lets_go,
                R.string.miwok_phrase_lets_go, R.raw.phrase_lets_go));
        locations.add(new Location(R.string.phrase_come_here,
                R.string.miwok_phrase_come_here, R.raw.phrase_come_here));

        // Create an {@link WordAdapter}, whose data source is a list of {@link Location}s. The
        // adapter knows how to create list items for each item in the list.
        WordAdapter adapter = new WordAdapter(getActivity(), locations, R.color.category_phrases);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared in the
        // word_list.xml layout file.
        ListView listView = (ListView) rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link WordAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Location} in the list.
        listView.setAdapter(adapter);



        return rootView;
    }


}
