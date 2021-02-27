package com.example.act2_decision;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.act2_decision.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnDecision1 = findViewById(R.id.btnDecision1);
        Button btnDecision2 = findViewById(R.id.btnDecision2);

        TextView txtLore = findViewById(R.id.txtLore);
        txtLore.setText("A bar brawl is about to start and you are involved with it because your faction RED PYROS had a conflict towards the opposing faction which is the WESTBROOK'S RAGING JOCKS, Your leader's unexpected brawl rule is no guns and no explosives, incase of brutality just use a melee weapon if the opposing faction wants the brawl to be more intense. There are 6 WRJ men and only 5 on your faction which is the RP, so you need to suggest a very good decision to your leader on how to win the brawl. ");

        btnDecision1.setOnClickListener(this);
        btnDecision2.setOnClickListener(this);
    }
    @Override
    public void onClick(View view){


        TextView txtDecision = findViewById(R.id.txtDecision);





        switch(view.getId()) {
            case R.id.btnDecision1:
                txtDecision.setText("BREAK THEIR DIGNITY - Just let one of your teammate get bullied by the jocks for a minute and wait for some possible witnesses to happen or just stay and get recorded by the CCTV to have an enough evidence for your faction to prove, and when everything is settled properly, all of you will stand and start beating the opposing faction with fists only and keep a reserve melee weapon incase the opposing faction wants to get intense, if your faction wins the brawl not only you won physically but also socially because bringing evidence towards the authorities can reprimand those brawl starter.");
                break;
            case R.id.btnDecision2:
                txtDecision.setText("NOTHING IS HAPPENING - Cancel the plan and all members of the pyros will get up and just walk out acting like they don't know what is happening to make the jocks look like an idiot towards the witnesses, but no winners will be seen because both of the factions are in their neutral state of mind, the jocks will be recieved trashtalks and laughs by the people because they looked like an idiot provoking other faction and the other one doesn't even care and for the pyros they can gain anyones respect because backing of a fight doesn't mean you're a coward and save your anger and strength to other worthy fights.");
                break;
        }

    }
}