package com.nickmillward.snake.screens;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.input.GestureDetector;
import com.nickmillward.snake.Level;
import com.nickmillward.snake.MobileControls;
import com.nickmillward.snake.overlays.GameOverOverlay;
import com.nickmillward.snake.overlays.SnakeHUD;
import com.nickmillward.snake.utils.Assets;
import com.nickmillward.snake.utils.Constants;
import com.nickmillward.snake.utils.Enums;
import com.nickmillward.snake.utils.ScreenManager;

/**
 * Created by nmillward on 9/7/16.
 */
public class GameplayScreen extends AbstractScreen {

    public static final String TAG = GameplayScreen.class.getName();

    MobileControls mobileControls;
    GestureDetector gestureDetector;
    SpriteBatch batch;
    private Level level;
    private SnakeHUD snakeHUD;
    private GameOverOverlay gameOverOverlay;

    public GameplayScreen() {
        super();
    }

    @Override
    public void buildStage() {

    }

    @Override
    public void show() {
        AssetManager assetManager = new AssetManager();
        Assets.instance.init(assetManager);

        batch = new SpriteBatch();
        level = new Level();
        snakeHUD = new SnakeHUD();
        gameOverOverlay = new GameOverOverlay();
        mobileControls = new MobileControls(level);

        if (onMobile()) {
            gestureDetector = new GestureDetector(mobileControls);
            Gdx.input.setInputProcessor(gestureDetector);
        }
    }

    @Override
    public void resize(int width, int height) {
        level.viewport.update(width, height, true);
        snakeHUD.viewport.update(width, height, true);
        gameOverOverlay.viewport.update(width, height, true);
    }

    @Override
    public void dispose() {
        super.dispose();
        batch.dispose();
    }

    @Override
    public void render(float delta) {
        level.update(delta);

        Gdx.gl.glClearColor(
                Constants.BACKGROUND_COLOR.r,
                Constants.BACKGROUND_COLOR.g,
                Constants.BACKGROUND_COLOR.b,
                Constants.BACKGROUND_COLOR.a);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        level.render(batch);

        snakeHUD.render(batch, level.getCurrentScore());

        if (level.isGameOver) {
            ScreenManager.getInstance().showScreen(Enums.Screen.RESTART_SCREEN);
            Gdx.app.log("GamePlayScreen", "highscore: " + level.getHighScore());
        }
    }

    /**
     * Check if the user is on a mobile device
     */
    public boolean onMobile() {
        return Gdx.app.getType() == Application.ApplicationType.Android || Gdx.app.getType() == Application.ApplicationType.iOS;
    }
}