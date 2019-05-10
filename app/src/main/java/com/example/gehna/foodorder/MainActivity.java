package com.example.gehna.foodorder;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.CursorAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    static Bitmap bitmap,bitmap1,bitmap2,bitmap3,bitmap4;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] rest={"McDonalds" , "Dominos", "Starbucks", "Burger King", "Subway","Pizza Hut"};
         int[] Icons = {
                R.drawable.unnamed,
                R.drawable.dominos,
                R.drawable.starbucks,
                R.drawable.bk,
                R.drawable.sub,
                R.drawable.pizzahut
        };
        ListAdapter ListAdapter= new CustomAdapter(this,rest, Icons);
        ListView ListView=(ListView)findViewById(R.id.ListView);
        ListView.setAdapter(ListAdapter);

        final ArrayList<restaurants> restList = new ArrayList<>();
        restList.add(new restaurants(BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.mcdcover),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.mcchk),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.mcvg),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.nugs),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.mcflur),"McDonald's","McChicken Meal","McVeggie Meal","Nuggets","Mc Flurry","Rs 180","Rs 140","Rs 90","Rs 50","66000666"));
        restList.add(new restaurants(BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.domicover),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.barb),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.margha),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pep),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.choco),"Domino's","BBQ Chicken Pizza","Margharita Pizza","5 Pepper Pizza","Choco Lava Cake","Rs 320","Rs 150","Rs 285","Rs 80","22412121"));
        restList.add(new restaurants(BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.starcover),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.java),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.starchoco),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.tea),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.cara),"Starbucks","Java Chip Frappe","Hot Chocolate","Iced Shaken Tea","Caramel Frappucino","Rs 190","Rs 200","Rs 170","Rs 180","84678564"));
        restList.add(new restaurants(BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.bkcover),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.burgerking1),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.burgerking2),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.burgerking3),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.burgerking4),"Burger King","Chicken Whopper","Chicken Boss Burger", "Fiery Veg Burger","Veg Suprise Burger","Rs 270","Rs 285","Rs 180","Rs 220","394022343"));
        restList.add(new restaurants(BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.subcover),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.subway1),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.subway2),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.subway3),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.subway4),"Subway","Veg Shammi","Chicken Tikka","Chicken Teriyaki","Veg Suprise Burger","Rs 150","Rs 180","Rs 190","Rs 120","394022343"));
        restList.add(new restaurants(BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pizzahutcover),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pizzahut1),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pizzahut2),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pizzahut3),BitmapFactory.decodeResource(MainActivity.this.getResources(),R.drawable.pizzahut4),"Pizza Hut","Garlic Bread","Veg Supreme Pizza","Chicken Feast Pizza","Cheesy Bites","Rs 80","Rs 220","Rs 275","Rs 250","394022343"));


        ListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener(){
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String rest = String.valueOf(parent.getItemAtPosition(position));
                        restaurants rest1=restList.get(position);
                        Intent intent=new Intent(MainActivity.this,restActivity.class);

                        bitmap=rest1.getCover();
                        bitmap1=rest1.getItem1();
                        bitmap2=rest1.getItem2();
                        bitmap3=rest1.getItem3();
                        bitmap4=rest1.getItem4();
                        intent.putExtra("rest_name", rest1.getRest_name());
                        intent.putExtra("n1", rest1.getN1());
                        intent.putExtra("n2", rest1.getN2());
                        intent.putExtra("n3", rest1.getN3());
                        intent.putExtra("n4", rest1.getN4());
                        intent.putExtra("p1", rest1.getP1());
                        intent.putExtra("p2", rest1.getP2());
                        intent.putExtra("p3", rest1.getP3());
                        intent.putExtra("p4", rest1.getP4());
                        intent.putExtra("call", rest1.getCall());
                        startActivity(intent);

                    }
                }
        );

    }
}
