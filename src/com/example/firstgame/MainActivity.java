package com.example.firstgame;

import org.cocos2d.layers.CCScene;
import org.cocos2d.nodes.CCDirector;
import org.cocos2d.opengl.CCGLSurfaceView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	//cocos2d����Ὣͼ�λ����ڸ�view������
	private CCGLSurfaceView view=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view=new CCGLSurfaceView(this);
		setContentView(view);
		//�õ�CCDirector����
		CCDirector director=CCDirector.sharedDirector();
		//���õ�ǰ��Ϸ��ʹ�õ�view����
		director.attachInView(view);
		//����Ļ����
		director.setDeviceOrientation(CCDirector.kCCDeviceOrientationLandscapeLeft);
		//������Ϸ�Ƿ���ʾFPS(ÿ�봫���֡��)
		director.setDisplayFPS(true);
		//������Ⱦһ֡��������Ҫ��ʱ��
		director.setAnimationInterval(1/30.0);
		//����һ����������
		CCScene scene=CCScene.node();
		//���ɲ��������
		GamePlayer player=new GamePlayer();
		//����������ӵ�������
		scene.addChild(player);
		//���г���
		director.runWithScene(scene);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
