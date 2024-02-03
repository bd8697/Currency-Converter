package com.viorel.atestat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class FinalScreen implements Screen {
	Vector3 touch;
	Sefu game;
	OrthographicCamera camera;
	SpriteBatch batch;
    static int to;
    float transition;
    char amountold;


	public FinalScreen(Sefu game){

		this.game=game;
		camera=new OrthographicCamera();
		camera.setToOrtho(true,1280,720);
		touch=new Vector3();
		batch=new SpriteBatch();

	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0F,0F,0F,1F);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		camera.update();
		batch.setProjectionMatrix(camera.combined);
		String s="=";
		float x = 0;float y=0;
		float amountnewv = 0;
		CharSequence amountold=String.valueOf(Amount.amount);

		CharSequence ss=String.valueOf(s);

		switch(From.from)
		{case 1:
		x=1;
		break;
		case 2:
			x=(float)0.33;
			break;
		case 3:
			x=(float)1.26;
			break;
		case 4:
			x=(float)0.22;
			break;
		case 5:
			x=(float)0.07;
			break;
		case 6:
			x=(float)0.08;
			break;
		case 7:
			x=(float)0.87;
			break;
		case 8:
			x=(float)0.9;
			break;
		}

		amountnewv=(float) (Amount.amount*x);
		switch(To.to)
		{case 1:
		y=(float)1;
		break;
		case 2:
			y=(float)3;
			break;
		case 3:
			y=(float)0.78;
			break;
		case 4:
			y=(float)4.5;
			break;
		case 5:
			y=(float)13;
			break;
		case 6:
			y=(float)12;
			break;
		case 7:
			y=(float)1.1;
			break;
		case 8:
			y=(float)0.9;
			break;
		}

		amountnewv=(float) (amountnewv*y);

		CharSequence amountnew=String.valueOf((int)amountnewv);
		batch.begin();
		batch.draw(Assets.sprite_back,0,0);
		Assets.fontamount.draw(batch,amountold,250,310);
		Assets.fontamount.draw(batch,ss,600,310);
		Assets.fontamount.draw(batch,amountnew,700,310);


		switch(From.from)
		{case 1:
		batch.draw(Assets.eurom,500,290);
		break;
		case 2:
			batch.draw(Assets.yenm,500,290);
			break;
		case 3:
			batch.draw(Assets.poundm,500,290);
			break;
		case 4:
			batch.draw(Assets.leum,480,270);
			break;
		case 5:
			batch.draw(Assets.rupeem,500,290);
			break;
		case 6:
			batch.draw(Assets.wonm,500,290);
			break;
		case 7:
			batch.draw(Assets.dollarm,500,290);
			break;
		case 8:
			batch.draw(Assets.francm,500,290);
			break;
		}


		switch(To.to)
		{case 1:
		batch.draw(Assets.eurom,950,290);
		break;
		case 2:
			batch.draw(Assets.yenm,950,290);
			break;
		case 3:
			batch.draw(Assets.poundm,950,290);
			break;
		case 4:
			batch.draw(Assets.leum,930,270);
			break;
		case 5:
			batch.draw(Assets.rupeem,950,290);
			break;
		case 6:
			batch.draw(Assets.wonm,950,290);
			break;
		case 7:
			batch.draw(Assets.dollarm,950,290);
			break;
		case 8:
			batch.draw(Assets.francm,950,290);
			break;
		}
		System.out.println(amountnewv);
		System.out.println(y);

		batch.end();

	}


	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
