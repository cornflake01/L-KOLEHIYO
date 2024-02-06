package com.example.twotwo_lkolehiyo;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class OfficesFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_offices, container, false);

        // Find the ImageView in the fragment_offices.xml layout
        ImageView imageView1 = rootView.findViewById(R.id.imageView1);

        // Set a click listener on the ImageView
        imageView1.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeAcademicActivity.class);
            startActivity(intent);
        });

        ImageView imageView3 = rootView.findViewById(R.id.imageView3);

        // Set a click listener on the ImageView
        imageView3.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficePrincipalActivity.class);
            startActivity(intent);
        });

        ImageView imageView4 = rootView.findViewById(R.id.imageView4);

        // Set a click listener on the ImageView
        imageView4.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeProgheadActivity.class);
            startActivity(intent);
        });

        ImageView imageView7 = rootView.findViewById(R.id.imageView7);

        // Set a click listener on the ImageView
        imageView7.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeFacultyActivity.class);
            startActivity(intent);
        });

        ImageView imageView6 = rootView.findViewById(R.id.imageView6);

        // Set a click listener on the ImageView
        imageView6.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeGuidanceActivity.class);
            startActivity(intent);
        });

        ImageView imageView5 = rootView.findViewById(R.id.imageView5);

        // Set a click listener on the ImageView
        imageView5.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeClinicActivity.class);
            startActivity(intent);
        });

        ImageView imageView8 = rootView.findViewById(R.id.imageView8);

        // Set a click listener on the ImageView
        imageView8.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeComlabActivity.class);
            startActivity(intent);
        });

        ImageView imageView9 = rootView.findViewById(R.id.imageView9);

        // Set a click listener on the ImageView
        imageView9.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeRectorActivity.class);
            startActivity(intent);
        });

        ImageView imageView10 = rootView.findViewById(R.id.imageView10);

        // Set a click listener on the ImageView
        imageView10.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeResearchActivity.class);
            startActivity(intent);
        });

        ImageView imageView11 = rootView.findViewById(R.id.imageView11);

        // Set a click listener on the ImageView
        imageView11.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeAcadvpActivity.class);
            startActivity(intent);
        });

        ImageView imageView13 = rootView.findViewById(R.id.imageView13);

        // Set a click listener on the ImageView
        imageView13.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeRemivpActivity.class);
            startActivity(intent);
        });

        ImageView imageView12 = rootView.findViewById(R.id.imageView12);

        // Set a click listener on the ImageView
        imageView12.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeAcadvpActivity.class);
            startActivity(intent);
        });

        ImageView imageView14 = rootView.findViewById(R.id.imageView14);

        // Set a click listener on the ImageView
        imageView14.setOnClickListener(v -> {
            // Intent to navigate to the office_academic.xml layout page
            Intent intent = new Intent(getActivity(), OfficeFinanceActivity.class);
            startActivity(intent);
        });

        return rootView;
    }
}
