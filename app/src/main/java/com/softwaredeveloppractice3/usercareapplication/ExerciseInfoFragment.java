package com.softwaredeveloppractice3.usercareapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ExerciseInfoFragment extends Fragment {

    public static final String EXTRA_FIRST = "first";
    private ArrayList<ExerciseItem> mExerciseList;

    private RecyclerView mRecyclerView;
    private ExerciseAdapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_exerciseinfo, null);

        createExerciseList();


        mRecyclerView = view.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mAdapter = new ExerciseAdapter(mExerciseList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

        mAdapter.setOnItemClickListener(new ExerciseAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getActivity(), ActivityRunning.class);
                intent.putExtra(EXTRA_FIRST, mExerciseList.get(position));

                startActivity(intent);
            }
        });
        return view;
    }

    public void createExerciseList() {
        mExerciseList = new ArrayList<>();
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_running, "Running", "755 Cal", "Any runner can tell you their stories about how getting in a good run can immediately improve their mood.The runner\'s high, that euphoric feeling you get when your body begins producing endorphins, is a well - known and scientifically backed benefit of the practice of getting into some running shoes and pounding out some miles.But aside from a good mood boost, what other positive physical effects does running have on the human body ? Let’s take a look at how it changes your body composition and your overall physical system, and what changes the body undergoes during an average run."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_basketball, "Basket Ball", "738 Cal", "Losing weight is not as simple as people think. Not everyone is able to stay determined and follow a proper diet and exercise routine to come to a good shape. For some, following a restricted diet is a task, while others find gymming too intimidating. If you also think that aerobics classes or treadmill workouts are not for you, then you can play other sports to get fit. Gymming is not the only way out to shed kilos, if you love playing basketball, then you can even lose weight by playing this sport. Moreover, it has been found that when you participate in a physical activity you enjoy, you're more likely to include it in your habit."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_bike, "Bicycle", "898 Cal", "We ride because we love to ride. But if you’re looking to lose a few pounds before summer, cycling is a great—not to mention fun!—way to start. Hopping on your bike and going for a long, easy ride or doing something short and fast both have immense health benefits and can bring joy into your life. What you eat matters, too, although you don’t necessarily have to forego your favorite foods in order to lose weight. Here are 14 expert-backed tips on cycling for weight loss that will help you get the ball (er, wheels) rolling."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_boxing, "Boxing", "727 Cal", "A typical boxing workout for weight loss, known as cardio or fitness boxing, involves a variety of elements that help you burn calories as you work toward losing weight. This form of workout includes up-tempo exercises such as jumping rope, calisthenics such as mountain climbers and burpees, working the heavy bag, shadowboxing and hitting a trainer's focus pads. If you want to test your fundamentals, light, controlled sparring drills are ideal. The aerobic nature of many of boxing's exercises leads to a high calorie burn without a significant shock to your joints."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_hiking, "Hiking", "546 Cal", "Hiking outdoors has plenty of perks: nice views, fresh air, and the sounds and smells of nature. It's good for you, too. Hiking is a powerful cardio workout that can : Lower your risk of heart disease, Improve your blood pressure and blood sugar levels, Boost bone density, since walking is a weight-bearing exercise, Build strength in your glutes, quadriceps, hamstrings, and the muscles in your hips and lower legs, Strengthen your core, Improve balance, Boost your mood. \"Research shows that hiking has a positive impact on combating the symptoms of stress and anxiety, says Gregory A. Miller, PhD, president of the American Hiking Society."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_rope, "Rope", "670 Cal", "The popularity of jump rope training has exploded over the past few years, but many gym-goers are still unaware of the jump rope benefits that come with this style of training. The  jump rope is one of the oldest training tools. It’s great for all fitness and ability levels. It fits in with all training goals – whether it be fat loss, endurance, strength, or performance. And it gets the job done. Always. Anywhere. In this comprehensive post we’re going to dissect the benefits of jumping rope and show you why we (and many others) believe that the jump rope should be part of every training routine."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_stair, "Climbing", "852 Cal", "Vintage Fitness personal training clients here in Toronto often have issues with climbing stairs.  If you live in a condo and don’t often have to climb stairs this blog is even more important for you for times that you visit your kids or travel via public transport and need to climb stairs. Climbing stairs seems like an easy enough activity but it involves most of the muscles of your legs as well as good balance."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_swim, "Swimming", "585 Cal", "Swimming is one of the most popular sports in Australia. Our nation is surrounded by water and swimming is one of our great passions. As well as being fun, swimming is a great way to keep fit, stay healthy and make friends. Swimming is a healthy activity that you can continue for a lifetime. It is a low-impact activity that has many physical and mental health benefits."));
        mExerciseList.add(new ExerciseItem(R.drawable.exercise_yoga, "Yoga", "125 Cal", "Yoga is not a new practice—it has been known to mankind though the ages. Yoga is a group of mental, physical, and spiritual practices that help elevate your mood, cleanse your spirit, invigorate your body, and sharpen your mind. And I am sure those who are addicted to yoga can vouch for that statement. Just a few minutes of practice each day can help you ease out of worries and stresses. If you wish to further reap its rewards, incorporate yoga into your daily routine as it is a powerful way to relieve anxiety and cope with everyday stresses."));

    }


}
