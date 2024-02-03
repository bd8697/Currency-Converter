package com.viorel.atestat;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector3;

public class Amount implements Screen{


	Vector3 touch;
	Sefu game;
	OrthographicCamera camera;
	SpriteBatch batch;
    static int to;
    float transition;
    static int amount;
	int sir=800;
    static char amountstr=2;


	public Amount(Sefu game){

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
		CharSequence amountstr=String.valueOf(amount);
		batch.begin();

		batch.setColor(1.0f, 1.0f, 1.0f, 1);
		batch.draw(Assets.sprite_back,0,0);
		batch.draw(Assets.convert_amount,0,-20);

		if(transition<1)
			batch.setColor(1.0f, 1.0f, 1.0f, transition);

		batch.draw(Assets.bar,0,-20);
		batch.draw(Assets.b0,40,330);
		batch.draw(Assets.b1,290,330);
		batch.draw(Assets.b2,540,330);
		batch.draw(Assets.b3,790,330);
		batch.draw(Assets.b4,1040,330);
		batch.draw(Assets.b5,40,520);
		batch.draw(Assets.b6,290,520);
		batch.draw(Assets.b7,540,520);
		batch.draw(Assets.b8,790,520);
		batch.draw(Assets.b9,1040,520);
		batch.draw(Assets.check,920,135);
		Assets.fontamount.draw(batch,amountstr,sir,200);

		switch(to)
		{case 1:
		batch.draw(Assets.b0pressed,40,330);
		break;
		case 2:
			batch.draw(Assets.b1pressed,290,330);
			break;
		case 3:
			batch.draw(Assets.b2pressed,540,330);
			break;
		case 4:
			batch.draw(Assets.b3pressed,790,330);
			break;
		case 5:
			batch.draw(Assets.b4pressed,1040,330);
			break;
		case 6:
			batch.draw(Assets.b5pressed,40,520);
			break;
		case 7:
			batch.draw(Assets.b6pressed,290,520);
			break;
		case 8:
			batch.draw(Assets.b7pressed,540,520);
			break;
		case 9:
			batch.draw(Assets.b8pressed,790,520);
			break;
		case 10:
			batch.draw(Assets.b9pressed,1040,520);
			break;
		case 11:
			batch.draw(Assets.checkpressed,920,135);
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

		if(touch.x>=40 && touch.x<=40+200 && touch.y>330 && touch.y<=330+200)
			to=1;
		else
			if(touch.x>=290 && touch.x<=290+200 && touch.y>330 && touch.y<=330+200)
				to=2;
			else
				if(touch.x>=540 && touch.x<=540+200 && touch.y>330 && touch.y<=330+200)
					to=3;
				else
					if(touch.x>=790 && touch.x<=790+200 && touch.y>330 && touch.y<=330+200)
						to=4;
					else
						if(touch.x>=1040 && touch.x<=1040+200 && touch.y>330 && touch.y<=330+200)
							to=5;
						else
							if(touch.x>=40 && touch.x<=40+200 && touch.y>520 && touch.y<=520+200)
								to=6;
							else
								if(touch.x>=290 && touch.x<=290+200 && touch.y>520 && touch.y<=520+200)
									to=7;
								else
									if(touch.x>=540 && touch.x<=540+200 && touch.y>520 && touch.y<=520+200)
										to=8;
									else
										if(touch.x>=790 && touch.x<=790+200 && touch.y>520 && touch.y<=520+200)
											to=9;
										else
											if(touch.x>=1040 && touch.x<=1040+200 && touch.y>520 && touch.y<=520+200)
												to=10;
											else
												if(touch.x>=920 && touch.x<=920+200 && touch.y>135 && touch.y<=135+200)
													to=11;

		if(Gdx.input.isTouched()&& transition>1)
			{try
			{Thread.sleep(100);}
			catch(InterruptedException e){
			e.printStackTrace();}
			if(touch.x>=40 && touch.x<=40+200 && touch.y>330 && touch.y<=330+200)
				{to=1;
				if(amount<1000)
				{amount=amount*10+to-1;
				if(amount>=10)
				sir=sir-60;}
				}
			else
				if(touch.x>=290 && touch.x<=290+200 && touch.y>330 && touch.y<=330+200)
				{to=2;
				if(amount<1000)
				{amount=amount*10+to-1;
				if(amount>=10)
				sir=sir-60;}
				}
				else
					if(touch.x>=540 && touch.x<=540+200 && touch.y>330 && touch.y<=330+200)
					{to=3;
					if(amount<1000)
					{amount=amount*10+to-1;
					if(amount>=10)
					sir=sir-60;}
					}
					else
						if(touch.x>=790 && touch.x<=790+200 && touch.y>330 && touch.y<=330+200)
						{to=4;
						if(amount<100)
						{amount=amount*10+to-1;
						if(amount>=10)
						sir=sir-60;}
						}
						else
							if(touch.x>=1040 && touch.x<=1040+200 && touch.y>330 && touch.y<=330+200)
							{to=5;
							if(amount<100)
							{amount=amount*10+to-1;
							if(amount>=10)
							sir=sir-60;}
							}
							else
								if(touch.x>=40 && touch.x<=40+200 && touch.y>520 && touch.y<=520+200)
								{to=6;
								if(amount<100)
								{amount=amount*10+to-1;
								if(amount>=10)
								sir=sir-60;}
								}
								else
									if(touch.x>=290 && touch.x<=290+200 && touch.y>520 && touch.y<=520+200)
									{to=7;
									if(amount<100)
									{amount=amount*10+to-1;
									if(amount>=10)
									sir=sir-60;}
									}
									else
										if(touch.x>=540 && touch.x<=540+200 && touch.y>520 && touch.y<=520+200)
										{to=8;
										if(amount<100)
										{amount=amount*10+to-1;
										if(amount>=10)
										sir=sir-60;}
										}
										else
											if(touch.x>=790 && touch.x<=790+200 && touch.y>520 && touch.y<=520+200)
											{to=9;
											if(amount<100)
											{amount=amount*10+to-1;
											if(amount>=10)
											sir=sir-60;}
											}
											else
												if(touch.x>=1040 && touch.x<=1040+200 && touch.y>520 && touch.y<=520+200)
												{to=10;
												if(amount<100)
												{amount=amount*10+to-1;
												if(amount>=10)
												sir=sir-60;}
												}
												else
													if(touch.x>=920 && touch.x<=920+200 && touch.y>135 && touch.y<=135+200)
														game.setScreen(new FinalScreen(game));



			}

		System.out.println(amount);


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
