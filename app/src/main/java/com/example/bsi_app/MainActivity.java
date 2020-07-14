package com.example.bsi_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MainActivity extends AppCompatActivity {

    private FirebaseAuth firebaseAuth;
    private String usertype;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setup();
        if(firebaseAuth.getUid()!=null){
            finish();
            startActivity(new Intent(MainActivity.this,WelcomeActivity.class));
        }
        else {
            finish();
            startActivity(new Intent(MainActivity.this, RegisterActivity.class));
        }
    }

    private void setup(){
        firebaseAuth=FirebaseAuth.getInstance();
    }
}
