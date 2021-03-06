package com.nickmillward.snake.utils;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by nmillward on 9/7/16.
 */
public class Constants {

    // WORLD
    public static final float WORLD_SIZE = 800;
    public static final Color BACKGROUND_COLOR = Color.SLATE;
    public static final Color GAMEPLAY_BACKGROUND_COLOR = Color.valueOf("00A3B2");
    public static final String TEXTURE_ATLAS = "textures/textureAtlas.atlas";
    public static final String UI_SKIN = "uiskin.json";
    public static final String FONT_TITAN = "font/titan.ttf";
    public static final String PREF_HIGH_SCORE = "High Score Preference";
    public static final String PREF_NEW_HIGH_SCORE = "New High Score Preference";
    public static final String PREF_FIRST_TIME = "First Time";
    public static final String KEY_HIGH_SCORE = "highScore";
    public static final String KEY_NEW_HIGH_SCORE = "newHighScore";
    public static final String KEY_FIRST_TIME = "firstTime";

    // SNAKE
    public static final float SNAKE_SEGMENT_DEFAULT_SIZE = 50;
    public static final Vector2 SNAKE_SEGMENT_CENTER = new Vector2(SNAKE_SEGMENT_DEFAULT_SIZE / 2, SNAKE_SEGMENT_DEFAULT_SIZE / 2);
    public static final int EASY_SNAKE_VELOCITY = 10;
    public static final int MEDIUM_SNAKE_VELOCITY = 5;
    public static final int HARD_SNAKE_VELOCITY = 3;

    public static final Vector2 SNAKE_DEFAULT_START_POINT = new Vector2(WORLD_SIZE / 2, WORLD_SIZE / 2);
    public static final int SNAKE_DEFAULT_LENGTH = 4;

    public static final String IOS_CRY_TEARS = "cry_tears";
    public static final String IOS_GRIN = "grin";
    public static final String IOS_HAPPY = "happy";
    public static final String IOS_HAPPY_CRY = "happy_cry";
    public static final String IOS_HEART = "heart";
    public static final String IOS_KISS = "kiss";
    public static final String IOS_SHADES = "shades";
    public static final String IOS_SHOCK = "shock";
    public static final String IOS_SMIRK = "smirk";
    public static final String IOS_TONGUE_HAPPY = "tongue_happy";
    public static final String IOS_TONGUE_TEASE = "tongue_tease";
    public static final String IOS_TONGUE_WINK = "tongue_wink";

    // FOOD
    public static final float FOOD_DEFAULT_SIZE = 40;
    public static final Vector2 FOOD_CENTER = new Vector2(FOOD_DEFAULT_SIZE / 2, FOOD_DEFAULT_SIZE / 2);
    public static final int FOOD_BASE_POINT_VALUE = 5;
    public static final int FOOD_EASY_POINT_VALUE = 2;
    public static final int FOOD_MEDIUM_POINT_VALUE = 5;
    public static final int FOOD_HARD_POINT_VALUE = 10;

    public static final String IOS_BEEF = "beef";
    public static final String IOS_BURGER = "burger";
    public static final String IOS_CAKE = "cake";
    public static final String IOS_CANDYBAR = "candybar";
    public static final String IOS_COOKIE = "cookie";
    public static final String IOS_DONUT = "donut";
    public static final String IOS_DRUMSTICK = "drumstick";
    public static final String IOS_ICECREAM = "icecream";
    public static final String IOS_LOLLIPOP = "lollipop";
    public static final String IOS_PIZZA = "pizza";

    // SNAKE HUD
    public static final float SNAKE_HUD_VIEWPORT_SIZE = 480;
    public static final float SNAKE_HUD_MARGIN = 20;
    public static final String SNAKE_HUD_SCORE_LABEL = "Score: ";
    public static final String BUTTON_PAUSE = "btn_pause";

    // LEVEL
    public static final Color BORDER_COLOR = Color.WHITE;
    public static final float BORDER_WIDTH = 15.0f;
    public static final float BORDER_SNAKE_HUD = 100;

    // START SCREEN
    public static final String MENU_BUTTON = "button";
    public static final String BUTTON_PLAY = "btn_play";
    public static final String TITLE_SNAKE = "emojiconda_title";
    public static final String IMG_BACKGROUND = "bg_start";
    public static final String SUBTITLE_LABEL = "A GAME OF MIXED EMOTIONS \n" + "AND JUNK FOOD";

    public static final String BUTTON_EASY_ON = "EASY_ON";
    public static final String BUTTON_EASY_OFF = "EASY_OFF";
    public static final String BUTTON_MEDIUM_ON = "MEDIUM_ON";
    public static final String BUTTON_MEDIUM_OFF = "MEDIUM_OFF";
    public static final String BUTTON_HARD_ON = "HARD_ON";
    public static final String BUTTON_HARD_OFF = "HARD_OFF";

    // GAME_SCREEN OVER SCREEN
    public static final String HIGH_SCORE_LABEL = "High Score: ";
    public static final String NEW_HIGH_SCORE_LABEL = "NEW \n High Score: ";
    public static final String BUTTON_HOME = "btn_home";
    public static final String BUTTON_RESUME = "btn_resume";
    public static final String TITLE_GAME_OVER = "txt_gameover";

    // INSTRUCTION OVERLAY
    public static final String BUTTON_GOT_IT = "btn_got_it";
    public static final String IMG_SWIPE = "swipe";
    public static final String TXT_SWIPE = "swipe-to-move";

}
