package com.example.twotwo_lkolehiyo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class CalendarFragment extends Fragment {

    private TextView eventTextView1;
    private TextView eventTextView2;
    private TextView eventTextView3;
    private TextView eventTextView4;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calendar, container, false);

        // Set up event text views and click listeners
        eventTextView1 = view.findViewById(R.id.eventTextView1);
        eventTextView2 = view.findViewById(R.id.eventTextView2);
        eventTextView3 = view.findViewById(R.id.eventTextView3);
        eventTextView4 = view.findViewById(R.id.eventTextView4);

        eventTextView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleEventText((TextView) v);
            }
        });

        eventTextView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleEventText((TextView) v);
            }
        });

        eventTextView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleEventText((TextView) v);
            }
        });

        eventTextView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toggleEventText((TextView) v);
            }
        });

        // Add more event text views and click listeners as needed

        // Set up SearchView
        SearchView mySearchView = view.findViewById(R.id.searchView);
        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                // Handle search submission if needed
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                // Filter events based on the search query
                filterEvents(newText);
                return true;
            }
        });

        return view;
    }

    private void toggleEventText(TextView textView) {
        // Toggle the visibility of the full text
        if (textView.getMaxLines() == 1) {
            textView.setMaxLines(Integer.MAX_VALUE);
        } else {
            textView.setMaxLines(1);
        }
    }

    private void filterEvents(String query) {
        // Implement event filtering logic based on the search query
        // For example, you can compare the query with event names and show/hide accordingly
        if (eventTextView1.getText().toString().toLowerCase().contains(query.toLowerCase())) {
            eventTextView1.setVisibility(View.VISIBLE);
        } else {
            eventTextView1.setVisibility(View.GONE);
        }

        if (eventTextView2.getText().toString().toLowerCase().contains(query.toLowerCase())) {
            eventTextView2.setVisibility(View.VISIBLE);
        } else {
            eventTextView2.setVisibility(View.GONE);
        }

        if (eventTextView3.getText().toString().toLowerCase().contains(query.toLowerCase())) {
            eventTextView3.setVisibility(View.VISIBLE);
        } else {
            eventTextView3.setVisibility(View.GONE);
        }

        if (eventTextView4.getText().toString().toLowerCase().contains(query.toLowerCase())) {
            eventTextView4.setVisibility(View.VISIBLE);
        } else {
            eventTextView4.setVisibility(View.GONE);
        }
        // Add more event text views as needed
    }
}
