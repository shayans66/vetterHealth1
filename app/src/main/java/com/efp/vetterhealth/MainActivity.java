package com.efp.vetterhealth;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.transition.Fade;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 13},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u001a\u0010-\u001a\u00020**\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0004J&\u00101\u001a\u00020**\u0002022\u0017\u00103\u001a\u0013\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020504¢\u0006\u0002\b6H\u0086\bJ\u001a\u00107\u001a\u00020**\u00020\u00012\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\"X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00068"},
        d2 = {"Lcom/efp/vetterhealth/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "currentFrag", "", "getCurrentFrag", "()I", "setCurrentFrag", "(I)V", "fragHelp", "Lcom/efp/vetterhealth/FragmentHelp;", "getFragHelp", "()Lcom/efp/vetterhealth/FragmentHelp;", "setFragHelp", "(Lcom/efp/vetterhealth/FragmentHelp;)V", "fragHome", "Lcom/efp/vetterhealth/FragmentHome;", "getFragHome", "()Lcom/efp/vetterhealth/FragmentHome;", "setFragHome", "(Lcom/efp/vetterhealth/FragmentHome;)V", "fragPost", "Lcom/efp/vetterhealth/FragmentPost;", "getFragPost", "()Lcom/efp/vetterhealth/FragmentPost;", "setFragPost", "(Lcom/efp/vetterhealth/FragmentPost;)V", "fragReminders", "Lcom/efp/vetterhealth/FragmentReminders;", "getFragReminders", "()Lcom/efp/vetterhealth/FragmentReminders;", "setFragReminders", "(Lcom/efp/vetterhealth/FragmentReminders;)V", "fragSleepTracking", "Lcom/efp/vetterhealth/FragmentSleepTracking;", "getFragSleepTracking", "()Lcom/efp/vetterhealth/FragmentSleepTracking;", "setFragSleepTracking", "(Lcom/efp/vetterhealth/FragmentSleepTracking;)V", "onNavigationItemSelectedListener", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "addFragment", "fragment", "Landroidx/fragment/app/Fragment;", "frameId", "inTransaction", "Landroidx/fragment/app/FragmentManager;", "func", "Lkotlin/Function1;", "Landroidx/fragment/app/FragmentTransaction;", "Lkotlin/ExtensionFunctionType;", "replaceFragment", "app_debug"}
)
public final class MainActivity extends AppCompatActivity {
    @NotNull
    private FragmentHelp fragHelp = new FragmentHelp();
    @NotNull
    private FragmentHome fragHome = new FragmentHome();
    @NotNull
    private FragmentPost fragPost = new FragmentPost();
    @NotNull
    private FragmentReminders fragReminders = new FragmentReminders();
    @NotNull
    private FragmentSleepTracking fragSleepTracking = new FragmentSleepTracking();
    private int currentFrag;
    private final OnNavigationItemSelectedListener onNavigationItemSelectedListener = (OnNavigationItemSelectedListener)(new OnNavigationItemSelectedListener() {
        public final boolean onNavigationItemSelected(@NotNull MenuItem item) {
            Intrinsics.checkParameterIsNotNull(item, "item");
            switch(item.getItemId()) {
                case -1000118:
                    MainActivity.this.replaceFragment(MainActivity.this, (Fragment)MainActivity.this.getFragReminders(), -1000063);
                    MainActivity.this.setCurrentFrag(3);
                    return true;
                case -1000089:
                    MainActivity.this.replaceFragment(MainActivity.this, (Fragment)MainActivity.this.getFragSleepTracking(), -1000063);
                    MainActivity.this.setCurrentFrag(2);
                    return true;
                case -1000085:
                    MainActivity.this.replaceFragment(MainActivity.this, (Fragment)MainActivity.this.getFragHome(), -1000063);
                    MainActivity.this.setCurrentFrag(0);
                    return true;
                case -1000024:
                    MainActivity.this.replaceFragment(MainActivity.this, (Fragment)MainActivity.this.getFragHelp(), -1000063);
                    MainActivity.this.setCurrentFrag(4);
                    return true;
                case -1000021:
                    MainActivity.this.replaceFragment(MainActivity.this, (Fragment)MainActivity.this.getFragPost(), -1000063);
                    MainActivity.this.setCurrentFrag(1);
                    return true;
                default:
                    return false;
            }
        }
    });
    private HashMap _$_findViewCache;

