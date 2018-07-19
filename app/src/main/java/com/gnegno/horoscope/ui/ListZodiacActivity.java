package com.gnegno.horoscope.ui;

/**
 * Класс содержит методы для инициализации компонента RecycleView,
 * который будет отображать информацию про актуальный астрологический гороскоп
 * и содержать некоторые изображения

public class ListZodiacActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycle_view_item_zodiac2);
        ImageView iv_imageZodiac = findViewById(R.id.iv_imageZodiac);
        iv_imageZodiac.setImageDrawable(getResources().getDrawable
                (getResources().getIdentifier(KEY,"drawable", getPackageName())));
        TextView tv_DescriptZodiac = findViewById(R.id.tv_DescriptZodiac);
        tv_DescriptZodiac.setText((String) getMapLastIntent().get(KEY));
        TextView tv_DescriptZodiac2 = findViewById(R.id.tv_NameOfZodiac);
        tv_DescriptZodiac2.setText(KEY);
    }
    public static final String KEY = "aries";
    /*
      Управляет процессом создания, инициализации RecycleView
      получает данные из прошлой Activity

    private void controlStartRecycleView() {
        HashMap zodiacMap = getMapLastIntent();
        initRecycleViewZodiac(zodiacMap);
    } */

    /*
      Управляет процессом создания, инициализации RecycleView
      получает данные из прошлой Activity */


        /* Получает информацию из прошлого Activity
    private HashMap getMapLastIntent() {
        Intent intent = getIntent();
        return (HashMap) intent.getSerializableExtra("zodiac");
    }


    /*
      Инициализация RecycleView, LayoutManager и Adapter
      @param zodiacMap Уже готовая к работе коллекция, которая хранит данные о знаках зодиаках, их гороскоп. Нужна для вывода данных.
     *
    private void initRecycleViewZodiac(HashMap zodiacMap) {
        RecyclerView recyclerView = findViewById(R.id.rv_zodiak_item);
        recyclerView.setHasFixedSize(false);

        RecyclerView.LayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);

        RecyclerView.Adapter adapter = new RecycleViewZodiac(zodiacMap);
        recyclerView.setAdapter(adapter);

    }

} */