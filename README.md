# Sorting

activity_main.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.pianist.finalproject.List"
    android:background="#0D47A1"
    android:orientation="vertical">
    <TextView
        android:id="@+id/header"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Алгоритмы сортировки:"
        android:textAllCaps="true"
        android:fontFamily="sans-serif-regular"
        android:layout_margin="8dp"
        android:textSize="20sp"
        android:textColor="#fff"
        android:alpha="0.87"
        android:layout_centerHorizontal="true"/>
    <ScrollView
        android:layout_centerHorizontal="true"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_below="@id/header">
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">
            <Button
                android:background="@drawable/button"
                android:id="@+id/quick"
                android:layout_width="280dp"
                android:layout_height="wrap_content"
                android:layout_margin="8dp"
                android:padding="20dp"
                android:alpha="0.8"
                android:shadowColor="#000"
                android:text='Быстрая сортировка'
                android:textStyle="bold"
                android:textColor="#E3F2FD"
                android:layout_centerHorizontal="true"
                android:onClick="infAboutQuick"/>
            <Button
                android:alpha="0.8"
                android:background="@drawable/button"
                android:id="@+id/bubbles"
                android:layout_width="280dp"
                android:layout_height="wrap_content"
                android:layout_margin="8dp"
                android:padding="20dp"
                android:text="Пузырьковая сортировка"
                android:textStyle="bold"
                android:textColor="#E3F2FD"
                android:layout_centerHorizontal="true"
                android:layout_below="@id/quick"
                android:onClick="infAboutBubbles"/>
            <Button
                android:alpha="0.8"
                android:background="@drawable/button"
                android:id="@+id/chet"
                android:layout_width="280dp"
                android:layout_height="wrap_content"
                android:layout_margin="8dp"
                android:padding="20dp"
                android:text="Чётно-нечётная сортировка"
                android:textStyle="bold"
                android:textColor="#E3F2FD"
                android:layout_centerHorizontal="true"
                android:layout_below="@id/bubbles"
                android:onClick="infAboutChet"/>
            <Button
                android:alpha="0.8"
                android:background="@drawable/button"
                android:id="@+id/shake"
                android:layout_width="280dp"
                android:layout_height="wrap_content"
                android:layout_margin="8dp"
                android:padding="20dp"
                android:text="сортировка перемешиванием"
                android:textStyle="bold"
                android:textColor="#E3F2FD"
                android:layout_centerHorizontal="true"
                android:layout_below="@id/chet"
                android:onClick="infAboutShake"/>
            <Button
                android:alpha="0.8"
                android:background="@drawable/button"
                android:id="@+id/ches"
                android:layout_width="280dp"
                android:layout_height="wrap_content"
                android:layout_margin="8dp"
                android:padding="20dp"
                android:text="Сортировка рассчёской"
                android:textStyle="bold"
                android:textColor="#E3F2FD"
                android:layout_centerHorizontal="true"
                android:layout_below="@id/shake"
                android:onClick="infAboutChes"/>
            <Button
                android:alpha="0.8"
                android:background="@drawable/button"
                android:id="@+id/silly"
                android:layout_width="280dp"
                android:layout_height="wrap_content"
                android:layout_margin="8dp"
                android:padding="20dp"
                android:text='"глупая" сортировка'
                android:textStyle="bold"
                android:textColor="#E3F2FD"
                android:layout_centerHorizontal="true"
                android:layout_below="@id/ches"
                android:onClick="infAboutSilly"/>
        </RelativeLayout>
    </ScrollView>
</RelativeLayout>

