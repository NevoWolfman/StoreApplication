package com.example.storeapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class InputFragment extends Fragment {

    private EditText nameET;
    private EditText priceET;
    private Button addBTN;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_input, container, false);

        nameET = view.findViewById(R.id.nameET);
        priceET = view.findViewById(R.id.priceET);
        addBTN = view.findViewById(R.id.addBTN);
        addBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = nameET.getText().toString();
                String price = priceET.getText().toString();

                if(name.isEmpty() || price.isEmpty())
                {
                    Toast.makeText(requireContext(), "Fill inputs", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    //TODO: send name and price to Recycleview or DB
                }
            }
        });

        return view;
    }
}