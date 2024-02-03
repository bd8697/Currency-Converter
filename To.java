package com.viorel.atestat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class To implements Screen {

		Vector3 touch;
		Sefu game;
		OrthographicCamera camera;
		SpriteBatch batch;
	    static int to;
	    float transition;

		public To(Sefu game){

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
			generalUpdate(touch,camera);
			batch.begin();

			batch.setColor(1.0f, 1.0f, 1.0f, 1);
			batch.draw(Assets.sprite_back,0,0);
			batch.draw(Assets.convert_to,0,-20);

			if(transition<1)
				batch.setColor(1.0f, 1.0f, 1.0f, transition);


			batch.draw(Assets.euro,50,150);
			batch.draw(Assets.yen,350,150);
			batch.draw(Assets.pound,650,150);
			batch.draw(Assets.leu,950,150);
			batch.draw(Assets.rupee,50,430);
			batch.draw(Assets.won,350,430);
			batch.draw(Assets.dollar,650,430);
			batch.draw(Assets.franc,950,430);

			switch(to)
			{case 1:
			batch.draw(Assets.europressed,50,150);
			break;
			case 2:
				batch.draw(Assets.yenpressed,350,150);
				break;
			case 3:
				batch.draw(Assets.poundpressed,650,150);
				break;
			case 4:
				batch.draw(Assets.leupressed,950,150);
				break;
			case 5:
				batch.draw(Assets.rupeepressed,50,430);
				break;
			case 6:
				batch.draw(Assets.wonpressed,350,430);
				break;
			case 7:
				batch.draw(Assets.dollarpressed,650,430);
				break;
			case 8:
				batch.draw(Assets.francpressed,950,430);
				break;
			}

			if(transition<1)
				transition=transition+0.01f;

			batch.end();
		}
		private void generalUpdate(Vector3 touch,OrthographicCamera camera) {

			to=0;

			touch.set(Gdx.input.getX(),Gdx.input.getY(),0);
			camera.unproject(touch);

			if(touch.x>=50 && touch.x<=50+275 && touch.y>150 && touch.y<=150+275)
				to=1;
			else
				if(touch.x>=350 && touch.x<=350+275 && touch.y>150 && touch.y<=150+275)
					to=2;
				else
					if(touch.x>=650 && touch.x<=650+275 && touch.y>150 && touch.y<=150+275)
						to=3;
					else
						if(touch.x>=950 && touch.x<=950+275 && touch.y>150 && touch.y<=150+275)
							to=4;
						else
							if(touch.x>=50 && touch.x<=50+275 && touch.y>430 && touch.y<=430+275)
								to=5;
							else
								if(touch.x>=350 && touch.x<=350+275 && touch.y>430 && touch.y<=430+275)
									to=6;
								else
									if(touch.x>=650 && touch.x<=650+275 && touch.y>430 && touch.y<=430+275)
										to=7;
									else
										if(touch.x>=950 && touch.x<=950+275 && touch.y>430 && touch.y<=430+275)
											to=8;

			if(Gdx.input.isTouched()&& transition>1)
				{try
				{Thread.sleep(100);}
				catch(InterruptedException e){
				e.printStackTrace();}
				if(touch.x>=50 && touch.x<=50+275 && touch.y>150 && touch.y<=150+275)
					game.setScreen(new Amount(game));
				else
					if(touch.x>=350 && touch.x<=350+275 && touch.y>150 && touch.y<=150+275)
						game.setScreen(new Amount(game));
					else
						if(touch.x>=650 && touch.x<=650+275 && touch.y>150 && touch.y<=150+275)
							game.setScreen(new Amount(game));
						else
							if(touch.x>=950 && touch.x<=950+275 && touch.y>150 && touch.y<=150+275)
								game.setScreen(new Amount(game));
							else
								if(touch.x>=50 && touch.x<=50+275 && touch.y>430 && touch.y<=430+275)
									game.setScreen(new Amount(game));
								else
									if(touch.x>=350 && touch.x<=350+275 && touch.y>430 && touch.y<=430+275)
										game.setScreen(new Amount(game));
									else
										if(touch.x>=650 && touch.x<=650+275 && touch.y>430 && touch.y<=430+275)
											game.setScreen(new Amount(game));
										else
											if(touch.x>=950 && touch.x<=950+275 && touch.y>430 && touch.y<=430+275)
												game.setScreen(new Amount(game));

				}

			System.out.println(to);


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
