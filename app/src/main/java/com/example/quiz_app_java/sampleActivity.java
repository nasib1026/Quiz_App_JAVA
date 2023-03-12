package com.example.quiz_app_java;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;

import androidx.appcompat.app.AppCompatActivity;

public class sampleActivity {
    int num;
    string string;

    public sampleActivity(int num, string string) {
        this.num = num;
        this.string = string;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public string getString() {
        return string;
    }

    public void setString(string string) {
        this.string = string;
    }
}