    @NotNull
    public final FragmentHelp getFragHelp() {
        return this.fragHelp;
    }

    public final void setFragHelp(@NotNull FragmentHelp var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.fragHelp = var1;
    }

    @NotNull
    public final FragmentHome getFragHome() {
        return this.fragHome;
    }

    public final void setFragHome(@NotNull FragmentHome var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.fragHome = var1;
    }

    @NotNull
    public final FragmentPost getFragPost() {
        return this.fragPost;
    }

    public final void setFragPost(@NotNull FragmentPost var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.fragPost = var1;
    }

    @NotNull
    public final FragmentReminders getFragReminders() {
        return this.fragReminders;
    }

    public final void setFragReminders(@NotNull FragmentReminders var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.fragReminders = var1;
    }

    @NotNull
    public final FragmentSleepTracking getFragSleepTracking() {
        return this.fragSleepTracking;
    }

    public final void setFragSleepTracking(@NotNull FragmentSleepTracking var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.fragSleepTracking = var1;
    }

    public final int getCurrentFrag() {
        return this.currentFrag;
    }

    public final void setCurrentFrag(int var1) {
        this.currentFrag = var1;
    }

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ///this.setContentView(-1300031);
        View var10000 = this.findViewById(-1000077);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "findViewById(R.id.nav_view)");
        BottomNavigationView navView = (BottomNavigationView)var10000;
        this.replaceFragment(this, (Fragment)this.fragHome, -1000063);
        navView.setOnNavigationItemSelectedListener(this.onNavigationItemSelectedListener);
    }

    public final void addFragment(@NotNull AppCompatActivity $receiver, @NotNull Fragment fragment, int frameId) {
        Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        FragmentManager var10001 = $receiver.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(var10001, "supportFragmentManager");
        FragmentManager $receiver$iv = var10001;
        int $i$f$inTransaction = false;
        FragmentTransaction var10000 = $receiver$iv.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(var10000, "beginTransaction()");
        FragmentTransaction $receiver = var10000;
        int var8 = false;
        var10000 = $receiver.add(frameId, fragment);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "add(frameId, fragment)");
        var10000.commit();
    }

    public final void replaceFragment(@NotNull AppCompatActivity $receiver, @NotNull Fragment fragment, int frameId) {
        Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
        Intrinsics.checkParameterIsNotNull(fragment, "fragment");
        fragment.setEnterTransition(new Fade());
        FragmentManager var10001 = $receiver.getSupportFragmentManager();
        Intrinsics.checkExpressionValueIsNotNull(var10001, "supportFragmentManager");
        FragmentManager $receiver$iv = var10001;
        int $i$f$inTransaction = false;
        FragmentTransaction var10000 = $receiver$iv.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(var10000, "beginTransaction()");
        FragmentTransaction $receiver = var10000;
        int var8 = false;
        var10000 = $receiver.replace(frameId, fragment);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "replace(frameId, fragment)");
        var10000.commit();
    }

    public final void inTransaction(@NotNull FragmentManager $receiver, @NotNull Function1 func) {
        int $i$f$inTransaction = 0;
        Intrinsics.checkParameterIsNotNull($receiver, "receiver$0");
        Intrinsics.checkParameterIsNotNull(func, "func");
        FragmentTransaction var10001 = $receiver.beginTransaction();
        Intrinsics.checkExpressionValueIsNotNull(var10001, "beginTransaction()");
        ((FragmentTransaction)func.invoke(var10001)).commit();
    }

    public View _$_findCachedViewById(int var1) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }

        View var2 = (View)this._$_findViewCache.get(var1);
        if (var2 == null) {
            var2 = this.findViewById(var1);
            this._$_findViewCache.put(var1, var2);
        }

        return var2;
    }

    public void _$_clearFindViewByIdCache() {
        if (this._$_findViewCache != null) {
            this._$_findViewCache.clear();
        }

    }
}
