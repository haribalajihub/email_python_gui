
===============
Dependency
===============
implementation 'com.google.android.material:material:1.1.0'
    implementation 'com.google.android.material:material:1.2.0-beta01'


===============
Item Xml Code
===============
No needed


===============
Xml Code
===============
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical">

    <com.google.android.material.appbar.AppBarLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:theme="@style/ThemeOverlay.MaterialGallery.AppBarLayout">

        <com.google.android.material.appbar.MaterialToolbar
            android:id="@+id/toolbar"
            android:layout_width="match_parent"
            android:layout_height="?attr/actionBarSize"
            app:title="@string/expansion_panels" />

    </com.google.android.material.appbar.AppBarLayout>

    <androidx.core.widget.NestedScrollView
        android:id="@+id/activity_expansion_panels_nested_scroll_view"
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:scrollbars="none"
        android:scrollingCache="true">

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:paddingTop="@dimen/spacing_medium">

            <com.google.android.material.card.MaterialCardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/spacing_middle"
                android:layout_marginTop="@dimen/spacing_medium"
                android:layout_marginRight="@dimen/spacing_middle"
                android:layout_marginBottom="@dimen/spacing_medium"
                android:visibility="visible"
                app:cardCornerRadius="2dp"
                app:cardElevation="2dp">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:background="@android:color/white"
                        android:gravity="center_vertical"
                        android:minHeight="?attr/actionBarSize"
                        android:orientation="horizontal">

                        <View
                            android:layout_width="@dimen/spacing_large"
                            android:layout_height="wrap_content" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="Text"
                            android:textAppearance="@style/TextAppearance.AppCompat.Medium"
                            android:textColor="@color/grey_80" />

                        <ImageButton
                            android:id="@+id/activity_expansion_panels_btn_toggle_text"
                            android:layout_width="?attr/actionBarSize"
                            android:layout_height="?attr/actionBarSize"
                            android:background="?attr/selectableItemBackgroundBorderless"
                            android:tint="@color/grey_80"
                            app:srcCompat="@drawable/ic_arrow_downward" />

                    </LinearLayout>

                    <LinearLayout
                        android:id="@+id/activity_expansion_lyt_expand_text"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="vertical">

                        <TextView
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:padding="@dimen/spacing_large"
                            android:text="@string/peragraph_xsmall" />

                        <View
                            android:layout_width="match_parent"
                            android:layout_height="1dp"
                            android:background="@color/grey_10" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:gravity="end"
                            android:orientation="horizontal">

                            <Button
                                android:id="@+id/activity_expansion_panels_btn_hide_text"
                                style="@style/Widget.AppCompat.Button.Borderless"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:gravity="center"
                                android:text="@string/HIDE" />

                        </LinearLayout>

                    </LinearLayout>

                </LinearLayout>

            </com.google.android.material.card.MaterialCardView>

            <com.google.android.material.card.MaterialCardView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:layout_marginLeft="@dimen/spacing_middle"
                android:layout_marginTop="@dimen/spacing_medium"
                android:layout_marginRight="@dimen/spacing_middle"
                android:layout_marginBottom="@dimen/spacing_medium"
                android:visibility="visible"
                app:cardCornerRadius="2dp"
                app:cardElevation="2dp">

                <LinearLayout
                    android:layout_width="match_parent"
                    android:layout_height="wrap_content"
                    android:orientation="vertical">

                    <LinearLayout
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:background="@android:color/white"
                        android:gravity="center_vertical"
                        android:minHeight="?attr/actionBarSize"
                        android:orientation="horizontal">

                        <View
                            android:layout_width="@dimen/spacing_large"
                            android:layout_height="wrap_content" />

                        <TextView
                            android:layout_width="0dp"
                            android:layout_height="wrap_content"
                            android:layout_weight="1"
                            android:text="Input"
                            android:textAppearance="@style/TextAppearance.AppCompat.Medium"
                            android:textColor="@color/grey_80" />

                        <ImageButton
                            android:id="@+id/activity_expansion_panel_btn_toggle_input"
                            android:layout_width="?attr/actionBarSize"
                            android:layout_height="?attr/actionBarSize"
                            android:background="?attr/selectableItemBackgroundBorderless"
                            android:tint="@color/grey_80"
                            app:srcCompat="@drawable/ic_arrow_downward" />

                    </LinearLayout>

                    <LinearLayout
                        android:id="@+id/activity_expansion_panel_lyt_expand_input"
                        android:layout_width="match_parent"
                        android:layout_height="wrap_content"
                        android:orientation="vertical">

                        <EditText
                            android:id="@+id/activity_expansion_panel_edt_name"
                            android:layout_width="match_parent"
                            android:layout_height="50dp"
                            android:layout_marginLeft="@dimen/spacing_large"
                            android:layout_marginTop="@dimen/spacing_large"
                            android:layout_marginRight="@dimen/spacing_large"
                            android:background="@color/grey_5"
                            android:gravity="center_vertical"
                            android:hint="Name"
                            android:padding="@dimen/spacing_middle"
                            android:textColor="@color/grey_60" />

                        <LinearLayout
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="10dp"
                            android:layout_marginLeft="@dimen/spacing_large"
                            android:orientation="horizontal">

                            <androidx.appcompat.widget.AppCompatTextView
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Choice" />

                            <RadioGroup
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginStart="20dp"
                                android:orientation="horizontal">

                                <com.google.android.material.radiobutton.MaterialRadioButton
                                    android:layout_width="wrap_content"
                                    android:layout_height="wrap_content"
                                    android:text="Male" />

                                <com.google.android.material.radiobutton.MaterialRadioButton
                                    android:layout_width="wrap_content"
                                    android:layout_height="wrap_content"
                                    android:text="Female" />

                            </RadioGroup>
                        </LinearLayout>

                        <LinearLayout
                            android:layout_width="wrap_content"
                            android:layout_height="wrap_content"
                            android:layout_marginTop="10dp"
                            android:layout_marginLeft="@dimen/spacing_large"
                            android:orientation="horizontal">

                            <androidx.appcompat.widget.AppCompatTextView
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Choice" />

                            <com.google.android.material.checkbox.MaterialCheckBox
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:layout_marginStart="20dp"
                                android:text="Cricket" />

                            <com.google.android.material.checkbox.MaterialCheckBox
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Vollyball" />

                            <com.google.android.material.checkbox.MaterialCheckBox
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:text="Hockey" />
                            
                        </LinearLayout>

                        <View
                            android:layout_width="match_parent"
                            android:layout_height="1dp"
                            android:background="@color/grey_10" />

                        <LinearLayout
                            android:layout_width="match_parent"
                            android:layout_height="wrap_content"
                            android:gravity="end"
                            android:orientation="horizontal">

                            <Button
                                android:id="@+id/activity_expansion_panel_btn_hide_input"
                                style="@style/Widget.AppCompat.Button.Borderless"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:gravity="center"
                                android:text="@string/HIDE" />

                            <Button
                                android:id="@+id/activity_expansion_panel_btn_save_input"
                                style="@style/Widget.AppCompat.Button.Borderless"
                                android:layout_width="wrap_content"
                                android:layout_height="wrap_content"
                                android:gravity="center"
                                android:text="@string/SAVE" />

                        </LinearLayout>

                    </LinearLayout>

                </LinearLayout>

            </com.google.android.material.card.MaterialCardView>

        </LinearLayout>

    </androidx.core.widget.NestedScrollView>

