package com.example.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button Halqiyah;
    private Button Lahatiyah;
    private Button Shajariyah;
    private Button Tarfiyah;
    private Button Niteeyah;
    private Button Lisaveyah;
    private Button quiz;
    private ImageView imageView;
    Emissionpoints[] emissionpoints;
    private Button Ghunna;
    private TableLayout tbLayout;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
        Halqiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[0].path);
                createTabaleHeader();
                createTabale(emissionpoints[0]);
            }
        });
        Lahatiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[1].path);
                createTabaleHeader();
                createTabale(emissionpoints[1]);
            }
        });
        Shajariyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[2].path);
                createTabaleHeader();
                createTabale(emissionpoints[2]);
            }
        });

        Tarfiyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[3].path);
                createTabaleHeader();
                createTabale(emissionpoints[3]);
            }
        });
        Niteeyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[4].path);
                createTabaleHeader();
                createTabale(emissionpoints[4]);
            }
        });
        Lisaveyah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[5].path);
                createTabaleHeader();
                createTabale(emissionpoints[5]);
            }
        });
        Ghunna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tbLayout.removeAllViews();
                imageView.setBackgroundResource(emissionpoints[6].path);
                createTabaleHeader();
                createTabale(emissionpoints[6]);
            }
        });
        quiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, com.example.task3.quiz.class);

                startActivity(intent);
            }
        });

    }

    class Subpoints {
        public String sno;
        public String letters;
        public String soundProduced;

        Subpoints() {

        }

        Subpoints(String num1, String let, String sound) {
            this.sno = num1;
            this.letters = let;
            this.soundProduced = sound;
        }


    }

    class Emissionpoints {
        String name;
        Subpoints[] information;
        int path;

        Emissionpoints(String nm, Subpoints[] info, int pth) {
            this.name = nm;
            this.information = info;
            this.path = pth;

        }

    }


    private void initialize() {
        tbLayout = findViewById(R.id.table_id);
        Halqiyah = findViewById(R.id.Halqiyah);
        Lahatiyah = findViewById(R.id.Lahatiyah);
        Shajariyah = findViewById(R.id.Shajariyah);
        Tarfiyah = findViewById(R.id.Tarfiyah);
        Niteeyah = findViewById(R.id.Niteeyah);
        Lisaveyah = findViewById(R.id.Lisaveyah);
        Ghunna = findViewById(R.id.Ghunna);
        imageView = findViewById(R.id.imageView);
        textView = findViewById(R.id.textView);
        quiz = findViewById(R.id.quiz);

        Subpoints a1 = new Subpoints("1", "          ه أ", "End of Throat");
        Subpoints a2 = new Subpoints("2", "          ح ع", "End of Throat");
        Subpoints a3 = new Subpoints("3", "          خ غ", "End of Throat");

        Subpoints[] halqiyaAr = {a1, a2, a3};
        emissionpoints = new Emissionpoints[]{
                new Emissionpoints("Halqiya", halqiyaAr, R.drawable.halqiya),
                new Emissionpoints("Lahatiyah", new Subpoints[]{
                        new Subpoints("1", "          ق",
                                "Base of Tongue which is near \nUvula touching the mouth roof"),
                        new Subpoints("2", "          ک",
                                "Portion of Tongue near its base\n" +
                                        "touching the roof of mouth"),
                }, R.drawable.halqiya),
                new Emissionpoints("Shajariyah-\n" +
                        "Haafiyah", new Subpoints[]{
                        new Subpoints("1", "       ج ش ی",
                                "Tongue touching the center of\nthe mouth roof"),
                        new Subpoints("2", "          ض",
                                "One side of the tongue\n" +
                                        "touching the molar teeth"),
                }, R.drawable.halqiya),
                new Emissionpoints("Tarfiyah", new Subpoints[]{
                        new Subpoints("1", "         ل",
                                "Rounded tip of the tongue\ntouching the base of the\nfrontal 8 teeth"),
                        new Subpoints("2", "          ن",
                                "Rounded tip of the tongue\n" +
                                        "touching the base of the\n" +
                                        "frontal 6 teeth"),
                        new Subpoints("3", "          ر",
                                "Rounded tip of the tongue and\n" +
                                        "some portion near it touching\n" +
                                        "the base of the frontal 4 teeth"),
                }, R.drawable.halqiya),
                new Emissionpoints("Nit-eeyah", new Subpoints[]{
                        new Subpoints("1", "       ت د ط",
                                "Tip of the tongue touching the\n" +
                                        "base of the front 2 teeth"),

                }, R.drawable.halqiya),
                new Emissionpoints("Lisaveyah", new Subpoints[]{
                        new Subpoints("1", "       ظ ذ ث",
                                "Tip of the tongue touching the\n" +
                                        "tip of the frontal 2 teeth"),
                        new Subpoints("2", "       ص ز س",
                                "Tip of the tongue comes\n" +
                                        "between the front top and\n" +
                                        "bottom teeth"),
                }, R.drawable.halqiya),
                new Emissionpoints("Ghunna", new Subpoints[]{
                        new Subpoints("1", "         م ن",
                                "While pronouncing the ending\n" +
                                        "sound of م or ن , bring the\n" +
                                        "vibration to the nose"),
                        new Subpoints("2", "          ف",
                                "Tip of the two upper jaw teeth\n" +
                                        "touches the inner part of the\n" +
                                        "lower lip"),
                        new Subpoints("3", "          ب",
                                "Inner part of the both lips\n" +
                                        "touch each other"),
                        new Subpoints("4", "          م",
                                "Outer part of both lips touch\n" +
                                        "each other"),
                        new Subpoints("5", "          و",
                                "Rounding both lips and not\n" +
                                        "closing the mouth"),
                }, R.drawable.halqiya),

        };
    }


    private void createTabale(Emissionpoints emi) {
        TableRow tbRow = new TableRow(this);
        textView.setText(emi.name);
        TextView tv0 = new TextView(this);
        tv0.setText("          ");
        tbRow.addView(tv0);

        TextView tv2 = new TextView(this);
        tv2.setText("            ");
        tbRow.addView(tv2);

        TextView tv3 = new TextView(this);
        tv3.setText(" ");
        tbRow.addView(tv3);

        tbLayout.addView(tbRow);
        for (Subpoints x : emi.information) {
            tbRow = new TableRow(this);

            tv0 = new TextView(this);
            tv0.setText(x.sno);
            tbRow.addView(tv0);

            tv2 = new TextView(this);
            tv2.setText(x.letters);
            tbRow.addView(tv2);

            tv3 = new TextView(this);
            tv3.setText(x.soundProduced);
            tbRow.addView(tv3);

            tbLayout.addView(tbRow);
        }


//        tbRow = new TableRow(this);
//         tv0 = new TextView(this);
//        tv0.setText("1  ");
//        tbRow.addView(tv0);
//
//         tv1 = new TextView(this);
//        tv1.setText("Halqiyah ");
//        tbRow.addView(tv1);
//
//
//         tv2 = new TextView(this);
//        tv2.setText("            أ ہ");
//        tbRow.addView(tv2);
//         tv3 = new TextView(this);
//        tv3.setText("End of Throat ");
//        tbRow.addView(tv3);
//
//        tbLayout.addView(tbRow);
//
//
//        tbRow = new TableRow(this);
//
//
//         tv0 = new TextView(this);
//        tv0.setText("2  ");
//        tbRow.addView(tv0);
//
//         tv1 = new TextView(this);
//        tv1.setText("  ");
//        tbRow.addView(tv1);
//
//
//         tv2 = new TextView(this);
//        tv2.setText("             ع ح");
//        tbRow.addView(tv2);
//         tv3 = new TextView(this);
//        tv3.setText("Middle of Throat     ");
//        tbRow.addView(tv3);
//        tbLayout.addView(tbRow);
//
//        tbRow = new TableRow(this);
//
//
//        tv0 = new TextView(this);
//        tv0.setText("3  ");
//        tbRow.addView(tv0);
//
//        tv1 = new TextView(this);
//        tv1.setText("  ");
//        tbRow.addView(tv1);
//
//
//        tv2 = new TextView(this);
//        tv2.setText("             غ خ");
//        tbRow.addView(tv2);
//        tv3 = new TextView(this);
//        tv3.setText("Start of Throat     ");
//        tbRow.addView(tv3);
//        tbLayout.addView(tbRow);


    }

    private void createTabaleHeader() {
        TableRow tbRow = new TableRow(this);


        TextView tv0 = new TextView(this);
        tv0.setText("S No.       ");
        tv0.setTextSize(17);
        tv0.setTypeface(null, Typeface.BOLD);

        tbRow.addView(tv0);


        TextView tv2 = new TextView(this);
        tv2.setText("Word         ");
        tv2.setTypeface(null, Typeface.BOLD);
        tv2.setTextSize(17);
        tbRow.addView(tv2);


        TextView tv3 = new TextView(this);
        tv3.setText("Location         ");
        tv3.setTypeface(null, Typeface.BOLD);
        tv3.setTextSize(17);
        tbRow.addView(tv3);

        tbLayout.addView(tbRow);
    }
}