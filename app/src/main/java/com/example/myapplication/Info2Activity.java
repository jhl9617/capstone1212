package com.example.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.net.URL;

public class Info2Activity extends AppCompatActivity{

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info2);

        Button back = (Button)findViewById(R.id.btnInfo2Back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //개 고양이 선택
        Button ChoiceDog = (Button)findViewById(R.id.txtInfo2ChoiceDog);
        Button ChoiceCat = (Button)findViewById(R.id.txtInfo2ChoiceCat);

        //세부항목 선택
        Button ChoiceHealth = (Button)findViewById(R.id.txtInfo2ChoiceDogHealth);
        Button ChoiceFood = (Button)findViewById(R.id.txtInfo2ChoiceDogFood);
        Button ChoiceProduct = (Button)findViewById(R.id.txtInfo2ChoiceDogProduct);
        Button ChoiceBehavior = (Button)findViewById(R.id.txtInfo2ChoiceDogBehavior);

        ImageButton img1 = (ImageButton)findViewById(R.id.imgInfo2Img1);
        ImageButton img2 = (ImageButton)findViewById(R.id.imgInfo2Img2);
        ImageButton img3 = (ImageButton)findViewById(R.id.imgInfo2Img3);
        ImageButton img4 = (ImageButton)findViewById(R.id.imgInfo2Img4);
        ImageButton img5 = (ImageButton)findViewById(R.id.imgInfo2Img5);
        ImageButton img6 = (ImageButton)findViewById(R.id.imgInfo2Img6);
        ImageButton img7 = (ImageButton)findViewById(R.id.imgInfo2Img7);
        ImageButton img8 = (ImageButton)findViewById(R.id.imgInfo2Img8);
        ImageButton img9 = (ImageButton)findViewById(R.id.imgInfo2Img9);

        TextView txt1 = (TextView)findViewById(R.id.txtInfo2Img1);
        TextView txt2 = (TextView)findViewById(R.id.txtInfo2Img2);
        TextView txt3 = (TextView)findViewById(R.id.txtInfo2Img3);
        TextView txt4 = (TextView)findViewById(R.id.txtInfo2Img4);
        TextView txt5 = (TextView)findViewById(R.id.txtInfo2Img5);
        TextView txt6 = (TextView)findViewById(R.id.txtInfo2Img6);
        TextView txt7 = (TextView)findViewById(R.id.txtInfo2Img7);
        TextView txt8 = (TextView)findViewById(R.id.txtInfo2Img8);
        TextView txt9 = (TextView)findViewById(R.id.txtInfo2Img9);

        TextView check = (TextView)findViewById(R.id.check);

        boolean choicecheck = true; //true는 개 false는 고양이이

       //디폴트 - 개-> 건강
        img1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/102248/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/65381/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/44186/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/42331/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/29472/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/28871/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/18201/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/9221/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });

        img9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String url = "https://mypetlife.co.kr/96406/";
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


        ChoiceDog.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                check.setText("개");
                ChoiceDog.setTextColor(Color.BLUE);
                ChoiceCat.setTextColor(Color.BLACK);
            }
        });

        ChoiceCat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                check.setText("고양이");
                ChoiceDog.setTextColor(Color.BLACK);
                ChoiceCat.setTextColor(Color.BLUE);
            }
        });

        ChoiceHealth.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ChoiceHealth.setTextColor(Color.parseColor("#0000FF"));
                ChoiceFood.setTextColor(Color.parseColor("#000000"));
                ChoiceProduct.setTextColor(Color.parseColor("#000000"));
                ChoiceBehavior.setTextColor(Color.parseColor("#000000"));



                if(check.getText().toString() == "개")
                {
                    img1.setImageResource(R.drawable.dh1);
                    txt1.setText("예방접종 순서 및 필수 종류");
                    img1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/102248/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                    img2.setImageResource(R.drawable.dh2);
                    txt2.setText("발톱 자르는 방법 및 필수 상식 5가지");
                    img2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/65381/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img3.setImageResource(R.drawable.dh3);
                    txt3.setText("입양 첫 날 해야할 10가지");
                    img3.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/44186/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img4.setImageResource(R.drawable.dh4);
                    txt4.setText("털갈이 시기 관리법");
                    img4.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/42331/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img5.setImageResource(R.drawable.dh5);
                    txt5.setText("강아지 처음 키울 때 7가지 원칙");
                    img5.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/29472/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img6.setImageResource(R.drawable.dh6);
                    txt6.setText("강아지 간식 고르는 법 6가지");
                    img6.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/28871/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img7.setImageResource(R.drawable.dh7);
                    txt7.setText("반려견이 아플 때 보이는 행동 6가지");
                    img7.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/18201/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img8.setImageResource(R.drawable.dh8);
                    txt8.setText("강아지 음식 줄 때 피해야 할 6가지");
                    img8.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/9221/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img9.setImageResource(R.drawable.dh9);
                    txt9.setText("중성화 수술 전후 유의사항");
                    img9.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/96406/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });
                }

                //고양이
                else
                {
                    img1.setImageResource(R.drawable.ch1);
                    txt1.setText("스크래처 고르기");
                    img1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/98755/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                    img2.setImageResource(R.drawable.ch2);
                    txt2.setText("수명을 단축시키는 5가지 행동");
                    img2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/95437/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img3.setImageResource(R.drawable.ch3);
                    txt3.setText("실내에서 키워야 하는 이유");
                    img3.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/95029/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img4.setImageResource(R.drawable.ch4);
                    txt4.setText("행복하게 키우는 5가지 방법");
                    img4.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/87071/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img5.setImageResource(R.drawable.ch5);
                    txt5.setText("평소보다 많이 운다면 응급신호 일수도 !");
                    img5.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/86435/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img6.setImageResource(R.drawable.ch6);
                    txt6.setText("불안 증세 보일 때 대처 5가지");
                    img6.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/84840/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img7.setImageResource(R.drawable.ch7);
                    txt7.setText("스트레스를 받게 하는 12가지 행동");
                    img7.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/84677/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img8.setImageResource(R.drawable.ch8);
                    txt8.setText("털갈이 시기와 대처법 알아보기");
                    img8.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/81578/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img9.setImageResource(R.drawable.ch9);
                    txt9.setText("고양이 모래 소재별 장단점");
                    img9.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/78851/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });
                } // else 닫기
            } //onClick 닫기
        });

        //음식 골랐을 때
        ChoiceFood.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                ChoiceHealth.setTextColor(Color.BLACK);
                ChoiceFood.setTextColor(Color.BLUE);
                ChoiceProduct.setTextColor(Color.BLACK);
                ChoiceBehavior.setTextColor(Color.BLACK);


                if(check.getText().toString() == "개")
                {
                    img1.setImageResource(R.drawable.egg);
                    txt1.setText("계란을 먹어도 될까?");
                    img1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%ea%b3%84%eb%9e%80-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                    img2.setImageResource(R.drawable.sweetpotato);
                    txt2.setText("고구마를 먹어도 될까?");
                    img2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%ea%b3%a0%ea%b5%ac%eb%a7%88-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%a0%ea%b9%8c/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img3.setImageResource(R.drawable.orange);
                    txt3.setText("귤을 먹어도 될까?");
                    img3.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%ea%b7%a4-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img4.setImageResource(R.drawable.gim);
                    txt4.setText("김을 먹어도 될까?");
                    img4.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%ea%b9%80-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img5.setImageResource(R.drawable.honey);
                    txt5.setText("꿀을 먹어도 될까?");
                    img5.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%ea%bf%80-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img6.setImageResource(R.drawable.chicken);
                    txt6.setText("닭고기를 먹어도 될까?");
                    img6.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%eb%8b%ad%ea%b3%a0%ea%b8%b0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img7.setImageResource(R.drawable.pig);
                    txt7.setText("돼지고기를 먹어도 될까?");
                    img7.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%eb%8f%bc%ec%a7%80%ea%b3%a0%ea%b8%b0-%ec%a4%98%eb%8f%84-%eb%90%a0%ea%b9%8c/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img8.setImageResource(R.drawable.straw);
                    txt8.setText("딸기를 먹어도 될까?");
                    img8.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%eb%94%b8%ea%b8%b0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%a0%ea%b9%8c/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img9.setImageResource(R.drawable.milk);
                    txt9.setText("우유를 먹어도 될까?");
                    img9.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b0%95%ec%95%84%ec%a7%80-%ec%9a%b0%ec%9c%a0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });
                }

                //고양이
                else
                {
                    img1.setImageResource(R.drawable.egg);
                    txt1.setText("계란을 먹어도 될까?");
                    img1.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%ea%b3%84%eb%9e%80-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                    img2.setImageResource(R.drawable.honey);
                    txt2.setText("꿀을 먹어도 될까?");
                    img2.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%ea%bf%80-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img3.setImageResource(R.drawable.chicken);
                    txt3.setText("닭고기를 먹어도 될까?");
                    img3.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%eb%8b%ad%ea%b3%a0%ea%b8%b0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img4.setImageResource(R.drawable.pig);
                    txt4.setText("돼지고기를 먹어도 될까?");
                    img4.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%eb%8f%bc%ec%a7%80%ea%b3%a0%ea%b8%b0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img5.setImageResource(R.drawable.straw);
                    txt5.setText("딸기를 먹어도 될까?");
                    img5.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%eb%94%b8%ea%b8%b0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img6.setImageResource(R.drawable.sweetpotato);
                    txt6.setText("고구마를 먹어도 될까?");
                    img6.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%ea%b3%a0%ea%b5%ac%eb%a7%88-%eb%a8%b9%ec%96%b4%eb%8f%84-%ea%b4%9c%ec%b0%ae%ec%9d%84%ea%b9%8c/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img7.setImageResource(R.drawable.chovy);
                    txt7.setText("멸치를 먹어도 될까?");
                    img7.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%eb%a9%b8%ec%b9%98-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94-%ea%b8%89%ec%97%ac-%ec%8b%9c-%ec%a3%bc%ec%9d%98%ec%a0%90%ec%9d%80/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img8.setImageResource(R.drawable.apple);
                    txt8.setText("사과를 먹어도 될까?");
                    img8.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%ec%82%ac%ea%b3%bc-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img9.setImageResource(R.drawable.cow);
                    txt9.setText("소고기를 먹어도 될까?");
                    img9.setOnClickListener(new View.OnClickListener(){
                        public void onClick(View v){
                            String url = "https://mypetlife.co.kr/wiki/%ea%b3%a0%ec%96%91%ec%9d%b4-%ec%86%8c%ea%b3%a0%ea%b8%b0-%eb%a8%b9%ec%96%b4%eb%8f%84-%eb%90%98%eb%82%98%ec%9a%94/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });
                } // else 닫기
            } //onClick 닫기
        });

        //제품을 골랐을때
        ChoiceProduct.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ChoiceHealth.setTextColor(Color.BLACK);
                ChoiceFood.setTextColor(Color.BLACK);
                ChoiceProduct.setTextColor(Color.BLUE);
                ChoiceBehavior.setTextColor(Color.BLACK);


                if (check.getText().toString() == "개") {
                    img1.setImageResource(R.drawable.dp1);
                    txt1.setText("개껌 추천");
                    img1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/103590/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                    img2.setImageResource(R.drawable.dp2);
                    txt2.setText("강아지 산책 용품, 필수품은?");
                    img2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/102279/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img3.setImageResource(R.drawable.dp3);
                    txt3.setText("강아지 치약 성분 조심해야 할 것과 추천");
                    img3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/101855/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img4.setImageResource(R.drawable.dp4);
                    txt4.setText("강아지 털갈이 청소템 추천 !");
                    img4.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/101715/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img5.setImageResource(R.drawable.dp5);
                    txt5.setText("강아지 배변봉투 추천 !");
                    img5.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/101639/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img6.setImageResource(R.drawable.dp6);
                    txt6.setText("칫솔 추천 제품 및 선택 방법 !");
                    img6.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/100831/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img7.setImageResource(R.drawable.dp7);
                    txt7.setText("강아지 샴푸 추천!");
                    img7.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/100624/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img8.setImageResource(R.drawable.dp8);
                    txt8.setText("강아지 터그 장난감 추천 !");
                    img8.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/100231/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img9.setImageResource(R.drawable.dp9);
                    txt9.setText("강아지 이동장 추천 !");
                    img9.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/99995/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });
                }

                //고양이
                else {
                    img1.setImageResource(R.drawable.cp1);
                    txt1.setText("다이어트 보조 캣휠 및 간식 추천!");
                    img1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/103620/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });


                    img2.setImageResource(R.drawable.cp2);
                    txt2.setText("고양이 화장실 종류별 장단점 및 추천!");
                    img2.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/103179/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img3.setImageResource(R.drawable.cp3);
                    txt3.setText("고양이 모래 종류와 추천!");
                    img3.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/103159/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img4.setImageResource(R.drawable.cp4);
                    txt4.setText("고양이 침대 고르는 법과 추천!");
                    img4.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/101806/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img5.setImageResource(R.drawable.cp5);
                    txt5.setText("고양이 털빠짐 관리 추천 아이템 !");
                    img5.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/101078/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img6.setImageResource(R.drawable.cp6);
                    txt6.setText("고양이 정수기 장단점 및 고르는법!");
                    img6.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/101008/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img7.setImageResource(R.drawable.cp7);
                    txt7.setText("고양이 샴푸 추천 !");
                    img7.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/100618/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img8.setImageResource(R.drawable.cp8);
                    txt8.setText("고양이 밥그릇 추천!");
                    img8.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/100219/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });

                    img9.setImageResource(R.drawable.cp9);
                    txt9.setText("빗 종류별 특징과 추천!");
                    img9.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                            String url = "https://mypetlife.co.kr/100099/";
                            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                            startActivity(intent);
                        }
                    });
                } // else 닫기
            }
        });


                //행동을 골랐을때
                ChoiceBehavior.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        ChoiceHealth.setTextColor(Color.BLACK);
                        ChoiceFood.setTextColor(Color.BLACK);
                        ChoiceProduct.setTextColor(Color.BLACK);
                        ChoiceBehavior.setTextColor(Color.BLUE);


                        if (check.getText().toString() == "개") {
                            img1.setImageResource(R.drawable.db1);
                            txt1.setText("강아지의 잠자는 모습, 편안함을 나타내는 건?");
                            img1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/103092/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });


                            img2.setImageResource(R.drawable.db2);
                            txt2.setText("강아지 애정표현 및 불만표현은?");
                            img2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/101692/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img3.setImageResource(R.drawable.db3);
                            txt3.setText("강아지가 낑낑대는 이유");
                            img3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/54113/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img4.setImageResource(R.drawable.db4);
                            txt4.setText("강아지가 주인을 따라다니는 이유");
                            img4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/48217/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img5.setImageResource(R.drawable.db5);
                            txt5.setText("강아지가 헥헥거리는 이유");
                            img5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/47024/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img6.setImageResource(R.drawable.db6);
                            txt6.setText("강아지의 공격성 원인 및 대처법은?");
                            img6.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/31326/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img7.setImageResource(R.drawable.db7);
                            txt7.setText("강아지 꼬리를 보면 기분을 알 수 있다?");
                            img7.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/28776/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img8.setImageResource(R.drawable.db8);
                            txt8.setText("강아지가 갸우뚱 하는 이유");
                            img8.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/20268/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img9.setImageResource(R.drawable.db9);
                            txt9.setText("강아지의 소변 실수 이유 및 대처법");
                            img9.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/19511/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });
                        }

                        //고양이
                        else {
                            img1.setImageResource(R.drawable.cb1);
                            txt1.setText("고양이 딸꾹질 원인과 대처법");
                            img1.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/102221/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });


                            img2.setImageResource(R.drawable.cb2);
                            txt2.setText("고양이 기본지식");
                            img2.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/97245/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img3.setImageResource(R.drawable.cb3);
                            txt3.setText("고양이 마음 읽기");
                            img3.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/95979/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img4.setImageResource(R.drawable.cb4);
                            txt4.setText("고양이를 놀라게 하는 행동");
                            img4.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/95037/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img5.setImageResource(R.drawable.cb5);
                            txt5.setText("고양이는 주인을 큰 고양이라고 생각할까?");
                            img5.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/94881/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img6.setImageResource(R.drawable.cb6);
                            txt6.setText("고양이는 왜 두발로 서려고 할까?");
                            img6.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/94851/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img7.setImageResource(R.drawable.cb7);
                            txt7.setText("고양이 울음소리, 이럴 때는 위험신호?");
                            img7.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/94681/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img8.setImageResource(R.drawable.cb8);
                            txt8.setText("고양이가 싫어하는 의사표시를 나타내는 행동");
                            img8.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/87359/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                            img9.setImageResource(R.drawable.cb9);
                            txt9.setText("고양이의 좋아요 5가지 신호는?");
                            img9.setOnClickListener(new View.OnClickListener() {
                                public void onClick(View v) {
                                    String url = "https://mypetlife.co.kr/85883/";
                                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                                    startActivity(intent);
                                }
                            });

                        } // else 닫기

                    } //onClick 닫기



            }); // onCreate 닫기
        }
    }