MainActivity.java
package com.example.android.sorting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void infAboutQuick(View view){
        String article ="Быстрая сортировка";
        String infa = "QuickSort является существенно улучшенным вариантом алгоритма сортировки с помощью прямого обмена (его варианты известны как «Пузырьковая сортировка» и «Шейкерная сортировка»), известного, в том числе, своей низкой эффективностью. Принципиальное отличие состоит в том, что в первую очередь производятся перестановки на наибольшем возможном расстоянии и после каждого прохода элементы делятся на две независимые группы. Любопытный факт: улучшение самого неэффективного прямого метода сортировки дало в результате один из наиболее эффективных улучшенных методов.\n" +
                "\n" +
                "Общая идея алгоритма состоит в следующем:\n" +
                "\n" +
                "Выбрать из массива элемент, называемый опорным. Это может быть любой из элементов массива или же число, вычисленное на основе значений элементов; от выбора этого числа сильно зависит эффективность алгоритма.\n" +
                "Сравнить все остальные элементы с опорным и переставить их в массиве так, чтобы разбить массив на три непрерывных отрезка, следующие друг за другом: «меньшие опорного», «равные» и «большие».\n" +
                "Для отрезков «меньших» и «больших» значений выполнить рекурсивно ту же последовательность операций, если длина отрезка больше единицы.";
        int imageId = 1;
        switchViews(article, infa, imageId);
    }

    public void infAboutBubbles(View view){
        String article ="Пузырьковая сортировка";
        String infa = "Сортировка простыми обменами, сортиро́вка пузырько́м (англ. bubble sort) — простой алгоритм сортировки. Для понимания и реализации этот алгоритм — простейший, но эффективен он лишь для небольших массивов. Сложность алгоритма: O(n^2).\n" +
                "\n" +
                "Алгоритм считается учебным и практически не применяется вне учебной литературы, вместо него на практике применяются более эффективные алгоритмы сортировки. В то же время метод сортировки обменами лежит в основе некоторых более совершенных алгоритмов, таких как шейкерная сортировка, пирамидальная сортировка и быстрая сортировка."+"\n"
                +"Принцип действий прост: обходим массив от начала до конца, попутно меняя местами неотсортированные соседние элементы. В результате первого прохода на последнее место «всплывёт» максимальный элемент. Теперь снова обходим неотсортированную часть массива (от первого элемента до предпоследнего) и меняем по пути неотсортированных соседей. Второй по величине элемент окажется на предпоследнем месте. Продолжая в том же духе, будем обходить всё уменьшающуюся неотсортированную часть массива, запихивая найденные максимумы в конец.";
        int imageId = 2;
        switchViews(article, infa, imageId);
    }

    public void infAboutChet(View view){
        String article ="Чётно-нечётная сортировка";
        String infa = "Производится многократный прогон по массиву, соседние элементы сравниваются и, в случае необходимости, меняются местами. В отличие от пузырьковой сортировки шаг по массиву равен двум, а не единице.\n" +
                "\n" +
                "Сначала элементы с нечётными индексами сравниваются/обмениваются с элементами с чётными индексами (1-й со 2-м, 3-й с 4-м, 5-й с 6-м и т.д.). Затем элементы с чётными индексами сравниваются/обмениваются с соседними элементами с нечётными индексами (2-й с 3-м, 4-й с 5-м, 6-й с 7-м и т.д.). Затем снова нечётные сравниваются с чётными, потом снова чётные с нечётными и т.д. Процесс завершается если в результате двух прогонов не происходило обменов — значит массив упорядочен.";
        int imageId = 3;
        switchViews(article, infa, imageId);
    }

    public void infAboutShake(View view){
        String article ="Сортировка перемешиванием";
        String infa = "Она же шейкерная сортировка, она же коктейльная сортировка. Начинается процесс как в «пузырьке»: выдавливаем максимум на самые задворки. После этого разворачиваемся на 1800 и идём в обратную сторону, при этом уже перекатывая в начало не максимум, а минимум. Отсортировав в массиве первый и последний элементы, снова делаем кульбит. Обойдя туда-обратно несколько раз, в итоге заканчиваем процесс, оказавшись в середине списка."+"\n"
                +"Шейкерная сортировка работает немного быстрее чем пузырьковая, поскольку по массиву в нужных направлениях попеременно мигрируют и максимумы и минимумы. Улучшения, как говорится, налицо.\n" +
                "\n" +
                "Как видите, если к процессу перебора подойти творчески, то выталкивание тяжёлых (лёгких) элементов к концам массива происходит быстрее. ";
        int imageId = 4;
        switchViews(article, infa, imageId);
    }

    public void infAboutChes(View view){
        String article ="Сортировка расчёской";
        String infa = "В «пузырьке», «шейкере» и «чёт-нечете» при переборе массива сравниваются соседние элементы. Основная идея «расчёски» в том, чтобы первоначально брать достаточно большое расстояние между сравниваемыми элементами и по мере упорядочивания массива сужать это расстояние вплоть до минимального. Таким образом мы как бы причёсываем массив, постепенно разглаживая на всё более аккуратные пряди.Первоначальный разрыв между сравниваемыми элементами лучше брать не абы какой, а с учётом специальной величины называемой фактором уменьшения, оптимальное значение которой равно примерно 1,247. Сначала расстояние между элементами равно размеру массива разделённого на фактор уменьшения (результат, естественно, округляется до ближайшего целого). Затем, пройдя массив с этим шагом, мы снова делим шаг на фактор уменьшения и проходим по списку вновь. Так продолжается до тех пор, пока разность индексов не достигнет единицы. В этом случае массив досортировывается обычным пузырьком.\n";
        int imageId = 5;
        switchViews(article, infa, imageId);
    }

    public void infAboutSilly(View view){
        String article ="\"Глупая\" сортировка";
        String infa = "Сортировка и впрямь глупейшая. Просматриваем массив слева-направо и по пути сравниваем соседей. Если мы встретим пару взаимно неотсортированных элементов, то меняем их местами и возвращаемся на круги своя, то бишь в самое начало. Снова проходим-проверяем массив, если встретили снова «неправильную» пару соседних элементов, то меняем местами и опять начинаем всё сызнова. Продолжаем до тех пор пока массив потихоньку-полегоньку не отсортируется."+
                "\n"+"Внесём в глупую сортировку одно-единственное улучшение. Обнаружив при проходе два соседних неотсортированных элемента и поменяв их местами, не станем откатываться в начало массива, а невозмутимо продолжим его обход до самого конца. \n" +
                "\n" +
                "В этом случае перед нами не что иное как всем известная пузырьковая сортировка";
        int imageId = 6;
        switchViews(article, infa, imageId);
    }

    public void switchViews(String a, String inf, int id){
        Intent i = new Intent(this, SubActivity.class);
        i.putExtra("a",a);
        i.putExtra("i",inf);
        i.putExtra("id",id);
        startActivity(i);
    }
}
activity_sub.xml
<?xml version="1.0" encoding="utf-8"?>
<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.android.sorting.SubActivity"
    android:background="#0D47A1">
    <TextView
        android:id="@+id/article_text_view"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_centerHorizontal="true"
        android:textColor="#FFF"
        android:textSize="22sp"
        android:text=""
        android:textStyle="italic"/>
    <ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:layout_below="@id/article_text_view">
        <RelativeLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent">
            <TextView
                android:id="@+id/information_text_view"
                android:textColor="#E3E3E3"
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:layout_centerHorizontal="true"
                android:layout_margin="8dp"
                android:paddingBottom="8dp"
                android:textSize="14sp"
                android:text="" />
            <ImageView
                android:layout_centerHorizontal="true"
                android:scaleType="centerInside"
                android:layout_below="@id/information_text_view"
                android:id="@+id/image_view"
                android:layout_width="400dp"
                android:layout_height="wrap_content"/>
        </RelativeLayout>
    </ScrollView>
</RelativeLayout>
SubActivity.java
package com.example.android.sorting;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        Intent child = getIntent();
        String art = child.getStringExtra("a");
        String inf = child.getStringExtra("i");
        int imageId = child.getIntExtra("id",1);
        description(art,inf,imageId);
    }

    public void description(String article,String inf,int id){
        TextView art = (TextView)findViewById(R.id.article_text_view);
        TextView information = (TextView)findViewById(R.id.information_text_view);
        ImageView image = (ImageView)findViewById(R.id.image_view);
        art.setText(article);
        information.setText(inf);
        if (id == 1) {
            image.setImageResource(R.drawable.quicksort);
        }
        if (id == 2) {
            image.setImageResource(R.drawable.bubbles);
        }
        if (id == 3) {
            image.setImageResource(R.drawable.chet);
        }
        if (id == 4) {
            image.setImageResource(R.drawable.shake);
        }
    }
}

