package com.example.exemplenavigationdrawer.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.navigation.NavController;

import com.example.exemplenavigationdrawer.MainActivity;
import com.example.exemplenavigationdrawer.R;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = view.findViewById(R.id.text_home);

        Button btnActionSettings = view.findViewById(R.id.btnActionSettings);

        btnActionSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("Toto", "Titi");

                NavController navController = ((MainActivity)getActivity()).getNavController();
                navController.navigate(R.id.action_nav_home_to_nav_settings, bundle);
            }
        });

        return view;
    }
}
