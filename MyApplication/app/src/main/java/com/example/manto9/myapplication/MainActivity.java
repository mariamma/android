package com.example.manto9.myapplication;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_USER = "com.example.manto9.myapplication.USERNAME";
    public final static String EXTRA_PASS = "com.example.manto9.myapplication.PASS";
    Button clickButton;
    EditText usernameEditText;
    EditText passwordEditText;
    Context context;
    ListView listView;
    String[] countries = {"India", "China", "Pakistan", "USA", "Japan", "Pakistan", "SriLanka", "Myanmar","Russia"};
    ImageView iv;
    ArrayList prgmName;
    public static int [] prgmImages={R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name,R.drawable.ic_action_name};
    public static String [] prgmNameList={"Let Us C","c++","JAVA","Jsp","Microsoft .Net","Android","PHP","Jquery","JavaScript"};

  /*  @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //put layout/design on the screen
                    // R - auto-generated file - for all resources, android generate an integer-id and store it in R file
        clickButton = (Button) findViewById(R.id.login);
        usernameEditText = (EditText) findViewById(R.id.username);
        passwordEditText = (EditText) findViewById(R.id.password);

        //set listener for button
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String userName = usernameEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                Toast.makeText(MainActivity.this, "BUTTON CLICKED " + userName ,Toast.LENGTH_LONG).show();
                //explicit intents
//                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
//                intent.putExtra(EXTRA_USER,userName);
//                intent.putExtra(EXTRA_PASS,password);
//                startActivity(intent);

                //implicit intent
                //Intent i = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:0000000000"));
                Intent i = new Intent();
                i.setClassName("com.android.calculator2",
                        "com.android.calculator2.Calculator");
                startActivity(i);
            }
        });
    }

*/


//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main2);
//        listView = (ListView) findViewById(R.id.listView);
////        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
////                android.R.layout.simple_expandable_list_item_1, countries);
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this,
//                R.layout.row_item, R.id.textViewItem, countries);
//        listView.setAdapter(arrayAdapter);
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                String s = (String) parent.getItemAtPosition(position);
//                Log.i("List",s + " " + id);
//
//            }
//        });
//    }


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.custom_list);
            context=this;
            listView=(ListView) findViewById(R.id.listView);
            listView.setAdapter(new CustomAdapter(this, prgmNameList,prgmImages));
        }


//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.context_menu);
//        int ig = R.layout.support_simple_spinner_dropdown_item;
//        Button bt = (Button) findViewById(R.id.button);
//        iv = (ImageView) findViewById(R.id.contextimageView);
//        registerForContextMenu(iv);
//    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.my_menu,menu);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.my_menu, menu);
            return super.onCreateOptionsMenu(menu);
        }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.act1){
            AlertDialog.Builder ad = new AlertDialog.Builder(MainActivity.this);
            ad.setTitle("MyDialogue");
            ad.setMessage("This is my message");
            ad.setCancelable(false);
            ad.setPositiveButton("cancel", new DialogInterface.OnClickListener(){

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    finish();
                }
            });
            ad.setNegativeButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            });
            AlertDialog alertDialog = ad.create();
            alertDialog.show();
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("manto","Activity started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("manto","Activity resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("manto","Activity paused");
    }

}
