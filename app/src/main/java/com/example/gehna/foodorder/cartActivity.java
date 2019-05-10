package com.example.gehna.foodorder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class cartActivity extends AppCompatActivity {


    String n1, n2, n3, n4;
    String p1, p2, p3, p4;
    String q1, q2, q3, q4;
    int total=0;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        TextView cartMain = findViewById(R.id.cartMain);

        Intent intent = getIntent();
        n1 = intent.getStringExtra("name1");
        n2 = intent.getStringExtra("name2");
        n3 = intent.getStringExtra("name3");
        n4 = intent.getStringExtra("name4");
        p1 = intent.getStringExtra("price1");
        p2 = intent.getStringExtra("price2");
        p3 = intent.getStringExtra("price3");
        p4 = intent.getStringExtra("price4");
        q1 = intent.getStringExtra("quantity1");
        q2 = intent.getStringExtra("quantity2");
        q3 = intent.getStringExtra("quantity3");
        q4 = intent.getStringExtra("quantity4");

        int qq1 = Integer.parseInt(q1);
        int qq2 = Integer.parseInt(q2);
        int qq3 = Integer.parseInt(q3);
        int qq4 = Integer.parseInt(q4);
        int pp1 = Integer.parseInt(p1.substring(3));
        int pp2 = Integer.parseInt(p2.substring(3));
        int pp3 = Integer.parseInt(p3.substring(3));
        int pp4 = Integer.parseInt(p4.substring(3));


        if(qq1 != 0 && qq2 != 0 && qq3 !=0 && qq4 != 0){

            cartMain.append("ITEMS  -  QUANTITY  -  PRICE\n");
        }
        if (qq1 != 0)
            cartMain.append(n1 + "   " + q1 + "   " + p1 + "\n");
        if (qq2 != 0)
            cartMain.append(n2 + "   " + q2 + "   " + p2 + "\n");
        if (qq3 != 0)
            cartMain.append(n3 + "   " + q3 + "   " + p3 + "\n");
        if (qq4 != 0)
            cartMain.append(n4 + "   " + q4 + "   " + p4 + "\n");


        total = (qq1*pp1) + (qq2*pp2) + (qq3*pp3) + (qq4*pp4);
        TextView totalTV = findViewById(R.id.total);
        totalTV.append(" "+total);

    }

    public void place_order(View v) {
        EditText first = findViewById(R.id.first);
        EditText last = findViewById(R.id.last);
        EditText phone = findViewById(R.id.phone);
        EditText address=findViewById(R.id.address);
        TextView cartMain = findViewById(R.id.cartMain);

        if (cartMain.getText().toString().isEmpty() ) {
            Toast.makeText(getBaseContext(), "Cart Empty", Toast.LENGTH_LONG).show();

        } else if(first.getText().toString().isEmpty() || last.getText().toString().isEmpty() || phone.getText().toString().isEmpty() || address.getText() .toString().isEmpty()){
                Toast.makeText(getBaseContext(), "Invalid Details", Toast.LENGTH_LONG).show();
        } else {
            Intent i = new Intent(this, successActivity.class);
            startActivity(i);
        }




        }



    public void clear(View v){

        TextView t=findViewById(R.id.total);
        TextView cart=findViewById(R.id.cartMain);

        cart.setText("");
        t.setText("");
        total=0;
    }

}
