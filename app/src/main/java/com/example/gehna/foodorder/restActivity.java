package com.example.gehna.foodorder;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class restActivity extends AppCompatActivity {



    String callGlobal;
    String n1, n2, n3, n4;
    String p1, p2, p3, p4;
    int q1 = 0, q2 = 0, q3 = 0, q4 = 0;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest);

        Intent intent = getIntent();

        ImageView cover = findViewById(R.id.cover);
        ImageView image1 = findViewById(R.id.image1);
        ImageView image2 = findViewById(R.id.image2);
        ImageView image3 = findViewById(R.id.image3);
        ImageView image4 = findViewById(R.id.image4);
        TextView mainName = findViewById(R.id.mainName);
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        TextView price1 = findViewById(R.id.price1);
        TextView price2 = findViewById(R.id.price2);
        TextView price3 = findViewById(R.id.price3);
        TextView price4 = findViewById(R.id.price4);


        Bitmap coverBM = MainActivity.bitmap;
        Bitmap image1BM = MainActivity.bitmap1;
        Bitmap image2BM = MainActivity.bitmap2;
        Bitmap image3BM = MainActivity.bitmap3;
        Bitmap image4BM = MainActivity.bitmap4;

        cover.setImageBitmap(coverBM);
        image1.setImageBitmap(image1BM);
        image2.setImageBitmap(image2BM);
        image3.setImageBitmap(image3BM);
        image4.setImageBitmap(image4BM);

        mainName.setText(intent.getStringExtra("rest_name"));
        text1.setText(intent.getStringExtra("n1"));
        text2.setText(intent.getStringExtra("n2"));
        text3.setText(intent.getStringExtra("n3"));
        text4.setText(intent.getStringExtra("n4"));
        price1.setText(intent.getStringExtra("p1"));
        price2.setText(intent.getStringExtra("p2"));
        price3.setText(intent.getStringExtra("p3"));
        price4.setText(intent.getStringExtra("p4"));
        callGlobal = intent.getStringExtra("call");

            p1 = intent.getStringExtra("p1");
            p2 = intent.getStringExtra("p2");
            p3 = intent.getStringExtra("p3");
            p4 = intent.getStringExtra("p4");

            n1 = intent.getStringExtra("n1");
            n2 = intent.getStringExtra("n2");
            n3 = intent.getStringExtra("n3");
            n4 = intent.getStringExtra("n4");



    }


    int quanPlus(int quantity, TextView text){

        quantity++;
        text.setText(""+quantity);
        return quantity;

    }

    int quanMinus(int quantity, TextView text){
        if(quantity>0) {
            quantity--;
            text.setText("" + quantity);
            return quantity;

        } else {
            return quantity;
        }
    }


    public void plus1(View view){
        TextView quantity1 = findViewById(R.id.quantity1);
        q1 = quanPlus(q1, quantity1);


    }

    public void minus1(View view){
        TextView quantity1 = findViewById(R.id.quantity1);
        q1 = quanMinus(q1, quantity1);
    }

    public void plus2(View view){
        TextView quantity2 = findViewById(R.id.quantity2);
        q2 = quanPlus(q2, quantity2);


    }

    public void minus2(View view){
        TextView quantity2 = findViewById(R.id.quantity2);
        q2 = quanMinus(q2, quantity2);
    }
    public void plus3(View view){
        TextView quantity3 = findViewById(R.id.quantity3);
        q3 = quanPlus(q3, quantity3);


    }

    public void minus3(View view){
        TextView quantity3 = findViewById(R.id.quantity3);
        q3 = quanMinus(q3, quantity3);
    }
    public void plus4(View view){
        TextView quantity4 = findViewById(R.id.quantity4);
        q4 = quanPlus(q4, quantity4);


    }

    public void minus4(View view){
        TextView quantity4 = findViewById(R.id.quantity4);
        q4 = quanMinus(q4, quantity4);
    }




    public void toCart(View view){
        Intent intent = new Intent(this, cartActivity.class);
        intent.putExtra("price1", p1);
        intent.putExtra("price2", p2);
        intent.putExtra("price3", p3);
        intent.putExtra("price4", p4);
        intent.putExtra("name1", n1);
        intent.putExtra("name2", n2);
        intent.putExtra("name3", n3);
        intent.putExtra("name4", n4);

        String qq1 = String.valueOf(q1);
        String qq2 = String.valueOf(q2);
        String qq3 = String.valueOf(q3);
        String qq4 = String.valueOf(q4);

        intent.putExtra("quantity1",qq1);
        intent.putExtra("quantity2",qq2);
        intent.putExtra("quantity3",qq3);
        intent.putExtra("quantity4",qq4);


        startActivity(intent);
    }







    public void call (View view){
        Intent intent = new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", callGlobal, null));
        startActivity(intent);
    }


}
