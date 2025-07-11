// MainActivity.java
package com.iranwar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends GameActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button createBtn = findViewById(R.id.createBtn);
        Button joinBtn = findViewById(R.id.joinBtn);
        
        createBtn.setOnClickListener(v -> startHost());
        joinBtn.setOnClickListener(v -> joinGame());
    }
}
