package com.example.molliestephenson.counter;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void startsAtZero() {
        onView(withId(R.id.textView)).check(matches(withText("0")));
    }

    @Test
    public void canIncreaseNumber() {
        onView(withId(R.id.up)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("1")));
    }

    @Test
    public void canDecreaseNumber() {
        onView(withId(R.id.down)).perform(click());
        onView(withId(R.id.textView)).check(matches(withText("-1")));
    }
}
