package com.example.firstgame;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	//cocos2d引擎会将图形绘制在该view对象上
	private CCGLSurfaceView view=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view=new CCGLSurfaceView(this);
		setContentView(view);
		//得到CCDirector对象
		CCDirector director=CCDirector.sharedDirector();
		//设置当前游戏所使用的view对象
		director.attachInView(view);
		//是屏幕横向
		director.setDeviceOrientation(CCDirector.kCCDeviceOrientationLandscapeLeft);
		//设置游戏是否显示FPS(每秒传输的帧数)
		director.setDisplayFPS(true);
		//设置渲染一帧数据所需要的时间
		director.setAnimationInterval(1/30.0);
		//生成一个场景对象
		CCScene scene=CCScene.node();
		//生成布景层对象
		GamePlayer player=new GamePlayer();
		//将布景层添加到场景中
		scene.addChild(player);
		//运行场景
		director.runWithScene(scene);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
