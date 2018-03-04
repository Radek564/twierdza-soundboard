package com.sd.twierdzasoundboard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.media.MediaPlayer;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    private MediaPlayer mp2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mp = MediaPlayer.create(this, R.raw.rt_taunt_01);
        mp2 = MediaPlayer.create(this, R.raw.battle);

    }

    public void clickHandler(View v){

        int id = v.getId();

        switch (id){

            case R.id.button1:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.rt_taunt_01);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button2:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.random_events10);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button3:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.random_events13);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button4:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.pop_rising);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button5:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.pop_falling);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button6:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.pop_immigrate);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button7:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.pop_popularity8);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button8:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_female119);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button9:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male110);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button10:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male69);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button11:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male43);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button12:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male42);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button13:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male1);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button14:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.genie_24);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button15:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_female85);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button16:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_startgame);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button17:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_fear1);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button18:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.food_warning4);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button19:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.food_none);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button20:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.ca_vict_02);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button21:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.ca_taunt_02);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button22:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.ca_anger_01);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button23:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.ca_add_player_01);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button24:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_warning18);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button25:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_warning1);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button26:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_warning16);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button27:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.food_double);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button28:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.food_warning5);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button29:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.placement_warning8);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button30:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_warning2);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button31:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_female1);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button32:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_message39);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button33:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.pop_emigrate);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button34:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.tr_load1);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button35:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.tr_load2);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;
            case R.id.button36:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.engineer_equip4);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button37:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.mace_s4);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button38:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.pg_taunt_03);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button39:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male58);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button40:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_male72);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button41:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.peasant_female17);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button42:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.enemy_attack21);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button43:
                mp.release();
                mp = MediaPlayer.create(this, R.raw.general_warning8);
                mp.start();
                mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
                break;

            case R.id.button44:
                if (mp2.isPlaying()) {
                    mp2.stop();
                } else {
                    mp2 = MediaPlayer.create(this, R.raw.battle);
                    mp2.start();
                    mp2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp2.release();
                        }
                    });
                }
                break;

            case R.id.button45:
                    mp.release();
                    mp = MediaPlayer.create(this, R.raw.asword_m1);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                break;

            case R.id.button46:
                    mp.release();
                    mp = MediaPlayer.create(this, R.raw.asword_m2);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                break;

            case R.id.button47:
                    mp.release();
                    mp = MediaPlayer.create(this, R.raw.asword_m3);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                break;

            case R.id.button48:
                    mp.release();
                    mp = MediaPlayer.create(this, R.raw.asword_m4);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                break;

            case R.id.button49:
                    mp.release();
                    mp = MediaPlayer.create(this, R.raw.asword_m5);
                    mp.start();
                    mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                break;
        }

    }

    public void onDestroy(){
        super.onDestroy();
        if (mp.isPlaying())
            mp.stop();

        if (mp2.isPlaying())
            mp2.stop();
    }

}