</LinearLayout>


===============
Model Code
===============
No needed


===============
Adapter Code
===============
No needed


===============
MainActivity Code
===============
public class ExpansionPanelsMainActivity extends AppCompatActivity {

    private NestedScrollView nested_scroll_view;
    private ImageButton imageButtonToggleText, imageButtonToggleInput;
    private View layoutExpandText, layoutExpandInput;
    private View parent_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expansion_panels_main);
        parent_view = findViewById(android.R.id.content);
        initToolbar();

        initComponent();
    }

    private void initToolbar() {
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void initComponent() {

        // text section
        imageButtonToggleText = findViewById(R.id.activity_expansion_panels_btn_toggle_text);
        Button buttonHideText = findViewById(R.id.activity_expansion_panels_btn_hide_text);
        layoutExpandText = findViewById(R.id.activity_expansion_lyt_expand_text);
        layoutExpandText.setVisibility(View.GONE);

        imageButtonToggleText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionText(imageButtonToggleText);
            }
        });

        buttonHideText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionText(imageButtonToggleText);
            }
        });

        // input section
        imageButtonToggleInput = findViewById(R.id.activity_expansion_panel_btn_toggle_input);
        Button buttonHideInput = findViewById(R.id.activity_expansion_panel_btn_hide_input);
        Button buttonSaveInput = findViewById(R.id.activity_expansion_panel_btn_save_input);
        layoutExpandInput = findViewById(R.id.activity_expansion_panel_lyt_expand_input);
        layoutExpandInput.setVisibility(View.GONE);

        imageButtonToggleInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInput(imageButtonToggleInput);
            }
        });

        buttonHideInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toggleSectionInput(imageButtonToggleInput);
            }
        });

        buttonSaveInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(parent_view, R.string.data_saved, Snackbar.LENGTH_SHORT).show();
                toggleSectionInput(imageButtonToggleInput);
            }
        });

        // nested scrollview
        nested_scroll_view = findViewById(R.id.activity_expansion_panels_nested_scroll_view);
    }

    private void toggleSectionText(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            AnimationHelper.openStep(layoutExpandText, new AnimationHelper.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, layoutExpandText);
                }
            });
        } else {
            AnimationHelper.closeStep(layoutExpandText);
        }
    }

    private void toggleSectionInput(View view) {
        boolean show = toggleArrow(view);
        if (show) {
            AnimationHelper.openStep(layoutExpandInput, new AnimationHelper.AnimListener() {
                @Override
                public void onFinish() {
                    Tools.nestedScrollTo(nested_scroll_view, layoutExpandInput);
                }
            });
        } else {
            AnimationHelper.closeStep(layoutExpandInput);
        }
    }

    public boolean toggleArrow(View view) {
        if (view.getRotation() == 0) {
            view.animate().setDuration(200).rotation(180);
            return true;
        } else {
            view.animate().setDuration(200).rotation(0);
            return false;
        }
    }

}
